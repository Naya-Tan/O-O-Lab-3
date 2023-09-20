package Naya_Tan_Lab3;
import javax.swing.*;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HandButtons extends JPanel{
	
	// create the deck 
	Deck deckOfCards = new Deck();
	
	// buttons 
	JButton deal = new JButton("     Deal a Card     ");
	JButton reset = new JButton("Reset Deck");
	
	// add back of card image
	ImageIcon backOfCard = new ImageIcon(new ImageIcon("src/Naya_Tan_Lab3/cards/back.png").getImage().getScaledInstance(100, 150, Image.SCALE_DEFAULT));
	JLabel back = new JLabel(backOfCard);
	
	// add label to show how many cards are left to be dealt
	int amount = 52;
	JLabel cardsLeft = new JLabel("Number of cards left to deal = " + amount);
	JLabel resetPlease = new JLabel();
	
	
	HandButtons(){
		
		ImageIcon imageIcon = new ImageIcon(new ImageIcon("src/Naya_Tan_Lab3/deck.gif").getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT));
        JLabel deckImage = new JLabel(imageIcon);
        this.add(deckImage);
        
        // add button to shuffle deck 
        deal.addActionListener(new ButtonListener());
    	this.add(deal);
    	
    	// reset deck button 
        reset.addActionListener(new ButtonListener());
     	this.add(reset);
     	
     	// add back of card image
        this.add(back);
        
        // counter for cards left to deal 
        this.add(cardsLeft);
        this.add(resetPlease);
	}
	
	private class ButtonListener implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			// reset the deck 
			if(e.getSource() == reset) {
				deckOfCards.renewDeck(); //why isnt the deck being renewed?
				back.setIcon(backOfCard);
				resetPlease.setText("");
				amount = 52;
				cardsLeft.setText("Number of cards left to deal = " + amount);
			}
			
			if(e.getSource() == deal) {	
				Card tempCard = deckOfCards.draw();
				// now we want to display the card being drawn 
				String temp = "src/Naya_Tan_Lab3/cards/";
				temp = temp + tempCard + ".png";
				ImageIcon imageIcon = new ImageIcon(new ImageIcon(temp).getImage().getScaledInstance(100, 150, Image.SCALE_DEFAULT));
		        back.setIcon(imageIcon);	
		        amount--;
		        cardsLeft.setText("Number of cards left to deal = " + amount);
		        
		        if(amount == 0) {
		        	resetPlease.setText("No more cards left - please reset the deck!");
		        }
		        
			}
		}
	
	}
	
	
	
}

