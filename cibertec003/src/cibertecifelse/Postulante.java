package cibertecifelse;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Postulante extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JComboBox comboBoxSexo;
	private JTextField txtEdad;
	private JLabel lblNewLabel_1;
	private JTextArea txtArea;
	private JButton btnProcesar;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Postulante frame = new Postulante();
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
	public Postulante() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("Sexo");
		lblNewLabel.setBounds(39, 22, 46, 14);
		contentPane.add(lblNewLabel);
		
		comboBoxSexo = new JComboBox();
		comboBoxSexo.setModel(new DefaultComboBoxModel(new String[] {"Femenino", "Masculino"}));
		comboBoxSexo.setBounds(112, 18, 91, 22);
		contentPane.add(comboBoxSexo);
		
		txtEdad = new JTextField();
		txtEdad.setBounds(112, 51, 86, 20);
		contentPane.add(txtEdad);
		txtEdad.setColumns(10);
		
		lblNewLabel_1 = new JLabel("Edad");
		lblNewLabel_1.setBounds(39, 54, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		txtArea = new JTextArea();
		txtArea.setBounds(54, 99, 307, 119);
		contentPane.add(txtArea);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(228, 18, 89, 23);
		contentPane.add(btnProcesar);
		
		btnNewButton = new JButton("Borrar");
		btnNewButton.addActionListener(this);
		btnNewButton.setVerticalAlignment(SwingConstants.BOTTOM);
		btnNewButton.setBounds(238, 50, 89, 23);
		contentPane.add(btnNewButton);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton) {
			actionPerformedBtnNewButton(e);
		}
		if (e.getSource() == btnProcesar) {
			actionPerformedBtnProcesar(e);
		}
	}
	protected void actionPerformedBtnProcesar(ActionEvent e) {
		//declarar variables entrada
		int Sexo,edad;
		//declarar variables salida
		String categoria;
		
		//leer
		Sexo=comboBoxSexo.getSelectedIndex();
		edad=Integer.parseInt(txtEdad.getText());
		
		//Calcular la categoria
		if(Sexo==0) {
			System.out.println("*");
			if(edad<23)
				categoria="FA";
			else
				categoria="FB";
		} else {
			System.out.println("**");
			if(edad<25)
				categoria="MA";
			else
				categoria="MB";
		}
		
		//imprimir
		txtArea.setText("categoria : " + categoria);

	}
	protected void actionPerformedBtnNewButton(ActionEvent e) {
		txtArea.setText("");
		comboBoxSexo.setSelectedIndex(0);
		txtEdad.setText("");
	}
}
