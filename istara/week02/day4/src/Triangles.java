/*import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {

    public static void mainDraw(Graphics graphics) {


        int x1 = 0;
        int y1 = java.lang.Math.sqrt(int numHolder);
        int x2 = WIDTH;
        int y2 = y1;
        numHolder = java.lang.Math.sqrt((WIDTH * WIDTH) - (WIDTH/2 * WIDTH/2));

        graphics.drawLine(x1, y1, x2, y2);

        for (int i = 0; i < 21; i++) {
            graphics.drawLine(x1 + i * WIDTH/42, y1 + i * (y1/21), x2 - i * (WIDTH/42), y2);
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
}*/