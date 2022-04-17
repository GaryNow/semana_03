package semana_03;

public class Empleado {
	// Atributos privados
	private int codigo, categoria,numeroCelular;
	private String nombre;
	// Variable privada de clase
	private static int cantidadEmpleados;
	private static double sumaSueldosNetos;
	// Constante publica de clase
	public static final double DESCUENTO;
	// Bloque de inicializacion
	static {
		DESCUENTO = 0.15;
		cantidadEmpleados = 0;
		sumaSueldosNetos = 0;
	}
	// Constructores
	public Empleado(int codigo, String nombre,int categoria, int numeroCelular) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.categoria = categoria;
		this.numeroCelular = numeroCelular;	
		cantidadEmpleados++;
		sumaSueldosNetos += sueldoNeto();
	}
	public Empleado(int codigo,String nombre) {
		this(codigo,nombre,2,999999999);
	}
	public Empleado() {
		this(4444, "Ninguno");
	}
	
	// Métodos getters and setters de los atributos privados
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getCategoria() {
		return categoria;
	}
	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}
	public int getNumeroCelular() {
		return numeroCelular;
	}
	public void setNumeroCelular(int numeroCelular) {
		this.numeroCelular = numeroCelular;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	// Método setters and getters en variables privadas de clase
	public static int getCantidadEmpleados() {
		return cantidadEmpleados;
	}
	public static void setCantidadEmpleados(int cantidadEmpleados) {
		Empleado.cantidadEmpleados = cantidadEmpleados;
	}
	public static double getSumaSueldosNetos() {
		return sumaSueldosNetos;
	}
	public static void setSumaSueldosNetos(double sumaSueldosNetos) {
		Empleado.sumaSueldosNetos = sumaSueldosNetos;
	}
	
	// Método q retorne el sueldo Bruto
	public double sueldoBruto() {
		double sueldoBruto;
		switch (getCategoria()) {
		case 0: sueldoBruto = 7200 ; break;
		case 1: sueldoBruto = 6300 ; break;
		case 2: sueldoBruto = 5100 ; break;
		default: sueldoBruto = 0; break;
		}
		return sueldoBruto;
	}
	// Método que retorne el descuento
	public double descuento() {
		return sueldoBruto()*DESCUENTO;
	}
	// Método que retorne el sueldo neto
	public double sueldoNeto() {
		return  sueldoBruto() - descuento();
	}
}
