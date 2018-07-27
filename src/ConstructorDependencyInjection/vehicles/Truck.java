package ConstructorDependencyInjection.vehicles;

public class Truck implements Vehicle {

	private final String myIntroduction ="I'm a truck";
	
	public void introduceYourSelf() {
		System.out.println(myIntroduction);
	}
}
