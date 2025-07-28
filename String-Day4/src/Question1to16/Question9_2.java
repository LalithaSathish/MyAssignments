package Question1to16;
/*Description: Given String as "Hai i am ramsarath" and verify whether
the given string startsWith welcome
Example:
-----------
Input = Hai i am ramsarath
output = False*/
public class Question9_2 {
	public static void main(String[] args) {
		 String input="Hai i am ramsarath";
         String lowerinput=input.toLowerCase();
         System.out.println(lowerinput.startsWith("welcome"));
	}

}
