import java.awt.*;

public abstract class Leaf {
    protected int x, y;
    protected int originalX;
    protected int swayAmount = 4;
    protected int swayDirection = 1;

    public Leaf(int x, int y) {
        this.x = x;
        this.originalX = x;
        this.y = y;
    }

    public void sway() {
        x += swayDirection;

        if (x > originalX + swayAmount || x < originalX - swayAmount) {
            swayDirection *= -1;
        }
    }

    public abstract void draw(Graphics g);
}
