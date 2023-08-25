import java.util.*;
public class Lab2C {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a width: ");
        int width = input.nextInt();

        System.out.print("Enter a height: ");
        int height = input.nextInt();

        int area = width*height;
        int perimeter = 2*(width*height);

        System.out.println("The area is "+area);
        System.out.println("The perimeter is "+perimeter);
    }
}
