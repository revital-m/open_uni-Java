
public class Animal {

	private String name;
	private double age;
	private String color;

	// Constructor for Animal.
	public Animal(String name, double age, String color) {
		this.name = name;
		this.age = age;
		this.color = color;
	}

	// Set animal name.
	public void setName(String name) {
		this.name = name;
	}

	// Get animal name.
	public String getName() {
		return this.name;
	}

	// Set animal age.
	public void setAge(double age) {
		this.age = age;
	}

	// Get animal age.
	public double getAge() {
		return this.age;
	}

	// Set animal color.
	public void setColor(String color) {
		this.color = color;
	}

	// Get animal color.
	public String getColor() {
		return this.color;
	}

	public void eat() {
		System.out.println("I am eating.");
	}

	public void sleep() {
		System.out.println("I am sleeping.");
	}

	// Return true if the animals are equals.
	public boolean equals(Object animal) {
		if (!(animal instanceof Animal)) {
			return false;
		}
		Animal otherAnimal = (Animal) animal;
		if (otherAnimal.getName().equals(this.getName()) && otherAnimal.getAge() == this.getAge()
				&& otherAnimal.getColor().equals(this.getColor())) {
			return true;
		}
		return false;
	}

	// Return a new copy of the animal.
	public Animal clone() {
		Animal clonedAnimal = new Animal(this.getName(), this.getAge(), this.getColor());
		return clonedAnimal;
	}

	// Return String representation of the animal.
	public String toSting() {
		return "I am an animal. Name: " + this.name + ", Age: " + this.age + ", Color: " + this.color;
	}
}
