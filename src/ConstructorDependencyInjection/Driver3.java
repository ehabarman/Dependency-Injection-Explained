package ConstructorDependencyInjection;

import ConstructorDependencyInjection.CarShops.CarShop1;
import ConstructorDependencyInjection.CarShops.CarShop2;
import ConstructorDependencyInjection.CarShops.CarShop3;
import ConstructorDependencyInjection.vehicles.Vehicle;

public class Driver3 {

	public void run() {
		CarShop1 carShop1 = new CarShop1();
		CarShop2 carShop2 = new CarShop2();
		CarShop3 carShop3 = new CarShop3();
		
		Vehicle bicycle = carShop1.buyBicycle();
		Vehicle truck = carShop2.buyTruck();
		Vehicle car = carShop3.buyCar();
		
		truck.introduceYourSelf();
		bicycle.introduceYourSelf();
		car.introduceYourSelf();
	}
	
}
