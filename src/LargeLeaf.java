import java.awt.*;

public class LargeLeaf extends Leaf {
    public LargeLeaf(int x, int y) {
        super(x, y, new Color(19, 119, 19));
    }


    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(x, y, 40, 20);
    }
}
