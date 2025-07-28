package day3;

//import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
	
	public static void main(String[] args) {
		
		int num[]= {1,3,2,4,2,1,3,5,6,2,3,5,6,2};
		
		Set<Integer> out=new LinkedHashSet<Integer>();
		
		Set<Integer> duplicates=new LinkedHashSet<Integer>();
		
		for (int i = 0; i < num.length; i++) {
			boolean bool=out.add(num[i]);
			
			if(!bool) {
				duplicates.add(num[i]);
			}
		}
		
		System.out.println(out);
		System.out.println("Duplicates are: " + duplicates);
		
	}

}
