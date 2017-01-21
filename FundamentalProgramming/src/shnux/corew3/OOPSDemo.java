package shnux.corew3;

/*
 * 
 * 1.Encapsulation 
 * 
 * Encapsulation means putting together all the variables (instance variables) and the methods into a single unit called Class.
 * It also means hiding data and methods within an Object. 
 * Encapsulation provides the security that keeps data and methods safe from inadvertent changes. 
 * Programmers sometimes refer to encapsulation as using a “black box,” or a device that you can use without regard to
 *  the internal mechanisms.
 * A programmer can access and use the methods and data contained in the black box but cannot change them. 
 * Below example shows Mobile class with properties,
 * which can be set once while creating object using constructor arguments. 
 * Properties can be accessed using getXXX() methods which are having public access modifiers. 
 */
class Mobile {
	public String manufacturer;
	public String operating_system;
	public String model;
	public int cost;

	public Mobile() {
		// TODO Auto-generated constructor stub
	}

	// Constructor to set properties/characteristics of object
	Mobile(String man, String o, String m, int c) {
		this.manufacturer = man;
		this.operating_system = o;
		this.model = m;
		this.cost = c;
	}

	// Method to get access Model property of Object
	public String getModel() {
		return this.model;
	}
	// We can add other method to get access to other properties
}

/*
 * 2. Inheritance
 * 
 * An important feature of object-oriented programs is inheritance—the ability
 * to create classes that share the attributes and methods of existing classes,
 * but with more specific features. Inheritance is mainly used for code
 * reusability. So you are making use of already written class and further
 * extending on that. That why we discussed about the code reusability the
 * concept. In general one line definition we can tell that deriving a new class
 * from existing class, it’s called as Inheritance. You can look into the
 * following example for inheritance concept. Here we have Mobile class extended
 * by other specific class like Android and Blackberry
 */

class Android extends Mobile {
	// Constructor to set properties/characteristics of object
	Android(String man, String o, String m, int c) {
		super(man, o, m, c);
	}

	// Method to get access Model property of Object
	public String getModel() {
		return "This is Android Mobile- " + model;
	}
}

class Blackberry extends Mobile {
	// Constructor to set properties/characteristics of object
	Blackberry(String man, String o, String m, int c) {
		super(man, o, m, c);
	}

	public String getModel() {
		return "This is Blackberry-" + model;
	}

}

/*
 * 3.Polymorphism
 * 
 * In Core Java Polymorphism is one of easy concept to understand. Polymorphism
 * definition is that Poly means many and morphos means forms. It describes the
 * feature of languages that allows the same word or symbol to be interpreted
 * correctly in different situations based on the context. There are two types
 * of Polymorphism available in Java. For example, in English the verb “run”
 * means different things if you use it with “a footrace,” a “business,” or “a
 * computer.” You understand the meaning of “run” based on the other words used
 * with it. Object-oriented programs are written so that the methods having same
 * name works differently in different context. Java provides two ways to
 * implement polymorphism.
 */

/*
 * Static Polymorphism (compile time polymorphism/ Method overloading):
 */

/*
 * The ability to execute different method implementations by altering the
 * argument used with the method name is known as method overloading. In below
 * program we have three print methods each with different arguments. When you
 * properly overload a method, you can call it providing different argument
 * lists, and the appropriate version of the method executes.
 */

class Overloadsample {

	public void print(String s) {
		System.out.println("First Method with only String- " + s);
	}

	public void print(int i) {
		System.out.println("Second Method with only int- " + i);
	}

	public void print(String s, int i) {
		System.out.println("Third Method with both- " + s + "--" + i);
	}
}
/*
 * Dynamic Polymorphism (run time polymorphism/ Method Overriding)
 * 
 * When you create a subclass by extending an existing class, the new subclass contains 
 * data and methods that were defined in the original superclass. In other words, 
 * any child class object has all the attributes of its parent. Sometimes, however, 
 * the superclass data fields and methods are not entirely appropriate for the subclass objects;
 * in these cases, you want to override the parent class members. Let’s take example used in inheritance explanation. 
 */

/*
 * 4. Abstraction
 * 
 * All programming languages provide abstractions. 
 * It can be argued that the complexity of the problems you’re able to solve is directly related to the 
 * kind and quality of abstraction. An essential element of object-oriented programming is abstraction. 
 * Humans manage complexity through abstraction. When you drive your car you do not have to be concerned with
 *  the exact internal working of your car(unless you are a mechanic). What you are concerned with is interacting with 
 *  your car via its interfaces like steering wheel, brake pedal, accelerator pedal etc. 
 *  Various manufacturers  of car has different implementation of car working but its basic 
 *  interface has not changed (i.e. you still use steering wheel, brake pedal, accelerator pedal 
 *  etc to interact with your car). Hence the knowledge you have of your car is abstract.

A powerful way to manage abstraction is through the use of hierarchical classifications. 
This allows you to layer the semantics of complex systems, breaking them into more manageable pieces. 

From the outside, the car is a single object. Once inside, you see that the car consists of several subsystems: 
steering, brakes, sound system, seat belts, heating, cellular phone, and so on. 
In turn, each of these subsystems is made up of more specialized units. 
For instance, the sound system consists of a radio, a CD player, and/or a tape player. 
The point is that you manage the complexity of the car (or any other complex system)through the use of hierarchical abstractions.
 */

abstract class VehicleAbstract {
	public abstract void start();
	public void stop(){
		System.out.println("Stopping Vehicle in abstract class");
	}
}
class TwoWheeler extends VehicleAbstract{
	@Override
	public void start() {
		System.out.println("Starting Two Wheeler");		
	}	
}
class FourWheeler extends VehicleAbstract{
	@Override
	public void start() {
		System.out.println("Starting Four Wheeler");
	}
}

public class OOPSDemo {
	
}
