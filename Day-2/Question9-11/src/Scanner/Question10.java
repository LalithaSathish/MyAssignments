package Scanner;

import java.util.Scanner;

/*Description: Using Scanner class get the below details
studentId
studentName
Mark1
Mark2
Mark3
Mark4
Mark5
:Find the total and average of marks*/
public class Question10 {
	public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter Student Id Number:- ");
            long studentId=scan.nextLong();
            System.out.println("Enter Student Name:- ");
            String studentName=scan.next();
            System.out.println("Enter Mark1:- ");
            byte Mark1=scan.nextByte();
            System.out.println("Enter Mark2:- ");
            byte Mark2=scan.nextByte();
            System.out.println("Enter Mark3:- ");
            byte Mark3=scan.nextByte();
            System.out.println("Enter Mark4:- ");
            byte Mark4=scan.nextByte();
            System.out.println("Enter Mark5:- ");
            byte Mark5=scan.nextByte();
            
            long Total=Mark1+Mark2+Mark3+Mark4+Mark5;
            byte Average=(byte) (Total/5);
            System.out.println("Total Mark of "+studentName+" is "+Total);
            System.out.println("Percentage of mark:"+ Average+"%");
            
            
	}
}
