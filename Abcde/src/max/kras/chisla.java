package max.kras;

import java.util.Scanner;

public class chisla {

	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
    
		Scanner sc = new Scanner(System.in);
    int a;
    System.out.println("¬ведите 5-тизначное число");
    
    a = sc.nextInt();
    System.out.println(a/10000);
    System.out.println(a%10000/1000);
    System.out.println(a%1000/100);
    System.out.println(a%100/10);
    System.out.println(a%10/1 );
	}

}
