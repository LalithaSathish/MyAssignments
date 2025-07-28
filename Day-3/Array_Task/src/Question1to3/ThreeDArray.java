package Question1to3;

public class ThreeDArray {
	public static void main(String[] args) {
		int array[][]=new int[3][3];
		
		array[0][0]=10;
		array[0][1]=11;
		array[0][2]=12;
		
		array[1][0]=13;
		array[1][1]=14;
		array[1][2]=15;
		
		array[2][0]=16;
		array[2][1]=17;
		array[2][2]=18;
		
		
		for(int[] temp:array) {
			for(int temp1:temp) {
				System.out.println(temp1);
			}
		}

	}
}
