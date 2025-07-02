package JATtask5;

import java.util.Scanner;

public class task5p7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the first number");
		int num1=sc.nextInt();
		System.out.println("Enter the Second number");
		int num2=sc.nextInt();
		System.out.println("Enter the Third number");
		int num3=sc.nextInt();
		if (num1>num2&&num1>num3) {
			System.out.println("num 1 is the greatest among three");
		}
		else if(num2>num1&&num2>num3) {
				System.out.println("num2 is the greatest among three");
			}
			else {
				System.out.println("num3 is the greatest among three");
			}
		}
		

	}

