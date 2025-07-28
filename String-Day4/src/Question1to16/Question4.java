package Question1to16;

import java.util.Scanner;

/*Description : Get two input from user and check the equality
: print in the output whether it is Equal or not
Example:
--------
Input :
String 1 : Java
String 2 : Java
Example:
---------
Input :
String 1 : Java
String 2 : java

Example:
---------
Input :
String 1 : Green Technology
String 2 : GreenTechnology.

Example(use equalsIgnoreCase):
---------
Input :
String 1 : Java
String 2 : java

Example(use equalsIgnoreCase) :
---------
Input :
String 1 : Ramsarath
String 2 : ramsarath */

public class Question4 {
	public static void main(String[] args) {
		
		System.out.println("Enter the first word: ");
		Scanner scan1=new Scanner(System.in);
		String in1=scan1.next();
		
		System.out.println("Enter the second word: ");
		Scanner scan2=new Scanner(System.in);
		String in2=scan2.next();
		
		System.out.println("Equal case");
		if (in1.equals(in2)) {
			System.out.println("Given two Strings are Equal");			
		}else {
			System.out.println("Given two Strings are Not equal");
		}
		System.out.println("Equal ignore case");
		if (in1.equalsIgnoreCase(in2)) {
			System.out.println("Given two Strings are Equal");			
		}else {
			System.out.println("Given two Strings are Not equal");
		}
	}

}
