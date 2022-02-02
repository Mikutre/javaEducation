package hw;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a;
		
		Scanner ab=new Scanner(System.in);
		System.out.println("aaaa");
				a=ab.nextInt();
		if(a<36) {a=Math.ceil(a/4);}
		
		System.out.println(a);

	}

}
