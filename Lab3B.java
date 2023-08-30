import java.util.*;

class Lab3B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input
        System.out.print("Course 1 hours: ");
        float course1 = input.nextFloat();
        System.out.print("Grade for course 1: ");
        float grade1 = input.nextFloat();

        System.out.print("Course 2 hours: ");
        float course2 = input.nextFloat();
        System.out.print("Grade for course 2: ");
        float grade2 = input.nextFloat();

        System.out.print("Course 3 hours: ");
        float course3 = input.nextFloat();
        System.out.print("Grade for course 3: ");
        float grade3 = input.nextFloat();

        System.out.print("Course 4 hours: ");
        float course4 = input.nextFloat();
        System.out.print("Grade for course 4: ");
        float grade4 = input.nextFloat();

        input.close();

        // Equations
        float totalPts = (float) Math.round((course1 + course2 + course3 + course4) * 1000) /1000;
        float qualityPts = course1 * grade1 + course2 * grade2 + course3 * grade3 + course4 * grade4;
        float gpa = qualityPts / totalPts;

        // Output
        System.out.println("Total hours is: "+ totalPts);
        System.out.println("Total quality points is: "+ qualityPts);
        System.out.println("Your GPA for this semester is "+ gpa);
    }
}