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



System.out.println("������� 1-�� ������� ������������");
a=ab.nextDouble();


System.out.println("������� 2-�� ������� ������������");

b=bc.nextDouble();

System.out.println("������� 3-�� ������� ������������");

c=ca.nextDouble();

p=(a+b+c)/2;

z=p*(p-a)*(p-b)*(p-c);

z=Math.sqrt(z);

System.out.println("������� ������� ������������ �����"+z);


;	}

}
