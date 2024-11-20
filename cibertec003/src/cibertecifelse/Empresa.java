package cibertecifelse;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Empresa extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField txtcantidad;
	private JTextArea txtarea;
	private JButton btnProcesar;
	private JComboBox comboTurno;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Empresa frame = new Empresa();
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
	public Empresa() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 538, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("Turno");
		lblNewLabel.setBounds(27, 28, 110, 14);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Cantidad");
		lblNewLabel_1.setBounds(27, 65, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		txtcantidad = new JTextField();
		txtcantidad.setBounds(178, 62, 125, 20);
		contentPane.add(txtcantidad);
		txtcantidad.setColumns(10);
		
		txtarea = new JTextArea();
		txtarea.setBounds(27, 109, 305, 112);
		contentPane.add(txtarea);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(371, 24, 89, 23);
		contentPane.add(btnProcesar);
		
	
		
		comboTurno = new JComboBox();
		comboTurno.setModel(new DefaultComboBoxModel(new String[] {"Mañana", "Noche"}));
		comboTurno.setBounds(178, 24, 125, 22);
		contentPane.add(comboTurno);
		
	
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnProcesar) {
			actionPerformedBtnProcesar(e);
		}
	}
	protected void actionPerformedBtnProcesar(ActionEvent e) {
		
		
		//declaro variables entrada
		int turno;//Almacena el indice de los elementos del combo
		int cantidad;				
		//declaro variables salida
		int cantidadCaramelos;
		double importeCompra,importeDescuento,importePagar;
		
		//lectura datos entrada
		turno=comboTurno.getSelectedIndex();
		cantidad=Integer.parseInt(txtcantidad.getText());
		
		//calculos
		//Calcula Importe de compra
		if(turno==0)
			importeCompra=37.5*cantidad;
		else 
			importeCompra=45.0*cantidad;
		
		//Calcula el importe de descuento
		if(cantidad>=15)
			importeDescuento=0.08*importeCompra;
		else
			importeDescuento=0.05*importeCompra;
		
		//calcula el importe a pagar
		importePagar=importeCompra-importeDescuento;
		
		//Calcula los caramelos de obsequio
		if(importePagar>200)
			cantidadCaramelos=2*cantidad;
		else 
			cantidadCaramelos=0;
						
		//impresion
		txtarea.setText("Importe compra : S/."+ importeCompra+"\n");
		txtarea.append("Importe descuento : S/."+ importeDescuento+"\n");
		txtarea.append("Importe pagar : S/."+ importePagar+"\n");
		txtarea.append("Caramelos de reglao : "+ cantidadCaramelos+"\n");
		
	}
}
