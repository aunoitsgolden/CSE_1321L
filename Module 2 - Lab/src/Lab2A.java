/*
Class:      CSE 1321L
Section:    J03
Term:       Fall 2023
Instructor: Mourya
Name:       Rowan Golden
Lab#:       202
*/
import java.util.*;

public class Lab2A {


   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

       System.out.println("Enter a name: ");
       String name1 = input.nextLine();

       System.out.println("Enter another name: ");
       String name2 = input.nextLine();

       System.out.println("Enter a verb: ");
       String verb = input.nextLine();

       System.out.println("Enter an adverb: ");
       String adverb = input.nextLine();

       System.out.println("Once upon a time, there was a person named "+name1+" who had a child named "+name2+". "+"This child would "+verb+" "+adverb+" while singing to strangers.");
    }
}