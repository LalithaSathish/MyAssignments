package day2;

public class LearnArray {
	
	public static void main(String[] args) {
		
		int number[]= {91,62,43,94,45,16,67,18,29};
		
		int number2[]=new int[9];
		for (int i = 0; i < number2.length; i++) {
			number2[i]=i+1;
			System.out.println("Number2 "+i+":"+number2[i]);
			System.out.println("Number:"+i+":"+ number[i]);
		}
	}

}
