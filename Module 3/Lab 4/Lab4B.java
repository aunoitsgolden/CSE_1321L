import java.util.Scanner;

class Lab4B {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter the day: ");
    String today = (input.nextLine()).toLowerCase();
    input.close();
    
    if (today.equals("monday") || today.equals("wednesday")) {
      System.out.println("I have class today!");
    } else if (today.equals("friday")) {
      System.out.println("It's Friday! Friday! Gotta get down on Friday!");
    } else {
      System.out.println("I should use this time to do my homework.");
    }
  }
}
