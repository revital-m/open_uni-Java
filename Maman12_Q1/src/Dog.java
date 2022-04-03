
public class Dog extends Mammal {

	private double tailLength;
	private Owner owner;

	// Constructor for Dog.
	public Dog(String name, double age, String color, double tailLength, Owner owner) {
		super(name, age, color);
		this.tailLength = tailLength;
		this.owner = owner;
	}

	// Set the dog's tail length.
	public void setTailLength(double newLength) {
		this.tailLength = newLength;
	}

	// Get the dog's tail length.
	public double getTailLength() {
		return this.tailLength;
	}

	// Set the dog's owner.
	public void setDogOwner(Owner otherOwner) {
		this.getDogOwner().setOwnerName(otherOwner.getOwnerName());
		this.getDogOwner().setOwnerPhoneNum(otherOwner.getOwnerPhoneNum());
	}

	// Get the dog's owner.
	public Owner getDogOwner() {
		return this.owner;
	}

	public void eat() {
		System.out.println("I am a dog. I eat meat, bone & more.");
	}

	public void run() {
		System.out.println("I can run.");
	}

	// Return true if the dogs are equals.
	public boolean equals(Object dog) {
		if (!(dog instanceof Dog)) {
			return false;
		}
		Dog otherDog = (Dog) dog;
		if (super.equals(dog) && this.getTailLength() == otherDog.getTailLength()
				&& this.getDogOwner().equals(otherDog.getDogOwner())) {
			return true;
		}
		return false;
	}

	// Return a new copy of the dog.
	public Dog clone() {
		Dog clonedDog = new Dog(this.getName(), this.getAge(), this.getColor(), this.getTailLength(),
				new Owner(this.getDogOwner()));
		return clonedDog;
	}

	// Return String representation of the dog.
	public String toSting() {
		return "I am a dog. I can run. Name: " + this.getName() + ", Age: " + this.getAge() + ", Color: "
				+ this.getColor() + ", Tail Length: " + this.tailLength + ", " + this.getDogOwner().toString();
	}
}
