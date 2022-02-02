package hw;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=3;
		int b=9;
		figure(a, b);
	}
	public static void figure(int a, int b) {
		
		
		 
		for(int i=1; i<=a; i=i+1) {
			System.out.print("* ");
			
			for(int j=1; j<b; j=j+1) {
				if((i==a)||(i==1)||(j==b-1)) {
				System.out.print("* ");}
				else {System.out.print("  ");
					
				}
					}
			System.out.println();
		}
			 
			
		
	
	}
}
