package String_Exercise;

public class String_Reverse {


	public static void main(String[] args) {

		String str="Lalitha Selvaraj";
		char[] input=str.toCharArray();

		for (int i = str.length()-1; i >= 0; i--) {
			System.out.print(input[i]);
		}
	
		
	}

}
