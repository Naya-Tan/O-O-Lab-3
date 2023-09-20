package Naya_Tan_Lab3;

import javax.swing.*;
import java.awt.*;

public class NumberDisplayGUI {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Number Display");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// create the main jpanel to add the two smaller ones on 
		JPanel mainPanel = new JPanel();
		mainPanel.setPreferredSize(new Dimension(300,320));
		mainPanel.setBackground(Color.white);
		
		// create the numberpad panel and add it to the main 
		NumberPad buttons = new NumberPad();
		buttons.setPreferredSize(new Dimension(280,300));
		
		frame.getContentPane();
		
		// add the smaller panel to the main one 
		mainPanel.add(buttons);
		frame.add(mainPanel);
	
		
		frame.pack();
		frame.setVisible(true);
	}

}
