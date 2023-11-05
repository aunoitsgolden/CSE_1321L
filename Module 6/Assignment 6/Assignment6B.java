import java.util.Scanner;

public class Assignment6B {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("[X PixMap Editor]");
        
        String[] colorMap = new String[8];
        int i = 0;
        for (int j = 1; j <= 4; j++) {
            System.out.print("Enter a hexadecimal color for color "+j+": ");
            colorMap[i+1] = input.nextLine();
            System.out.print("Enter a letter to represent this color: ");
            colorMap[i] = input.nextLine();
            i += 2; 
        }

        System.out.print("\n");
        System.out.print("Enter a width: ");
        int width = input.nextInt();
        System.out.print("Enter a height: ");
        int height = input.nextInt();    
        String[][] xmpImage = new String[height][width];
        replaceColor(xmpImage, width, height, "", colorMap[0]); // "" == null

        int choice = 0;
        do {
            System.out.print("\nOptions:"
                            +"\n1) Set a color"
                            +"\n2) Replace colors"
                            +"\n3) Print X PixMap"
                            +"\n4) Quit"
                            +"\nChoice: ");
            choice = input.nextInt();
            System.out.print("\n");

            switch (choice) {
                case 1:
                    System.out.print("Enter a row index: ");
                    int rowInd = input.nextInt();
                    System.out.print("Enter a column index: ");
                    int colInd = input.nextInt();
                    input.nextLine();
                    System.out.print("Enter a color: ");
                    String chosenColor = input.nextLine();

                    if (check_if_valid_color(colorMap, chosenColor) == true) {
                        xmpImage[rowInd][colInd] = chosenColor;
                        System.out.println("Color updated!");
                    } else {
                        System.out.print("Color is not in the color map!");
                    }
                    break;

                case 2:
                    input.nextLine();
                    System.out.print("Enter the color to replace: ");
                    String replaceable = input.nextLine();
                    System.out.print("Enter the new color: ");
                    String newColor = input.nextLine();

                    if (check_if_valid_color(colorMap, newColor) == true) {
                        replaceColor(xmpImage, width, height, replaceable, newColor);
                        System.out.println("Color updated!");
                    } else {
                        System.out.println("Color is not in the color map!");
                    }
                    break;

                case 3:
                    PrintXPixMap(colorMap, xmpImage, width, height);
                    break;
            }

        } while (choice != 4);
        input.close();
        System.out.println("[Closing...]");
    }   
    
    public static void PrintXPixMap(String[] arr1D, String[][] arr2D, int width, int height) {
        System.out.print("#define image_format 1\n" // can only be 1 as it is an XMP
                        +"#define image_width "+width+"\n"
                        +"#define image_height "+height+"\n"
                        +"#define image_ncolors 4\n" // can only be 4 as we only ask for 4 colors 
                        +"#define image_chars_per_pixel 1\n"); // can only be 1 as only 1 character represents each colors
        
        System.out.print("static char *image_colors[] = {");
        int max = arr1D.length;
        for (int i = 0; i < max; i++) {
            if (i % 2 == 0) {
                System.out.print("\n");
            }
            System.out.print("\""+arr1D[i]+"\"");
            if (i != max-1) {
                System.out.print(", ");
            }
        }
        System.out.print("\n};\n");
        
        System.out.print("static char *image_pixels[] = {\n");
        for (int j = 0; j < height; j++) {
            System.out.print("\"");
            for (int k = 0; k < width; k++) {
                System.out.print(arr2D[j][k]);
            }
            if (j != height - 1) {
                System.out.print("\", ");
            } 
            System.out.print("\n");
        }
        System.out.print("};\n");
    }   

    public static boolean check_if_valid_color(String[] colorScheme, String color) {
        for (int i = 0; i < colorScheme.length; i++) {
            if (colorScheme[i].equals(color)) {
                return true;
            }
        }
        return false;
    } 

    public static void replaceColor(String[][] xmp, int width, int height, String replaceableColor, String newColor) {
        for (int i = 0; i < height; i++) { // iterate through 2D array one row at a time
            for (int j = 0; j < width; j++) { 
                if (xmp[i][j] == null || xmp[i][j].equals(replaceableColor)) {
                    xmp[i][j] = newColor; // replace any instance of color 1 w/ color 2
                } else {
                    continue;
                }                 
            }
        }
    }
}
