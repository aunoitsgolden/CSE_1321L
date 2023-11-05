import java.util.Scanner;

public class Assignment6A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("[Building Character]");
        System.out.print("Enter an array width: ");
        int width = input.nextInt();
        System.out.print("Enter an array height: ");
        int height = input.nextInt();
        System.out.print("Enter an initial value: ");
        float startVal = input.nextFloat();
        
        // initialize and print array w/ starting value
        System.out.println("\nCreating an array with "+height+" row(s) and "+width+" column(s)\n");
        float arr[][] = new float[height][width]; 
        for (int i = 0; i < height; i++) {
            updateRow(arr, width, height, i, 0, width, startVal);
        }
        print_array(arr, height, width);
         
        // print array w/ -(starting value)
        System.out.println("\nMaking the first row negative\n");
        startVal *= -1;
        updateRow(arr, width, height, 0, 0, width, startVal);
        print_array(arr, height, width);
    
        // print array w/ single updated value
        System.out.print("\nEnter a row index: ");
        int rowInd = input.nextInt();
        System.out.print("Enter a column index: ");
        int colInd = input.nextInt();
        System.out.print("Enter a value: ");
        float val = input.nextFloat();
        System.out.print("\n");
        updateRow(arr, width, height, rowInd, colInd, 1, val);
        print_array(arr, height, width);

        // print array w/ "12.78" for even rows and "87.21" for odd rows
        System.out.println("\nAlternating rows\n");
        for (int l = 0; l < height; l++) {
            if (l % 2 == 0) {
                updateRow(arr, width, height, l, 0, width, 12.78f);
            } else {
                updateRow(arr, width, height, l, 0, width, 87.21f);
            }
        }
        print_array(arr, height, width);

        // print array w/ multiple updated values
        boolean doAble = false;
        do {
            System.out.print("\nEnter a row index: ");
            rowInd = input.nextInt();
            System.out.print("Enter a column index: ");
            colInd = input.nextInt();
            System.out.print("Enter a length: ");
            int rowLength = input.nextInt();
            System.out.print("Enter a value: ");
            val = input.nextFloat();

            if (updateRow(arr, width, height, rowInd, colInd, rowLength, val) == false) {
                System.out.println("\nInvalid information! Try again.");
            } else {
                System.out.print("\n");
                print_array(arr, height, width);
                input.close();
                doAble = true; 
            }
        } while (doAble == false);

        System.out.println("\n[Finally done!]");
    }
    
    public static void print_array(float[][] array, int rows, int columns) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print((array[i][j])+", ");
            }
            System.out.print("\n");
        }
    }
    
    public static boolean updateRow(float[][] array, int width, int height, int rowIndex, int columnIndex, int rowLength, float value) {
        if (columnIndex > height || rowIndex > width) {
            return false;
        } else {
            if (columnIndex + rowLength > width) { 
                return false;
            } else {  
                for (int j = columnIndex; j < (rowLength+columnIndex); j++) {
                        array[rowIndex][j] = value;
                    }
                }
                return true;
            
        }
    }
}
