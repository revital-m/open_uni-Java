
public class Snake extends Reptile {

	private double bodyLength;

	// Constructor for Snake.
	public Snake(String name, double age, String color, double bodyLength) {
		super(name, age, color);
		this.bodyLength = bodyLength;
	}

	// Set the snake's body length.
	public void setBodyLength(double newBodyLength) {
		this.bodyLength = newBodyLength;
	}

	// Get the snake's body length.
	public double getBodyLength() {
		return this.bodyLength;
	}

	public void eat() {
		System.out.println("I am a snake. I eat mice.");
	}

	// Return true if the snakes are equals.
	public boolean equals(Object snake) {
		if (!(snake instanceof Snake)) {
			return false;
		}
		Snake otherSnake = (Snake) snake;
		if (super.equals(otherSnake) && this.getBodyLength() == otherSnake.getBodyLength()) {
			return true;
		}
		return false;
	}

	// Return a new copy of the snake.
	public Snake clone() {
		Snake clonedSnake = new Snake(this.getName(), this.getAge(), this.getColor(), this.getBodyLength());
		return clonedSnake;
	}

	// Return String representation of the snake.
	public String toSting() {
		return "I am a snake. Name: " + this.getName() + ", Age: " + this.getAge() + ", Color: " + this.getColor()
				+ ", Body Length: " + this.bodyLength;
	}

}
