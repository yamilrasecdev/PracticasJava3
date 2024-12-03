package cibertec003;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Angulo extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JButton btnNewButton;
	private JTextField txtgrados;
	private JTextField txtminutos;
	private JTextField txtsegundos;
	private JTextArea txtarea;
	private JButton btnBorrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Angulo frame = new Angulo();
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
	public Angulo() {
		setTitle("Angulo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 583, 345);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("Grados");
		lblNewLabel.setBounds(55, 36, 46, 14);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Minutos");
		lblNewLabel_1.setBounds(55, 61, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Segundos");
		lblNewLabel_2.setBounds(55, 111, 74, 14);
		contentPane.add(lblNewLabel_2);
		
		btnNewButton = new JButton("Procesar");
		btnNewButton.addActionListener(this);
		btnNewButton.setBounds(321, 32, 89, 23);
		contentPane.add(btnNewButton);
		
		txtgrados = new JTextField();
		txtgrados.setBounds(146, 33, 86, 20);
		contentPane.add(txtgrados);
		txtgrados.setColumns(10);
		
		txtminutos = new JTextField();
		txtminutos.setBounds(146, 58, 86, 20);
		contentPane.add(txtminutos);
		txtminutos.setColumns(10);
		
		txtsegundos = new JTextField();
		txtsegundos.setBounds(146, 111, 86, 20);
		contentPane.add(txtsegundos);
		txtsegundos.setColumns(10);
		
		txtarea = new JTextArea();
		txtarea.setBounds(55, 183, 397, 100);
		contentPane.add(txtarea);
		
		btnBorrar = new JButton("Borrar");
		btnBorrar.setBounds(321, 81, 89, 23);
		contentPane.add(btnBorrar);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton) {
			actionPerformedBtnNewButton(e);
		}
	}
	protected void actionPerformedBtnNewButton(ActionEvent e) {		
		//Declaración de variables
		int grados, minutos, segundos; 
		double beta;
		String tipo = "";		
		// Entrada de datos
		grados = Integer.parseInt(txtgrados.getText()); 
		minutos = Integer.parseInt(txtminutos.getText()); 
		segundos = Integer.parseInt(txtsegundos.getText());

		//Validar
		//Validar - Grados
		if (grados <0 || grados >360 ) {
			JOptionPane.showMessageDialog(this, "Grados debe ser de 0 a 360");
			txtgrados.requestFocus();
			txtgrados.selectAll();
			return;//Salir programa
		}
				
		// Validar - Minutos -
		 if (minutos <0 || minutos>59 ) {
			JOptionPane.showMessageDialog(this, "Minutos deben ser de 0 a 59");
			txtminutos.requestFocus();
			txtminutos.selectAll();
			return;//Salir del programa
		}
		
		 if (segundos<0 || segundos>59) {
			JOptionPane.showMessageDialog(this, "segundos deben ser de 0 a 59");
			txtsegundos.requestFocus();
			txtsegundos.selectAll();
			return;
		}
		 //{
		
			//Calcular Determina el ángulo en grados
			beta = grados + minutos / 60.0 + segundos / 3600.0;
	
			//Determina el tipo de ángulo 
			if (beta == 0)
				tipo = "Nulo";
	
			if (beta > 0 && beta < 90)
				tipo = "Agudo";
	
			if (beta == 90)
				tipo = "Recto";
	
			if (beta > 90 && beta < 180)
				tipo = "Obtuso";
	
			if (beta == 180)
				tipo = "Llano";
	
			if (beta > 180 && beta < 360)
				tipo = "Cóncavo";
	
			if (beta == 360)
				tipo = "Completo";
	
			// Salida de resultados
			txtarea.setText("El ángulo se clasifica como : " + tipo);
		//}

	}
}
