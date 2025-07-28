package Encapsulation;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;

public class Pojo {

	private String Employee_Name;
	private int Employee_ID;
	private String Employee_Posting;
	private int Employee_Salary;
	
	Map<Integer, Integer> map;

	public String getEmployee_Name() {
		return Employee_Name;
	}
	public void setEmployee_Name(String employee_Name) {
		if (employee_Name=="Emp_1" || employee_Name=="Emp_2" || employee_Name=="Emp_3") {
			this.Employee_Name = employee_Name+" is the valid Employee Name";
		}

	}

	public int getEmployee_ID() {
		return Employee_ID;
	}
	public void setEmployee_ID(int employee_ID) {
		if (employee_ID==1001 && Employee_Name.equals("Emp_1 is the valid Employee Name")) {
			this.Employee_ID=1;
		}
		if (employee_ID==1002 && Employee_Name.equals("Emp_2 is the valid Employee Name")) {
			this.Employee_ID=2;
		}
		if (employee_ID==1003 && Employee_Name.equals("Emp_3 is the valid Employee Name")) {
			this.Employee_ID=3;
		}
	}

	public String getEmployee_Posting() {
		return Employee_Posting;
	}
	public void setEmployee_Posting(String employee_Posting) {
		if (Employee_ID==1 && employee_Posting.equals("Developer")) {
			this.Employee_Posting="Dev";
		}
		if (Employee_ID==2 && employee_Posting.equals("QA")) {
			this.Employee_Posting="Testing";
		}
		if (Employee_ID==3 && employee_Posting.equals("HR")) {
			this.Employee_Posting="Human";
		}
	}
	public int getEmployee_Salary() {
		return Employee_Salary;
	}
	public void setEmployee_Salary(int employee_Salary) {
		if (Employee_Posting=="Dev" && employee_Salary==50000) {
			this.Employee_Salary=employee_Salary;
		}
		if (Employee_Posting=="Testing" && employee_Salary==35000) {
			this.Employee_Salary=employee_Salary;
		}
		if (Employee_Posting=="Human" && employee_Salary==40000) {
			this.Employee_Salary=employee_Salary;
		}	
	}

	public void Read_Data() throws IOException {

		File f=new File("D:\\Greens Technologies\\API_WorkSpace\\Encapsulation_POJO\\Library\\Data.txt");
		List<String> readLines = FileUtils.readLines(f);
		for (int i = 0; i < readLines.size(); i++) {
			readLines.get(i);
		}


	    }
	}
}
