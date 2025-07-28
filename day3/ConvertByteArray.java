package day3;

import java.util.Arrays;

public class ConvertByteArray {
	
	public static void main(String[] args) {
		
		String str="Lalitha";
		
		byte[] by=str.getBytes();
		
		System.out.println(Arrays.toString(by));
		
		byte[] byt1= {76, 97, 108, 105, 116, 104, 97};
		
		String str1=new String(byt1);
		
		System.out.println(str1);
		
		StringBuffer str2=new StringBuffer(str);
		str2.indexOf(str1);
	}

}
