package Question1to16;

/*Description:Convert all small letter and into capital letter
Example:
----------
Input = WelcomE
Output = wELCOMe*/

public class Question8_3 {
	public static void main(String[] args) {
		String input="WelcomE";

		char array[]=input.toCharArray();

		StringBuilder output = new StringBuilder();

		for (int i = 0; i < array.length; i++) {
			if (Character.isLowerCase(array[i])) {
				output.append(Character.toUpperCase(array[i]));
			}else {
				output.append(Character.toLowerCase(array[i]));
			}
		}
		System.out.println(output);

	}
}