package Interfaces;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingTest {
	private static JLabel label = new JLabel("--");
	private static JButton btnLimpiar = new JButton("Limpiar");
	private static JButton btnEscribir = new JButton("Escribir");
	private static JButton btnAutor =new JButton("Autor");

	public static void acciones(ActionEvent e) {
		Object obj = e.getSource();
		if (obj == btnLimpiar)
			label.setText("");
		if (obj == btnEscribir)
			label.setText("Hola Mundo");
		if(obj==btnAutor)
			label.setText("Daniel");
	}

	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager
					.getCrossPlatformLookAndFeelClassName());
		} catch (Exception e) {
			e.printStackTrace();
		}

		JFrame frame = new JFrame("Controlando Eventos");
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				acciones(e);
			
			}
		});
		btnEscribir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				acciones(e);
				
			}
		});
		btnAutor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				acciones(e);
				
			}
		});
		frame.getContentPane().add(label);
		frame.getContentPane().add(btnLimpiar);
		frame.getContentPane().add(btnEscribir);
		frame.getContentPane().add(btnAutor);
		
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.out.println("Adiossssss");
				System.exit(0);
			}
		});
		frame.setLayout(new GridLayout(0, 1));
		frame.pack();
		frame.setSize(250, 150);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}
