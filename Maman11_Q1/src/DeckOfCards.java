import java.security.SecureRandom;
import java.util.ArrayList;

// DeckOfCards class represents a deck of playing cards.
public class DeckOfCards {
	
	private static final SecureRandom randomNumbers = new SecureRandom();
	private static final int NUMBER_OF_CARDS = 52;
	private ArrayList<Card> deck = new ArrayList<Card>(NUMBER_OF_CARDS);
	
	// Constructor that fills deck of cards.
	public DeckOfCards() {
		
		String[] faces = {"Ace", "Deuce", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
		String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
		
		// Populate deck with Card objects
		for(int i = 0; i < NUMBER_OF_CARDS; i++) {
			deck.add(new Card(faces[i % 13], suits[i / 13]));
		}
	}
	
	// Shuffle the deck of cards randomly.
	public void shuffle() {
		
		for(int first = 0; first < deck.size(); first++) {
			// Select a random number between 0-51.
			int second = randomNumbers.nextInt(NUMBER_OF_CARDS);
			
			// Swap the current card with the randomly selected card.
			Card temp = deck.get(first);
			deck.set(first,deck.get(second));
			deck.set(second,temp);
		}
	}
	
	// Check if the deck is empty.
	public boolean isEmptyDeck() {
		return deck.isEmpty();
	}
	
	// Deal one card.
	public Card dealCard() {
		
		// Determine whether there are cards remain to be dealt.
		if (!isEmptyDeck()) {
			return deck.remove(0); // Return the top card in the arrayList.
		}
		return null; // Return null to indicate that all Cards were dealt.
	}
	
	// Add a card to the deck.
	public void addCard(Card card) {
		deck.add(card);
	}
	
	// Return the deck size.
	public int deckSize() {
		return deck.size();
	}
    
	// Clear the deck.
	public void clearDeck() {
		deck.clear();
	}
	
    // Add cards to the deck.
	public void addCardsToDeck(DeckOfCards  deckToAdd) {
		
		while (!deckToAdd.isEmptyDeck()) {
			deck.add(deckToAdd.dealCard());
		}
	}
}
