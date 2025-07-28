package day3;

public class ReverseString {
	
	public static void main(String[] args) {
		
		String str="lalitha";
		
		char input[]=str.toCharArray();
		
		for (int i = input.length; i >0; i--) {
			System.out.println(input[i]);
		}
	}

}
