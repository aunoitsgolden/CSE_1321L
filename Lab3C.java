import java.util.*;

class Lab3C {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input
        System.out.print("Enter the number of quarters: ");
        int quarters = input.nextInt();
        System.out.print("Enter the number of dimes: ");
        int dimes = input.nextInt();
        System.out.print("Enter the number of nickels: ");
        int nickels = input.nextInt();
        System.out.print("Enter the number of pennies: ");
        int pennies = input.nextInt();
        input.close();

        // Equations
        int total = 25 * quarters + 10 * dimes + 5 * nickels + pennies;
        int cents = total % 100;
        int dollars = total / 100;

        // Output
        System.out.println("\nYou entered "+ quarters +" quarters.");
        System.out.println("You entered "+ dimes +" dimes.");
        System.out.println("You entered "+ nickels +" nickels.");
        System.out.println("You entered "+ pennies +" pennies.");

        System.out.println("\nYour total is "+ dollars +" dollars and "+ cents +" cents.");
    }
}