package semana_03;

public class Consultor {
	private int codigo;
	private String nombre;
	private int horasTrabajadas;
	private double tarifaPorhora;
	
	private static int cantidadConsultor;
	private static double sumaSueldosNetos;
	
	public static final double AFP,EPS;
	
	static {
		AFP=0.1;
		EPS=0.05;
	}

	public Consultor(int codigo, String nombre, int horasTrabajadas, double tarifaPorhora) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.horasTrabajadas = horasTrabajadas;
		this.tarifaPorhora = tarifaPorhora;
		cantidadConsultor++;
		sumaSueldosNetos += sueldoNeto();
	}
	public Consultor(int codigo, String nombre, int horasTrabajadas) {
		this(codigo,nombre,horasTrabajadas,65.0);
	}
	public Consultor() {
		this(333,"Juan",30);
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}
	public void setHorasTrabajadas(int horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}
	public double getTarifaPorhora() {
		return tarifaPorhora;
	}
	public void setTarifaPorhora(double tarifaPorhora) {
		this.tarifaPorhora = tarifaPorhora;
	}
	public static int getCantidadConsultor() {
		return cantidadConsultor;
	}
	public static void setCantidadConsultor(int cantidadConsultor) {
		Consultor.cantidadConsultor = cantidadConsultor;
	}
	public static double getSumaSueldosNetos() {
		return sumaSueldosNetos;
	}
	public static void setSumaSueldosNetos(double sumaSueldosNetos) {
		Consultor.sumaSueldosNetos = sumaSueldosNetos;
	}
	
	public double sueldoBruto() {
		return horasTrabajadas*tarifaPorhora;
	}
	public double descuentoAFP() {
		return sueldoBruto()*AFP;
	}
	public double descuentoEPS() {
		return sueldoBruto()*EPS;
	}
	public double sueldoNeto() {
		return sueldoBruto() - descuentoAFP() - descuentoEPS();
	}
}
