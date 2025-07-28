package week1.day1;
import java.util.Scanner;

public class FibonacciSeries {
	
public static void main(String[] args) {
	
    Scanner s1 = new Scanner(System.in);  
    System.out.println("Enter the desired range of the Fibonacci series");
    int count = s1.nextInt();
    
	int Prev=0,Curr=1,Sum=0;	
	System.out.println(Prev+"\n"+Curr);
	
		for (int i =0; i < count-2; i++) {
		     Sum=Prev+Curr;
		     System.out.println(Sum);
		     Prev=Curr;
		     Curr=Sum;
		}	
	} 
}

