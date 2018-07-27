# What is coupling
The following is different definition for coupling with the same meaning:
  - Coupling is the degree of interdependence between software modules 
  - a measure of how closely connected two routines or modules are
  - the strength of the relationships between modules.

# What is Dependency
Dependency in object oriented programming is how much two classes or methods complete each other. In other words, if class or method need another class or method to finish its task then that class or method is dependency.


# What is Dependency Injection

  dependency injection (DI) is the process of supplying a resource that a given piece of code requires.
  The required resource, which is often a component of the application itself, is called a dependency. 


# Dependency Types
In this lesson we will discuss three types of Dependency Injection:

1. Interface Naming Dependency Injection
2. Constructor Dependency Injection
3. Method Dependency Injection


- ### Interface Naming Dependency Injection
In many situation during programming, we might need to change classes names which might cause a problem called naming dependency.
Check code in **NoDependencyInjection** package, let's assume that we wish to change the name of one of the three classes Car, Bicycle or Truck then we need to modify our code in 7 different lines and if we wish to change names of all three classes then we will have to change our code in 21 lines. This problem will become truly troublesome when we are handling huge projects. For example lets say we have 10 shops then the changes will be 70.

Now imagine that you have more classes and locations contains names of the three classes. how many line do you need to change everytime? this problem is the naming depency.

In order to solve this problem we use interface as data type for similar objects that have common properties or belong to the same kind or family. In our case the three classes earlier represent types of vehicles. so we use vehicles as interface.

check code in **InterfaceDependencyInjection** package and note the changes. now in this code if we want to change our class name then we have only to make changes in 3 lines and if we wish to change all names then we need only 9 lines which is less than half of the original senario.

- ### Constructor Dependency Injection
continuing from **InterfaceDependencyInjection** package, let's say that we wish to change constructor of one of the three vehicles. This action will result in the need to make changes in 3 different locations and if we wish to add more vehicles or remove then we will have again to make changes in 3 different locations and the more shops we have the more the changes we need.

In order to solve this problem we use other class as link between vehicles and shops. This class will handle constructing the objects from the vehicles and send them to shops. Check code in **ConstructorDependencyInjection** package. Now we only need to make changes in VehiclesFactory class.

- ### Method Dependency Injection
After adding Constructor Dependency Injection, we reduced problem from the constructors but the redundent code in shops and high coupling from methods still there. In order to fix the problem we removed methods in classes and replaced them with one method that depends on passing data. This injection saved us the efforts and time to change different methods by injecting one methods moving the depency to this method. check **MethodDependencyInjection** package.
