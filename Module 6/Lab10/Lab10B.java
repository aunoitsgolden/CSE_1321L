import java.util.Scanner;

class Lab10B {
    public static boolean isValid(double width, double height) {
        if ((width + height) > 30) {
            return true;
        } else {
            return false;
        }
    }
    public static double area(double width, double height) {
        return width * height;
    }
    public static double perimeter(double width, double height) {
        return (2*width)+(2*height);
    }
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        char choice = 'Y';

        while (choice != 'N') {
            System.out.print("Enter width: ");
            double width = input.nextFloat();
            System.out.print("Enter height: ");
            double height = input.nextFloat();
            input.nextLine(); // consume \n

            if (isValid(width, height) == true) {
                System.out.println("This is a valid rectangle");
                System.out.println("The area is: "+area(width, height));
                System.out.println("The perimeter is "+perimeter(width, height));
            } else {
                System.out.println("This is an invalid rectangle");
            }
            System.out.print("\nDo you want to enter another width and height (Y/N)? : ");
            choice = input.nextLine().charAt(0);
            System.out.println(" ");
        }
        System.out.println("Program Ends");
        input.close();
    }
}
