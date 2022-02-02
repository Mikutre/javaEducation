package hw;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = new int [] {0,5,2,4,7,1,3,19};
		int b=0;
		for(int i=0;i<a.length;i=i+1) {
			if(a[i]%2==1) {
				b=b+1;}
			}
		System.out.println(b);
			
		}
	
}
