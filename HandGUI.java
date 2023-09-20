package Naya_Tan_Lab3;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class HandGUI {
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("Hand");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// create the main jpanel to add the two smaller ones on 
		JPanel mainPanel = new JPanel();
		mainPanel.setPreferredSize(new Dimension(300,420));
		mainPanel.setBackground(Color.white);
		
		// create panel to show the dice bag image and buttons
		HandButtons handButtons = new HandButtons();
		handButtons.setPreferredSize(new Dimension(280,400));
		
		frame.getContentPane();
		frame.add(mainPanel);
		mainPanel.add(handButtons);
		
		frame.pack();
		frame.setVisible(true);
		
	}

}
