import java.awt.*;

public class LargeLeaf extends Leaf {
    public LargeLeaf(int x, int y) {
        super(x, y);
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(new Color(34, 139, 34)); // Dark green color
        g.fillOval(x, y, 30, 30);
    }
}
