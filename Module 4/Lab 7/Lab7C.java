import java.util.Scanner;

class Lab7C {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter a value for the size: ");
        int size = input.nextInt();
        input.close();

        System.out.println("This is the requested "+size+"x"+size+" right-triangle:");
        for (int x = 0; x < size; x++) {
            for (int y = 0; y < size - x; y++) {
                System.out.print(" ");
            }
            for (int z = -1; z < size && z < x; z++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
