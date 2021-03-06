package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import semana_03.Movil;

import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Problema_3_3 extends JFrame implements ActionListener {
	
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
					Problema_3_3 frame = new Problema_3_3();
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
	public Problema_3_3() {
		setTitle("Problema_3_3");
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
		Movil m1 = new Movil(994102356,"Now",90,0.4);
		listado(m1);
		Movil m2 = new Movil(994136841,"Gary");
		listado(m2);
		Movil m3 = new Movil();
		listado(m3);
		imprimir("------------------------------------");
		imprimir("IGV:  " + Movil.IGV);
		imprimir("Cantidad de Moviles:  " + Movil.getCantidadMoviles());
		imprimir("Suma de importes:  " + Movil.getSumaDeImportes());
		imprimir("------------------------------------");
		imprimir();
	}
	//  M???todos tipo void (sin par???metros)
	void imprimir() {
		imprimir("");
	}
	//  M???todos tipo void (con par???metros)
	void listado(Movil x) {
		imprimir("N??mero de movil: " + x.getNumeroMovil());
		imprimir("Nombre de cliente: " + x.getNombreCliente());
		imprimir("Segundos consumidos: " + x.getSegundosConsumidos());
		imprimir("PxS: " + x.getPrecioPorSegundo());
		imprimir("Importe a pagar: " + x.importePaga());
		imprimir("");
	}
	void imprimir(String s) {
		txtS.append(s + "\n");
	}	
	
}