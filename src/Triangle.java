import java.awt.*;

class Triangle extends Shape {
    Triangle(int size) {
        super("Triangle", size);
    }


    void draw(Graphics g) {
        g.setColor(Color.BLACK);
        int centerX = getWidth() / 2;
        int topY = 50;
        int bottomY = topY + size;
        int leftX = centerX - size / 2;
        int rightX = centerX + size / 2;

        int[] xPoints = {centerX, leftX, rightX};
        int[] yPoints = {topY, bottomY, bottomY};

        g.fillPolygon(xPoints, yPoints, 3);
    }
}
