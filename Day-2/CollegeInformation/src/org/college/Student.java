package org.college;

public class Student extends College{
	public void studentName() {
		System.out.println("studentName Method from Student Class");
	}
	public void studentDept() {
		System.out.println("studentDept Method from Student Class");
	}
	public void studentId() {
		System.out.println("studentId Method from Student Class");
	}
	
	public static void main(String[] args) {
		Student std=new Student();
		std.studentName();
		std.studentId();
		std.studentDept();
		std.collegeName();
		std.collegeCode();
		std.collegeRank();
		std.deptName();
		std.HostelName();
	}
}
