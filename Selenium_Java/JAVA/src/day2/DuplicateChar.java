package day2;

import java.util.Arrays;

public class DuplicateChar {

	public static void main(String[] args) {

		String name="lalitha sathishkumar";

		char name1[]=name.toCharArray();

		Arrays.sort(name1);

		int len=name1.length;

		for (int i = 0; i < len-1; i++) {
			//System.out.println(name1[i]);
			if (name1[i]==name1[i+1]) {
				System.out.println(name1[i]);
			}

		}
	}
}
