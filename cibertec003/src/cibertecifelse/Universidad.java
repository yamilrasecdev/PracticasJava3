package cibertecifelse;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class Universidad extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JComboBox comboCategoria;
	private JTextField txtPromedio;
	private JLabel lblNewLabel_1;
	private JButton btnProcesar;
	private JTextArea textArea;

		//Declarar variables entrada
		int categoria;
		double promedio;
		//Declarar variable salida
		double pensionActual;
		double descuento;
		double pensionFinal;
		private JButton btnBorrar;
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Universidad frame = new Universidad();
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
	public Universidad() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("Categoria");
		lblNewLabel.setBounds(10, 36, 77, 14);
		contentPane.add(lblNewLabel);
		
		comboCategoria = new JComboBox();
		comboCategoria.setModel(new DefaultComboBoxModel(new String[] {"A", "B", "C", "D"}));
		comboCategoria.setBounds(166, 32, 108, 22);
		contentPane.add(comboCategoria);
		
		txtPromedio = new JTextField();
		txtPromedio.setBounds(176, 92, 98, 20);
		contentPane.add(txtPromedio);
		txtPromedio.setColumns(10);
		
		lblNewLabel_1 = new JLabel("Promedio");
		lblNewLabel_1.setBounds(10, 79, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(306, 32, 89, 23);
		contentPane.add(btnProcesar);
		
		textArea = new JTextArea();
		textArea.setBounds(38, 143, 285, 89);
		contentPane.add(textArea);
		
		btnBorrar = new JButton("Limpiar");
		btnBorrar.addActionListener(this);
		btnBorrar.setBounds(306, 91, 89, 23);
		contentPane.add(btnBorrar);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnBorrar) {
			actionPerformedBtnBorrar(e);
		}
		if (e.getSource() == btnProcesar) {
			actionPerformedBtnProcesar(e);
		}
	}
	
	//Lectura de datos entrada
	void LecturaDatos() {
		categoria=comboCategoria.getSelectedIndex();
		promedio=Double.parseDouble(txtPromedio.getText());
	}
	
	//Calcular Pension actual
	void CalcularPension() {
		if (categoria==0)//A
			pensionActual=550;
		else if (categoria==1)//B
			pensionActual=500;
		else if (categoria==2)//C
			pensionActual=460;
		else //D
			pensionActual=400;
		
	}
	
	//Calculo Descuento
	void CalcularDescuento() {
		if (promedio<=13.99)
			descuento=0;
		else if(promedio<=15.99)
			descuento=0.10*pensionActual;
		else if(promedio<=17.99)
			descuento=0.12*pensionActual;
		else 
			descuento=0.15*pensionActual;
	}
	
	//Calcular Pension Final
	void CalcularPensionFinal() {
		pensionFinal=pensionActual-descuento;
				
	}
	
	//Imprimir resultados
	void ImprimirResultados() {
		textArea.setText("pension actual : S/. " +pensionActual+"\n");
		textArea.append("descuento : S/."+descuento+"\n");
		textArea.append("pension final : S/."+pensionFinal+"\n");
		
	}
	
	
	protected void actionPerformedBtnBorrar(ActionEvent e) {
		textArea.setText("");
	}
	
protected void actionPerformedBtnProcesar(ActionEvent e) {
		
		//Lectura de datos
		LecturaDatos();
			//System.out.println("categoria : " +categoria);
			//System.out.println("promedio : "+promedio);
		CalcularPension();
		CalcularDescuento();
		CalcularPensionFinal();
		ImprimirResultados();
	}
	
}
