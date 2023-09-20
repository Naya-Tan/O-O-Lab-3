package Naya_Tan_Lab3;

import java.util.ArrayList;

public class Hand {

	// what cards are in the players hand 
		private ArrayList<Card> playerHand = new ArrayList<Card>();

		public ArrayList<Card> hand() {
			return playerHand;
		}
				
		public ArrayList<Card> addCard(Card card) {
			this.playerHand.add(card);
			return this.playerHand;
		}
		
		public ArrayList<Card> addMulCards(ArrayList<Card> cards){
			for (int i = 0; i < cards.size(); i++) {
				this.playerHand.add(cards.get(i));
			}
			return this.playerHand;
		}
		
		public String toString() {
			String handToString = "";
			for (int i = 0; i < playerHand.size(); i++) {
				handToString = handToString + String.valueOf(playerHand.get(i) + ", ");
			}
			return handToString;
		}
}
