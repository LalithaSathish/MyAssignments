package day3;

public class FindPalindrom {
	
	public static void main(String[] args) {
		
		String str="laliilal";
		
		StringBuilder strin=new StringBuilder(str);
		strin.reverse();
		
		System.out.println(strin.toString().equals(str));
	}

}
