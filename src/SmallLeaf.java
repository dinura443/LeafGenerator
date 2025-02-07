import java.awt.*;

public class SmallLeaf extends Leaf {
    public SmallLeaf(int x, int y) {
        super(x, y);
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(new Color(144, 238, 144)); // Even lighter green
        g.fillOval(x, y, 10, 10);
    }
}
