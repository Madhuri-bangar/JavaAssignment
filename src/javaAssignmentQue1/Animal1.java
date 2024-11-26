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


	public class Animal1 {
	    private String name;
	    private int age;

	    // b) Class Constructor
	    public Animal1 (String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    public void speak() {
	        System.out.println(name + " makes a sound.");
	    }

	    // i) Abstraction and Encapsulation (Getters and Setters)
	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public int getAge() {
	        return age;
	    }

	    public void setAge(int age) {
	        this.age = age;
	    }
	}

	// f) Inheritance
	class Dog extends Animal1 {

	    // b) Class Constructor
	    public Dog(String name, int age) {
	        super(name, age);
	    }

	    // e) Method Overriding
	    @Override
	    public void speak() {
	        System.out.println(getName() + " barks.");
	    }
	}

	// h) Abstract Class
	abstract class Bird extends Animal1 {
	    public Bird(String name, int age) {
	        super(name, age);
	    }

	    // Abstract method
	    public abstract void fly();
	}

	// g) Interface
	interface Pet {
	    void showAffection();
	}

	// c) (Method Overriding, Interface Implementation)
	class Parrot extends Bird implements Pet {

	    // b) Class Constructor
	    public Parrot(String name, int age) {
	        super(name, age);
	    }

	    @Override
	    public void speak() {
	        System.out.println(getName() + " says hello!");
	    }

	    @Override
	    public void fly() {
	        System.out.println(getName() + " is flying.");
	    }

	    @Override
	    public void showAffection() {
	        System.out.println(getName() + " is showing affection.");
	    }
	}

	// d) Method Overloading
	class Calculator {
	    public int add(int a, int b) {
	        return a + b;
	    }

	    public double add(double a, double b) {
	        return a + b;
	    }
	}

	// j) Composition and Aggregation
	class Owner {
	    private String name;
	    private Pet pet; // Aggregation (pet can exist without owner)

	    public Owner(String name, Pet pet) {
	        this.name = name;
	        this.pet = pet;
	    }

	    public void showPet() {
	        pet.showAffection();
	    }

	    // k) Generalization and Specialization
	    // Generalization: Owner has a pet, which can be of different types.
	    // Specialization: A Parrot is a specialized type of Pet.

	    // i) Abstraction and Encapsulation (Getters and Setters)
	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public Pet getPet() {
	        return pet;
	    }

	    public void setPet(Pet pet) {
	        this.pet = pet;
	    }
	}

	 



