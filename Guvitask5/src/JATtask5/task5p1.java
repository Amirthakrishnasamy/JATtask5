package JATtask5;

import java.util.Scanner;

public class task5p1 {
	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String to verify palindrome:");
	String str=sc.next();
	int strlength=str.length();
	String reversestr="";
	
	for(int i=(strlength-1);i>=0;--i) {
		reversestr=reversestr+str.charAt(i);
	}
	System.out.println(reversestr);
	if (str.equals(reversestr)) {
		System.out.println("the given string is a palindrome");
	}
	else {
		System.out.println("the given string is not a plaindrome");
	}
}
	
}
