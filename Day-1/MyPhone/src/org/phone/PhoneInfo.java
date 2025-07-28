package org.phone;

public class PhoneInfo {

	public String phoneName() {
		String phonename="Mi";
		return phonename;
	}
	public long phoneimeiNum() {
		long phoneimeinumber=356789104589654L;
		return phoneimeinumber;
	}	
	public String Camera() {
		String camera="Front and back camera";
		return camera;
	}
	public String storage() {
		String ram="32 GB";
		return ram;
	}
	public String osName() {
		String os="Android";
		return os;
	}
	
	public static void main(String[] args) {
		PhoneInfo pi=new PhoneInfo();
		System.out.println("Phone Name:- "+pi.phoneName()+"\n"+"Phone IMEI Number:- "+pi.phoneimeiNum()+"\n"+"Phone Camera:- "+pi.Camera()+"\n"+"Storage:- "+pi.storage()+"\n"+"OS Name:- "+pi.osName());
	}

}
