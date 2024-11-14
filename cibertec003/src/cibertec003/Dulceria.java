package cibertec003;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Dulceria extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JComboBox combotipo;
	private JTextField txtcantidad;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextArea textArea;
	private JButton btnProcesar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dulceria frame = new Dulceria();
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
	public Dulceria() {
		setTitle("Dulceria");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 485);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		combotipo = new JComboBox();
		combotipo.setModel(new DefaultComboBoxModel(new String[] {"Primor", "Dulzura", "Tentacion", "Explocion"}));
		combotipo.setBounds(177, 56, 158, 22);
		contentPane.add(combotipo);
		
		txtcantidad = new JTextField();
		txtcantidad.setBounds(177, 113, 158, 20);
		contentPane.add(txtcantidad);
		txtcantidad.setColumns(10);
		
		lblNewLabel = new JLabel("Tipo");
		lblNewLabel.setBounds(64, 60, 72, 14);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Cantidad");
		lblNewLabel_1.setBounds(64, 116, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		textArea = new JTextArea();
		textArea.setBounds(94, 205, 362, 151);
		contentPane.add(textArea);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(427, 56, 89, 23);
		contentPane.add(btnProcesar);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnProcesar) {
			actionPerformedBtnProcesar(e);
		}
	}
	protected void actionPerformedBtnProcesar(ActionEvent e) {
	}
}
