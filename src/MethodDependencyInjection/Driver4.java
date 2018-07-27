package MethodDependencyInjection;

import MethodDependencyInjection.CarShops.CarShop1;
import MethodDependencyInjection.CarShops.CarShop2;
import MethodDependencyInjection.CarShops.CarShop3;
import MethodDependencyInjection.vehicles.Vehicle;

public class Driver4 {

	public void run() {
		CarShop1 carShop1 = new CarShop1();
		CarShop2 carShop2 = new CarShop2();
		CarShop3 carShop3 = new CarShop3();
		
		Vehicle bicycle = carShop1.buyVehicle("Bicycle");
		Vehicle truck = carShop2.buyVehicle("Truck");
		Vehicle car = carShop3.buyVehicle("Car");
		
		truck.introduceYourSelf();
		bicycle.introduceYourSelf();
		car.introduceYourSelf();
	}
	
}
