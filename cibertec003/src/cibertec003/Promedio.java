package cibertec003;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Promedio extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JTextField txtpractica1;
	private JTextField txtpractica2;
	private JTextField txtpractica3;
	private JButton btnProcesar;
	private JTextArea txtarea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Promedio frame = new Promedio();
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
	public Promedio() {
		setTitle("Promedio");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("Práctica 1");
		lblNewLabel.setBounds(25, 27, 75, 14);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Practica 2");
		lblNewLabel_1.setBounds(25, 73, 64, 14);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Practica 3");
		lblNewLabel_2.setBounds(25, 121, 64, 14);
		contentPane.add(lblNewLabel_2);
		
		txtpractica1 = new JTextField();
		txtpractica1.setBounds(110, 24, 86, 20);
		contentPane.add(txtpractica1);
		txtpractica1.setColumns(10);
		
		txtpractica2 = new JTextField();
		txtpractica2.setBounds(110, 70, 86, 20);
		contentPane.add(txtpractica2);
		txtpractica2.setColumns(10);
		
		txtpractica3 = new JTextField();
		txtpractica3.setBounds(110, 118, 86, 20);
		contentPane.add(txtpractica3);
		txtpractica3.setColumns(10);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(236, 23, 89, 23);
		contentPane.add(btnProcesar);
		
		txtarea = new JTextArea();
		txtarea.setBounds(25, 167, 358, 70);
		contentPane.add(txtarea);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnProcesar) {
			actionPerformedBtnProcesar(e);
		}
	}
	protected void actionPerformedBtnProcesar(ActionEvent e) {
		//declaro
		double promedio;
		int p1, p2, p3;

		//Entrada de datos

		p1 = Integer.parseInt(txtpractica1.getText());

		p2 = Integer.parseInt(txtpractica2.getText());

		p3 = Integer.parseInt(txtpractica3.getText());


		//Si amerita, añade 2 puntos a p1 
		if (p1 >= 10) {
			p1 = p1 + 2;


		if (p1 > 20)
			p1 = 20;

		}


		//Si amerita, añade 2 puntos a p2 
		if (p2 >= 10) {
			p2 = p2 + 2;

		if (p2 > 20)
			p2 = 20;

		}

		//Si amerita, añade 2 puntos a p3 
		if (p3 >= 10) {
			p3 = p3 + 2;


		if (p3 > 20)
			p3 = 20;
		}

		// Calcula el promedio
		promedio = (p1 + p2 + p3) / 3.0;

		// Salida de resultados
		txtarea.setText("Promedio final : " + promedio);


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
