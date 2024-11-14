package cibertec003;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class Empleado extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JComboBox combocategoria;
	private JTextField txthoras;
	private JButton btnProcesar;
	private JButton btnLimpiar;
	private JTextArea txtarea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Empleado frame = new Empleado();
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
	public Empleado() {
		setTitle("Empleado");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 585, 415);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("Categoria");
		lblNewLabel.setBounds(54, 54, 120, 14);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Horas");
		lblNewLabel_1.setBounds(51, 93, 65, 25);
		contentPane.add(lblNewLabel_1);
		
		combocategoria = new JComboBox();
		combocategoria.setModel(new DefaultComboBoxModel(new String[] {"C1", "C2", "C3", "C4"}));
		combocategoria.setBounds(147, 50, 135, 22);
		contentPane.add(combocategoria);
		
		txthoras = new JTextField();
		txthoras.setBounds(147, 95, 152, 20);
		contentPane.add(txthoras);
		txthoras.setColumns(10);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(333, 50, 89, 23);
		contentPane.add(btnProcesar);
		
		btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setBounds(333, 94, 89, 23);
		contentPane.add(btnLimpiar);
		
		txtarea = new JTextArea();
		txtarea.setBounds(59, 157, 386, 170);
		contentPane.add(txtarea);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnProcesar) {
			actionPerformedBtnProcesar(e);
		}
	}
	protected void actionPerformedBtnProcesar(ActionEvent e) {
//		Declaración de variables 
		int categoria;
		double horas, suelbru, desc, suelnet, tarifa = 0;

		//Entrada de datos

		categoria = combocategoria.getSelectedIndex(); 
		horas = Double.parseDouble(txthoras.getText());

		//Determina la tarifa horaria if (categoria == 0)
		tarifa = 45.0;

		if (categoria == 1)
			tarifa = 37.5;

		if (categoria == 2)
			tarifa = 35.0;

		if (categoria == 3)
			tarifa = 32.5;

		//Calcula el sueldo bruto 
			suelbru = horas * tarifa;

		//Calcula el descuento 
			desc = 0.15 * suelbru;
		//Calcula el sueldo neto 
			suelnet = suelbru - desc;

		//Salida de resultados
		txtarea.setText("Tarifa horaria : S/." + tarifa + "\n");
		txtarea.append("Sueldo bruto : S/." + suelbru + "\n");
		txtarea.append("Descuento	: S/." + desc + "\n");
		txtarea.append("Sueldo neto	: S/." + suelnet);

		
	}
}
