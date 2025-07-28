package week1.day2;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number to find factorial: ");
		int userinput = input.nextInt();
		int temp = 1;
		for (int i = 1; i <= userinput; i++) {
			
			temp=temp*i;
		}
		
		System.out.println("Factorial of "+userinput+" is "+temp);
	}

}
