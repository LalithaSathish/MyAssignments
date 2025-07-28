package org.college;

public class College {
	public String collegeName() {
		String colleagename="SRM";
		return colleagename;
	}
	public int collegeCode() {
		int collegecode=12345;
		return collegecode;
	}
	public int collegeRank() {
		int collegerank=2;
		return collegerank;
	}
	public static void main(String[] args) {
		College clg=new College();
		System.out.println("College Class methods:-\n"+"College Name:- "+clg.collegeName()+"\nCollege Code:- "+clg.collegeCode()+"\nCollege Rank:- "+clg.collegeRank());
		Student std=new Student();
		System.out.println("Student class methods from College class:- \n"+"Student Name:- "+std.studentName()+"\nStudent Id:- "+std.studentId()+"\nStudent Department:- "+std.studentDept());
		Hostel hstl=new Hostel();
		System.out.println("Hostel class method from College class:- \n"+"Hostel Name:- "+hstl.hostelName());
		Dept dpt=new Dept();
		System.out.println("Dept class method from college class:- \n"+"Department Name:- "+dpt.deptName());
	}
}
