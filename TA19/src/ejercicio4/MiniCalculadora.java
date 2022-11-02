package ejercicio4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;

public class MiniCalculadora extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;


	/**
	 * Create the frame.
	 */
	public MiniCalculadora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 504, 380);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setForeground(new Color(0, 0, 0));
		textField.setBounds(116, 17, 308, 38);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setForeground(new Color(0, 0, 0));
		textField_1.setBounds(116, 59, 308, 38);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setBounds(116, 100, 308, 38);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton("+");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double operando1,operando2;
				String resultado;
				operando1=Double.parseDouble(textField.getText());
				operando2=Double.parseDouble(textField_1.getText());
				resultado=""+(operando1+operando2);
				textField_2.setText(resultado);
			}
		});
		btnNewButton.setBounds(116, 163, 56, 56);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("/");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double operando1,operando2;
				String resultado;
				operando1=Double.parseDouble(textField.getText());
				operando2=Double.parseDouble(textField_1.getText());
				resultado=""+(operando1/operando2);
				textField_2.setText(resultado);
			}
		});
		btnNewButton_1.setBounds(216, 251, 56, 56);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("-");
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double operando1,operando2;
				String resultado;
				operando1=Double.parseDouble(textField.getText());
				operando2=Double.parseDouble(textField_1.getText());
				resultado=""+(operando1-operando2);
				textField_2.setText(resultado);
			}
		});
		btnNewButton_2.setBounds(116, 251, 56, 56);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("x");
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double operando1,operando2;
				String resultado;
				operando1=Double.parseDouble(textField.getText());
				operando2=Double.parseDouble(textField_1.getText());
				resultado=""+(operando1*operando2);
				textField_2.setText(resultado);
			}
		});
		btnNewButton_3.setBounds(216, 163, 56, 56);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("X");
		btnNewButton_4.setForeground(new Color(255, 0, 0));
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_4.setBounds(338, 184, 86, 69);
		contentPane.add(btnNewButton_4);
		
		JLabel lblNewLabel = new JLabel("Resultado");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(32, 106, 74, 26);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Operando1");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(32, 23, 74, 26);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Operando2");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(32, 65, 74, 26);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("QUIT");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setBounds(351, 149, 62, 36);
		contentPane.add(lblNewLabel_3);
		
		JButton btnNewButton_5 = new JButton("About");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "MiniCalculadora creada por Dani Martos.");
			}
		});
		btnNewButton_5.setBounds(338, 288, 89, 23);
		contentPane.add(btnNewButton_5);
	}
}
