import java.util.Scanner;

class Lab8B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] arr;
        int n = 0;

        System.out.print("Please enter the number of rows: ");
        int rows = input.nextInt();
        System.out.print("Please enter the number of columns: ");
        int columns = input.nextInt();

        arr = new int[rows][columns];
        input.close();
        
        System.out.println("\nI have "+ rows +" rows and "+ columns +" columns. I need to fill-up "+ (rows*columns) +" spaces.");
        System.out.println("\nThe "+ rows +"x"+ columns +" array:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                arr[i][j] = n + 1;
                System.out.print(arr[i][j]+"|");
                n++;
            }
            System.out.print("\n");
        }
    }
}
