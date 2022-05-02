package Ej2;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ej2 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ej2 frame = new Ej2();
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
	public Ej2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Escribe el titulo de una pelicula");
		lblNewLabel.setBounds(58, 64, 214, 16);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Peliculas");
		lblNewLabel_1.setBounds(284, 64, 61, 16);
		contentPane.add(lblNewLabel_1);

		textField = new JTextField();
		textField.setBounds(58, 132, 199, 26);
		contentPane.add(textField);
		textField.setColumns(10);

		String[] pelis = { "Bob", "Revolution" };

		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setBounds(284, 133, 148, 27);
		contentPane.add(comboBox);

		for (String peli : pelis) {

			comboBox.addItem(peli);

		}

		JButton btnNewButton = new JButton("Añadir");
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(!textField.getText().trim().isEmpty()){ //no guardar si eesta vacio ni todo con espacios
					comboBox.addItem(textField.getText().trim());
				}

				
			}
		});
		btnNewButton.setBounds(58, 212, 117, 29);
		contentPane.add(btnNewButton);
	}
}
