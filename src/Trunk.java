import java.awt.*;

public class Trunk {
    private int x, y, width, height;

    public Trunk(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void draw(Graphics g) {
        g.setColor(new Color(102, 51, 0));
        g.fillRect(x, y, width, height);
    }
}
