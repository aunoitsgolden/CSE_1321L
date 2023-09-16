import java.util.Scanner;

class Assignment3B {
  public static void main(String[] args) {
    System.out.println("[World Traveler Checklist]]");
    Scanner input = new Scanner(System.in);

    int counters = 0;
    System.out.print("Have you been to Africa? ");
    switch (input.next().charAt(0)) {
      case 'Y':
        counters++;
        break;
    }
    System.out.print("Have you been to Antarctica? ");
    switch (input.next().charAt(0)) {
      case 'Y':
        counters++;
        break;
    }
    System.out.print("Have you been to Asia? ");
    switch (input.next().charAt(0)) {
      case 'Y':
        counters++;
        break;
    }
    System.out.print("Have you been to Australia? ");
    switch (input.next().charAt(0)) {
      case 'Y':
        counters++;
        break;
    }
    System.out.print("Have you been to Europe? ");
    switch (input.next().charAt(0)) {
      case 'Y':
        counters++;
        break;
    }
    System.out.print("Have you been to North America? ");
    switch (input.next().charAt(0)) {
      case 'Y':
        counters++;
        break;
    }
    System.out.print("Have you been to South America? ");
    switch (input.next().charAt(0)) {
      case 'Y':
        counters++;
        break;
    }
    input.close();

    switch (counters) {
      case 1:
        System.out.print("\nYou have visited 1 continent: ");
        break;
      default:
        System.out.print("\nYou have visited "+counters+" continents: ");
        break;
    }
      
    switch (counters) {
      case 0:
        System.out.print("How is that possible? Are you living in space?");
        break;
      case 1:
        System.out.print("That's a good start. Time to explore the world!");
        break;
      case 2:
      case 3:
        System.out.print("You've just started your journey to see the world.");
        break;
      case 4:
      case 5:
        System.out.print("You're an experienced traveler now.");
        break;
      case 6:
        System.out.print("Wow, you've bee almost everywhere!");
        break;
      case 7:
        System.out.print("You're a true world travler!");
        break;
    }
  }
}
