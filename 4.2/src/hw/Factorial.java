package hw;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
	int num;
	int f;
	System.out.println("Введите целое число от 4 до 16");
	num=sc.nextInt();
	f=num;
	
	if((num>4)&&(num<16)) {
		while(num>1) {
			f=f*(num-1);
			num=num-1;
		}
		System.out.println("Факториал этого числа равен "+f);
	}
	else {System.out.println("Invalid number");
	
	}
	}

}
