package Interfaces;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TablaPractica extends JFrame {

	private JPanel contentPane;
	private JTextField textClave;
	private JTextField textValor;
	private JTable table;
	private DefaultTableModel modelo;
	private JButton btnAddd;
	private JButton btnBorrar;
	private JButton btnModificar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TablaPractica frame = new TablaPractica();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TablaPractica() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblClave = new JLabel("Clave");
		lblClave.setBounds(91, 153, 46, 14);
		contentPane.add(lblClave);
		
		textClave = new JTextField();
		textClave.setBounds(38, 173, 135, 20);
		contentPane.add(textClave);
		textClave.setColumns(10);
		
		JLabel lblValor = new JLabel("Valor");
		lblValor.setBounds(284, 153, 46, 14);
		contentPane.add(lblValor);
		
		textValor = new JTextField();
		textValor.setBounds(231, 173, 135, 20);
		contentPane.add(textValor);
		textValor.setColumns(10);
		
		btnAddd = new JButton("A\u00F1adir");
		btnAddd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textClave.setText("");
				textValor.setText("");
			}
		});
		btnAddd.setBounds(52, 227, 89, 23);
		contentPane.add(btnAddd);
		
		btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		btnBorrar.setBounds(176, 227, 89, 23);
		contentPane.add(btnBorrar);
		
		btnModificar = new JButton("Modificar");
		btnModificar.setBounds(293, 227, 89, 23);
		contentPane.add(btnModificar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(51, 21, 315, 122);
		contentPane.add(scrollPane);
		
		
		modelo= new DefaultTableModel();
		table = new JTable(modelo);
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
			},
			new String[] {
				"Clave", "Valor",
				
			}
		));
	}
}
