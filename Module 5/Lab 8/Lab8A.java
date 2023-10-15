import java.util.Scanner;

class Lab8A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr1 = new int[5];
        int[] arr2 = new int[5];
        int[] sums = new int[5];

        System.out.println("Please enter 5 integers for the first array:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Integer "+ (i + 1) +": ");
            arr1[i] = input.nextInt();
        }
        
        System.out.println("\nPlease enter 5 integers for the second array:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Integer "+ (i + 1) +": ");
            arr2[i] = input.nextInt();
        }
        input.close();

        for (int j = 0; j < 5; j++) {
            sums[j] = arr1[j] + arr2[j];
        }
        System.out.print("\nThe resulting sums are "+sums[0]+"|"+sums[1]+"|"+sums[2]+"|"+sums[3]+"|"+sums[4]+"|");
    }
}
