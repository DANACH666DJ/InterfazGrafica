package Interfaces;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class EjemploBorderLayout {
	public static void main(String[] args) {
		JFrame ventana = new JFrame("Ejemplo");
		ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		Container contenedor = ventana.getContentPane();
		contenedor.add(new JButton("Centro"),BorderLayout.CENTER);
		contenedor.add(new JButton("Norte"), BorderLayout.NORTH);
		contenedor.add(new JButton("Sur"), BorderLayout.SOUTH);
		contenedor.add(new JButton("Este"), BorderLayout.EAST);
		contenedor.add(new JButton("Oeste"), BorderLayout.WEST);
		ventana.setSize(400, 400);
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);
	}
}
