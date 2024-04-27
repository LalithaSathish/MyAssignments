package week1.day1;

public class Loop {
	public static void main(String[] args) {
		int a=3,b=2;
		//ifelse condition
		if (a<b) {
			System.out.println("B variable is higher value");		
		}
		else {
			System.out.println("A variable is higher value");
		}
		//switch case
		switch (a) {
		case 1:System.out.println("Value of a is 1");break;
		case 2:System.out.println("Value of a is 2");break;
		case 3:System.out.println("Value of a is 3");break;
		default:System.out.println("Value of a is other than 123");break;
		}
		
		//for loop
	    for (int i = 1; i <= 10; i++){
	    	if(i%2==0)
	    	{
	    	System.out.println("Even Number " + i);
	    	}
		}

	}

}
