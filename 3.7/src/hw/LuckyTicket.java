package hw;

import java.util.Scanner;

public class LuckyTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		int a;
		int b;
		int c;
		int d;
		int sum1;
		int sum2;
		
Scanner ab = new Scanner(System.in);
System.out.println("Введите 4-значное число");
	num=ab.nextInt();
	a=num/1000;
	b=(num%1000)/100;
	c=(num%100)/10;
	d=(num%10)/1;
	
	sum1=a+b;
	sum2=c+d;
	
	if(sum1==sum2) {System.out.println("Число является счастливым билетом");}
	else {System.out.println("Число не является счастливым билетом");}
	
	
	}

}
