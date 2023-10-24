import java.util.Scanner;

class Lab10A {
    public static int min(int x, int y) {
        int minValue;
        if (x > y) {
            minValue = y;
        } else {
            minValue = x;
        }
        return minValue;    
    }
    public static int max(int x, int y) {
        int maxValue;
        if (x > y) {
            maxValue = x;
        } else {
            maxValue = y;
        }
        return maxValue;    
    }
    public static float average(int x, int y) {
        float sum = x + y;
        return sum/2;    
    }
    public static void main(String[] args) {   
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = input.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = input.nextInt();
        input.close();

        System.out.println("Min is "+min(num1, num2));
        System.out.println("Max is "+max(num1, num2));
        System.out.println("Average is "+average(num1, num2));
    }
}
