package Encap;

import java.io.File;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;

public class Pojo {

	private String Name;
	private int StudentId;
	private int Mark;
	
	Map <Integer, Integer> map;

	public void setName(String name) {
		if(name.equals("Lalitha")|name.equals("Sathish")|name.equals("Dhiya")|name.equals("Karnan")) {
			this.Name=name+" is valid Name";
		}

	}

	public void setStudentId(int id) {
		if((id==16 && Name=="Lalitha is valid Name")|(id==17 && Name=="Karnan is valid Name")|
				(id==18 && Name=="Sathish is valid Name")|(id==15 && Name=="Dhiya is valid Name")){
			this.StudentId=id;
		}
	}

	public void setMark(int mark) {
		if ((StudentId==16 && mark==415)|(StudentId==15 && mark==499)|
				(StudentId==18 && mark==432)|(StudentId==17 && mark==480)){
			this.Mark=mark;
		}

	}

	public String getName() {
		return Name;
	}

	public int getStudentId() {
		return StudentId;
	}

	public int getMark() {
		return Mark;
	}

	public void readDatafromDB() throws IOException {
		map =new LinkedHashMap();
		File f=new File("D:\\Greens Technologies\\Selenium_Framework\\PoJoEncapsulation\\Library\\StudentData.txt");
		List<String> lines=FileUtils.readLines(f);

		for (int i = 0; i < lines.size(); i++) {
			String ind_lines=lines.get(i);
			String[] words=ind_lines.split(",");
			
			int x=Integer.parseInt(words[2]);
			int y=Integer.parseInt(words[3]);
			map.put(i+1, x);
			map.put(i+2, y);
		}

	}

}
