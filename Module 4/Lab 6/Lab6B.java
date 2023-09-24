import java.util.Scanner;
import java.util.Random;

class Lab6B {
    public static void main(String[] args) {
        // Initialize scanner and random
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        // Define target value
        System.out.println("Enter a number between 1 and 1000: ");
        int target = input.nextInt();
    
        // Loop for computer to guess target
        int guess = 0;
        int i = 1;
        while (guess != target) {
            guess = rand.nextInt(1000);
            System.out.println("My guess was "+ guess);            
            i++;
        }
        
        System.out.println("\nI guessed the number was "+ guess +" and it only took me "+ i +" guesses");
    }
}
