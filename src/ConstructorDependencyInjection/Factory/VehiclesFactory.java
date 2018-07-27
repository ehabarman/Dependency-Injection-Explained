package ConstructorDependencyInjection.Factory;

import ConstructorDependencyInjection.vehicles.Bicycle;
import ConstructorDependencyInjection.vehicles.Car;
import ConstructorDependencyInjection.vehicles.Truck;
import ConstructorDependencyInjection.vehicles.Vehicle;

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
