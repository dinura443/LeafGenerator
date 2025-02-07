import javax.swing.*;
import java.awt.*;

public class Sun extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.YELLOW);
        g.fillOval(400, 10, 100, 100);


    }
}
