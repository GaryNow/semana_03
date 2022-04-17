package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import semana_03.Empleado;

import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Problema_3_2 extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	private JButton btnProcesar;
	private JScrollPane scrollPane;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Problema_3_2 frame = new Problema_3_2();
					frame.setVisible(true);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Problema_3_2() {
		setTitle("Problema_3_2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(173, 11, 89, 23);
		contentPane.add(btnProcesar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 48, 414, 403);
		contentPane.add(scrollPane);
		
		txtS = new JTextArea();
		txtS.setFont(new Font("Monospaced", Font.PLAIN, 13));
		scrollPane.setViewportView(txtS);
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnProcesar) {
			actionPerformedBtnProcesar(arg0);
		}
	}
	protected void actionPerformedBtnProcesar(ActionEvent arg0) {
		Empleado e1 = new Empleado(2,"Gary",0,994125364);
		listado(e1);
		Empleado e2 = new Empleado(1,"Stephano");
		listado(e2);
		Empleado e3 = new Empleado();
		listado(e3);
		
		imprimir("------------------------------------");
		imprimir("Factor de descuento:  " + Empleado.DESCUENTO);
		imprimir("Cantidad de empleados:  " + Empleado.getCantidadEmpleados());
		imprimir("La suma de sueldos netos:  " + Empleado.getSumaSueldosNetos());
		imprimir("------------------------------------");
		imprimir();
	}
	//  M�todos tipo void (sin par�metros)
	void imprimir() {
		imprimir("");
	}
	//  M�todos tipo void (con par�metros)
	void listado(Empleado x) {
		imprimir("Código: " + x.getCodigo());
		imprimir("Nombre: " + x.getNombre());
		imprimir("Categoria: " + x.getCategoria());
		imprimir("Número de celular: " + x.getNumeroCelular());
		imprimir("Sueldo Neto: " + x.sueldoNeto());
		imprimir();
	}
	
	void imprimir(String s) {
		txtS.append(s + "\n");
	}	
	
}