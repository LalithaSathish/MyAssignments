package Scanner;

import java.util.Scanner;

public class Question9 {
	
	public static void main(String[] args) {
		//empId
		System.out.println("Enter Employee Id:- ");
		Scanner scan=new Scanner(System.in);
		short empId=scan.nextShort();

		//empName
		System.out.println("Enter Employee Name:- ");
		Scanner scan1=new Scanner(System.in);
		String empName=scan1.next();

		//empEmail
		System.out.println("Enter Employee Email:- ");
		Scanner scan2=new Scanner(System.in);
		String empEmail=scan2.next();

		//empPhoneno
		System.out.println("Enter Employee Phone Number:- ");
		Scanner scan3=new Scanner(System.in);
		long empPhoneno=scan3.nextLong();

		//empSalary
		System.out.println("Enter Employee Salary:- ");
		Scanner scan4=new Scanner(System.in);
		int empSalary=scan4.nextInt();

		//empGender
		System.out.println("Enter Employee Gender"
				+ ":- ");
		Scanner scan5=new Scanner(System.in);
		String empGender=scan5.next();

		//empCity
		System.out.println("Enter Employee City:- ");
		Scanner scan6=new Scanner(System.in);
		String empCity=scan6.next();

		
		System.out.println("EMP ID:- "+empId+"\n");
		System.out.println("EMP Name:- "+empName);
		System.out.println("EMP Email:- "+empEmail);
		System.out.println("EMP Phone Number:- "+empPhoneno);
		System.out.println("EMP Salary:- "+empSalary);
		System.out.println("EMP Gender:- "+empGender);
		System.out.println("EMP City:- "+empCity);
	}

}
