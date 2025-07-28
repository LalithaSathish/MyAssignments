package Question1to3;

public class TwoDArray {

	public static void main(String[] args) {
		int array[][]=new int[2][2];
		
		array[0][0]=15;
		array[0][1]=16;
		array[1][0]=17;
		array[1][1]=18;
		
		/*for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.println(array[i][j]);
			}
		}*/
		
		for(int[] temp:array) {
			for(int temp1:temp) {
				System.out.println(temp1);
			}
		}

	}

}
