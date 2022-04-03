/**
 * War cards game:
 * Distribute a deck of cards to two players.
 * In each turn the two players present the top card in the deck.
 * The player whose card value is higher wins both cards and places them at the bottom of his deck.
 * In case the values of the two cards is the same, a "war" mode is declared - 
 * 		each player adds 3 cards, and the player with the higher third card wins all the cards dealt.
 * 		if the cards values are the same again, "war" mode is declared until one of the players wins.
 * The first player left without cards loses.
 */
import javax.swing.*;

public class Main {
	
	public static void main(String[] args) {
		warCardsGame();
	}

	public static void warCardsGame() {
		
		String infoMessage;
		DeckOfCards playerOneDeck = new DeckOfCards();
		DeckOfCards playerTwoDeck = new DeckOfCards();
		DeckOfCards mainDeck = new DeckOfCards();

		dealt(playerOneDeck, playerTwoDeck, mainDeck);
		
		while(!playerOneDeck.isEmptyDeck() && !playerTwoDeck.isEmptyDeck()) {
			Card playerOneCard = playerOneDeck.dealCard();
			Card playerTwoCard = playerTwoDeck.dealCard();
			mainDeck.addCard(playerOneCard);
			mainDeck.addCard(playerTwoCard);
			
			String info = "Player One:\n    Card: " + playerOneCard.toString() + "\n\nPlayer Two:\n    Card: " + playerTwoCard.toString();

			if (playerOneCard.cardFace() == playerTwoCard.cardFace()) {
				infoMessage = info + "\n\nWar!!!";
				warCase(playerOneDeck, playerTwoDeck, mainDeck, playerOneCard, playerTwoCard);
			}
			else {
				infoMessage = info + checkForWinnerOfRound(playerOneDeck, playerTwoDeck, mainDeck, playerOneCard, playerTwoCard);
			}
			JOptionPane.showMessageDialog(null, infoMessage);

		}
		winCase(playerOneDeck);
	}
	
	// Add two more cards to the main deck for each player.
	private static void warCase(DeckOfCards playerOneDeck, DeckOfCards playerTwoDeck, DeckOfCards mainDeck, Card playerOneCard, Card playerTwoCard) {

		for (int i = 0; i < 2; i++){
			playerOneCard = playerOneDeck.dealCard();
			playerTwoCard = playerTwoDeck.dealCard();
			mainDeck.addCard(playerOneCard);
			mainDeck.addCard(playerTwoCard);
		}
	}
	
	// Check for the winner in this round.
	private static String checkForWinnerOfRound(DeckOfCards playerOneDeck, DeckOfCards playerTwoDeck, DeckOfCards mainDeck, Card playerOneCard, Card playerTwoCard) {
		
		if(playerOneCard.cardFace() > playerTwoCard.cardFace()) {
			addCardsToWinDeck(playerOneDeck, mainDeck);
			return "\n\nPlayer ONE won the round!" + "\n\nPlayer One Deck Size: " + playerOneDeck.deckSize() + "\nPlayer Two Deck Size: " + playerTwoDeck.deckSize();
		}
		else if (playerOneCard.cardFace() < playerTwoCard.cardFace()) {
			addCardsToWinDeck(playerTwoDeck, mainDeck);
			return "\n\nPlayer TWO won the round!" + "\n\nPlayer One Deck Size: " + playerOneDeck.deckSize() + "\nPlayer Two Deck Size: " + playerTwoDeck.deckSize();
		}
		return "\n\nWar!!!";
	}
	
	// Check for the winner of the game.
	private static void  winCase(DeckOfCards playerOneDeck) {
		if(playerOneDeck.isEmptyDeck()) {
			JOptionPane.showMessageDialog(null,  "Player TWO won!");
		}
		else {
			JOptionPane.showMessageDialog(null, "Player ONE won!");
		}
	}
	
	// Add all the cards in main deck to the winning player deck.
	private static void addCardsToWinDeck(DeckOfCards winDeck, DeckOfCards mainDeck) {
		
		winDeck.addCardsToDeck(mainDeck);
		mainDeck.clearDeck();
	}
	
	// Dealt the main deck of cards between the two players.
	private static void dealt(DeckOfCards playerOneDeck, DeckOfCards playerTwoDeck, DeckOfCards mainDeck) {
		
		int numOfCard = 52;
		
		// Start the players with empty decks.
		playerOneDeck.clearDeck(); 
		playerTwoDeck.clearDeck();
		
		mainDeck.shuffle(); // Shuffle randomly the main deck before dealt it.
		
		for(int i = 0; i < numOfCard; i++) {
			
			if((i % 2) == 0) {
				playerOneDeck.addCard(mainDeck.dealCard());
			}
			else {
				playerTwoDeck.addCard(mainDeck.dealCard());
			}
		}
		
		mainDeck.clearDeck(); // Empty the main deck after the dealt.
	}    
}

