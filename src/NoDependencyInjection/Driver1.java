package NoDependencyInjection;

import NoDependencyInjection.CarShops.CarShop1;
import NoDependencyInjection.CarShops.CarShop2;
import NoDependencyInjection.CarShops.CarShop3;
import NoDependencyInjection.vehicles.Bicycle;
import NoDependencyInjection.vehicles.Car;
import NoDependencyInjection.vehicles.Truck;

public class Driver1 {

	public void run() {
		CarShop1 carShop1 = new CarShop1();
		CarShop2 carShop2 = new CarShop2();
		CarShop3 carShop3 = new CarShop3();
		
		Bicycle bicycle = carShop1.buyBicycle();
		Truck truck = carShop2.buyTruck();
		Car car = carShop3.buyCar();
		
		truck.introduceYourSelf();
		bicycle.introduceYourSelf();
		car.introduceYourSelf();
	}
	
}
