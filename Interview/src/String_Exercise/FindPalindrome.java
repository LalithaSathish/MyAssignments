package String_Exercise;

public class FindPalindrome {

	public static void main(String[] args) {

		String in="madadadasdam";

		//		StringBuilder stringInput=new StringBuilder(in);
		//		
		//		if(in.equals(stringInput.reverse().toString())){
		//			System.out.println("Given string input is Palindrome");
		//		}else {
		//			System.out.println("Given string input is not Palindrome");
		//		}
		boolean isPalindrome=true;

		for (int i=0;i<=in.length()/2;i++) {
			if(in.charAt(i)!=in.charAt(in.length()-1-i)){
				isPalindrome=false;
			}
		}

		if(isPalindrome){
			System.out.println("Palindrome");
		}else{
			System.out.println("Not Palindrome");
		}
	}

}
