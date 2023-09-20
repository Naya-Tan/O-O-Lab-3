package Naya_Tan_Lab3;

import java.util.ArrayList;


public class Deck {
	
	// holds all the cards in the deck 
	ArrayList<Card> deckOfCards = new ArrayList<Card>();
	// keeps track of the removed cards of the deck
	ArrayList<Card> removed = new ArrayList<Card>();
	
	public int size; // to keep track of how many cards are in the deck 
	Card newCard;
	public String s;
	public int value;
	
	String[] suits = new String[] {"clubs", "spades", "diamonds", "hearts"};
	
	// create the deck of cards
	public Deck() {
		
		for (int i = 0; i < 4; i++) {
			for (int j = 1; j < 14; j++) {
				s = suits[i];
				value = j;
				newCard = new Card(value, s);
				this.deckOfCards.add(newCard);
			}
		}
		this.size = this.deckOfCards.size();
	}
	
	public Card draw() {
		int randomCard = (int)(Math.random() * this.size - 1);
		Card cardDrawn = this.deckOfCards.get(randomCard);
		this.deckOfCards.remove(randomCard);
		this.size--;
		this.removed.add(cardDrawn);
		
		return cardDrawn;	
	}
	
	public ArrayList<Card> deal(int numCards){
		ArrayList<Card> dealt = new ArrayList<Card>();
		
		for(int i = 0; i < numCards; i++) {
			int randomCard = (int)(Math.random() * this.size - 1);
			Card cardDrawn = this.deckOfCards.get(randomCard);
			this.deckOfCards.remove(cardDrawn);
			this.size--;
			this.removed.add(cardDrawn);
			dealt.add(cardDrawn);
		}
		
		return dealt;
	}
	
	public void renewDeck() {
		for (int i = 0; i < this.removed.size(); i++) {
			Card renewCard = this.removed.get(i);
			this.deckOfCards.add(renewCard);
		}
		removed.clear();
		this.size = this.deckOfCards.size();
		
	}
	
	
}