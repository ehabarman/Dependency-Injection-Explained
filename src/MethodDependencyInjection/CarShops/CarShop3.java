package MethodDependencyInjection.CarShops;

import MethodDependencyInjection.Factory.VehiclesFactory;
import MethodDependencyInjection.vehicles.Bicycle;
import MethodDependencyInjection.vehicles.Car;
import MethodDependencyInjection.vehicles.Truck;
import MethodDependencyInjection.vehicles.Vehicle;

public class CarShop3 {
	
	public Vehicle buyVehicle(String type) {
		return VehiclesFactory.instanceOf(type);
	}
}
