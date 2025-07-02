package JATtask5;

import java.util.Scanner;

public class task5p2 {
	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String to be reversed:");
	String str=sc.next();
	int strlength=str.length();
	String reversestr="";
	
	for(int i=(strlength-1);i>=0;--i) {
		reversestr=reversestr+str.charAt(i);
	}
	System.out.println("The string after reversal is:" +reversestr);

	}

}
