import java.awt.*;

public class SmallLeaf extends Leaf {
    public SmallLeaf(int x, int y) {
        super(x, y, Color.GREEN);
    }



    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(x, y, 40, 20);
    }
}
