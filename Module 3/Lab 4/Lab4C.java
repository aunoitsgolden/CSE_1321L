import java.util.Scanner;

class Lab4C {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Input
    System.out.print("Welcome!"
                    +"\nPlease input a number: ");
    float number = input.nextInt();
    
    System.out.print("\nWhat would you like to do to this number:"
                    +"\n0) Get the additive inverse of the number"
                    +"\n1) Get the reciprocal of the number"
                    +"\n2) Square the number"
                    +"\n3) Cube the number"
                    +"\n4) Exit the program"
                    +"\n\n");
        
    int choice = input.nextInt();
    input.close();

    // Do Something + Output
    float answer;
    switch (choice) {
      case 0:
        answer = number*-1;
        System.out.println("\nThe additive inverse of "+number+" is "+answer);
        break;
      case 1:
        answer = 1/number;
        System.out.println("\nThe reciprocal of "+number+" is "+answer);
        break;
      case 2:
        answer = number*number;
        System.out.println("\nThe square of "+number+" is "+answer);
        break;
      case 3:
        answer = number*number*number;
        System.out.println("\nThe cube of "+number+" is "+answer);
        break;
      case 4:
        System.out.println("\nThank you, goodbye!");
        break;
      default: 
        System.out.println("\nInvalid input, please try again!");
        break;
    }
  }
}
