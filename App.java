import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {

	public static void main(String[] args) {
	
	// Create a new deck from deck class and shuffle
	Deck deck1 = new Deck();
	ArrayList<Card> newDeck = deck1.newDeck();
	Collections.shuffle(newDeck);
	
	// Two new players from Player class
	Player player1 = new Player("Tom", 0);
	Player player2 = new Player("Alice", 0);
	
	
	//Two new hands by iterating through deck and splitting first 26 to first hand and last 26 second hand
	ArrayList<Card> hand1 = new ArrayList<>();
	ArrayList<Card> hand2 = new ArrayList<>();
	for(int i = 0; i < newDeck.size()/2; i++) {
		int j = 1;
		j += i;
		hand1.add(newDeck.get(i));
		hand2.add(newDeck.get(newDeck.size()-j));
	}
	
	System.out.println("Player one is: " + player1.getName() + ", their hand is: " + hand1);
	System.out.println("");
	System.out.println("Player two is: " + player2.getName() + ", their hand is: " + hand2);
	System.out.println("");
	
	 
	//Iterate through hands getting next card from each hand and comparing two then incrementing player score if card value is higher
	for(int i = 0; i < newDeck.size()/2; i++) {
		Card card1 = hand1.get(i);
		int card1Value = card1.getValue();
		Card card2 = hand2.get(i);
		int card2Value = card2.getValue();
		
		if (card1Value > card2Value) {
		player1.setScore(player1.getScore()+1);	
		}
		
		else if(card1Value < card2Value) {
		player2.setScore(player2.getScore()+1);
		}

	}
	// Printing each player score and player with high score or draw if score is equal
	System.out.println(player1.getName() + "'s score is :" + player1.getScore());
	System.out.println(player2.getName() + "'s score is :" + player2.getScore());
	    
	
	if(player1.getScore() > player2.getScore()) {
		System.out.println(player1.getName() + " wins.");
	}
	else if(player1.getScore() < player2.getScore()) {
		System.out.println(player2.getName() + " wins.");
	}
	else {
		System.out.println("Draw.");
	}
	
		
	}
		
	
}
