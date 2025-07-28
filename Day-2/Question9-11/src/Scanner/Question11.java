package Scanner;

import java.util.Scanner;

/*Description: Using Scanner class get the below details
StudentId
StudentName
StudentEmail
StudentPhoneno
StudentDept
StudentGender
StudentCity*/
public class Question11 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter StudentId\r\n"
				+ "StudentName\r\n"
				+ "StudentEmail\r\n"
				+ "StudentPhoneno\r\n"
				+ "StudentDept\r\n"
				+ "StudentGender\r\n"
				+ "StudentCity");
		int StudentId=scan.nextInt();
		String StudentName=scan.next();
		String StudentEmail=scan.next();
		long StudentPhoneno=scan.nextLong();
		String StudentDept=scan.next();
		String StudentGender=scan.next();
		String StudentCity=scan.next();
		
		System.out.println("StudentId\t"+StudentId+"\n"
				+ "StudentName\t"+StudentName+"\n"
				+ "StudentEmail\t"+StudentEmail+"\n"
				+ "StudentPhoneno\t"+StudentPhoneno+"\n"
				+ "StudentDept\t"+StudentDept+"\n"
				+ "StudentGender\t"+StudentGender+"\n"
				+ "StudentCity\t"+StudentCity);
	}

}
