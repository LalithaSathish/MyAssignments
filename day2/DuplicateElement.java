package day2;

public class DuplicateElement {
	
	public static void main(String[] args) {
		
		String str="lalithhjjjja";
		System.out.println(str);
		
		String namelist[]= {"lalitha","sathish","dhiya","sathish","lalitha","sathish"};
				
		for (int i = 0; i < namelist.length-1; i++) {
			for (int j = i+1; j < namelist.length; j++) {
				if (namelist[i]==namelist[j]) {
					System.out.println(namelist[i]);
				}
			}
		}
	}

}
