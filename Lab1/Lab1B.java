/*
Class:      CSE1321L
Section:    J03
Term:       Fall 2023
Instructor: Mourya
Name:       Rowan Golden
Lab#:       202
 */

// Program Lab1B.java
// Demonstrate reading a string from the user.
import java.util.Scanner;
public class Lab1B
{
    // Reads a character string from the user and prints it.
    public static void main (String[] args)
    {
        String x;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a line of text: ");
        x = scan.nextLine();
        System.out.println("You wrote '" + x + "'");
    }
}
