import javax.swing.*;
import java.awt.*;

abstract class Shape extends JFrame {
    int size;

    Shape(String title, int size) {
        super(title);
        this.size = size;
        setSize(2 * size + 50, 2 * size + 50);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public void paint(Graphics g) {
        super.paint(g);
        draw(g);
    }

    abstract void draw(Graphics g);
}
