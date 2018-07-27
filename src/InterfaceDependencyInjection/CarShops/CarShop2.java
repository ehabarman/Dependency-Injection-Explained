package InterfaceDependencyInjection.CarShops;

import InterfaceDependencyInjection.vehicles.Bicycle;
import InterfaceDependencyInjection.vehicles.Car;
import InterfaceDependencyInjection.vehicles.Truck;
import InterfaceDependencyInjection.vehicles.Vehicle;

public class CarShop2 {
	
	public Vehicle buyBicycle() {
		return new Bicycle() ;
	}
	
	public Vehicle buyTruck() {
		return new Truck();
	}
	
	public Vehicle buyCar() {
		return new Car();
	}
}
