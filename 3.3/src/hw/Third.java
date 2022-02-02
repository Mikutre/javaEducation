package hw;

import java.util.Scanner;

public class Third {

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		// TODO Auto-generated method stub
Scanner ab=new Scanner(System.in);
System.out.println("Type year");
a=ab.nextInt();
c=a%400;
b=a%100;
a=a%4;
if(c==0) {System.out.println("In this year 366 days");}
else {
if(b==0) {System.out.println("In this year 365 days");}
else {
if(a==0) {System.out.println("In this year 366 days");}
else {System.out.println("In this year 365 days");}
	}
	}
	}
	
}
