
public class Reptile extends Animal {

	// Constructor for Reptile.
	public Reptile(String name, double age, String color) {
		super(name, age, color);
	}

	public void crawl() {
		System.out.println("I can crawl.");
	}

	public void eat() {
		System.out.println("I am eating. I can eat rodents.");
	}

	// Return true if the reptiles are equals.
	public boolean equals(Object reptile) {
		if (!(reptile instanceof Reptile)) {
			return false;
		}
		Reptile otherReptile = (Reptile) reptile;
		if (super.equals(otherReptile)) {
			return true;
		}
		return false;
	}

	// Return String representation of the reptile.
	public String toSting() {
		return "I am a reptile. I can crawl. Name: " + this.getName() + ", Age: " + this.getAge() + ", Color: "
				+ this.getColor();
	}
}
