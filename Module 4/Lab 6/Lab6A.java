import java.util.Scanner;

class Lab6A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter 10 numbers and this program will display the largest.\n");
        
        // initialize variable we're using for largest input
        int x = 0;

        // start loop (start at 0 to create good habits)
        for (int i = 0; i <= 9; i++) {
            // print question over and over
            System.out.print("Please enter number "+ (i+1) +": ");
            int y = input.nextInt();

            // update x if y is larger
            if (y > x) {
                x = y;
            }
        }
        input.close();
        System.out.println("\nThe largest number was "+ x);
    }    
}
