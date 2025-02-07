import java.awt.*;

public abstract class Leaf {
    protected int x, y;
    protected Color color;

    public Leaf(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }



    public abstract void draw(Graphics g);
}
