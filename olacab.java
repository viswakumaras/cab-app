package com.olacab;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Scanner;

public class olacab {

	public static void main(String[] args) {
		
		loginValidation();
		String [] cabtypes = new String[3];
		Scanner sc= new Scanner(System.in);
	
		cabtypes[0]="micro";
		cabtypes[1]="macro";
		cabtypes[2]="prime";
		System.out.println("cabtypes"+Arrays.toString(cabtypes)); //displaying the cab types
		for(String c:cabtypes )
			System.out.println(c);
		String cab=sc.next();
		System.out.println("Enter km");
		int rs = sc.nextInt();
		int bill = cabSelection(cabtypes, cab, rs); // Bill value caclculation for respective cab type 
		System.out.println("your bill with gst   Rs "+gstEstimator(bill)+"/-"); // bill with Gst
	
		try {
		peakHour(bill);
		}
		catch(Exception e)
		{
			System.out.println("ENTER THE DETAILS CORRECTLY!!!");
			peakHour(bill);
		}
		try {
		withoutPeakHour(bill);
		}
		catch(Exception e)
		{
			System.out.println("ENTER THE DETAILS CORRECTLY!!!");
			withoutPeakHour(bill);
		}
		


		
	}


	


	private static int cabSelection(String[] cabtypes, String cab, int rs) {
		int bill=0;
		if(cab.equals(cabtypes[0])==true) 
			bill = rs*10;
		if(cab.equals(cabtypes[1])==true)
			bill = rs*15;
		if(cab.equals(cabtypes[2])==true) 
		    bill = rs*20;
		return bill;
	}
	    
      	private static double peakHourChecker(int bill, int hour) {
			double peaky = ((bill* 0.0125) + gstEstimator(bill));
			return peaky;
     	}
		
		

	private static void loginValidation() {
		System.out.println("---Ola cabs---");
		System.out.print("mobile no:  ");
		Scanner sc= new Scanner(System.in);
		String mobileno = sc.next();  //input mobile no
		System.out.print("password:  ");  // input password
		String password=sc.next();
		String setpass="ABCD";   //assigning password
		String setmobile="9597181908"; //assigning mobileno
		if(mobileno.equals(setmobile) == true &&password.equals(setpass) == true )  //validating
	       System.out.println("Logged in successfully");
		else {
			System.out.println("Enter Mobile no or Password correctly ");
			loginValidation();
		}
		
			
	}
	private static double gstEstimator(int bill) {
		double gstbill = bill* 0.07 + bill;
		return gstbill;


	}
	
    public static void peakHour(int bill) {
    	System.out.println("Journey date");
    	Scanner sc= new Scanner(System.in);
		String dc = sc.next();
		LocalDate jc = LocalDate.parse(dc);
		System.out.println("Confirmed date"+jc);
		System.out.println("Enter pickup time");
		String timee = sc.next();
		LocalTime ti = LocalTime.parse(timee); // Converting input time to Time parse
		int hour = ti.getHour();
		if (hour > 17 && hour < 19) {
	    	System.out.println("IT IS PEAK HOURS  so 1.25% extra charges ,your  bill amount is  Rs "+  peakHourChecker(bill,hour)+"/-");
			System.out.println("Enter your age ( %50 discount for senior citizen age above 60)");
			int dob = sc.nextInt();
			int age = dob; //Calculating age from DOB
			                          
			if (age > 60) {      //with age checking for senior citizenship 
				System.out.println("your age is exceeding 60 so ur bill is  Rs " + peakHourChecker(bill,hour) / 2+"/-"); //%50 discount for senior citizen
			} else
				System.out.println("your total bill is Rs " +  peakHourChecker(bill,hour)); // or else only peak hour charges added
		}
    }
     public static void withoutPeakHour(int bill) {
    	 System.out.println("Enter your age ( %50 discount for senior citizen age above 60");
    	 Scanner sc= new Scanner(System.in);
 		int dob = sc.nextInt();
 		int age=dob;
 		if (age > 60) {
 			System.out.println("your age is exceeding 60, 50% discount !! your bill is   Rs " + gstEstimator(bill) / 2+"/-");
 		} else {
 			System.out.println("your total bill is  Rs " + gstEstimator(bill)+"/-");
 		}
     }
}
