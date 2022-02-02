package hw;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] a = {1, 2, 5, 3, 4, 1};
		System.out.println(highestNumber(a));
	}
	public static int highestNumber(int a[]) {
		int b=0;
		for(int i = 0; i<a.length; i=i+1) {
			if(b<a[i]) {
				b=a[i];
			}
		}
		return b;}
		

}
