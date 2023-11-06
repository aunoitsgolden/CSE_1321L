import java.util.Scanner;

public class Lab11B {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a password: ");
        String pw = input.nextLine();
        input.close();

        boolean lengthReq = pw.length() >= 8;
        boolean containsDigit = pw.matches(".*[0-9].*");
        boolean containsUpper = pw.matches(".*[A-Z].*"); 

        if (lengthReq && containsDigit && containsUpper) {
            System.out.println("Valid password");
        } else {
            System.out.println("Invalid password");
        }
        System.out.print("\nProgram Ends\n");
    }   
}
