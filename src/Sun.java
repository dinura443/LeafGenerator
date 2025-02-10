import javax.swing.*;
import java.awt.*;

public class Sun extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int sunX = 500;
        int sunY = 30;
        int sunDiameter = 100;

        g.setColor(Color.YELLOW);
        g.fillOval(sunX, sunY, sunDiameter, sunDiameter);

        int rayLength = 80;
        for (int i = 0; i < 360; i += 30) {
            int centerX = sunX + sunDiameter / 2;
            int centerY = sunY + sunDiameter / 2;
            int x2 = (int) (centerX + rayLength * Math.cos(Math.toRadians(i)));
            int y2 = (int) (centerY - rayLength * Math.sin(Math.toRadians(i)));
            g.drawLine(centerX, centerY, x2, y2);
        }

        g.setColor(Color.BLACK);
        int eyeWidth = 10, eyeHeight = 15;
        int eyeY = sunY + 30;
        g.fillOval(sunX + 25, eyeY, eyeWidth, eyeHeight);
        g.fillOval(sunX + 65, eyeY, eyeWidth, eyeHeight);

        g.drawArc(sunX + 30, sunY + 50, 40, 20, 0, -180);




    }


}
