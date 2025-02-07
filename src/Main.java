import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("CAUTION: ENTER AN AMOUNT ABOVE 50 ");
        System.out.println("Enter the amounts of leaf required for the Tree: ");
        int LeadAmount = sc.nextInt();
        if(LeadAmount < 50)
        {
            System.out.println("Not enough leaves");

        }
        else{
            new Assembler(LeadAmount);

        }
    }
}
