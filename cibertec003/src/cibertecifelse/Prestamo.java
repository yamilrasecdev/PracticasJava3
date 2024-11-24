package cibertecifelse;

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

public class Prestamo extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JTextField txtMonto;
	private JButton btnProcesar;
	private JTextArea txtArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Prestamo frame = new Prestamo();
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
	public Prestamo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 588, 388);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("Monto del prestamoo");
		lblNewLabel.setBounds(80, 47, 132, 14);
		contentPane.add(lblNewLabel);
		
		txtMonto = new JTextField();
		txtMonto.setBounds(265, 44, 86, 20);
		contentPane.add(txtMonto);
		txtMonto.setColumns(10);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(445, 43, 89, 23);
		contentPane.add(btnProcesar);
		
		txtArea = new JTextArea();
		txtArea.setBounds(66, 97, 361, 196);
		contentPane.add(txtArea);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnProcesar) {
			actionPerformedBtnProcesar(e);
		}
	}
	protected void actionPerformedBtnProcesar(ActionEvent e) {
		//declarar variables entrada
		double montoprestamo;
		//declarar variables salida
		double montointeres,tasainteres,montocuota;
		int cuota;
		//leer
		montoprestamo=Double.parseDouble(txtMonto.getText());
		//calculos
		//obtener # cuotas
		if(montoprestamo<=5000)
			cuota=2;
		else if(montoprestamo<=10000)
				cuota=4;
		else if(montoprestamo<=15000)
			cuota=6;
		else 
			cuota=10;
		
		//calcula tasa
		if(montoprestamo>10000)
			tasainteres=0.03;
		else
			tasainteres=0.05;
		
		//calcular monto interes
		montointeres=tasainteres*montoprestamo*cuota;
		
		//calcular monto cuota
		montocuota=(montoprestamo+montointeres)/cuota;
		
		
		
		txtArea.setText("# cuotas: "+ cuota+"\n");
		txtArea.append("tasa: "+ tasainteres+"\n");
		txtArea.append("cuota mensual : " +montocuota+"\n");
		txtArea.append("interes total  : "  +montointeres);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
