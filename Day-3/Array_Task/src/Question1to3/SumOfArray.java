package Question1to3;

public class SumOfArray {
	public static void main(String[] args) {
		int input[]= {1,2,3,4,5,6,7,8,9,10};
		int output = 0;
		
		for (int i = 0; i <=input.length-1; i++) {
			output=output+input[i];
		}
		
		System.out.println("Sum of input Array:- "+output);
		
		for(int temp:input) {
			System.out.println(temp);
		}
	}

}
