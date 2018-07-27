package NoDependencyInjection.CarShops;

import NoDependencyInjection.vehicles.Bicycle;
import NoDependencyInjection.vehicles.Car;
import NoDependencyInjection.vehicles.Truck;

public class CarShop2 {
	
	public Bicycle buyBicycle() {
		return new Bicycle() ;
	}
	
	public Truck buyTruck() {
		return new Truck();
	}
	
	public Car buyCar() {
		return new Car();
	}
}
