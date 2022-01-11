package org.allvehicle;

import org.fourwheeler.FourWheeler;
import org.threewheeler.ThreeWheeler;
import org.twowheeler.TwoWheller;

public class Vehicle {
	public void VehicleNecessery() {
		System.out.println("Need tyres for all type of vehicle ");
		
	}
public static void main(String[] args) {
	TwoWheller t=new TwoWheller();
	t.bike();
	t.cycle();
	ThreeWheeler tr=new ThreeWheeler();
	tr.Auto();
	FourWheeler f=new FourWheeler();
	f.car();
	f.bus();
	f.lorry();

}
}
