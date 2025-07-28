package week1.day1;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter the input to find prime or not: ");
		int userinput=scr.nextInt();
		if((userinput==0)||(userinput==1))
		{
			System.out.println("Not Prime Number");
		}
		if(userinput==2)
		{
			
			System.out.println("Prime Number");
		}
		if(userinput>2)
		{
		if(prime(userinput)==true)
		{
			System.out.println("Prime Number");
		}
		else
		{
			System.out.println("Not Prime Number");
		}
		}
		
	}
	
	public static boolean prime(int input) {
		for (int i = 2; i <= input; i++) {
			
			if((input%2)!=0){
				if(input%i==0)
				{
					return false;
				}            
				else
				{
					return true;
				}
			}
			}
		return false;
	}
}
		
