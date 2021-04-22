package olacab;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Scanner;

public class olacab {

	public static void main(String[] args) {
		System.out.print("mobile no");
		Scanner sc= new Scanner(System.in);
		String mobileno = sc.next();  //input mobile no
		System.out.print("password");  // input password
		String password=sc.next();
		String setpass="ABCD";   //assigning password
		String setmobile="9597181908"; //assigning mobileno
		LoginValidation(mobileno, password, setpass, setmobile); //validating login details
			 
		
		String [] cabtypes = new String[3];
		cabtypes[0]="micro";
		cabtypes[1]="macro";
		cabtypes[2]="prime";
		System.out.println("cabtypes"+Arrays.toString(cabtypes)); //displaying the cab types
		for(String c:cabtypes )
			System.out.println(c);
		String cab=sc.next();
		System.out.println("Enter km");
		int rs = sc.nextInt();
		int bill=0;
		if(cab.equals(cabtypes[0])==true) 
			bill = rs*10;
		if(cab.equals(cabtypes[1])==true)
			bill = rs*15;
		if(cab.equals(cabtypes[2])==true) 
		    bill = rs*20;
		System.out.println("your bill with gst"+GstEstimator(bill));
		
		
		System.out.println("journey date");
		String dc = sc.next();
		LocalDate jc = LocalDate.parse(dc);
		System.out.println("confirmed date" + jc);
		System.out.println("enter pickup time");
		String timee = sc.next();
		LocalTime ti = LocalTime.parse(timee);
		int hour = ti.getHour();
		if (hour > 17 && hour < 19) {
	    	System.out.println("IT IS PEAK HOURS  so 1.25% extra charges ,your  bill amount is"+  Peakhourchecker(bill,hour));
			System.out.println("enter date of birth");
			String dob = sc.next();
			LocalDate dd = LocalDate.parse(dob);
			LocalDate now = LocalDate.now();
			int df = now.getYear();
			int gg = dd.getYear();
			int age = df - gg;
			if (age > 60) {
				System.out.println("your age is exceeding 60 so ur bill is" + Peakhourchecker(bill,hour) / 2);
			} else
				System.out.println("your total bill is " +  Peakhourchecker(bill,hour));
		}
		System.out.println("enter date of birth");
		String dob = sc.next();
		LocalDate dd = LocalDate.parse(dob);
		LocalDate now = LocalDate.now();
		int df = now.getYear();
		int gg = dd.getYear();
		int age = df - gg;
		if (age > 60) {
			System.out.println("your age is exceeding 60, 50% discount !! your bill is" + GstEstimator(bill) / 2);
		} else {
			System.out.println("your total bill is " + GstEstimator(bill));
		}
	}
	    
      	private static double Peakhourchecker(int bill, int hour) {
			double peaky = ((bill* 0.0125) + GstEstimator(bill));
			return peaky;
     	}
		
		

	private static void LoginValidation(String mobileno, String password, String setpass, String setmobile) {
		if(mobileno.equals(setmobile) == true &&password.equals(setpass) == true )  //validating
	       System.out.println("success");
	}
	private static double GstEstimator(int bill) {
		double gstbill = bill* 0.07 + bill;
		return gstbill;


	}

}
