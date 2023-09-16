import java.util.Scanner;

class Assignment3A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("[WebMD Checker]");
        System.out.print("What is your suspected illness? ");
        String illness = input.nextLine();

        switch (illness) {
          case "HGPS": {
            System.out.print("Do you have brittle bones? ");
            char answer = input.next().charAt(0);
            if (answer == 'Y') {
              System.out.print("It is possible that you have HGPS");
            } else {
              System.out.print("It is not likely that you have HGPS");
            }
          }
            input.close();
            break;
 
          case "Bokter Syndrome": {
            System.out.print("Do you have a Vitamin C deficiency? ");
            char answer = input.next().charAt(0);
            if (answer == 'Y') {
              System.out.print("Are you a sailor? ");
              char sailor = input.next().charAt(0);
              if (sailor == 'Y') {
                System.out.print("It is possible that you have Bokter Syndrome");
              } else {
                System.out.print("It is not likely that you have Bokter Syndrome");
              }
            } else {
                System.out.print("It is not likely that you have Bokter Syndrome");
              }
            }
              input.close();
              break;
            
          case "Lupus":
            System.out.print("It is not likely that you have Lupus");
            input.close();
            break;
        }
    }
}
