package org.network;

public class Wifi {
	public void wifiName() {
		System.out.println("wifiName method from Wifi class");
	}
	
	public static void main(String[] args) {
		Wifi wf=new Wifi();
		wf.wifiName();
		
		MobileData md=new MobileData();
		md.dataName();
		
		Lan ln=new Lan();
		ln.lanName();
		
		Wireless wl=new Wireless();
		wl.modamName();
	}
}
