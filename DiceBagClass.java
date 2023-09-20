package Naya_Tan_Lab3;

import java.util.ArrayList;

//import Naya_Tan_Lab3.Die;

public class DiceBagClass {

	ArrayList<Die> diceInBag = new ArrayList<Die>(); 
	Die newDie;
	
	String s;
	int total;
	int count;
	
	// add function for adding die 
	public void addDie(int sides, int numOfDie){
		for (int i = 0; i < numOfDie; i++) {
			newDie = new Die(sides);
			this.diceInBag.add(newDie);
			}
	}
	
	public String rollFours(int numOfDie) {
		s = "";
		total = 0;
		count = 0;
		for (int i = 0; i < this.diceInBag.size(); i++) {
			if (count == numOfDie) {
				break;
			}
			
			Die tempDie = this.diceInBag.get(i);
			if (tempDie.numSides == 4) {
				tempDie.roll();
				//s = s + ("\nDie " + (count + 1) + " = " + tempDie.getFace());
				count++;
				total = total + tempDie.getFace();
			}
		}
		
		//return s + "\nThe sum of the dice is " + total;
		return String.valueOf(total);
	}
	
	public String rollSixes(int numOfDie) {
		s = "";
		total = 0;
		count = 0;
		for (int i = 0; i < this.diceInBag.size(); i++) {
			if (count == numOfDie) {
				break;
			}
			
			Die tempDie = this.diceInBag.get(i);
			if (tempDie.numSides == 6) {
				tempDie.roll();
				s = s + ("\nDie " + (count + 1) + " = " + tempDie.getFace());
				count++;
				total = total + tempDie.getFace();
			}
		}
		
		return s + "\nThe sum of the dice is " + total;
	}
	
	public String rollEights(int numOfDie) {
		s = "";
		total = 0;
		count = 0;
		for (int i = 0; i < this.diceInBag.size(); i++) {
			if (count == numOfDie) {
				break;
			}
			
			Die tempDie = this.diceInBag.get(i);
			if (tempDie.numSides == 8) {
				tempDie.roll();
				s = s + ("\nDie " + (count + 1) + " = " + tempDie.getFace());
				count++;
				total = total + tempDie.getFace();
			}
		}
		
		return s + "\nThe sum of the dice is " + total;
	}
	
	public String rollTens(int numOfDie) {
		s = "";
		total = 0;
		count = 0;
		for (int i = 0; i < this.diceInBag.size(); i++) {
			if (count == numOfDie) {
				break;
			}
			
			Die tempDie = this.diceInBag.get(i);
			if (tempDie.numSides == 10) {
				tempDie.roll();
				s = s + ("\nDie " + (count + 1) + " = " + tempDie.getFace());
				count++;
				total = total + tempDie.getFace();
			}
		}
		
		return s + "\nThe sum of the dice is " + total;
	}
	
	public String rollTwelves(int numOfDie) {
		s = "";
		total = 0;
		count = 0;
		for (int i = 0; i < this.diceInBag.size(); i++) {
			if (count == numOfDie) {
				break;
			}
			
			Die tempDie = this.diceInBag.get(i);
			if (tempDie.numSides == 12) {
				tempDie.roll();
				s = s + ("\nDie " + (count + 1) + " = " + tempDie.getFace());
				count++;
				total = total + tempDie.getFace();
			}
		}
		
		return s + "\nThe sum of the dice is " + total;
	}
	
	public String rollTwenties(int numOfDie) {
		s = "";
		total = 0;
		count = 0;
		for (int i = 0; i < this.diceInBag.size(); i++) {
			if (count == numOfDie) {
				break;
			}
			
			Die tempDie = this.diceInBag.get(i);
			if (tempDie.numSides == 20) {
				tempDie.roll();
				s = s + ("\nDie " + (count + 1) + " = " + tempDie.getFace());
				count++;
				total = total + tempDie.getFace();
			}
		}
		
		return s + "\nThe sum of the dice is " + total;
	}
	
	public String Armageddon() {
		s = "";
		total = 0;
		for (int i = 0; i < this.diceInBag.size(); i++) {
			Die tempDie = this.diceInBag.get(i);
			tempDie.roll();
			s = s + ("\nDie " + (i + 1) + " = " + tempDie.getFace());
			total = total + tempDie.getFace();
		}
		//return s + "\nThe sum of the dice is " + total;
		return String.valueOf(total);
	}
	
}