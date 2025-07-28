package week1.day1;

public class operators {
	public static void main(String[] args) {
		int a=10,b=5;
		//Arithmetic Operators
		System.out.println("Add = " + (a+b) + "\nSub = " + (a-b) + "\nMul = " + (a*b) + "\nDiv = " + (a/b) + "\nMod = " + (a%b));
		//Compare operators
		System.out.println("Comparing two values : (a==b)" + (a==b) + "\n(a!=b)"+ (a!=b) + "\n(a<b)" + (a<b) + "\n(a>b)" + (a>b));
	    //Logic Operators
		System.out.println("AND Logic: " + (a<b && a>b) + "OR Logic: " + (a<b || a>b));
	    //PreIncrement
		System.out.println("a++ = " + a++);
		System.out.println(a);
		System.out.println("++a = " + ++a);
	}

}
