package Naya_Tan_Lab3;

import javax.swing.*;
//import Die;

import Naya_Tan_Lab3.Die;
import Naya_Tan_Lab3.DiceBagClass;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class DiceBagButtons extends JPanel {
	
	JLabel bagTotal = new JLabel("Number of dice in the bag: 0");
	DiceBagClass diceBag = new DiceBagClass();
	
	int bagCount = 0;
	int number = 4;
	int result = 0;
	
	// array to hold amount of each die
	int sumOfEachDie[] = new int[6];
	
	JButton[] buttons = new JButton[7];
	JLabel[] labelsButtons = new JLabel[7];
	int count[] = new int[6];
	
	DiceBagButtons() {
		
		
		// add image to the panel 
		ImageIcon imageIcon = new ImageIcon(new ImageIcon("src/Naya_Tan_Lab3/diceBag.gif").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
        JLabel diceBag = new JLabel(imageIcon);
        this.add(diceBag);
        this.add(bagTotal);
        
        
        // make the list of buttons and add their labels
        for(int i = 0; i < 5; i ++ ) {
        	buttons[i] = new JButton("Roll a die with " + String.valueOf(number) + " sides");
        	buttons[i].addActionListener(new ButtonListener());
        	this.add(buttons[i]);
        	labelsButtons[i] = new JLabel();
        	this.add(labelsButtons[i]);
        	number +=2;
        }
        buttons[5] = new JButton("Roll a die with " + String.valueOf(number + 6) + " sides" );
        buttons[5].addActionListener(new ButtonListener());
        this.add(buttons[5]);
    	labelsButtons[5] = new JLabel();
    	this.add(labelsButtons[5]);
        
    	// add armageddon button 
    	buttons[6]= new JButton("     Armageddon     ");
    	buttons[6].addActionListener(new ButtonListener());
    	this.add(buttons[6]);
    	labelsButtons[6]= new JLabel("The sum of all the die in the bag is " + 0);
    	this.add(labelsButtons[6]);
    	
    	

	}
	
	
	private class ButtonListener implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
				
				// add die w 4 sides
				if(e.getSource() == buttons[0]) {
					diceBag.addDie(4,1); // add one die to the bag w side 4
					Die tempDie = new Die(4);
					tempDie.roll();
					result = tempDie.getFace(); 
					sumOfEachDie[0] += result;
					labelsButtons[0].setText("Result: " + result + " Sum: " + sumOfEachDie[0]);
					
					bagCount++;
					bagTotal.setText("Number of dice in the bag: " + bagCount);
				}
				
				// add die w 6 sides 
				if(e.getSource() == buttons[1]) {
					diceBag.addDie(6,1); // add die to the bag w side 6
					Die tempDie = new Die(6);
					tempDie.roll();
					result = tempDie.getFace(); 
					sumOfEachDie[1] += result;
					labelsButtons[1].setText("Result: " + result + " Sum: " + sumOfEachDie[1]); 
					
					bagCount++;
					bagTotal.setText("Number of dice in the bag: " + bagCount);
				}
				
				// add die w 8 sides 
				if(e.getSource() == buttons[2]) {
					diceBag.addDie(8,1); // add die to the bag w side 8
					Die tempDie = new Die(8);
					tempDie.roll();
					result = tempDie.getFace();
					sumOfEachDie[2] += result;
					labelsButtons[2].setText("Result: " + result + " Sum: " + sumOfEachDie[2]); 
					
					bagCount++;
					bagTotal.setText("Number of dice in the bag: " + bagCount);
				}
				
				// add die w 10 sides
				if(e.getSource() == buttons[3]) {
					diceBag.addDie(10,1); // add die to the bag w side 10
					Die tempDie = new Die(10);
					tempDie.roll();
					result = tempDie.getFace();
					sumOfEachDie[3] += result;
					labelsButtons[3].setText("Result: " + result + " Sum: " + sumOfEachDie[3]);
					
					bagCount++;
					bagTotal.setText("Number of dice in the bag: " + bagCount);
				}
				
				// add die w 12 sides 
				if(e.getSource() == buttons[4]) {
					diceBag.addDie(12,1); // add die to the bag w side 12
					Die tempDie = new Die(12);
					tempDie.roll();
					result = tempDie.getFace();
					sumOfEachDie[4] += result;
					labelsButtons[4].setText("Result: " + result + " Sum: " + sumOfEachDie[4]); 
					
					bagCount++;
					bagTotal.setText("Number of dice in the bag: " + bagCount);
				}
				
				
				// add die w 20 sides
				if(e.getSource() == buttons[5]) {
					diceBag.addDie(20,1); // add die to the bag w side 20
					Die tempDie = new Die(20);
					tempDie.roll();
					result = tempDie.getFace();
					sumOfEachDie[5] += result;
					labelsButtons[5].setText("Result: " + result + " Sum: " + sumOfEachDie[5]); 
					
					bagCount++;
					bagTotal.setText("Number of dice in the bag: " + bagCount);
				}
				
			
			// armageddon function 
			if(e.getSource() == buttons[6]) {
				labelsButtons[6].setText("The sum of the die in the bag: " + diceBag.Armageddon());
			}
			
			
		}
	}
	
	
	
}

	
