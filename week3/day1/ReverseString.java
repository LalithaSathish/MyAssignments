package week3.day1;

public class ReverseString {
	public static void main(String[] args) {
		String iname="You are the princess of my world";
		char[] oname=iname.toCharArray();
		
		for (int i = oname.length-1; i >=0 ; i--) {
			System.out.print(oname[i]);
			
		}
	}

}
