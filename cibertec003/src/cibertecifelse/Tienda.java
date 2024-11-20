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

public class Tienda extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField txtcantidad;
	private JTextField txtprecio;
	private JButton btnProcesar;
	private JTextArea txtarea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tienda frame = new Tienda();
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
	public Tienda() {
		setTitle("Tienda");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 551, 402);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("Cantidad");
		lblNewLabel.setBounds(54, 38, 46, 14);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Precio");
		lblNewLabel_1.setBounds(54, 90, 86, 14);
		contentPane.add(lblNewLabel_1);
		
		txtcantidad = new JTextField();
		txtcantidad.setBounds(161, 35, 86, 20);
		contentPane.add(txtcantidad);
		txtcantidad.setColumns(10);
		
		txtprecio = new JTextField();
		txtprecio.setBounds(161, 87, 86, 20);
		contentPane.add(txtprecio);
		txtprecio.setColumns(10);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(296, 34, 89, 23);
		contentPane.add(btnProcesar);
		
		txtarea = new JTextArea();
		txtarea.setBounds(72, 142, 343, 166);
		contentPane.add(txtarea);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnProcesar) {
			actionPerformedBtnProcesar(e);
		}
	}
	protected void actionPerformedBtnProcesar(ActionEvent e) {
		
		//Declarar variables entrada
		int cantidadDocenas;
		double precio;
		//Declarar variables salida
		double importeCompra, importeDescuento, importePagar;
		int cantidaLapiceros;
		
		//Lectura datos 
		cantidadDocenas=Integer.parseInt(txtcantidad.getText());
		precio=	Double.parseDouble(txtprecio.getText());				
		// Calculo
		// Calculo importe compra
		importeCompra=precio*cantidadDocenas;
		// Calculo importe descuento
		if(cantidadDocenas>10)
			importeDescuento=0.15*importeCompra;
			else 
				importeDescuento=0.11*importeCompra;
		// calculo importe pagar
		importePagar=importeCompra-importeDescuento;
		
		// calculo lapiceros de obsequio
		if(importePagar>=200)			
			cantidaLapiceros=2*cantidadDocenas;
			else 
				cantidaLapiceros=0;
		
		// impresion
		txtarea.setText("Importe de compra : S/." +importeCompra +"\n");
		txtarea.append("Importe de descuento : S/." +importeDescuento +"\n");
		txtarea.append("Importe de pagar : S/." +importePagar +"\n");
		txtarea.append("Lapiceros obsequio : " +cantidaLapiceros +"\n");
	}
}
