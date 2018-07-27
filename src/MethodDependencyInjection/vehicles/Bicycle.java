package MethodDependencyInjection.vehicles;

public class Bicycle implements Vehicle {

	private final String myIntroduction ="I'm a bicycle";
	
	public void introduceYourSelf() {
		System.out.println(myIntroduction);
	}
}
