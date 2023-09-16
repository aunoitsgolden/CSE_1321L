/*
----------------------------------------------
     _   _   _             _   _             _ 
    / \ | |_| |_ ___ _ __ | |_(_) ___  _ __ | |
   / _ \| __| __/ _ \ '_ \| __| |/ _ \| '_ \| |
  / ___ \ |_| ||  __/ | | | |_| | (_) | | | |_|
 /_/   \_\__|\__\___|_| |_|\__|_|\___/|_| |_(_)

In this doc I include Version 1 and a Version 2 of Assignment 3B
I use a very linear, non-reusable approach to solving the problem
(because it's easier on the brain)
If you're looking for a more complex solution, scroll down to where it says "Version 2"
Thank you!

(Big letter font used: "Standard" from ASCII Art Generator)
----------------------------------------------
 __     __            _               _ 
 \ \   / /__ _ __ ___(_) ___  _ __   / |
  \ \ / / _ \ '__/ __| |/ _ \| '_ \  | |
   \ V /  __/ |  \__ \ | (_) | | | | | |
    \_/ \___|_|  |___/_|\___/|_| |_| |_|
*/
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

/*
 __     __            _               ____  
 \ \   / /__ _ __ ___(_) ___  _ __   |___ \ 
  \ \ / / _ \ '__/ __| |/ _ \| '_ \    __) |
   \ V /  __/ |  \__ \ | (_) | | | |  / __/ 
    \_/ \___|_|  |___/_|\___/|_| |_| |_____|
*/
