package Ej3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JSlider;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ej3 extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	public ButtonGroup getButtonGroup() {
		return buttonGroup;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ej3 frame = new Ej3();
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
	public Ej3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JRadioButton rdbtnNewRadioButton = new JRadioButton("Windows");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(43, 70, 141, 23);
		contentPane.add(rdbtnNewRadioButton);

		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Linux");
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setBounds(43, 105, 141, 23);
		contentPane.add(rdbtnNewRadioButton_1);

		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Mac");
		buttonGroup.add(rdbtnNewRadioButton_2);
		rdbtnNewRadioButton_2.setBounds(43, 140, 141, 23);
		contentPane.add(rdbtnNewRadioButton_2);

		JCheckBox chckbxNewCheckBox = new JCheckBox("Programación");
		chckbxNewCheckBox.setBounds(257, 70, 128, 23);
		contentPane.add(chckbxNewCheckBox);

		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Diseño gráfico");
		chckbxNewCheckBox_1.setBounds(257, 105, 128, 23);
		contentPane.add(chckbxNewCheckBox_1);

		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Administrción");
		chckbxNewCheckBox_2.setBounds(257, 140, 128, 23);
		contentPane.add(chckbxNewCheckBox_2);

		JSlider slider = new JSlider();
		slider.setMinorTickSpacing(1);
		slider.setPaintTicks(true);
		slider.setMaximum(10);
		slider.setBounds(63, 223, 190, 29);
		contentPane.add(slider);

		JLabel lblNewLabel = new JLabel("Sistema Operativo");
		lblNewLabel.setBounds(43, 41, 128, 16);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Elije tu especialidad");
		lblNewLabel_1.setBounds(257, 42, 128, 16);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Horas dedicadas en el ordenador(entre 0 y 10)");
		lblNewLabel_2.setBounds(42, 195, 236, 16);
		contentPane.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("0");
		lblNewLabel_3.setBounds(73, 250, 20, 16);
		contentPane.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("10");
		lblNewLabel_4.setBounds(233, 250, 61, 16);
		contentPane.add(lblNewLabel_4);

		JButton btnNewButton = new JButton("Eviar Datos");

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String op = "";
				// op = buttonGroup.getSelection().getActionCommand();

				if (rdbtnNewRadioButton.isSelected()) {
					op = "Windows";
				} else if (rdbtnNewRadioButton_1.isSelected()) {
					op = "Linux";
				} else if (rdbtnNewRadioButton_2.isSelected()) {
					op = "Mac";
				}
				;

				String es = "";
				// op = buttonGroup.getSelection().getActionCommand();

				if (chckbxNewCheckBox.isSelected()) {
					es += "Programación";
				}
				if (chckbxNewCheckBox_1.isSelected()) {
					es += " Diseño gráfico";
				}
				if (chckbxNewCheckBox_2.isSelected()) {
					es += " Administrción";
				};

				JOptionPane.showMessageDialog(null, "El Sistema Operativo es " + op + "\n" + "Tu especialidad es " + es
						+ "\n" + "Horas Dedicadas en el pc " + slider.getValue());

			}

		});
		btnNewButton.setBounds(312, 223, 117, 29);
		contentPane.add(btnNewButton);
	}
}
