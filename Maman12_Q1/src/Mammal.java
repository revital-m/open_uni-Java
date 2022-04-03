
public class Mammal extends Animal {

	// Constructor for Mammal.
	public Mammal(String name, double age, String color) {
		super(name, age, color);
	}

	public void eat() {
		System.out.println("I am eating. I can eat plants, meat & more.");
	}

	// Return true if the mammals are equals.
	public boolean equals(Object mammal) {
		if (!(mammal instanceof Mammal)) {
			return false;
		}
		Mammal otherMammal = (Mammal) mammal;
		if (super.equals(otherMammal)) {
			return true;
		}
		return false;
	}

	// Return String representation of the mammal.
	public String toSting() {
		return "I am a mammal. Name: " + this.getName() + ", Age: " + this.getAge() + ", Color: " + this.getColor();
	}
}
