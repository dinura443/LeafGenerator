import java.awt.*;

public class SmallLeaf extends Leaf {
    public SmallLeaf(int x, int y) {
        super(x, y, new Color(41, 250, 41));
    }



    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(x, y, 20, 10);
    }
}
