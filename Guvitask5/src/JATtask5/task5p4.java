package JATtask5;
import java.util.Scanner;


public class task5p4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        sc.close();

        int mid = n / 2;
        for (int i = 0; i <= mid; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            int inner = n - 2 - 2 * i;
            if (inner >= 0) {
                for (int j = 0; j < inner; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = mid - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            int inner = n - 2 - 2 * i;
            if (inner >= 0) {
                for (int j = 0; j < inner; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}