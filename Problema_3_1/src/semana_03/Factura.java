package semana_03;

public class Factura {
	// Atributos privados
	private String ruc, empresa;
	private int unidades;
	private double precioUnitario;
	// Variable privada de clase
	private static int cantidadFacturas;
	private static double sumaImportes;
	// Constante pública de clase
	public static final String CLASE;
	// Bloque de inicializacion
	static {
		CLASE = "Sunat";
		cantidadFacturas = 0;
		sumaImportes = 0;
	}
	// Constructores
	public Factura(String ruc, String empresa, int unidades, double precioUnitario) {
		this.ruc 			= ruc;
		this.empresa		= empresa;
		this.unidades		= unidades;
		this.precioUnitario	= precioUnitario;
		cantidadFacturas++;
		sumaImportes+=importeFacturado();
	}
	public Factura(String ruc, String empresa) {
		this(ruc, empresa, 10, 50);
	}
	public Factura() {
		this("111111111", "MN-Global SRL");
	}
	// Métodos set y get para atributos privados
	
	public String getRuc() {
		return ruc;
	}
	public void setRuc(String ruc) {
		this.ruc = ruc;
	}
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	public int getUnidades() {
		return unidades;
	}
	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}
	public double getPrecioUnitario() {
		return precioUnitario;
	}
	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}
	//  M�todos p�blicos de clase: set/get
	
	public static int getCantidadFacturas() {
		return cantidadFacturas;
	}
	public static void setCantidadFacturas(int cantidadFacturas) {
		Factura.cantidadFacturas = cantidadFacturas;
	}
	public static double getSumaImportes() {
		return sumaImportes;
	}
	public static void setSumaImportes(double sumaImportes) {
		Factura.sumaImportes = sumaImportes;
	}
	public static String getClase() {
		return CLASE;
	}
	
	// método de retorno del importe facturado
	public double importeFacturado() {
		return unidades * precioUnitario;
	}
	
	
}
