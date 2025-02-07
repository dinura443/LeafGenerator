import java.awt.*;

public class MediumLeaf extends Leaf {
    public MediumLeaf(int x, int y) {
        super(x, y);
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(new Color(50, 205, 50)); // Lighter green
        g.fillOval(x, y, 20, 20);
    }
}
