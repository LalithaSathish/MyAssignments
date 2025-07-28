package String_Exercise;

import java.util.Scanner;
/*0(prev) + 1(curr) = 1(temp)
1() + 1 = 2
1 + 2 = 3
2 + 3 = 5
3 + 5 = 8*/

public class FibonaciSeries {
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number to find fibonacci series: ");
		int n=scan.nextInt();
		
		int temp=0;
		int prev=0;
		int curr=1;
		
		System.out.print(temp+" "+curr);
		
		for (int i = 1; i <=n-2 ; i++) {
			
			temp=prev+curr;
			System.out.print(" "+temp);
			prev=curr;
			curr=temp;	
		}
		
		
	}

}
