import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Animal> hotel = new ArrayList<Animal>();

		Owner revital = new Owner("Revital", "050-00000000");
		Owner sigal = new Owner("Sigal", "052-22222222");

		Dog miel = new Dog("Miel", 5, "Brown", 1.3, revital);
		Snake pita = new Snake("Pita", 7, "Yellow", 2.3);
		Swan lilo = new Swan("Lilo", 3, "White");
		Animal stitch = new Bird("Stitch", 2, "Blue");
		Animal miki = new Reptile("Miki", 4, "Gray");
		Animal mini = new Mammal("Mini", 4, "Black");

		hotel.add(miel);
		hotel.add(pita);
		hotel.add(lilo);
		hotel.add(stitch);
		hotel.add(miki);
		hotel.add(mini);

		// Iterate over all animals in hotel and print a string represent them, and use
		// eat() & sleep() for each animal.
		for (int i = 0; i < hotel.size(); i++) {

			Animal animal = hotel.get(i);
			System.out.println(animal.toSting());
			animal.eat();
			animal.sleep();
		}

		Dog mielClone = miel.clone(); // clone of miel.

		System.out.println(mielClone.toSting());
		mielClone.setDogOwner(sigal); // set mielClone owner
		mielClone.setName("Moki"); // set mielClone name
		System.out.println(miel.toSting());
		System.out.println(mielClone.toSting());
	}

}
