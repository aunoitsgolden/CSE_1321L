import java.util.Scanner;

class Lab3C {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("[Guess the Color Mode]");
    System.out.print("How many channels does your image have? ");
    int channels = input.nextInt();

    String colorMode = "";
    switch (channels) {
      case 1:
      case 2:
        colorMode = "Grayscale";
        break;

      case 3:
        colorMode = "RGB";
        break;

      case 4:
        System.out.print("What is its BPC Value? ");
        int bpc = input.nextInt();
        
        if (bpc == 32) {
          colorMode = "RGB";
        } 
        else if (bpc == 8 || bpc == 16) {
          System.out.print("What image format is it? ");
          input.nextLine(); // takes away leftover line from line 32 (bpc = nextInt)
          String image = input.nextLine();
          if 
            (image.equals("PNG")) {
            colorMode = "RGB";
          } 
          else if (image.equals("TIFF")) {
            colorMode = "CMYK";
          } 
          else {
            System.out.println("This image's color mode can not be determined.");
          }
        } 
        else {
          System.out.println("This is invalid input. Please run the program again.");
        }
        break;
        
      case 5:
        colorMode = "CMYK";
        break;

      default:
        System.out.println("This is invalid input. Please run the program again.");
        break;
    }

    input.close();

    if (colorMode.equals("Grayscale") || colorMode.equals("CMYK")) {
      System.out.println("It is a "+colorMode+" image.");
    } 
    else if (colorMode.equals("RGB")) {
      System.out.println("It is an "+colorMode+" image.");
    }
  }
}
