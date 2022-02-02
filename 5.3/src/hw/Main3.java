package hw;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a = new int [15];
		int[]b = new int [30];
		for(int i=0;i<15;i=i+1) {
			a[i]=(int)(Math.random()*10);
			b[i]=a[i];
		}
		for(int i=15;i<30;i=i+1) {
		 b[i]=(a[i-15]*2);
		}
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
	}

}
