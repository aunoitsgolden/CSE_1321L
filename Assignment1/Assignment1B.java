/*
Class:      CSE1321L
Section:    J03
Term:       Fall 2023
Instructor: Mourya
Name:       Rowan Golden
Lab#:       202
*/
import java.util.Scanner;

public class Assignment1B {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("[What to Tip]");
        System.out.print("Enter the total price of the meal: ");
        float meal = input.nextFloat();
        System.out.print("Enter the local tax rate: ");
        float tax = input.nextFloat();
        System.out.print("Enter the service charge: ");
        float service = input.nextFloat();

        float mealTax = meal * tax;
        float subtotal = meal + service;
        float totalAfterTax = subtotal + mealTax;

        System.out.println("\nThe subtotal is $"+ subtotal +"\n");

        double tax10 = subtotal*.1;
        System.out.println("A 10% tip would be $"+ tax10);
        System.out.println("The total would be $"+ (tax10 + totalAfterTax) +"\n");

        double tax25 = subtotal*.25;
        System.out.println("A 25% tip would be $"+ tax25);
        System.out.println("The total would be $"+ (tax25 + totalAfterTax));
    }
}
