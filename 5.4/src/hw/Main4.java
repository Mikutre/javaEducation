package hw;

import java.util.Arrays;
import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Write any text");
	String text = sc.next();
	int n=0;
	char [] letter = text.toCharArray();
	for(int i=0;i<letter.length;i=i+1) {
		if(letter[i]=='b') {
			
			n=n+1;
	}
	}
	System.out.println("There is "+ n +" b's");

	
	
		
	
	}

}
