package hw;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a ="qwert";
		int b=12;
		double c=13.12;
		System.out.println(method(b, c, a));

	}
	public static String method( int b, double c, String a) {
		double d=b+c;
		String text=a + d;
				return  text;
	}

}
