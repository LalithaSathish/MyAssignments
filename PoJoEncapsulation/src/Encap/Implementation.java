package Encap;

import java.io.IOException;

public class Implementation {
	
	public static void main(String[] args) throws IOException{
		
		Pojo p = new Pojo();
		p.readDatafromDB();

		p.setName("Lalitha");
		p.setStudentId(16);

		int mark = p.map.get(p.getStudentId());  // Get 415 from file
		p.setMark(mark);

		System.out.println(p.getMark());  // Should print 4
	
	}
}
