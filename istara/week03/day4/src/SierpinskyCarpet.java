import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SierpinskyCarpet {
    public static void mainDraw(Graphics graphics) {

        drawCarpet(0, 0, WIDTH, graphics);
    }

    public static void drawCarpet(int startX, int startY, int sizeOfSquare, Graphics graphics) {

        int newSize = sizeOfSquare / 3;

        graphics.fillRect(startX + newSize, startY + newSize, newSize, newSize);

        if (newSize != 0) {
            drawCarpet(startX, startY, newSize, graphics);
            drawCarpet(startX + newSize, startY, newSize, graphics);
            drawCarpet(startX + newSize * 2, startY, newSize, graphics);
            drawCarpet(startX, startY + newSize, newSize, graphics);
            drawCarpet(startX + newSize * 2, startY + newSize, newSize, graphics);
            drawCarpet(startX,startY + newSize * 2, newSize, graphics);
            drawCarpet(startX + newSize, startY + newSize * 2, newSize, graphics);
            drawCarpet(startX + newSize * 2, startY + newSize * 2, newSize, graphics);
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