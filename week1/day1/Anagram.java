package week1.day1;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
		System.out.print("Enter the first string: ");  
		String strx= sc.nextLine();              //reads string     
		
		Scanner sc1= new Scanner(System.in); //System.in is a standard input stream  
		System.out.print("\nEnter the second string: ");  
		String stry= sc1.nextLine();              //reads string   
		
		char[] Array1=strx.toCharArray();
		char[] Array2=stry.toCharArray();
		
		Arrays.sort(Array1);
		Arrays.sort(Array2);
	
		if(Arrays.equals(Array1, Array2)) { 	
			System.out.println("\ntrue"); 
			}
		else { System.out.println("\nfalse");}		
			
		}
		
	}


