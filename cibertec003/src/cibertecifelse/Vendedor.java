package cibertecifelse;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Vendedor extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JTextField txtImporte;
	private JLabel lblNewLabel_1;
	private JTextField txtHijos;
	private JButton btnProcesar;
	private JTextArea txtArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vendedor frame = new Vendedor();
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
	public Vendedor() {
		setTitle("Vendedor Salario");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 608, 404);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("Importe total vendido");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(55, 35, 154, 34);
		contentPane.add(lblNewLabel);
		
		txtImporte = new JTextField();
		txtImporte.setBounds(233, 43, 99, 20);
		contentPane.add(txtImporte);
		txtImporte.setColumns(10);
		
		lblNewLabel_1 = new JLabel("Numero de hijos");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(65, 88, 144, 14);
		contentPane.add(lblNewLabel_1);
		
		txtHijos = new JTextField();
		txtHijos.setBounds(233, 86, 99, 20);
		contentPane.add(txtHijos);
		txtHijos.setColumns(10);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(398, 42, 89, 23);
		contentPane.add(btnProcesar);
		
		txtArea = new JTextArea();
		txtArea.setBounds(55, 148, 346, 158);
		contentPane.add(txtArea);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnProcesar) {
			actionPerformedBtnProcesar(e);
		}
	}
	protected void actionPerformedBtnProcesar(ActionEvent e) {
		//declaro variables entrada
		double importeVenta;
		int hijos;
		//declaro variables salida
		double sueldoBasico,comision,bonificacion,sueldoBruto,descuento,sueldoNeto;
		
		//Lectura de datos
		importeVenta=Double.parseDouble(txtImporte.getText());
		hijos=Integer.parseInt(txtHijos.getText());
		
		//Sueldo basico
		sueldoBasico=600;
		
		//calcular comision
		if(importeVenta>15000)
			comision=0.07*importeVenta;
		else 
			comision=0.05*importeVenta;
		
		//calcula bonificacion
		if(hijos<5)
			bonificacion=25*hijos;
		else
			bonificacion=22*hijos;
		
		//calcula sueldo bruto
		sueldoBruto=sueldoBasico+comision+bonificacion;
		
		//calcula descuento
		if (sueldoBruto>3500)
			descuento=0.15*sueldoBruto;
		else
			descuento=0.11*sueldoBruto;
		
		//calculo sueldo neto
		sueldoNeto=sueldoBruto-descuento;
		
		txtArea.setText("Sueldo básico: S/. " + sueldoBasico + "\n"); 
		txtArea.append("Comisión : S/. " + comision + "\n"); 
		txtArea.append("Bonificación : S/. " + bonificacion + "\n"); 
		txtArea.append("Sueldo bruto : S/. " + sueldoBruto + "\n"); 
		txtArea.append("Descuento : S/. " + descuento + "\n"); 
		txtArea.append("Sueldo neto : S/. " + sueldoNeto);
		
		
		
		
		
	}
}
