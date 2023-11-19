import java.util.Scanner;

class SVGRect {

    private float width;
    private float height;
    private String fillColor;
    private String strokeColor;
    private float strokeWidth;
    private float offsetX;
    private float offsetY;

    public SVGRect() { 
        width = 1;
        height = 1;
        fillColor = "#0000FF";
        strokeColor = "#0F0F0F";
        strokeWidth = 1;
        offsetX = 0;
        offsetY = 0;
    }

    public void UpdateValues(float width, float height, String fillColor, String strokeColor) {
        this.width = width;
        this.height = height;
        this.fillColor = fillColor;
        this.strokeColor = strokeColor;
    }

    public boolean setDimensions(float x, float y) {
        if (x > 0 && y > 0) {
            this.UpdateValues(x, y, this.fillColor, this.strokeColor);
            return true;
        } else {
            return false;
        }
    }

    public void setOffsets(float x, float y) {
        this.offsetX = x;
        this.offsetY = y;
    }

    public boolean set_fill_and_stroke(String x, String y, float z) {
        if (z > 0) {
            this.UpdateValues(this.width, this.height, x, y);
            this.strokeWidth = z;
            return true;
        } else {
            return false;
        }
    }

    public void Print_XML() {
        System.out.print("<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
                        +"\n<svg"
                        +"\n  xmlns=\"http://www.w3.org/2000/svg\""
                        +"\n  xmlns:svg=\"http://www.w3.org/2000/svg\">"
                        +"\n <rect"
                        +"\n    style=\"fill:"+this.fillColor+"; stroke:"+this.strokeColor+"; stroke-width:"+this.strokeWidth+"\""
                        +"\n    width=\"230\""
                        +"\n    height=\"390\""
                        +"\n    x=\""+(int)this.offsetX+"\""
                        +"\n    y=\""+(int)this.offsetY+"\" />"
                        +"\n</svg>\n"
                        // didn't use \t as it can only add 8 characters, not 4. Instead, used same spacing as used in Assignment 7 documentation 
        );
    }

}

public class Assignment7A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SVGRect f = new SVGRect();
        int choice;

        System.out.println("[SVG Class]");
        System.out.print("Rectangle width: ");
        float width = input.nextFloat();
        System.out.print("Rectangle height: ");
        float height = input.nextFloat();
        input.nextLine();
        System.out.print("Fill color: ");
        String fillColor = input.nextLine();
        System.out.print("Stroke color: ");
        String strokeColor = input.nextLine();
        f.UpdateValues(width, height, fillColor, strokeColor);

        do {
            System.out.print("\nWhat would you like to do?"
                            +"\n1) Change the Rectangle size"
                            +"\n2) Update the Fill and Stroke settings"
                            +"\n3) Move the Rectangle"
                            +"\n4) Print valid XML"
                            +"\n5) Quit"
                            +"\nOption: "
            );
            choice = input.nextInt();
            System.out.print("\n");

            switch (choice) {
                case 1:
                    System.out.print("Enter a width: ");
                    width = input.nextFloat();
                    System.out.print("Enter a height: ");
                    height = input.nextFloat();

                    if (f.setDimensions(width, height) == true) {
                        System.out.println("Rectangle updated!");
                    } else {
                        System.out.println("Invalid input - rectangle not changed.");
                    }
                    break;

                case 2:
                    input.nextLine();
                    System.out.print("Enter a new fill color: ");
                    fillColor = input.nextLine();
                    System.out.print("Enter a new stroke color: ");
                    strokeColor = input.nextLine();
                    System.out.print("Enter a new stroke width: ");
                    float strokeWidth = input.nextFloat();
                    
                    if (f.set_fill_and_stroke(fillColor, strokeColor, strokeWidth) == true) {
                        System.out.println("Rectangle updated!");
                    } else {
                        System.out.println("Invalid input - rectangle not changed.");
                    }
                    break;

                case 3:
                    System.out.print("Enter a new offset x: ");
                    float x = input.nextFloat();
                    System.out.print("Enter a new offset y: ");
                    float y = input.nextFloat();
                    f.setOffsets(x, y);
                    System.out.println("Rectangle updated!");
                    break;
                
                case 4:
                    f.Print_XML();  
                    break;
            }
            
        } while (choice != 5);
        
        input.close();
        System.out.println("Closing!");
    }
}
