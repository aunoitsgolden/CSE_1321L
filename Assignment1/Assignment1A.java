/*
Class:      CSE1321L
Section:    J03
Term:       Fall 2023
Instructor: Mourya
Name:       Rowan Golden
Lab#:       202
*/
import java.util.Scanner;

public class Assignment1A {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a red value (0-255): ");
        int red = input.nextInt();
        System.out.print("Enter a green value (0-255): ");
        int green = input.nextInt();
        System.out.print("Enter a blue value (0-255): ");
        int blue = input.nextInt();
        System.out.print("Percentage to brighten color: ");
        float perc = input.nextFloat();

        float newRed = ((255 - red) * perc) +  red;
        float newGreen = ((255 - green) * perc) +  green;
        float newBlue = ((255 - blue) * perc) +  blue;

        System.out.println("\nA "+(perc*100)+"% brighter tint of RGB ("+red+", "+green+", "+blue+") is RGB ("+newRed+", "+newGreen+", "+newBlue+").");
    }
}
