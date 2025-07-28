package Question1to3;

public class AverageOfArray {
	public static void main(String[] args) {
		int input[]= {1,2,3,4,5,6,7,8,9,10};
		float temp=0;
		float output=0;
		for (int i = 0; i <=input.length; i++) {
			temp=temp+i;
		}
		output=temp/input.length;
		System.out.println(output);
	}

}
