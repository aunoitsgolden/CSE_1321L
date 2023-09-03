import java.util.Scanner;

public class Assignment1C {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("[XKCD Passphrase Generator]\n");
        System.out.print("Enter your third favorite animal: ");
        String animal = input.nextLine();
        System.out.print("Enter the subtotal from your last take-out meal: ");
        float meal = input.nextFloat();
        System.out.print("Enter a whole number less than |32767|: ");
        int number = input.nextInt();
        System.out.print("Enter a single letter: ");
        char letter = input.next().charAt(0);

        System.out.println("\nYour passphrase is: "+animal+" "+meal+" "+number+" "+letter);
        System.out.println("Other variations are:");
        System.out.println(letter+" "+number+" "+animal+" "+meal);
        System.out.println(meal+" "+letter+" "+animal+" "+number);
        System.out.println(number+" "+animal+" "+letter+" "+meal);
    }
}
