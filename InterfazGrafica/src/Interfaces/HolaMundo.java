package Interfaces;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

public class HolaMundo {

	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame ("Ventana Hola Mundo");
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		JLabel label = new JLabel ("Hola mundo");
		JLabel label2 = new JLabel ("Hola mundo");
		frame.getContentPane().add(label);
		frame.getContentPane().add(label2);
		label2.setVisible(false);
//		frame.pack();
//		frame.setSize(200, 100);
		frame.setBounds(0,400, 300, 100);
//		frame.setLocationRelativeTo(null);
//		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.setVisible(true);
		
		
		
		}
}
