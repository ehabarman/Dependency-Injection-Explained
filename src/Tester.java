import NoDependencyInjection.Driver1;
import InterfaceDependencyInjection.Driver2;
import MethodDependencyInjection.Driver4;
import ConstructorDependencyInjection.Driver3;
public class Tester {

	public static void main(String[] args) {
		
		Driver1 Driver1 = new Driver1();
		Driver1.run();
		System.out.println("___________________________");
		Driver2 driver2 = new Driver2();
		driver2.run();
		System.out.println("___________________________");
		Driver3 driver3 = new Driver3();
		driver3.run();
		System.out.println("___________________________");
		Driver4 driver4 = new Driver4();
		driver4.run();
	}
}
