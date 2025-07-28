package Question1to16;
/*Description: Find the particular character index in the given string
String 1: GreensTechnology
Find the last index of o

String 2: SeleniumAutomationtool
Find the index of o

String 3: RamSarath
Find the index of n

String 4: j a v a p r o g r a m
Find the last index of (emptyspace)

String 5: 7639416267
Find the index of 8*/

public class Question2 {
	public static void main(String[] args) {
		
		String input1="GreensTechnology";
		System.out.println("Last index of 'o' in GreensTechnology: "+input1.lastIndexOf('o'));
		
		String input2="SeleniumAutomationtool";
		System.out.println("Index of 'o' in SeleniumAutomationtool: "+input2.indexOf('o'));
	
		String input3="RamSarath";
		System.out.println("Index of 'n' in RamSarath: "+input3.indexOf('n'));
		
		String input4="j a v a p r o g r a m";
		System.out.println("Last index of ' ' in RamSarath: "+input4.lastIndexOf(' '));
		
		String input5="7639416267";
		System.out.println("Index of 8 in RamSarath: "+input5.indexOf('8'));
	}

}
