import java.text.DecimalFormat;
import java.util.Scanner;

class Lab3A {

    private static final DecimalFormat df = new DecimalFormat("0.000");
    private static final DecimalFormat df2 = new DecimalFormat("0.00");
  
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input
        System.out.print("Amount owed: $");
        int balance = input.nextInt();
        System.out.print("APR: ");
        float apr = input.nextFloat();
        input.close();

        // Equations
        float monthlyRate = ((apr / 12) * 1000)/1000;
        String formatMonthly = df.format(monthlyRate);
        float minPayment = (balance * apr / 12) / 100;
        String formatMin = df2.format(minPayment);

        // Output
        System.out.println("Monthly percentage rate: "+ formatMonthly);
        System.out.println("Minimum payment : $"+ formatMin);
    }
}
