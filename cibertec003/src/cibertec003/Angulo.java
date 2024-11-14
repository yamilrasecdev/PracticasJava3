package cibertec003;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
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
	private JTextArea textArea;
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
		
		textArea = new JTextArea();
		textArea.setBounds(55, 183, 397, 100);
		contentPane.add(textArea);
		
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
	}
}
