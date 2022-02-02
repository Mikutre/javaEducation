package max.kras;

import java.util.Scanner;

public class MainTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a;
		double b;
		double c;
		double z;
		double p;
Scanner ab=new Scanner(System.in);

Scanner bc=new Scanner(System.in);

Scanner ca=new Scanner(System.in);



System.out.println("¬ведите 1-ую сторону треугольника");
a=ab.nextDouble();


System.out.println("¬ведите 2-ую сторону треугольника");

b=bc.nextDouble();

System.out.println("¬ведите 3-ую сторону треугольника");

c=ca.nextDouble();

p=(a+b+c)/2;

z=p*(p-a)*(p-b)*(p-c);

z=Math.sqrt(z);

System.out.println("ѕлощадь данного треугольника равна"+z);


;	}

}
