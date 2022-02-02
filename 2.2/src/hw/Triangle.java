package hw;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		double x1;
		double x2;
		double x3;
		double x;
		double y1;
		double y2;
		double y3;
		double y;
		double a;
		double b;
		double c;
		
		Scanner ab = new Scanner(System.in);
		System.out.println("Введите x");
		
		x=ab.nextDouble();
		
		System.out.println("Введите y");
		
		y=ab.nextDouble();
		
		x1=0;
		y1=0;
		x2=4;
		y2=4;
		x3=6;
		y3=1;
		
		a=((x1-x)*(y2-y1))-((x2-x1)*(y1-y));
		b=((x2-x)*(y3-y2))-((x3-x2)*(y2-y));
		c=((x3-x)*(y1-y3))-((x1-x3)*(y3-y));
		
		if((a>=0)&(b>=0)&(c>=0)) {System.out.println("Точка лежит внутри треугольника");
} else {if((a<=0)&(b<=0)&(c<=0)) {System.out.println("Точка лежит внутри треугольника");
} else {System.out.println("Точка не лежит внутри треугольника");}
}
	}
}
