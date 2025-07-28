package Question1to16;
/*Description:Find the number of uppercase count and lowercase count in
the given String
Example:
Input = WelComeToJava
Output:
UpperCase=4
LowerCase=9*/

public class Question8_4 {
	
	public static void main(String[] args) {
		
		String input="WelComeToJava";
		int lowercount=0,uppercount=0;
		
		
		char array[]=input.toCharArray();
		
		for (int i = 0; i < array.length; i++) {
			if(Character.isLowerCase(array[i])) {
				lowercount=lowercount+1;
			}else {
				uppercount=uppercount+1;
			}
		}
		
		System.out.println("Number of lower count in input: "+lowercount);
		System.out.println("Number of upper count in input: "+uppercount);
	}

}
