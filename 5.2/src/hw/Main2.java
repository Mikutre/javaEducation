package hw;

import java.util.Arrays;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int b;
		System.out.println("������� ������ �������");
		b=sc.nextInt();
		
		int a [] = new int[b]; 
		for(int i=0;i<b;i=i+1) {
			System.out.println("������� ����� �����");
			a[i]=sc.nextInt();
		}
		
		System.out.println(Arrays.toString(a));
	}

}
	