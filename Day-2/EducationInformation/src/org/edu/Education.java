package org.edu;

public class Education extends Engineering{
	public void ug() {
		System.out.println("ug Method from Education Class");
	}
	public void pg() {
		System.out.println("pg Method from Education Class");
	}
	
	public static void main(String[] args) {
		Education ed=new Education();
		ed.ug();
		ed.pg();
		ed.bA();
		ed.bBA();
		ed.bsc();
		ed.bE();
		ed.bTech();
		ed.mbbs();
		ed.physiyo();
		ed.dental();
	}
}
