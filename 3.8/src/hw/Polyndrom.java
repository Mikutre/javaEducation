package hw;

import java.util.Scanner;

public class Polyndrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner ab=new Scanner(System.in);
	int number;
	int a;
	int b;
	int c;
	int d;
	int e;
	int f;
	int sum1;
	int sum2;
	int sum3;
	System.out.println("������� 6-������� �����");
	number=ab.nextInt();
	
	a=number/100000;
	b=(number%100000)/10000;
	c=(number%10000)/1000;
	d=(number%1000)/100;
	e=(number%100)/10;
	f=(number%10)/1;
	
	if(a==f) {
		if(b==e) {
			if(c==d) {System.out.println("����� �������� �����������");}
			else {System.out.println("����� �� �������� �����������");}
		}else {System.out.println("����� �� �������� �����������");}
	}else {System.out.println("����� �� �������� �����������");}
		}

}
