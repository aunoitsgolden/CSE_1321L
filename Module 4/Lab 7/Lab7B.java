import java.util.Scanner;

class Lab7B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter a value for the size: ");
        int size = input.nextInt();
        input.close();

        System.out.println("This is the requested "+size+"x"+size+" right-triangle:");
        for (int x = 0; x < size; x++) {
            System.out.print("*");
            // as long as y < x: show another star *. This does not print when y = x, which creates a triangle rather than a box
            for (int y = 0; y < size && y < x; y++) {
                System.out.print("*"); 
            }
            System.out.print("\n");
        }
    }
}
