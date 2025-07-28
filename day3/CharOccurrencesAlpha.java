package day3;


public class CharOccurrencesAlpha {

	public static void main(String[] args) {
		String str="lalitha";
		int count=1;
		char temp;

		char in[]=str.toCharArray();

		for (int i = 0; i < in.length; i++) {
			for (int j = i+1; j < in.length; j++) {

				if (in[i]==in[j]) {
					count=count+1;
					temp=in[i];
					System.out.println("letter "+temp+" Occurance "+count);
					count=1;
				}

			}
		}
	}

}
