import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;



public class Assembler extends JFrame {
    private Trunk trunk;
    private ArrayList<Leaf> leaves = new ArrayList<>();
    private Random random = new Random();
    private ArrayList<Branch> branches = new ArrayList<>();
    private int leafAmount = 200;


    public Assembler() {

        trunk = new Trunk(325, 375, 50, 400);
        generateBranches(10);
        setTitle("Tree Simulation");
        setSize(700, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        add(new DrawPanel());
        generateRandomLeaves();
        setVisible(true);
    }



    // any random control random
    private void generateRandomLeaves() {
        int centerX = 350;
        int centerY = 250;
        int maxRadius = 250;

        for (int i = 0; i < leafAmount; i++) {
            double angle = 1 * Math.PI * random.nextDouble();
            double radius = maxRadius * Math.sqrt(random.nextDouble());

            int x = (int) (centerX + radius * Math.cos(angle));
            int y = (int) (centerY + radius * Math.sin(angle));

            int type = random.nextInt(3);
            switch (type) {
                case 0 -> leaves.add(new LargeLeaf(x, y));
                case 1 -> leaves.add(new MediumLeaf(x, y));
                case 2 -> leaves.add(new SmallLeaf(x, y));
            }
        }
    }
    private void generateBranches(int count) {
        int startX = 350;
        int startY = 375;
        int maxLength = 60;

        int angleIncrement = 30;

        for (int i = 0; i < count; i++) {
            double angle = Math.toRadians(-30 + (i * angleIncrement)  );

            int length = 100 + random.nextInt(maxLength);
            int endX = (int) (startX + length * Math.cos(angle));
            int endY = (int) (startY - length * Math.sin(angle));

            branches.add(new Branch(startX, startY, endX, endY));
        }
    }




    class DrawPanel extends JPanel {
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                trunk.draw(g);

                for (Branch branch : branches) {
                    branch.draw(g);
                }
                for (Leaf leaf : leaves) {
                    leaf.draw(g);
                }
                new Sun().paintComponent(g);



            }
        }
    }
