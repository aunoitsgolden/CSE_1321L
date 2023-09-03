import java.util.Scanner;

public class Assignment2C {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // User Input
        System.out.print("X coordinate (bottom-left corner): ");
        int x1 = input.nextInt();
        System.out.print("Y coordinate (bottom-left corner): ");
        int y1 = input.nextInt();
        System.out.print("Hit box width: ");
        int width = input.nextInt();
        System.out.print("Hit box height: ");
        int height = input.nextInt();

        // Equations
        int x2 = x1 + width;
        int y2 = y1 + height;

        // Coordinate Output
        System.out.println("\n[Sprite Hit Box Coordinates]");
        System.out.println("Bottom-Left: "+x1+", "+y1);
        System.out.println("Top-Left: "+x1+", "+y2);
        System.out.println("Bottom-Right: "+x2+", "+y1);
        System.out.println("Top-Right: "+x2+", "+y2);
        System.out.println("--------------------------------------------------------------");
    }
}
