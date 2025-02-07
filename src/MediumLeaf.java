import java.awt.*;

public class MediumLeaf extends Leaf {
    public MediumLeaf(int x, int y) {
        super(x, y, Color.GREEN);
    }


    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(x, y, 60, 30);
    }
}
