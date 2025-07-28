package org.emp;

import org.client.Client;
import org.company.Company;
import org.project.Project;

public class Employee {
	public String empName() {
		String empname="Lalitha.S";
		return empname;
	}
	
	public static void main(String[] args) {
		Employee emp=new Employee();
		System.out.println("Method from Employee class \nEmployee Name:- "+emp.empName());
		Client cn=new Client();
		System.out.println("\nClient class calling from Employee class\nClient Name:- "+cn.clientName());
		Project prj=new Project();
		System.out.println("\nProject class calling from Employee class\nProject Name:- "+prj.projectName());
		Company com=new Company();
		System.out.println("\nCompany Class caling from Employee Class\nCompany Name:- "+com.companyName());
	}
}
