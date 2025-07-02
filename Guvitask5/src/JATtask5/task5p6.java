package JATtask5;

import java.util.Scanner;

public class task5p6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the month");
		  int month = sc.nextInt();
		  System.out.println("Enter the rent");
	      double rent = sc.nextDouble();
	      System.out.println("Enter the days");
	      int days = sc.nextInt();
          double normalCharge = rent * days;
	      double peakCharge = normalCharge * 1.20;
          double tariff;
	      switch (month) {
	            case 4: case 5: case 6:
	            case 11: case 12:
	                tariff = peakCharge;
	                break;
	            case 1: case 2: case 3:
	            case 7: case 8: case 9: case 10:
	                tariff = normalCharge;
	                break;
	            default:
	                System.out.println("Invalid Input");
	                return;
	        }

	        System.out.printf("Hotel Tariff: Rs.%.2f", tariff);
	    }

	}
