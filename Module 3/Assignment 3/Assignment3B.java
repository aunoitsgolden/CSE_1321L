/*
----------------------------------------------
     _   _   _             _   _             _ 
    / \ | |_| |_ ___ _ __ | |_(_) ___  _ __ | |
   / _ \| __| __/ _ \ '_ \| __| |/ _ \| '_ \| |
  / ___ \ |_| ||  __/ | | | |_| | (_) | | | |_|
 /_/   \_\__|\__\___|_| |_|\__|_|\___/|_| |_(_)

!! If you are to copy my work, do not use Version 2 in doing so. 
You will absolutely be flagged for cheating !!

A note:
In this doc I include Version 1 and a Version 2 of Assignment 3B
Version 1 is linear and has a non-reusable approach to solving the problem.

This is partially because because it's easier on the brain, but also because 
the Professor is not looking to include arrays in the solution for the problem.
We have not covered arrays in our material yet, and Version 2 uses arrays to 
shorten the amount of code you have to right to solve the problem. 
If you're interested in learning more about arrays, check out Module 5 on the
Lab page. It's cool stuff!

Also, a reminder to you all that if you have any questions or requests when I 
post on here, let me know. I want to help you the best I can, so if I need to 
explain my code throughout the process more, or hop in a call, I will. 

TLDR; Version 1 is linear, Version 2 uses arrays. Don't be afraid to reach out.

Thanks!

(Big letter font used: "Standard" from ASCII Art Generator)
----------------------------------------------

Version 1: 
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

// Version 2:
