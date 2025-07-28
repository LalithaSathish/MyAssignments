package week8.day1;

public class Learntrycatch {

	public static void main(String[] args) {

		int x=10;
		int y=5;
		int z=0;
		int[] array= {10,20,30};

		try{
			System.out.println(x/y);
			System.out.println(array[3]);
		}catch(ArithmeticException e){
			if(y==0) {
				System.out.println(x/1);}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			System.out.println(array[array.length-1]);
		}catch(Exception e){
			System.out.println("Unknown Exception");
		}
		System.out.println("Done");
	}
}


