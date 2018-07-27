package ConstructorDependencyInjection.CarShops;

import ConstructorDependencyInjection.Factory.VehiclesFactory;
import ConstructorDependencyInjection.vehicles.Bicycle;
import ConstructorDependencyInjection.vehicles.Car;
import ConstructorDependencyInjection.vehicles.Truck;
import ConstructorDependencyInjection.vehicles.Vehicle;

public class CarShop1 {

	public Vehicle buyBicycle() {
		return VehiclesFactory.instanceOf("Bicycle");
	}
	
	public Vehicle buyTruck() {
		return VehiclesFactory.instanceOf("Truck");
	}
	
	public Vehicle buyCar() {
		return VehiclesFactory.instanceOf("Car");
	}
}
