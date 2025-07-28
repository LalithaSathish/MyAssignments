package week3.day1;

public class ReverseOddWord {
	public static void main(String[] args) {
		String test = "I am a software tester";
		char temp;
		String result="";

		String[] split = test.split(" ");

		for (int i = 0; i <= split.length-1; i++) {
			
			
			if(i%2==1)
			{
				
				for (int j = 0; j < split[i].length(); j++) {
					
					temp=split[i].charAt(j);
					result=temp+result;
					
				}
				
				System.out.print(" "+result);
				result="";
				;
			}
			else {
				System.out.print(" "+split[i]);
			}

		}
	}
}


