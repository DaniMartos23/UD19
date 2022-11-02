package ejercicio2;

import java.awt.Component;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.SwingConstants;

public class Peliculas extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public Peliculas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel texto= new JLabel("Escribe el titulo de la pelicula");
		texto.setHorizontalAlignment(SwingConstants.CENTER);
		texto.setAlignmentX(Component.CENTER_ALIGNMENT);
		texto.setBounds(27, 61, 165, 14);
		contentPane.add(texto);
		
		JComboBox peliculas=new JComboBox<>();
		peliculas.setBounds(237, 95, 140, 20);
		contentPane.add(peliculas);
		
		peliculas.addItem("Quantum of Solace");
		peliculas.addItem("Avatar");
		
		
		JTextField textfield = new JTextField();
		textfield.setBounds(27, 95, 165, 20);
		contentPane.add(textfield);
		
		JButton btnNewButton = new JButton("Añadir");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				peliculas.addItem(textfield.getText());
			}
		});
		btnNewButton.setBounds(60, 126, 91, 23);
		contentPane.add(btnNewButton);
		
		JLabel peli= new JLabel("Peliculas");
		peli.setHorizontalAlignment(SwingConstants.CENTER);
		peli.setAlignmentX(Component.CENTER_ALIGNMENT);
		peli.setBounds(249, 61, 106, 14);
		contentPane.add(peli);
		
		
	
		
		
	}

}
