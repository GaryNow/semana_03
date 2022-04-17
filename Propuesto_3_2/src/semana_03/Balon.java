package semana_03;

public class Balon {
	private String marca;
	private double pesoEnGramos;
	private double presionLibras;
	private double diametroCM;
	private double precio;
	
	private static int balones;
	private static double sumaImportes;
	
	public static final double PI;
	public static final double DESCUENTO;
	
	static {
		PI = 3.1416;
		DESCUENTO = 0.05;
	}

	public Balon(String marca, double pesoEnGramos, double presionLibras, double diametroCM, double precio) {
		this.marca = marca;
		this.pesoEnGramos = pesoEnGramos;
		this.presionLibras = presionLibras;
		this.diametroCM = diametroCM;
		this.precio = precio;
		balones++;
		sumaImportes += getPrecio();
	}
	public Balon(String marca, double pesoEnGramos, double presionLibras) {
		this(marca,pesoEnGramos,presionLibras,18.5 , 100.0);
	}
	public Balon() {
		this("Adidas", 1.5, 4.8);
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getPesoEnGramos() {
		return pesoEnGramos;
	}
	public void setPesoEnGramos(double pesoEnGramos) {
		this.pesoEnGramos = pesoEnGramos;
	}
	public double getPresionLibras() {
		return presionLibras;
	}
	public void setPresionLibras(double presionLibras) {
		this.presionLibras = presionLibras;
	}
	public double getDiametroCM() {
		return diametroCM;
	}
	public void setDiametroCM(double diametroCM) {
		this.diametroCM = diametroCM;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public static int getBalones() {
		return balones;
	}
	public static void setBalones(int balones) {
		Balon.balones = balones;
	}
	public static double getSumaImportes() {
		return sumaImportes;
	}
	public static void setSumaImportes(double sumaImportes) {
		Balon.sumaImportes = sumaImportes;
	}
	
	public double radio() {
		return getDiametroCM()/2;
	}
	
	public double volumen() {
		return 4*PI* radio() *radio() *radio()/3;
	}
	
	public double descuento() {
		return precio*DESCUENTO;
	}
	
	public double importePaga() {
		return precio - descuento();
	}
}
