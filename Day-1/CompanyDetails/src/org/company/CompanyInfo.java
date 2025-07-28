package org.company;

public class CompanyInfo {

	public String companyName() {
		String companyname="Greens Technologies";
		return companyname;
	}
	public int companyId() {
		int companyid=123456;
		return companyid;
	}
	public String companyAddress() {
		String companyaddress="Medavakkam";
		return companyaddress;
	}
	public static void main(String[] args) {
		CompanyInfo ci=new CompanyInfo();
		System.out.println("Company Name:- " + ci.companyName());
		System.out.println("Company ID:- " + ci.companyId());
		System.out.println("Company Address:- "+ ci.companyAddress());

	}
}
