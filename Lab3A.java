import java.text.DecimalFormat;

class Lab3A {
/*
    private static final DecimalFormat df = new DecimalFormat("0.00");
    private static final DecimalFormat df2 = new DecimalFormat("0.000");
*/  
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input
        System.out.print("Amount owed: $");
        int balance = input.nextInt();
        System.out.print("APR: ");
        float apr = input.nextFloat();
        input.close();

        // Equations
        float monthlyRate = (float) Math.round((apr / 12) * 1000)/1000;
        float minPayment = (float) Math.round(balance * apr / 12) / 100;
        // Output
        System.out.println("Monthly percentage rate: "+ monthlyRate);
        System.out.println("Minimum payment : $"+ minPayment);
    }
}
