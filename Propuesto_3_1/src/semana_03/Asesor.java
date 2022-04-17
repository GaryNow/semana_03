package semana_03;

public class Asesor {
	// Atributos privados
	private String nombreAsesor;
	private int dni;
	private int codigo;
	private double remuneracionEnDolar;
	// Variable privada de clase
	private static int cantidadAsesor;
	private static double sumaRemuneracion;
	// Constante pública de clase
	public static final String INSTITUCION;
	// Bloque de inicializacion
	static {
		INSTITUCION="CV";
		cantidadAsesor = 0;
		sumaRemuneracion = 0;
	}
	public Asesor(String nombreAsesor, int dni, int codigo, double remuneracionEnDolar) {
		this.nombreAsesor = nombreAsesor;
		this.dni = dni;
		this.codigo = codigo;
		this.remuneracionEnDolar = remuneracionEnDolar;
		cantidadAsesor++;
		sumaRemuneracion += getRemuneracionEnDolar();
	}
	public Asesor(String nombre, int dni) {
		this(nombre,dni,55555,2000);
	}
	public Asesor() {
		this("NN",88888888);
	}
	// Métodos privados
	public String getNombreAsesor() {
		return nombreAsesor;
	}
	public void setNombreAsesor(String nombreAsesor) {
		this.nombreAsesor = nombreAsesor;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public double getRemuneracionEnDolar() {
		return remuneracionEnDolar;
	}
	public void setRemuneracionEnDolar(double remuneracionEnDolar) {
		this.remuneracionEnDolar = remuneracionEnDolar;
	}
	// Métodos de variables privadas
	public static int getCantidadAsesor() {
		return cantidadAsesor;
	}
	public static void setCantidadAsesor(int cantidadAsesor) {
		Asesor.cantidadAsesor = cantidadAsesor;
	}
	public static double getSumaRemuneracion() {
		return sumaRemuneracion;
	}
	public static void setSumaRemuneracion(double sumaRemuneracion) {
		Asesor.sumaRemuneracion = sumaRemuneracion;
	}
	
	
}
