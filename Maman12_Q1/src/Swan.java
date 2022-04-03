
public class Swan extends Bird {

	// Constructor for Duck.
	public Swan(String name, double age, String color) {
		super(name, age, color);
	}

	public void swim() {
		System.out.println("I can swim.");
	}

	public void eat() {
		System.out.println("I am eating. I can eat seeds and breadcrumbs.");
	}

	// Return true if the swans are equals.
	public boolean equals(Object swan) {
		if (!(swan instanceof Swan)) {
			return false;
		}
		Swan otherSwan = (Swan) swan;
		if (super.equals(otherSwan)) {
			return true;
		}
		return false;
	}

	// Return String representation of the swan.
	public String toSting() {
		return "I am a swan. I can swim. Name: " + this.getName() + ", Age: " + this.getAge() + ", Color: "
				+ this.getColor();
	}
}
