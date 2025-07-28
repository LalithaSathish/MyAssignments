package String_Exercise;

import java.util.Scanner;

public class ArmStrong {
	
	public static void main(String[] args) {
		
		System.out.println("Enter Iput: ");
		Scanner scan=new Scanner(System.in);
		int input=scan.nextInt();
		
		int Actual_Input=input;
		int sum=0;
		
		while(input!=0) {
			int digit=input%10;
			sum+=digit*digit*digit;
			input=input/10;	
		}
		
		if(sum==Actual_Input) {
			System.out.println("ArmStrong Number");
		}else {
			System.out.println("Not ArmStrong Number");
		}
	}

}
