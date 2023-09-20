package Naya_Tan_Lab3;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NumberPad extends JPanel {
	
	//TextField textfield;
	
	JTextField textfield = new JTextField();
	
	JButton[] numberButtons = new JButton [10];
	JButton[] functionButtons = new JButton[3];
	JButton decimal, even, clear;

	NumberPad(){
		
		textfield.setBounds(50, 25, 300, 50);
		textfield.setEditable(false);
		this.add(textfield);
		
		// make numberButtons in a grid layout 
		setLayout(new GridLayout (5,3));
			for(int i = 9; i >= 0; i--) {
				numberButtons[i] = new JButton(String.valueOf(i));
				numberButtons[i].addActionListener(new ButtonListener());
				this.add(numberButtons[i]);
			}
		
		// make the function buttons 
		decimal = new JButton(".");
		even = new JButton("Evener");
		clear = new JButton("Clear");
		
		// now assign it to the functionButtons list 
		functionButtons[0] = decimal;
		functionButtons[1] = even;
		functionButtons[2] = clear;
		
		// we want to assign action listeners to the function buttons
		for(int i = 0; i < 3; i++) {
			functionButtons[i].addActionListener(new ButtonListener());
			this.add(functionButtons[i]);
		}
		
		
	}
	
	// action listener class
	private class ButtonListener implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			
			for(int i = 0; i < 10; i++) {
				if(e.getSource() == numberButtons[i]) {
					textfield.setText(textfield.getText().concat(String.valueOf(i)));
				}
			}
			
			if(e.getSource() == decimal) {
				textfield.setText(textfield.getText().concat("."));
			}
			
			if(e.getSource() == clear) {
				textfield.setText("");
			}
			
			if(e.getSource() == even) {
				String text = textfield.getText();
				int rounded = 0;
				double number = Double.parseDouble(text);
				
				if (number - 0.5 < (int)number + 0.5) {
					rounded = (int)number;
					textfield.setText(String.valueOf(rounded));
				}
				
				rounded = (int)Math.round(number);
				if(rounded - 0.5 >= rounded - 0.5) {
					//rounded++;
					textfield.setText(String.valueOf(rounded));
				}
				
				
			}
			
			
			}
		}
	
	
	
	
}

