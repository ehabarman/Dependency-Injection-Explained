package MethodDependencyInjection.vehicles;

public class Car implements Vehicle {

	private final String myIntroduction ="I'm a car";
	
	public void introduceYourSelf() {
		System.out.println(myIntroduction);
	}
}
