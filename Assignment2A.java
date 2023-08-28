import java.util.Scanner;

public class Assignment2A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("[Octagon Calculator]");
        System.out.print("Enter the length of one side: ");
        int length = input.nextInt();
        int octPerim = 8 * length;
        float octArea = 2* (1 + Math.sqrt(2) * (length ** 2));
        System.out.print("Octagon Perimeter = " + octPerim);
        System.out.print("Octagon Area = " + octArea + "\n");

        System.out.println("[Cylinder Calculator]");
        System.out.print("Enter the radius: ");
        int radius = input.nextInt();
        System.out.print("Enter the height: ");
        int height = input.nextInt();
        System.out.print("Cylinder Perimeter = " + cylPerim);
        System.out.print("Cylinder Area = " + cylArea);
    }
}