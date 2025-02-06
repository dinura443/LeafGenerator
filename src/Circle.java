import java.awt.*;

class Circle extends Shape {
    Circle(int size) {
        super("circle", size);
    }

    void draw(Graphics g) {
        g.setColor(Color.BLACK);
        int radius = size;
        int diameter = 2 * radius;
        g.fillOval(25, 25, diameter, diameter);
    }
}
