import javax.swing.*;

import java.awt.*;
import java.awt.image.ImageObserver;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PlusSignFractal {
    public static void mainDraw(Graphics graphics) {

        graphics.setColor(Color.YELLOW);
        graphics.fillRect(0, 0, WIDTH, HEIGHT);
        graphics.setColor(Color.BLACK);
        graphics.drawRect(0, 0, WIDTH, HEIGHT);

        plusSignRect(0, 0, WIDTH, graphics);
    }

    public static void plusSignRect(int startX, int startY, int sizeOfSquare, Graphics graphics) {

        int newSize = sizeOfSquare / 3;

        graphics.drawRect(startX + newSize, startY, newSize, newSize);
        graphics.drawRect(startX,startY + newSize, newSize, newSize);
        graphics.drawRect(startX + (sizeOfSquare - newSize),startY + newSize, newSize, newSize);
        graphics.drawRect(startX + newSize,startX + (sizeOfSquare - newSize), newSize, newSize);

        if (newSize != 0) {
            plusSignRect(startX + newSize, startY, newSize, graphics);
            plusSignRect(startX, startY + newSize, newSize, graphics);
            plusSignRect(startX + newSize *2, startY + newSize, newSize, graphics);
            plusSignRect(startX + newSize, startY + newSize * 2, newSize, graphics);
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