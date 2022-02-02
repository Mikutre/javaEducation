package hw;

public class Main5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "a a a a a";
		
		System.out.println(countWords(text));

	}
	
	public static int countWords(String text) {
		char letter = ' ';
		int count = 1;
		char[] letters = text.toCharArray();
		for (char i : letters) {
			if(i==letter) {
				count +=1;
			}
		}
		return count;
	}

}
