package week3.day2;

import java.util.Arrays;

public class SecondLargestNumber {
	public static void main(String[] args) {
		int[] a={3, 2, 11, 4, 6, 7};

		Arrays.sort(a); // Sort in ascending order first

		System.out.println("Asending Order of array is: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(" "+a[i]+" ");
		}

		System.out.println("\nSecond Larger number in array is : "+a[a.length-2]);

	}

}
