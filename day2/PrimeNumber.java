package day2;

import java.util.Scanner;

public class PrimeNumber {

	public boolean findPrimeNumber(int n) {

		boolean result=true;

		for(int i=2;i<n/2;i++)
		{
			if(n%i==0) {
				result= false;
				break;
			}
		}

		return result;
	}

	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);
		System.out.println("Enter the input: ");
		int n=input.nextInt();

		PrimeNumber obj=new PrimeNumber();
		System.out.println(obj.findPrimeNumber(n));
	}

}
