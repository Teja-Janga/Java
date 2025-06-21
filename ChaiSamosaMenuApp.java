
import java.util.Scanner;

public class ChaiSamosaMenuApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int chaiPrice = 10;
        int samosaPrice = 15;
        int total = 0;
        int chaiQty = 0, samosaQty = 0;

        System.out.println(" Welcome to Chai-Samosa Stall!");
        System.out.println("-------------------------------");
        System.out.println("MENU:");
        System.out.println("1. Chai     - Rs." + chaiPrice+"/-");
        System.out.println("2. Samosa   - Rs." + samosaPrice+"/-");
        System.out.println("3. Both");
        System.out.println("4. Nothing / Exit");

        try {
        System.out.print("\nEnter your choice (1/2/3/4): ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("How many cups of Chai? ");
                chaiQty = sc.nextInt();
                total = chaiQty * chaiPrice;
                break;

            case 2:
                System.out.print("How many Samosas? ");
                samosaQty = sc.nextInt();
                total = samosaQty * samosaPrice;
                break;

            case 3:
                System.out.print("How many cups of Chai? ");
                chaiQty = sc.nextInt();
                System.out.print("How many Samosas? ");
                samosaQty = sc.nextInt();
                total = (chaiQty * chaiPrice) + (samosaQty * samosaPrice);
                break;

            case 4:
                System.out.println("Alright, maybe next time!");
                break;

            default:
                System.out.println("Invalid choice! Please try again.");
                break;
        }

        if (total > 0) {
            System.out.println("\n Order Summary:");
            if (chaiQty > 0) System.out.println("Chai x " + chaiQty + " = Rs." + (chaiQty * chaiPrice)+"/-");
            if (samosaQty > 0) System.out.println("Samosa x " + samosaQty + " = Rs." + (samosaQty * samosaPrice)+"/-");
            System.out.println("Total Bill = Rs." + total+"/-");
            System.out.println("\nEnjoy your snacks!");
        }
    }
        catch(Exception e){
            System.out.println(" Invalid input! Please enter the input correctly.");
        }
        finally {
            sc.close();
        }
    }
}
