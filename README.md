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


### Interface Naming Dependency
In many situation during programming, we might need to change classes names which might cause a problem called naming dependency.
Check code in **NoDependencyInjection** package, let's assume that we wish to change the name of one of the three classes Car, Bicycle or Truck then we need to modify our code in 7 different lines and if we wish to change names of all three classes then we will have to change our code in 21 lines.

Now imagine that you have more classes and locations contains names of the three classes. how many line do you need to change everytime? this problem is the naming depency.

In order to solve this problem we use interface as data type for similar objects that have common properties or belong to the same kind or family. In our case the three classes earlier represent types of vehicles. so we use vehicles as interface.

check code in **InterfaceDependencyInjection** package and note the changes. now in this code if we want to change our class name then we have only to make changes in 3 lines and if we wish to change all names then we need only 9 lines which is less than half of the original senario.

###
