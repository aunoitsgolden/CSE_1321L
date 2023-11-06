import java.util.Scanner;

public class Lab11A {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int menuChoice;
        String userChoice;

        do {
            System.out.print("Menu"
                            +"\n0) Hello World"
                            +"\n1) Goodbye Moon"
                            +"\n2) Walking on Sunshine"
                            +"\n"
                            +"\nWhat would you like to do: ");
            menuChoice = input.nextInt();

            System.out.println(" ");
            switch (menuChoice) {
                case 0:
                    System.out.println("Hello!");
                    break;

                case 1: 
                    System.out.println("Ok, bye.");
                    break;

                case 2: 
                    System.out.println("WHOA!");
                    break;
            }
            System.out.println(" ");
            input.nextLine();
            
            System.out.print("Type YES to rerun. ");
            userChoice = input.nextLine();
            System.out.println(" ");

        } while (userChoice.equalsIgnoreCase("yes"));

        input.close();
        System.out.println("Program Ends");
    }
}
