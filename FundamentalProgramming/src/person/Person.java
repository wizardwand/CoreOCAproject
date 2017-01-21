package person;

import static person.HairColor.*;

public class Person {

	// Enum --> specify the values to be set.
	HairColor hairColor = BLACK;

	public Person() {
	}

	public static void main(String[] args) {
		// Aliasing
		Person peterParker = new Person();
		Person spiderMan = peterParker;

		spiderMan.hairColor = RED;

		System.out.println("Hair Color of Peter Parker is : " + peterParker.hairColor);
		System.out.println("Hair Color of Spider Man  is : " + spiderMan.hairColor);

	}

}
