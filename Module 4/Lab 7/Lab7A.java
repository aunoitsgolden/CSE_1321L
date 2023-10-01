import java.util.Scanner;

class Lab7A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a value for the size: ");
        int size = input.nextInt();
        input.close();

        System.out.println("This is the requested 4x4 box:");
        for (int x = 0; x < size; x++) {
            System.out.print("*");
            for (int y = 0; y < size; y++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
