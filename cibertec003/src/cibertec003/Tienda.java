package cibertec003;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.Font;

public class Tienda extends JFrame implements ActionListener { private static final long serialVersionUID = 1L;

	//Declaración de variables
	private JLabel lblUnidades; private JTextField txtUnidades; private JButton btnProcesar; private JButton btnBorrar; private JScrollPane scpScroll; private JTextArea txtS;

//	Lanza la aplicación

public static void main(String[] args) {

try {
UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");

} catch (Throwable e) {
e.printStackTrace();
}

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

//Crea la GUI

public Tienda() { 
	
	setTitle("Tienda"); setBounds(100, 100, 450, 214); setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); getContentPane().setLayout(null);



lblUnidades = new JLabel("Unidades");

lblUnidades.setBounds(10, 13, 80, 14);

getContentPane().add(lblUnidades);


txtUnidades = new JTextField();

txtUnidades.setBounds(90, 10, 90, 20);

getContentPane().add(txtUnidades);


btnProcesar = new JButton("Procesar");

btnProcesar.addActionListener(this);

btnProcesar.setBounds(335, 9, 89, 23);

getContentPane().add(btnProcesar);


btnBorrar = new JButton("Borrar");

btnBorrar.addActionListener(this);

btnBorrar.setBounds(246, 9, 89, 23);

getContentPane().add(btnBorrar);


scpScroll = new JScrollPane();

scpScroll.setBounds(10, 44, 414, 120);

getContentPane().add(scpScroll);


txtS = new JTextArea();

txtS.setFont(new Font("Monospaced", Font.PLAIN, 12)); scpScroll.setViewportView(txtS);

}


//Direcciona eventos de tipo ActionEvent 
public void actionPerformed(ActionEvent arg0) {

if (arg0.getSource() == btnProcesar) { actionPerformedBtnProcesar(arg0);
}

if (arg0.getSource() == btnBorrar) { actionPerformedBtnBorrar(arg0);
}
}


protected void actionPerformedBtnProcesar(ActionEvent arg0) {

//	Declaración de variables
	int unidades;

	double impcom = 0, impdes, imppag;

	//Entrada de datos

	unidades = Integer.parseInt(txtUnidades.getText());


	//Calcula el importe de la compra 
	if (unidades >= 1 && unidades <= 25)
		impcom = unidades * 27.5;
	
	
	if (unidades >= 26 && unidades <= 50)	
		impcom = unidades * 25.5;
	
	
	if (unidades >= 51 && unidades <= 75)	
		impcom = unidades * 27.5;
	
	
	if (unidades >= 76)	
		impcom = unidades * 27.5;
	
	
		//Calcula el importe del descuento 
	if (unidades > 50)
		impdes = 0.15 * impcom;	
	else
		impdes = 0.05 * impcom;

	
	
	

	//Calcula el importe a pagar 
	imppag = impcom - impdes;


	//Salida de resultados
	txtS.setText("Importe de la compra	: " + impcom + "\n");
	txtS.append("Importe del descuento : " + impdes + "\n");
	txtS.append("Importe a pagar	: " + imppag);
}

// Procesa la pulsación del botón Borrar
protected void actionPerformedBtnBorrar(ActionEvent arg0) { 
	txtUnidades.setText("");
	txtS.setText("");
	txtUnidades.requestFocus();
}

}

