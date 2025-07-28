package org.transport;

import org.air.Air;
import org.road.Road;
import org.water.Water;

public class Transport {
	public void TransportForm() {
		System.out.println("TransportForm method from Transport class");
	}
	
	public static void main(String[] args) {
		Transport tst=new Transport();
		tst.TransportForm();
		
		Road rd=new Road();
		rd.bike();
		rd.bus();
		rd.car();
		rd.cycle();
		
		Air ar=new Air();
		ar.aeroPlane();
		ar.heliCopter();
		
		Water wat=new Water();
		wat.boat();
		wat.ship();
	}
}
