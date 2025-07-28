package day3;

public class FindFibonacciSeries {
	
	public static void main(String[] args) {
		
		int in=10;
		
		int prev = 0;
		int curr = 1;
		int future = 0;
		
		System.out.println("0");
		for (int i = 1; i < in-1; i++) {
			future = prev + curr ;
			System.out.println(future+ " ");
			prev = curr;
			curr = future;	
		}
	}

}
