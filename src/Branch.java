import java.awt.*;

public class Branch {
    private int x1, y1, x2, y2;

    public Branch(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public void draw(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(new Color(102, 51, 0));
        g2.setStroke(new BasicStroke(7));
        g2.drawLine(x1, y1, x2, y2);
    }
}
