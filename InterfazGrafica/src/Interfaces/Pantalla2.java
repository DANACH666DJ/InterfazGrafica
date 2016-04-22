package Interfaces;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JPasswordField;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.Calendar;
import javax.swing.SpinnerListModel;
import javax.swing.JList;

public class Pantalla2 extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombre;
	private JLabel lblNombre ;
	private JButton btnOk;
	private JTextArea txtArea;
	private JComboBox comboBox;
	private JCheckBox chckbxPregunta1 ;
	private JCheckBox chckbxPregunta2 ;
	private JRadioButton rdbtnHombre ;
	private JRadioButton rdbtnMujer ;
	private  ButtonGroup buttonGroup; 
	private JButton btnLimpiar;
	private JPasswordField passwordField;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pantalla2 frame = new Pantalla2();
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
	public Pantalla2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 614);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		lblNombre= new JLabel("Nombre");
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		
		btnOk = new JButton("Ok");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				txtArea.append(txtNombre.getText()+"\n");
//				txtNombre.setText("");
				
//				comboBox.addItem(txtNombre.getText()+"\n");
				
				if(chckbxPregunta1.isSelected()){
					
					System.out.println("Pregunta 1 seleccionada");
				}
				else{
					System.out.println("Pregunta 1 no seleccionada");
				}
				
				
				if(chckbxPregunta2.isSelected()){
					System.out.println("Pregunta 2 seleccionada");
				}
				else{
					System.out.println("Pregunta 2 no seleccionada");
				}
				
				
			}
		});
		
		JScrollPane scrollPane = new JScrollPane();
		
		comboBox = new JComboBox();
		
		
		comboBox.addItem("1");
		comboBox.addItem("2");
		comboBox.addItem("3");
		comboBox.addItem("4");
		
		chckbxPregunta1 = new JCheckBox("Pregunta1");
		
		chckbxPregunta2 = new JCheckBox("Pregunta2");
		buttonGroup = new ButtonGroup();
		
		rdbtnHombre = new JRadioButton("Hombre");
		buttonGroup.add(rdbtnHombre);
		
		rdbtnMujer = new JRadioButton("Mujer");
		buttonGroup.add(rdbtnMujer);
		
		
		
		JButton btnOk_1 = new JButton("Ok");
		btnOk_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnMujer.isSelected()){
					System.out.println("Es mujer");
					
				}else if(rdbtnHombre.isSelected()){
					System.out.println("Es hombre");
				}
				buttonGroup.clearSelection();
				if(rdbtnMujer.isEnabled()&& rdbtnHombre.isEnabled()){
					rdbtnMujer.setEnabled(false);
					rdbtnHombre.setEnabled(false);
				}else{
					rdbtnMujer.setEnabled(true);
					rdbtnHombre.setEnabled(true);
				}
				
				
			}
		});
		
		btnLimpiar = new JButton("Limpiar");
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxPregunta1.isSelected()){
					rdbtnMujer.setVisible(!rdbtnMujer.isVisible());
					rdbtnHombre.setVisible(!rdbtnHombre.isVisible());
				
					System.out.println("Pregunta 1 seleccionada");
				}
				else{
					System.out.println("Pregunta 1 no seleccionada");
				}
				
				
				if(chckbxPregunta2.isSelected()){
					rdbtnMujer.setVisible(!rdbtnMujer.isVisible());
					rdbtnHombre.setVisible(!rdbtnHombre.isVisible());
					System.out.println("Pregunta 2 seleccionada");
				}
				else{
					System.out.println("Pregunta 2 no seleccionada");
				}
			}
		});
		
		passwordField = new JPasswordField();
		
		
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblNombre)
							.addPreferredGap(ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
							.addComponent(txtNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE))
					.addGap(68)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(chckbxPregunta2, GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(chckbxPregunta1)
									.addPreferredGap(ComponentPlacement.RELATED))
								.addComponent(rdbtnMujer)
								.addComponent(rdbtnHombre)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
									.addComponent(btnLimpiar)
									.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)))
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(6)
									.addComponent(btnOk))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btnOk_1)))))
					.addGap(71))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNombre))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(36)
							.addComponent(btnOk))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(27)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 164, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(chckbxPregunta2)
									.addGap(9)
									.addComponent(chckbxPregunta1)
									.addGap(11)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(rdbtnMujer)
										.addComponent(btnOk_1))
									.addGap(9)
									.addComponent(rdbtnHombre)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(btnLimpiar)))))
					.addGap(317))
		);
		
		
		txtArea = new JTextArea();
		scrollPane.setColumnHeaderView(txtArea);
		contentPane.setLayout(gl_contentPane);
	}
}
