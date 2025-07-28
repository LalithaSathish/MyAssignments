package String_Exercise;

public class Reverse_second_String {
	
	public static void main(String[] args) {
		
		String str="Lalitha Selvaraj";
		
		String[] input=str.split(" ");
		
		for(String str1:input) {
			if (str1==input[1]) {
				StringBuilder reverse=new StringBuilder(str1);
				System.out.println(reverse.reverse());
			}else {
			System.out.print(str1+" ");}
			
		}
		
	}

}
