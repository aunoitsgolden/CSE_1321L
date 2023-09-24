import java.util.Scanner;

class Lab6C {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome!");

        int balance = 1000;
        System.out.println("You have $"+ balance +" in your account.");
        
        char repeatMenu;
        do {
            System.out.print("\nMenu"
                            +"\n0 - Make a deposit"
                            +"\n1 - Make a withdrawal"
                            +"\n2 - Display account value\n"
                            );
            
            System.out.print("\nPlease make a selection: ");
            int choice = input.nextInt();

            switch (choice) {
                case 0:
                    System.out.print("How much would you like to deposit? : ");
                    balance += input.nextInt();
                    System.out.println("Your current balance is $"+ balance); 
                    break;
                
                case 1:
                    System.out.print("How much would you like to withdrawal? : ");
                    balance -= input.nextInt();
                    System.out.println("Your current balance is $"+ balance); 
                    break;
                
                case 2:
                    System.out.println("Your current balance is $"+ balance); 
                    break;
                
                default:
                    System.out.println("Invalid entry, please try again.");
                    break;
                }

            System.out.print("Would you like to return to the main menu (Y/N)? : ");
            repeatMenu = input.next().charAt(0);
        
        } while (repeatMenu != 'N' && repeatMenu != 'n');
        
        input.close();
        System.out.println("\nThank you for banking with us!");
    }
}
