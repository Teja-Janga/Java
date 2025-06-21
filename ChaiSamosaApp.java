

import java.util.Scanner;

public class ChaiSamosaApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int chaiPrice = 10;
        int samosaPrice = 15;
        int total = 0;
        System.out.println("Welcome to Chai-Samosa Corner!");

        System.out.print("Do you want Chai? (yes/no): ");
        String chai = sc.next();
        if (chai.equalsIgnoreCase("yes")) {
            total += chaiPrice;
        }

        System.out.print("Do you want Samosa? (yes/no): ");
        String samosa = sc.next();
        if (samosa.equalsIgnoreCase("yes")) {
            total += samosaPrice;
        }

        System.out.println("\nOrder Confirmed!");
        if (total == 0) {
            System.out.println("You didn't order anything");
        } else {
            System.out.println("Total Bill: Rs."+total+"/-");
        }

        sc.close();
    }
}
