package ejercicio3;

import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import javax.swing.JSlider;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MiniEncuesta extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public MiniEncuesta() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label1 = new JLabel("Elije un sistema operativo");
		label1.setHorizontalAlignment(SwingConstants.CENTER);
		label1.setBounds(151, 34, 130, 14);
		contentPane.add(label1);
		
		JRadioButton button1 = new JRadioButton("Windows");
		button1.setHorizontalAlignment(SwingConstants.CENTER);
		button1.setBounds(50, 55, 109, 23);
		contentPane.add(button1);
		
		JRadioButton button2 = new JRadioButton("Linux");
		button2.setHorizontalAlignment(SwingConstants.CENTER);
		button2.setBounds(161, 55, 109, 23);
		contentPane.add(button2);
		
		JRadioButton button3 = new JRadioButton("Mac");
		button3.setHorizontalAlignment(SwingConstants.CENTER);
		button3.setBounds(272, 55, 109, 23);
		contentPane.add(button3);
		
		ButtonGroup bggroup= new ButtonGroup();
		bggroup.add(button1);
		bggroup.add(button2);
		bggroup.add(button3);
		

		JLabel label2 = new JLabel("Elije tu especialidad");
		label2.setHorizontalAlignment(SwingConstants.CENTER);
		label2.setBounds(151, 99, 130, 14);
		contentPane.add(label2);
		
		JCheckBox checkbox1 = new JCheckBox("Programación");
		checkbox1.setBounds(62, 120, 97, 23);
		contentPane.add(checkbox1);
		
		JCheckBox checkbox2 = new JCheckBox("Diseño Gráfico");
		checkbox2.setBounds(173, 120, 97, 23);
		contentPane.add(checkbox2);
		
		JCheckBox checkbox3 = new JCheckBox("Administración");
		checkbox3.setBounds(284, 120, 97, 23);
		contentPane.add(checkbox3);
		
		JLabel label3 = new JLabel("Horas dedicadas en el ordenador");
		label3.setHorizontalAlignment(SwingConstants.CENTER);
		label3.setBounds(143, 167, 169, 14);
		contentPane.add(label3);
		
		JSlider slider = new JSlider();
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		slider.setMajorTickSpacing(1);
		slider.setToolTipText("");
		slider.setPaintTrack(false);
		slider.setValue(5);
		slider.setMaximum(10);
		slider.setBounds(112, 192, 214, 39);
		contentPane.add(slider);
		
		JButton print = new JButton("Aceptar");
		print.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(button1.isSelected()) System.out.println("El sistema operativo escogido es Windows.");
				else if(button2.isSelected()) System.out.println("El sistema operativo escogido es Linux.");
				else System.out.println("El sistema operativo escogido es Mac.");
				
				if(checkbox1.isSelected()) System.out.println("Escogida la especialidad de programación.");
				if(checkbox2.isSelected()) System.out.println("Escogida la especialidad de diseño gráfico.");
				if(checkbox1.isSelected()) System.out.println("Escogida la especialidad de administración.");
				System.out.println("El número de horas dedicadas en el ordenador es de "+ slider.getValue()+".");
			}
		});
		print.setBounds(173, 229, 89, 23);
		contentPane.add(print);
		
		
	}
}
