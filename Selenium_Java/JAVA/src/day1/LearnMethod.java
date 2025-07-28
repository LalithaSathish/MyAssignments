package day1;

import Learning.OuterClass;

public class LearnMethod {
	
	public int getnumber() {
		return 7;
	}
	
	public String getname() {
		return "lalitha";
	}
	
	public boolean yesorno() {
		return false;
	}
	
	public char initial() {
		return 'S';
	}
	
	public int addtwo(int a,int b) {
		return a+b;
	}
	
	public String two(String name,String name1) {
		return name +" "+name1;

	}
	
	public static void main(String[] args) {
		
		LearnMethod obj= new LearnMethod();
		System.out.println(obj.getname());
		System.out.println(obj.addtwo(7, 5));
		System.out.println(obj.two("Lalitha", "Sathishkumar"));
		OuterClass oc = new OuterClass();
		oc.callInnerMethod();
		
	}

}
