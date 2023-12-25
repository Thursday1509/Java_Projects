package Brickbraker;

import java.awt.Color;
import javax.swing.JFrame;

public class Play {
	public static void main(String[] args) {
		JFrame obj=new JFrame();
		setup gamePlay = new setup();
		
		obj.setBounds(10, 10, 700, 600);
		obj.setTitle("Breakout Ball");		
		obj.setResizable(false);
		obj.setVisible(true);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obj.add(gamePlay);
                obj.setVisible(true);
		
	}

}
