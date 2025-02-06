import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class Controller extends JFrame {
    private ArrayList<Leaf> leaves = new ArrayList<>();
    private Random random = new Random();

    public Controller() {
        setTitle("Random Leaf Generator");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        add(new DrawPanel());
        generateRandomLeaves(10);
        setVisible(true);
    }

    private void generateRandomLeaves(int count) {
        for (int i = 0; i < count; i++) {
            int x = random.nextInt(350);
            int y = random.nextInt(350);
            int type = random.nextInt(3);

            switch (type) {
                case 0 -> leaves.add(new LargeLeaf(x, y));
                case 1 -> leaves.add(new MediumLeaf(x, y));
                case 2 -> leaves.add(new SmallLeaf(x, y));
            }
        }
    }

    class DrawPanel extends JPanel {

        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            for (Leaf leaf : leaves) {
                leaf.draw(g);
            }
        }
    }

    public static void main(String[] args) {
        new Controller();
    }
}
