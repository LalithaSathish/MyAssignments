package Question1to16;
/*Description: Given String as "Welcome to java class" and verify whether
the given string startsWith welcome
Example:
-----------
Input = Welcome to class java
output = True*/
public class Question9_1 {
	public static void main(String[] args) {
           String input="Welcome to java class";
           String lowerinput=input.toLowerCase();
           System.out.println(lowerinput.startsWith("welcome"));
	}
}
