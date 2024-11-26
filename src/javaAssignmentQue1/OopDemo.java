/*
 1)	Write a program to cover all Java OOPS concepts. Topics need to cover: 

a)	Class and Object
b)	Class constructor
c)	Method overloading
d)	Method overriding
e)	Inheritance
f)	Interface
g)	Abstract class


Madhuri Bangar
 */



package javaAssignmentQue1;

public class OopDemo {

	public static void main(String[] args) {
		  Dog dog = new Dog("Simba", 5);
	        dog.speak(); // e) Method Overriding

	        // h) Abstract Class, g) Interface
	        Parrot parrot = new Parrot("Raghu", 2);
	        parrot.speak(); // e) Method Overriding
	        parrot.fly(); // h) Abstract Class
	        parrot.showAffection(); // g) Interface

	        // d) Method Overloading
	        Calculator calc = new Calculator();
	        System.out.println("Sum of integers: " + calc.add(21, 3));
	        System.out.println("Sum of doubles: " + calc.add(2.5, 3.5));

	        // j) Composition and Aggregation
	        Owner owner = new Owner("Alice", parrot);
	        owner.showPet(); // Aggregation (pet belongs to owner, but can exist without it)

	}

}
