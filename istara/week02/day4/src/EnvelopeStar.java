import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EnvelopeStar {
    public static void mainDraw(Graphics graphics) {


        graphics.setColor(java.awt.Color.GREEN);
        int x1 = WIDTH/2;
        int y1 = 0;
        int x2 = WIDTH/2 + WIDTH/30;
        int y2 = HEIGHT/2;

        for (int i = 0; i < 15; i++) {
            graphics.drawLine(x1, y1 + i * HEIGHT/30, x2 + i * WIDTH/30, y2);
        }
        for (int i = 0; i < 15; i++) {
            graphics.drawLine(x1, y1 + i * HEIGHT/30, x2 - i * WIDTH/30, y2);
        }
        for (int i = 0; i < 15; i++) {
            graphics.drawLine(x1, y1 + HEIGHT - i * HEIGHT/30, x2 + i * WIDTH/30, y2);
        }
        for (int i = 0; i < 15; i++) {
            graphics.drawLine(x1, y1 + HEIGHT - i * HEIGHT/30, x2 - i * WIDTH/30, y2);
        }
    }




    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

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