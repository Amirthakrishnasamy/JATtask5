package JATtask5;
import java.util.Scanner;
public class task5p3 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number for pattern");
		int n=sc.nextInt();
		// TODO Auto-generated method stub
      for (int i=1;i<=n;i++) {
    	  for (int j=1;j<=i;j++) {
    	  System.out.print(j+(j<i?" ":""));
      }
    	  System.out.println();
	}
	}
}
