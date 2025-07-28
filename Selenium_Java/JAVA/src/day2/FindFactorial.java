package day2;

import java.util.Scanner;

public class FindFactorial {
	
	public static void main(String[] args) {
		
		int output =1;
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number to find Factorial: ");
		int fac=input.nextInt();
		
		for (int i = fac; i > 1; i--) {
			output=output*i;
		}
		
		System.out.println(output);
	}

}
