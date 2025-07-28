package org.allvehicle;

import org.fourwheeler.FourWheeler;
import org.threewheeler.ThreeWheeler;
import org.twowheeler.TwoWheller;

public class Vehicle {
	public void VehicleNecessery() {
		System.out.println("VehicleNecessery method from Vehicle class");
	}
	
	public static void main(String[] args) {
		Vehicle obj=new Vehicle();
		System.out.println("Below methods are calling from Vehicle");
		obj.VehicleNecessery();
		TwoWheller obj1=new TwoWheller();
		obj1.bike();
		obj1.cycle();
		ThreeWheeler obj2=new ThreeWheeler();
		obj2.Auto();
		FourWheeler obj3=new FourWheeler();
		obj3.car();
		obj3.bus();
		obj3.lorry();	
	}
}
