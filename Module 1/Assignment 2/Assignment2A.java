import java.util.Scanner;

public class Assignment2A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Octagon START
        System.out.println("[Octagon Calculator]");
        // Input
        System.out.print("Enter the length of one side: ");
        float length = input.nextFloat();
        // Equations
        float octPerim = 8 * length;
        double octArea = 2 * (1 + Math.sqrt(2)) * Math.pow(length, 2) ;
        // Output
        System.out.println("Octagon Perimeter = " + octPerim);
        System.out.println("Octagon Area = " + octArea + "\n");
        // Octagon END

        // Cylinder START
        System.out.println("[Cylinder Calculator]");
        // Input
        System.out.print("Enter the radius: ");
        float radius = input.nextFloat();
        System.out.print("Enter the height: ");
        float height = input.nextFloat();
        // Equations
        float cylPerim = 2 * (2 * radius + height);
        double pi = 3.14159;
        double cylArea = 2 * pi * radius * height + 2 * pi * Math.pow(radius, 2);
        // Output
        System.out.println("Cylinder Perimeter = " + cylPerim);
        System.out.println("Cylinder Area = " + cylArea);
        // Cylinder END
    }
}
