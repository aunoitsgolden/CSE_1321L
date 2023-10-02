import java.util.Scanner;

class Assignment4B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("[Plus Sign ASCII Art]");
        System.out.print("Font-size: ");
        int size = input.nextInt();
        System.out.print("Font-weight: ");
        int weight = input.nextInt();
        input.close();
      
        System.out.print("Drawing with text...\n");

        // Top
        for (int top = 0; top < size; top++) {
            for (int spaces = 0; spaces < size; spaces++) {
                System.out.print(" ");
            }
            for (int line = 0; line < weight; line++) {
                System.out.print("|");
            }
            System.out.print("\n");
        }
        // Center
        int width = size * 2 + weight;
        for (int height = 0; height < weight; height++) {
            for (int line = 0; line < width; line++) {
                System.out.print("-");
            }
            System.out.print("\n");
        }
        // Bottom
        for (int top = 0; top < size; top++) {
            for (int spaces = 0; spaces < size; spaces++) {
                System.out.print(" ");
            }
            for (int line = 0; line < weight; line++) {
                System.out.print("|");
            }
            System.out.print("\n");
        }
    }
}
