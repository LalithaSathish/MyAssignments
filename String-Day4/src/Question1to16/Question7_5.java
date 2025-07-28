package Question1to16;
/*Description: Get the address from the user and verify "pincode" is
present or not.
If present replce the pincode with empty space

Example:
------------
Input = 5-35-2a,ramsarath,Aruppukottai,pincode-626101
Output = 5-35-2a,ramsarath nivas,Aruppukottai*/
import java.util.Scanner;

public class Question7_5 {
	public static void main(String[] args) {
		System.out.println("Enter Address");
		Scanner scan = new Scanner(System.in);
		String input=scan.nextLine();

		System.out.println(input.toLowerCase().replaceAll(",pincode[-:\\s]*\\d{6}", " "));

	}
}
