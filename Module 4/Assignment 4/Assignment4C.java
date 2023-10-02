import java.util.Scanner;

class Assignment4C {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("[4 Gallons of Water]");

        int can3 = 0;
        int can5 = 0;
        int pour = 0;

        System.out.println("The 3 gallon can has "+can3+" gallons of water. The 5 gallon can has "+can5+" gallons of water.");
        do {
            System.out.print("\nOptions"
                            +"\n1) Fill the 5 gallon can from the fountain"
                            +"\n2) Fill the 3 gallon can from the fountain"
                            +"\n3) Pour the 5 gallon can into the 3 gallon jug"
                            +"\n4) Pour the 3 gallon can into the 5 gallon jug"
                            +"\n5) Empty the 5 gallon can into the fountain"
                            +"\n6) Empty the 3 gallon can into the fountain"
                            +"\nWhat will you do? "
                            );
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    can5 = 5;
                    break;

                case 2:
                    can3 = 3;
                    break;
                
                case 3:
                    if (3 - can3 >= can5) {
                        can3 += can5;
                        can5 = 0;
                    } else {
                        can5 -= 3 - can3;
                        can3 = 3;
                    }
                    break;

                case 4:
                    if (5 - can5 >= can3) {
                        can5 += can3;
                        can3 = 0;
                    } else {
                        can3 -= 5 - can5;
                        can5 = 5;
                    }
                    break;

                case 5:
                    can5 = 0;
                    break;

                case 6:
                    can3 = 0;
                    break;
            }
            
            System.out.println("\nThe 3 gallon can has "+can3+" gallons of water. The 5 gallon can has "+can5+" gallons of water.");

        } while (can5 != 4);

        input.close();
        System.out.print("You saved Bruce Willis and Samuel L. Jackson! You win!");
    }
}
