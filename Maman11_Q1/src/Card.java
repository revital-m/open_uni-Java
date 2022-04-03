// Card class represents a playing card.
public class Card {
	
	private final String face; // The face of the card ("Ace",..., "King").
	private final String suit; // The suit of the card ("Hearts", "Diamonds", "Clubs", "Spades").
	
	// Constructor that initializes card's face and suit
	public Card(String cardFace, String cardSuit) {
		this.face = cardFace;
		this.suit = cardSuit;
	}
	
	// Return the card face value in int.
	public int cardFace() {
		
		String[] values = { "Ace", "Deuce", "Three", "Four", "Five", "Six",
                "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King" };
		
        for(int i = 0; i < values.length; i++) {
            if(face == values[i])
                return i + 1;
        }
        return 0;
	}
	
	// Return String representation of the Card.
	public String toString() {
		return face + " of " + suit;
	}
}
