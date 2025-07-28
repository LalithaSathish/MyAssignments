package day2;

import java.util.Arrays;
import java.util.Scanner;

public class FindDuplicateInArray {

	public static void main(String[] args) {

	/*	Scanner input=new Scanner(System.in);
		System.out.println("Enter the array length: ");
		int len=input.nextInt();

		int[] Array=new int[len];

		for (int i = 0; i < len; i++) {
			Scanner ArrayIn=new Scanner(System.in);
			System.out.println("Enter the Array of "+i);
			Array[i]=ArrayIn.nextInt();
		}

		for (int i = 0; i < len; i++) {
			System.out.println(Array[i]);
		}
		*/
		int Array[]= {2,5,7,5,6,7,2,3};
		
		Arrays.sort(Array);
		
		for (int i = 0; i < Array.length-1; i++) {
			
			if (Array[i]==Array[i+1]) {
				System.out.println(Array[i]);
			}
			
		}
	}

}
