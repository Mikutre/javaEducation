package hw;

import java.util.Scanner;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double a;
		double b;
		double c;
		double d;
		
		Scanner ab=new Scanner(System.in);
System.out.println("Put 1st number");
		a=ab.nextDouble();
		System.out.println("Put 2nd number");
		b=ab.nextDouble();
		System.out.println("Put 3rd number");
		c=ab.nextDouble();
		System.out.println("Put 4th number");
		d=ab.nextDouble();
		
		
		if(a>b) {
			if(a>c) {
				if(a>d) {System.out.println("The highest number is "+a);}}	
		}
		else {if(b>c) {
			if(b>d) {System.out.println("The highest number is "+b);}}
			else 
			{if(c<d) {System.out.println("The highest number is "+d);}
			else{System.out.println("The highest number is "+c);}
	}
		
		}
		}
	}
