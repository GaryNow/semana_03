package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import semana_03.Balon;

import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Propuesto_3_2 extends JFrame implements ActionListener {
	
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
					Propuesto_3_2 frame = new Propuesto_3_2();
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
	public Propuesto_3_2() {
		setTitle("Propuesto_3_2");
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
		Balon b1 = new Balon("Now",20,5,10,80);
		listado(b1);
		Balon b2 = new Balon("Gn",18,7);
		listado(b2);
		Balon b3 = new Balon();
		listado(b3);
		
		imprimir("------------------------------------");
		imprimir("PI: " + Balon.PI);
		imprimir("Valor de desc: " + Balon.DESCUENTO);
		imprimir("Balones: " + Balon.getBalones());
		imprimir("Suma de importes: " + Balon.getSumaImportes());
		imprimir("------------------------------------");
		imprimir();
	}
	//  M???todos tipo void (sin par???metros)
	void imprimir() {
		imprimir("");
	}
	//  M???todos tipo void (con par???metros)
	void listado(Balon x) {
		imprimir("Marca: " + x.getMarca());
		imprimir("Peso en gr: " + x.getPesoEnGramos());
		imprimir("Presi??n en libras: " + x.getPresionLibras());
		imprimir("Diametro en cm: " + x.getDiametroCM());
		imprimir("Precio: " + x.getPrecio());
		imprimir("");
	}
	
	void imprimir(String s) {
		txtS.append(s + "\n");
	}	
	
}