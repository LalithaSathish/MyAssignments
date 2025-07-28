package week3.day2;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionReverseString {
	
	public static void main(String[] args) {
		
		String[] input= {"HCL", "Wipro", "Aspire Systems", "CTS"};
		List<String> Company=new ArrayList();
		
		for (int i = 0; i < input.length; i++) {	
			Company.add(input[i]);	
		}
		
		Company.sort(null);
		
		for (int i = input.length-1; i>=0 ; i--) {
			System.out.println(Company.get(i));
		}
		
		
		
	}

}
