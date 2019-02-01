import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class YellowSquare {
    public static void mainDraw(Graphics graphics) {

        graphics.setColor(Color.YELLOW);
        graphics.fillRect(0, 0, WIDTH, HEIGHT);
        graphics.setColor(Color.BLACK);
        graphics.drawRect(0, 0, WIDTH, HEIGHT);

        yellowSquare(0, 0, WIDTH, graphics);
    }

    public static void yellowSquare(int startX, int startY, int sizeOfSquare, Graphics graphics) {

        int newSize = sizeOfSquare / 3;

        graphics.drawRect(startX + newSize, startY, newSize, newSize);
        graphics.drawRect(startX,startY + newSize, newSize, newSize);
        graphics.drawRect(startX + (sizeOfSquare - newSize),startY + newSize, newSize, newSize);
        graphics.drawRect(startX + newSize,startX + (sizeOfSquare - newSize), newSize, newSize);

        if (newSize != 0) {
            yellowSquare(startX + newSize, startY, newSize, graphics);
            yellowSquare(startX, startY + newSize, newSize, graphics);
            yellowSquare(startX + newSize *2, startY + newSize, newSize, graphics);
            yellowSquare(startX + newSize, startY + newSize * 2, newSize, graphics);
        }
    }


    // Don't touch the code below
    static int WIDTH = 729;
    static int HEIGHT = 729;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}