package ejercicio1;
import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class holaMundo extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public holaMundo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Saludador");
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel texto= new JLabel("Escribe un nombre para saludar");
		texto.setAlignmentX(Component.CENTER_ALIGNMENT);
		texto.setBounds(121, 35, 151, 14);
		contentPane.add(texto);
		
		JTextField textfield=new JTextField();
		textfield.setBounds(75, 85, 244, 20);
		contentPane.add(textfield);
		
		JButton btnNewButton = new JButton("Saludar!");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "¡Hola "+textfield.getText()+"!");
			}
		});
		btnNewButton.setBounds(153, 133, 89, 23);
		contentPane.add(btnNewButton);
		
	}
}
