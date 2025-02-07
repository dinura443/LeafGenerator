import java.awt.*;

public class LargeLeaf extends Leaf {
    public LargeLeaf(int x, int y) {
        super(x, y, Color.GREEN);
    }


    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(x, y, 80, 40);
    }
}
