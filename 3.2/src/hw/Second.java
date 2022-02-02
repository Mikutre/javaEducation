package hw;

import java.util.Scanner;

public class Second {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a;
		int b=1;
		double c;
		Scanner ab=new Scanner(System.in);
	System.out.println("Type apartment number");
	a=ab.nextInt();
	if(a>0) {
	if(a>36) {
		if(a>72) {
			if(a>108) {
				if(a>144) {System.out.println("There is no apartmen with this number");}
			}
		}
	}
	}
	else {System.out.println("Invalid number");}
	if(a<=36) {b=1;}
	else {if(a<=72) {b=2;}
	else {if(a<=108) {b=3;}
	else {if(a<=144) {b=4;}
	
	
	if(a<=36) {a=Math.ceil(a/4);}
	else {if(a<=72) {a=Math.ceil((a-36)/4);}
	else {if (a<=108) {a=Math.ceil((a-72)/4);}
	else {if(a<=144) {a=Math.ceil((a-108)/4);
		
	}
	}
	
	
	}
	}
	}
	}

}
System.out.println("entrance-"+b);
System.out.println("floor-"+a);}
	
}
