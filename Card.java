package Naya_Tan_Lab3;

public class Card {
	 String suit;
	    int value;
	    String valueString;

	    public Card(int value, String suit){
	    	this.suit = suit;
	    	this.value = value;
	    }

	    public String toString() { 
	        switch (this.value) {
	        case 1:
	            valueString = "ace";
	            break;
	        case 11:
	        	valueString = "jack";
	            break;
	        case 12:
	        	valueString = "queen";
	            break;
	        case 13:
	        	valueString = "king";
	            break;
	        default:
	        	valueString = String.valueOf(this.value);
	            break;
	            }
	      
	        return ( valueString + "_of_" +  this.suit); 
	    }
}
