import java.util.ArrayList;
import java.util.List;


public class Deck {
	
	// method returns an arraylist of card, nested loop iterates through 4 suits and values 2-14 and adds new card to arraylist
	public ArrayList<Card> newDeck(){
	String[] suits = {"Clubs", "Hearts", "Spades", "Diamonds"};
	
	ArrayList<Card> cards = new ArrayList<>();
	
	for(int i = 0; i<=3; i++) {
		for(int j = 2; j <= 14; j++) {
			Card card = new Card(j, suits[i]);
			cards.add(card);
	}
	}
	return cards;
	}
	/*
	public Card draw() {
		Deck deck1 = new Deck();
		ArrayList<Card> newDeck = deck1.newDeck();
		Card topCard = newDeck.get(newDeck.size()-1);
		return topCard;
	}
	*/
	
	

}
