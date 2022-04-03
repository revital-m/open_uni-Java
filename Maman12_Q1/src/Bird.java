
public class Bird extends Animal {

	// Constructor for Bird.
	public Bird(String name, double age, String color) {
		super(name, age, color);
	}

	public void fly() {
		System.out.println("I can fly.");
	}

	public void eat() {
		System.out.println("I am eating. I can eat seeds.");
	}

	// Return true if the birds are equals.
	public boolean equals(Object bird) {
		if (!(bird instanceof Bird)) {
			return false;
		}
		Bird otherBird = (Bird) bird;
		if (super.equals(otherBird)) {
			return true;
		}
		return false;
	}

	// Return String representation of the bird.
	public String toSting() {
		return "I am a bird. I can fly. Name: " + this.getName() + ", Age: " + this.getAge() + ", Color: "
				+ this.getColor();
	}
}
