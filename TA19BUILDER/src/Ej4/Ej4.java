package Ej4;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ej4 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private char  operador;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ej4 frame = new Ej4();
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
	public Ej4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("N1");
		lblNewLabel.setBounds(161, 48, 35, 16);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(208, 68, 50, 43);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(161, 68, 50, 43);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setBounds(32, 68, 130, 43);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton("+");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(!textField.getText().trim().isEmpty() && !textField_1.getText().trim().isEmpty()){ //no guardar si eesta vacio ni todo con espacios
					operador =btnNewButton.getText().charAt(0);
					 
				}
				
			}
		});
		btnNewButton.setBounds(32, 123, 117, 29);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("-");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(!textField.getText().trim().isEmpty() && !textField_1.getText().trim().isEmpty()){ //no guardar si eesta vacio ni todo con espacios
					operador =btnNewButton_1.getText().charAt(0);
					 
				}
			}
		});
		btnNewButton_1.setBounds(147, 123, 117, 29);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("*");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!textField.getText().trim().isEmpty() && !textField_1.getText().trim().isEmpty()){ //no guardar si eesta vacio ni todo con espacios
					operador =btnNewButton_2.getText().charAt(0);
					 
				}
			}
		});
		btnNewButton_2.setBounds(32, 158, 117, 29);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("/");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!textField.getText().trim().isEmpty() && !textField_1.getText().trim().isEmpty()){ //no guardar si eesta vacio ni todo con espacios
					operador =btnNewButton_3.getText().charAt(0);
					 
				}
			}
		});
		btnNewButton_3.setBounds(147, 158, 117, 29);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("CALCULAR");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!textField.getText().trim().isEmpty() && !textField_1.getText().trim().isEmpty()){ //no guardar si eesta vacio ni todo con espacios
					int valor1 =Integer.parseInt(textField.getText().trim());
					int valor2 =Integer.parseInt(textField_1.getText().trim());
					int resultado = 0;
					
					switch (operador) {
					case '+':
						resultado = valor1+valor2;
						System.out.println(resultado);
						
						break;
					case '-':
						 resultado = valor1-valor2;
						System.out.println(resultado);
						break;
					case '/':
						 resultado = valor1/valor2;
						System.out.println(resultado);
						break;
					case '*':
						resultado = valor1*valor2;
						System.out.println(resultado);
						break;

					default:
						break;
					}
					
					textField_2.setText(Integer.toString(resultado));
					
				
					

				}
			}
		});
		btnNewButton_4.setBounds(93, 199, 117, 29);
		contentPane.add(btnNewButton_4);
		
		JLabel lblNewLabel_1 = new JLabel("RESULTADO");
		lblNewLabel_1.setBounds(32, 48, 91, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("N2");
		lblNewLabel_2.setBounds(208, 48, 35, 16);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("MINICLCULADORA");
		lblNewLabel_3.setBounds(30, 6, 228, 16);
		contentPane.add(lblNewLabel_3);
	}

}
