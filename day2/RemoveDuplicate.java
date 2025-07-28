package day2;

import java.util.Arrays;

public class RemoveDuplicate {

	public static void main(String[] args) {
		
		int numbers[]= {9,8,7,8,7,3,4,2,3,4,2};
		
		Arrays.sort(numbers);
		
		int temp[]=new int[numbers.length];
		
		for (int i = 0; i < numbers.length-1; i++) {
			
			if (numbers[i]==numbers[i+1]) {
				temp[i]=numbers[i+1];
			}
			else {
				temp[i]=numbers[i+1];
			}
		}

		for (int i = 0; i < temp.length; i++) {
			System.out.println(temp[i]);
		}
	}
}

