package day1;

import java.util.Scanner;

public class EvenNumber {
		
	public static void main(String[] args) {
		
		LearnMethod obj= new LearnMethod();
		System.out.println(obj.getnumber());;
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=scan.nextInt();
		
		for (int i = 0; i < n; i++) {
			if (i%2==0) {
				System.out.println(i);
							
			}			
		}
	}

	
}
