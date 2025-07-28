package String_Exercise;

import java.util.Scanner;

public class Prime {
	
	public static void main(String[] args) {
		
		System.out.println("Enter Input: ");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		
		boolean Isboolean=true;
		
		for(int i=2;i<=n-1;i++) {
			if(n%i==0) {
				Isboolean=false;
				break;
			}
		}
		
		if(Isboolean) {
			System.out.println("Prime Number");
		}else {
			System.out.println("Not Prime Number");
		}
		
	}

}
