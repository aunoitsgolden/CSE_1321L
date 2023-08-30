/*
Class:      CSE1321L
Section:    J03
Term:       Fall 2023
Instructor: Mourya
Name:       Rowan Golden
Lab#:       202
*/
import java.util.Scanner;

public class Assignment2B {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        // User Input
        System.out.print("Time in seconds: ");
        int timeInput = input.nextInt();

        // Equation
        int seconds = timeInput % 60;
        int convertMin = timeInput / 60;
        int minutes = convertMin % 60;
        int hours = convertMin / 60;

        // Time Output
        System.out.println("Converting...");
        System.out.println(timeInput+" seconds == "+hours+" hour(s), "+minutes+" minute(s), and "+seconds+" second(s).");
    }
}
