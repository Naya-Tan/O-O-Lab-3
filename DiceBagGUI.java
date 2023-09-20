package Naya_Tan_Lab3;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class DiceBagGUI {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Dice Bag ");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// create the main jpanel to add the two smaller ones on 
		JPanel mainPanel = new JPanel();
		mainPanel.setPreferredSize(new Dimension(300,420));
		mainPanel.setBackground(Color.WHITE);
		
		// create panel to show the dice bag image and buttons
		DiceBagButtons diceBag = new DiceBagButtons();
		diceBag.setPreferredSize(new Dimension(280,400));
		
		frame.getContentPane();
		frame.add(mainPanel);
		mainPanel.add(diceBag);
		
		frame.pack();
		frame.setVisible(true);
		
	}
}
