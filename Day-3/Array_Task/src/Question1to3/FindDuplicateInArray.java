package Question1to3;

import java.util.HashSet;

public class FindDuplicateInArray {
	public static void main(String[] args) {
		//int a[]= {10,10,20,50,60,80,60,50};
		
//		for (int i = 0; i <=a.length-1; i++) {
//			for (int j = i+1; j <=a.length-2; j++) {
//				if(a[i]==a[j]) {
//				System.out.println(a[j]);
//				}	
//			}
//		}
		
		int[] arr = {3, 1, 4, 2, 5, 3, 2};

        HashSet<Integer> seen = new HashSet<>();

        System.out.println("Duplicate elements:");
        for (int num : arr) {
            if (!seen.add(num)) {
                System.out.println(num);
            }
        }
		
		
	}
}
