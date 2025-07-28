package org.phone;

public class InternalStorage {
	public String processorName() {
		String processorname="Qualcomm Snapdragon";
		return processorname;
	}
	public String ramSize() {
		String ramsize="16 GB";
		return ramsize;
	}
	public static void main(String[] args) {
		ExternalStorage es=new ExternalStorage();
		System.out.println("Enternal Storage class calling from Internal storage class\n"+"External size:- "+es.size());
		InternalStorage is=new InternalStorage();
		System.out.println("Internal Storage methods:- "+"Processor Name:- "+is.processorName()+"Internal Storage:- "+is.ramSize());
	}
}
