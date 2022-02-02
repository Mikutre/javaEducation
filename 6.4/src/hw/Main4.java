package hw;

import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Input number");
		int [] a = {1, 17, 13, 25, 19};
		int b = sc.nextInt();
		
		System.out.println(number(a, b));
	}
	public static int number(int[] a, int b) {
		int c = -1;
		
		for(int i = 0; i<a.length; i=i+1) {
		
			
			if(c==a[i]) {c = i;
				
			}
		}
		return c;}
}
