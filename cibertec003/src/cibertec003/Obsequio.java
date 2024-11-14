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

public class Obsequio extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JTextField txtnumero;
	private JButton btnProcesar;
	private JTextArea txtarea;
	private JButton btnLimpiar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Obsequio frame = new Obsequio();
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
	public Obsequio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 714, 442);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("Número");
		lblNewLabel.setBounds(97, 54, 46, 14);
		contentPane.add(lblNewLabel);
		
		txtnumero = new JTextField();
		txtnumero.setBounds(203, 51, 86, 20);
		contentPane.add(txtnumero);
		txtnumero.setColumns(10);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(333, 50, 89, 23);
		contentPane.add(btnProcesar);
		
		txtarea = new JTextArea();
		txtarea.setBounds(74, 119, 420, 159);
		contentPane.add(txtarea);
		
		btnLimpiar = new JButton("Borrar");
		btnLimpiar.addActionListener(this);
		btnLimpiar.setBounds(464, 50, 89, 23);
		contentPane.add(btnLimpiar);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnLimpiar) {
			actionPerformedBtnLimpiar(e);
		}
		if (e.getSource() == btnProcesar) {
			actionPerformedBtnProcesar(e);
		}
	}
	protected void actionPerformedBtnProcesar(ActionEvent e) {
		//Declaración de variables entrada 
		int numero;

		String obsequio = "Ninguno";

		//Entrada de datos

		numero = Integer.parseInt(txtnumero.getText());


		// Determina el obsequio

		if (numero >= 1 && numero <= 20)
			obsequio = "Un lapicero";
		
		if	(numero >= 21	&&	numero <=	40)			
			obsequio = "Un cuaderno de	100 hojas";
		
		if	(numero >= 41	&&	numero <=	60)		
			obsequio = "Una caja de 12	plumones";	
								
		if (numero >= 61 && numero <= 80)
			obsequio = "Un cuaderno espiral";
	
		if (numero >= 81 && numero <= 99)
			obsequio = "Una agenda";
	
		if (numero == 100)
			obsequio = "Una mochila";

		// Salida de resultados
		txtarea.setText("Obsequio : " + obsequio);



	}
	protected void actionPerformedBtnLimpiar(ActionEvent e) {
		txtnumero.setText("");
		txtarea.setText("");
		txtnumero.requestFocus();

	}
	
}
