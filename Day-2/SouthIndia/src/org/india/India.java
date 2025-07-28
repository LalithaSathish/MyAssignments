package org.india;

import org.tamilnadu.TamiladuN;

public class India extends TamiladuN{
	public void india() {
		System.out.println("india Method from India Class");
	}
	//MultiLevel Inheritance
	public static void main(String[] args) {
		India ind = new India();
		ind.india();
		ind.tamillanguage();
		ind.malayalam();
		ind.telugu();
	}
}
