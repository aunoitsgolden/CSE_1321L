import java.util.Scanner;

class Lab8C {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] arr2D;
        int[] arr1D;
        int n = 0;

        System.out.print("Please enter the number of rows: ");
        int rows = input.nextInt();
        System.out.print("Please enter the number of columns: ");
        int columns = input.nextInt();
        input.close();

        int totalCells = rows*columns;
        arr2D = new int[rows][columns];
        arr1D = new int[totalCells];
        
        System.out.println("\nI have "+ rows +" rows and "+ columns +" columns. I need to fill-up "+ totalCells +" spaces.");
        System.out.println("\nThe "+ rows +"x"+ columns +" array:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                arr2D[i][j] = n + 1;
                arr1D[n] = arr2D[i][j];
                System.out.print(arr2D[i][j]+"|");
                n++;
            }
            System.out.print("\n");
        }

        System.out.println("\nThe "+ rows +"x"+ columns +" 2-D array flattened into a "+ totalCells +" cell 1-D array:");
        for (int k = 0; k < totalCells; k++) {
            System.out.print(arr1D[k] +"|");
        }
    }
}
