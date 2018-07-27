package MethodDependencyInjection.Factory;

import MethodDependencyInjection.vehicles.Bicycle;
import MethodDependencyInjection.vehicles.Car;
import MethodDependencyInjection.vehicles.Truck;
import MethodDependencyInjection.vehicles.Vehicle;

public class VehiclesFactory {

	public static Vehicle instanceOf(String type) {
				
		switch(type){
		
			case "Car" : return new Car();
			case "Bicycle" : return new Bicycle();
			case "Truck" : return new Truck();
			default: return null;
		}
	}
}
