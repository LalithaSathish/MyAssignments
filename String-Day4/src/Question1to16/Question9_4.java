package Question1to16;
/*Description: Given String as "Welcome to java class" and verify whether
the given string endsWith java
Example:
-----------
Input = Welcome to java class
output = False*/
public class Question9_4 {
	public static void main(String[] args) {
		 String input="Welcome to java class";
         String lowerinput=input.toLowerCase();
         System.out.println(lowerinput.endsWith("java"));
	}

}
