/*import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class CenterBoxFunction {

    public static void mainDraw(Graphics graphics){


        graphics.setColor(java.awt.Color.GREEN);
        int y = 65;
        int x2 = 35;

        for (int i = 0; i < 13; i++) {
            graphics.drawLine(5, y + i * 30, x2 + i * 30, 455);
        }

        graphics.setColor(Color.MAGENTA);
        int x3 = 65;
        int y4 = 35;

        for (int i = 0; i < 13; i++) {
            graphics.drawLine( x3 + i * 30, 5, 455, y4 + i * 30);
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
}*/