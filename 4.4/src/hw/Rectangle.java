package hw;

import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);

	int h;
	int w;
	
System.out.println("������� ������ ��������������");
w=sc.nextInt();

System.out.println("������� ������ ��������������");
h=sc.nextInt();

	for(int i=1;i<=h;i=i+1) {
		System.out.println();
		
		System.out.print("* ");
		
		for(int j=1;j<w;j=j+1) {
			if((i==1)||(i==h)||(j==w-1)) {
			System.out.print("* ");}
			else {System.out.print("  ");}
			
		}
	}
		
	
	
		
	}
	

}

