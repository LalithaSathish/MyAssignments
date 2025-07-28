package org.emp;

public class Employee {

	public int empId() {
		int empid = 743;
		return empid;
	}
	public String empName() {
		String empname="Lalitha";
		return empname;
	}
	public String empDob() {
		String empdob="16-03-1994";
		return empdob;
	}
	public String empPhone() {
		String empphone= "9003174310";
		return empphone;
	}
	public String empEmail() {
		String empemail="lalitha@gmail.com";
		return empemail;
	}
	public String empAddress() {
		String empaddress="Medavakkam";
		return empaddress;
	}
	
	public static void main(String[] args) {
		Employee emp=new Employee();
		System.out.println("Employee ID:- "+ emp.empId());
		System.out.println("Employee Name:- "+ emp.empName());
		System.out.println("Employee DOB:- "+ emp.empDob());
		System.out.println("Employee Phone:- "+ emp.empPhone());
		System.out.println("Employee Email:- "+ emp.empEmail());
		System.out.println("Employee Address:- " +emp.empAddress());	
	}
}
