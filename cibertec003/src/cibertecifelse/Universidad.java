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
		lblNewLabel.setBounds(38, 36, 77, 14);
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
		lblNewLabel_1.setBounds(25, 95, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(308, 49, 89, 23);
		contentPane.add(btnProcesar);
		
		textArea = new JTextArea();
		textArea.setBounds(38, 143, 285, 89);
		contentPane.add(textArea);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnProcesar) {
			actionPerformedBtnProcesar(e);
		}
	}
	protected void actionPerformedBtnProcesar(ActionEvent e) {
		
	}
}
