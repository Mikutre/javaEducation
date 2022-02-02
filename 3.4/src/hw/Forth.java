package hw;

import java.util.Scanner;

public class Forth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a;
		double b;
		double c;
		Scanner ab=new Scanner(System.in);
System.out.println("Type length of 1st side of triangle");

a=ab.nextDouble();

System.out.println("Type length of 2nd side of triangle");

b=ab.nextDouble();

System.out.println("Type length of 3rd side of triangle");

c=ab.nextDouble();

if((a+b)<c) {System.out.println("This triangle can not exist");}
else {if((b+c)<a) {System.out.println("This triangle can not exist");}
else {if((a+c)<b) {System.out.println("This triangle can not exist");}
else {System.out.println("This triangle can exist");}
}
}
	}

}
