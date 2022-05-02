package Ej1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EJ1 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EJ1 frame = new EJ1();
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
	public EJ1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ECRIBE UN NOMBRE PARA SALUDAR");
		lblNewLabel.setBounds(104, 64, 295, 16);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(74, 109, 299, 29);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("!Saludar¡");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Hola "+textField.getText()); 
			}
		});
		btnNewButton.setBounds(5, 238, 440, 29);
		contentPane.add(btnNewButton);
		
		
	}

}
