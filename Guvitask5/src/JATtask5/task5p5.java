package JATtask5;

import java.util.Scanner;

public class task5p5 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your mark");
		int mark=sc.nextInt();
		
		if(mark==100) {
			System.out.println("Your grade is S");
		}
		else {
			if(mark>=90&&mark<100) {
				System.out.println("Your grade is A");	
			}
			else {
				if(mark>=80&&mark<90) {
				System.out.println("Your grade is B");
			}
				else {
					if(mark>=70&&mark<80) {
						System.out.println("Your grade is C");
				}
					else {
						if(mark>=60&&mark<70) {
							System.out.println("Your grade is D");
					}
						else {
							if(mark>=50&&mark<60) {
								System.out.println("Your grade is E");
						}
							else {
								if(mark<50) {
									System.out.println("Your grade is F");
							}
								else {
									System.out.println("Invalid input");
								}
		}
		}
		}
	}
	}
	}
	}
}