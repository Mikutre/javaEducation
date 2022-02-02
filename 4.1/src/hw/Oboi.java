package hw;

import java.util.Scanner;

public class Oboi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("¬ведите количество полос");
	int num;
	num=sc.nextInt();
	for(int i=1;i<=5;i=i+1) {
		System.out.println();
		for(int j=1;j<=num;j=j+1) {
			if((j%2)==1) {System.out.print("***");
			}
			else {System.out.print("+++");
			
			}
		}
	}
	}

}
