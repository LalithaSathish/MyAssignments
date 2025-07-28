package String_Exercise;

public class Remove_Space_In_String {

	public static void main(String[] args) {

		String str="Lalitha Selvaraj";
		
		char[] input=str.toCharArray();
		
		for(int i=0;i<input.length;i++) {
			
			if(input[i]==' ') {
				continue;
			}
			else {
				System.out.print(input[i]);
			}
		}
	}

}
