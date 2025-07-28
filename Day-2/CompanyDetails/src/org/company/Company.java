package org.company;

import org.client.Client;

public class Company extends Client{
	public void companyName() {
		System.out.println("companyName Method from Company Class");
	}
	public static void main(String[] args) {
		Company com=new Company();
		com.companyName();
		com.clientName();
	}
}
