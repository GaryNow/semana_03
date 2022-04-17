package semana_03;

public class Movil {
	// Atributos privados
	private int numeroMovil;
	private String nombreCliente;
	private int segundosConsumidos;
	private double precioPorSegundo;
	// Variables privadas de clase
	private static int cantidadMoviles;
	private static double SumaDeImportes;
	// Constante pública de clase
	public static final double IGV;
	// Bloque de inicialización de static
	static {
		IGV = 0.18;
		cantidadMoviles = 0;
		SumaDeImportes = 0;
	}
	public Movil(int numeroMovil, String nombreCliente, int segundosConsumidos, double precioPorSegundo) {
		this.numeroMovil = numeroMovil;
		this.nombreCliente = nombreCliente;
		this.segundosConsumidos = segundosConsumidos;
		this.precioPorSegundo = precioPorSegundo;
		cantidadMoviles++;
		SumaDeImportes += importePaga();
	}
	public Movil(int numeroMovil, String nombreCliente) {
		this(numeroMovil,nombreCliente,75,0.28);
	}
	public Movil() {
		this(987656789,"Juan");
	}
	// Métodos para los atributos privados
	public int getNumeroMovil() {
		return numeroMovil;
	}
	public void setNumeroMovil(int numeroMovil) {
		this.numeroMovil = numeroMovil;
	}
	public String getNombreCliente() {
		return nombreCliente;
	}
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	public int getSegundosConsumidos() {
		return segundosConsumidos;
	}
	public void setSegundosConsumidos(int segundosConsumidos) {
		this.segundosConsumidos = segundosConsumidos;
	}
	public double getPrecioPorSegundo() {
		return precioPorSegundo;
	}
	public void setPrecioPorSegundo(double precioPorSegundo) {
		this.precioPorSegundo = precioPorSegundo;
	}
	// Métodos para variables privadas
	public static int getCantidadMoviles() {
		return cantidadMoviles;
	}
	public static void setCantidadMoviles(int cantidadMoviles) {
		Movil.cantidadMoviles = cantidadMoviles;
	}
	public static double getSumaDeImportes() {
		return SumaDeImportes;
	}
	public static void setSumaDeImportes(double sumaDeImportes) {
		SumaDeImportes = sumaDeImportes;
	}
	
	// Método del costo por consumo
	public double costoPorConsumo() {
		return segundosConsumidos*precioPorSegundo;
	}
	// Método del impuesto por IGV
	public double impuestoPorIGV() {
		return costoPorConsumo() * IGV;
	}
	// Método del importe a pagar
	public double importePaga() {
		return costoPorConsumo() + impuestoPorIGV();
	}
	
}
