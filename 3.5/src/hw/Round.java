package hw;

import java.util.Scanner;

public class Round {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x;
		double y;
		double length;
		Scanner ab = new Scanner(System.in);
		System.out.println("Input x");
		x=ab.nextDouble();
		System.out.println("Input y");
		y=ab.nextDouble();
		
		length=Math.sqrt((x*x)+(2*x*y)+(y*y));
		
		if(length<=4) {System.out.println("Точка лежит внутри круга");
		}else {System.out.println("Точка не лежит внутри круга");}
		
	}

}
