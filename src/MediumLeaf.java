import java.awt.*;

public class MediumLeaf extends Leaf {
    public MediumLeaf(int x, int y) {
        super(x, y, new Color(29, 186, 29));
    }


    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(x, y, 30, 15);
    }
}
