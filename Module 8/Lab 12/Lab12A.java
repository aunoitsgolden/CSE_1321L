import java.util.Scanner;

class Chair {

    public int numOfLegs;
    public boolean rolling;
    public String material;

    public Chair(int numOfLegs, boolean rolling, String material) {
        this.numOfLegs = numOfLegs;
        this.rolling = rolling;
        this.material = material;
    }

}

public class Lab12A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("You are about to create a chair.");
        System.out.print("How many legs does your chair have: ");
        int legs = input.nextInt();
        System.out.print("Is your chair rolling (true/false): ");
        boolean roll = input.nextBoolean();
        input.nextLine();
        System.out.print("What is your chair made of: ");
        String matter = input.nextLine();
        input.close();

        Chair ch1 = new Chair(legs, roll, matter);

        // use of conditional oneliner
        System.out.println("\nYour chair has "+ch1.numOfLegs+" legs, is "+(ch1.rolling == true? "":"not ")+"rolling, and is made of "+ch1.material+".");
        
        System.out.println("\nThis program is going to change that.");
        ch1.numOfLegs = 4;
        ch1.rolling = false;
        ch1.material = "wood";

        System.out.println("\nYour chair has "+ch1.numOfLegs+" legs, is "+(ch1.rolling == true? "":"not ")+"rolling, and is made of "+ch1.material+".");
    }
}
