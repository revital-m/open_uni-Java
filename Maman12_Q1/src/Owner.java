
public class Owner {

	private String name;
	private String phoneNum;

	// Constructor for Owner.
	public Owner(String name, String phoneNum) {
		this.name = name;
		this.phoneNum = phoneNum;
	}

	// Copy Constructor for Owner.
	public Owner(Owner owner) {
		this.name = owner.getOwnerName();
		this.phoneNum = owner.getOwnerPhoneNum();
	}

	// Set the owner's name.
	public void setOwnerName(String name) {
		this.name = name;
	}

	// Get the owner's name.
	public String getOwnerName() {
		return this.name;
	}

	// Set the owner's phone number.
	public void setOwnerPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	// Get the owner's phone number.
	public String getOwnerPhoneNum() {
		return this.phoneNum;
	}

	// Return true if the owners are equals.
	public boolean equals(Owner otherOwner) {
		if (this.getOwnerName().equals(otherOwner.getOwnerName())
				&& this.getOwnerPhoneNum().equals(otherOwner.getOwnerPhoneNum())) {
			return true;
		}
		return false;
	}

	// Return String representation of the owner.
	public String toString() {
		return "Owner - Name: " + this.getOwnerName() + ", Phone: " + this.getOwnerPhoneNum();
	}

}
