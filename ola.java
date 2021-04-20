package com.viswa;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Scanner;

public class ola {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("mobile no");
		Scanner sc= new Scanner(System.in);
		String mobileno = sc.next();
		System.out.print("password");
		String pass=sc.next();
		String set="ABCD";
		String set1="9597181908";
		if(mobileno.equals(set1) == true &&pass.equals(set) == true )
	       System.out.println("success");
			 
		
		String [] cabtypes = new String[3];
		cabtypes[0]="micro";
		cabtypes[1]="macro";
		cabtypes[2]="prime";
		System.out.println("cab types array object"+cabtypes);
		System.out.println("cabtypes"+Arrays.toString(cabtypes));
		System.out.println("no of cabtypes"+cabtypes.length);
		for(String c:cabtypes )
			System.out.println(c);
		String cab=sc.next();
		if(cab.equals(cabtypes[0])==true) 
			micro();
		if(cab.equals(cabtypes[1])==true)
			macro();
		if(cab.equals(cabtypes[2])==true) 
		    prime();
	}

	public static void micro() {
		System.out.println("Rs 10/hr");
		System.out.println("enter km");
		Scanner sc= new Scanner(System.in);
		int rs = sc.nextInt();
		System.out.println("your bill amount" + rs * 10);
		int bill = rs * 10;
		System.out.println("with gst" + ((bill* 0.07) + bill));
		double gstbill = bill* 0.07 + bill;
		System.out.println("journey date");
		String dc = sc.next();
		LocalDate jc = LocalDate.parse(dc);
		System.out.println("confirmed date" + jc);
		System.out.println("enter pickup time");
		String timee = sc.next();
		LocalTime ti = LocalTime.parse(timee);
		int hour = ti.getHour();
		if (hour > 17 && hour < 19) {
			System.out.println("1.25 % extra charges " + ((bill* 0.0125 )+ gstbill));
			double peaky = ((rs * 10 * 0.0125) + gstbill);
			System.out.println("enter date of birth");
			String dob = sc.next();
			LocalDate dd = LocalDate.parse(dob);
			LocalDate now = LocalDate.now();
			int df = now.getYear();
			int gg = dd.getYear();
			int age = df - gg;
			if (age > 60) {
				System.out.println("your age is exceeding 60 so ur bill is" + peaky / 2);
			} else
				System.out.println("your total bill is " + peaky);
		}
		System.out.println("enter date of birth");
		String dob = sc.next();
		LocalDate dd = LocalDate.parse(dob);
		LocalDate now = LocalDate.now();
		int df = now.getYear();
		int gg = dd.getYear();
		int age = df - gg;
		if (age > 60) {
			System.out.println("your age is exceeding 60 so ur bill is" + gstbill / 2);
		} else {
			System.out.println("your total bill is " + gstbill);
		}
	}
	 public static void macro()
	 {
	 System.out.println("Rs 15/hr");
	    System.out.println("enter km");
	    Scanner sc=new Scanner(System.in);
	    int rs1=sc.nextInt();
	    System.out.println("your bill amount"+rs1*15);
	    System.out.println("with gst"+rs1*15*0.07+rs1*15);
	    System.out.println("journey date");
	    String dc1=sc.next();
	    LocalDate jc1= LocalDate.parse(dc1);
	    System.out.println("confirmed date"+jc1);
	    System.out.println("enter pickup time");
	    String timeee=sc.next();
	    LocalTime ti1=LocalTime.parse(timeee);
	    int hourr=ti1.getHour();
	    if(hourr>17 && hourr < 19)
	    {
	    	System.out.println("1.25 % extra charges "+rs1*15*0.0125);
	        System.out.println("enter date of birth");
	        String dob1=sc.next();
	        LocalDate dd1=LocalDate.parse(dob1);
	        LocalDate now1=LocalDate.now();
	        int df1=now1.getYear();
	        int gg1=dd1.getYear();
	        int age1=df1-gg1;
	        if(age1>60) {
	          	System.out.println("your age is exceeding 60 so ur bill is"+(rs1*15*0.0125*0.7)/2);
	        }
	        else
	        	System.out.println("your total bill is "+rs1*15*0.0125*0.7);
	    }
	    System.out.println("enter date of birth");
     String dob1=sc.next();
     LocalDate dd1=LocalDate.parse(dob1);
     LocalDate now1=LocalDate.now();
     int df1=now1.getYear();
     int gg1=dd1.getYear();
     int age1=df1-gg1;
     if(age1>60) {
       	System.out.println("your age is exceeding 60 so ur bill is"+(rs1*15*0.7)/2);
     }
     else {
     	System.out.println("your total bill is "+rs1*15*0.7);
     }

}
	 public static void prime()
	 {
		 System.out.println("Rs 20/hr");
		    System.out.println("enter km");
		    Scanner sc=new Scanner(System.in);
		    int rs2=sc.nextInt();
		    System.out.println("your bill amount"+(rs2*20));
		    System.out.println("with gst"+((rs2*20*0.07)+rs2*20));
		    System.out.println("journey date");
		    String dc2=sc.next();
		    LocalDate jc2= LocalDate.parse(dc2);
		    System.out.println("confirmed date"+jc2);
		    System.out.println("enter pickup time");
		    String tim=sc.next();
		    LocalTime ti2=LocalTime.parse(tim);
		    int hou=ti2.getHour();
		    if(hou>17 && hou < 19)
		    {
		    	System.out.println("1.25 % extra charges "+(rs2*20*0.0125));
		        System.out.println("enter date of birth");
		        String dob2=sc.next();
		        LocalDate dd2=LocalDate.parse(dob2);
		        LocalDate now2=LocalDate.now();
		        int df2=now2.getYear();
		        int gg2=dd2.getYear();
		        int age2=df2-gg2;
		        if(age2>60) {
		          	System.out.println("your age is exceeding 60 so ur bill is"+(rs2*20*0.0125*0.7)/2);
		        }
		        else
		        	System.out.println("your total bill is "+(rs2*20*0.0125*0.7));
		    }
		    System.out.println("enter date of birth");
	        String dob2=sc.next();
	        LocalDate dd2=LocalDate.parse(dob2);
	        LocalDate now2=LocalDate.now();
	        int df2=now2.getYear();
	        int gg2=dd2.getYear();
	        int age2=df2-gg2;
	        if(age2>60) {
	          	System.out.println("your age is exceeding 60 so ur bill is"+(rs2*20*0.7)/2);
	        }
	        else {
	        	System.out.println("your total bill is "+(rs2*20*0.7));       	
		}
	}

}