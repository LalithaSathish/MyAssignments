package week3.day2;

public class MissingNumber {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 6, 8, 10};
		int n=0;
		//find the highest number in the array
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length; j++) {
				if(arr[i]>arr[j])
				{
					n=arr[i];
				}
			}
		}
		//create another array to compare
		int[] arrtemp = new int[n];
		for (int i = 0; i <n; i++) {
			arrtemp[i]=i+1;	
		}

		for (int i = 0; i < arrtemp.length; i++) {
			boolean ifexits=false;

			for (int j = 0; j < arr.length; j++) {
				System.out.println(i+j);
				if(arrtemp[i]==arr[j])
				{ 
					ifexits=true;
					break;
				}
				ifexits=false;
			}
			if(!ifexits)
			{
				System.out.println(arrtemp[i]);
			}
		}
	}

}