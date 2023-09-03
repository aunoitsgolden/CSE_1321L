import java.util.Scanner;

class Lab4A {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    
    // input
    System.out.print("Enter the score of your exam: ");
    float score = input.nextFloat();
    input.close();
    
    // grade
    String grade;
    if (score > 100) {
      grade = "Wow! A+++";
    } else if (score > 97) {
      grade = "A+";
    } else if (score > 95) {
      grade = "A";
    } else if (score > 92) {
      grade = "A-";
    } else if (score > 89) {
      grade = "B+";
    } else if (score > 86) {
      grade = "B";
    } else if (score > 83) {
      grade = "B-";
    } else if (score > 80) {
      grade = "C+";
    } else if (score > 77) {
      grade = "C";
    } else if (score > 74) {
      grade = "C-";
    } else if (score > 71) {
      grade = "D+";
    } else if (score > 68) {
      grade = "D";
    } else if (score > 65) {
      grade = "D-";
    } else if (score >= 0) {
      grade = "F";
    } else {
      grade = "";
    }

    // Output
    if (grade == null) {
      System.out.println("Please enter a valid score."); 
    } else {
      System.out.println("Letter grade is: "+grade);
    }
  }
}
