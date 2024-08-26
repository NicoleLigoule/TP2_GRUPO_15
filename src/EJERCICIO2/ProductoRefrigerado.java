package EJERCICIO2;

public class ProductoRefrigerado extends Producto {

	private String codigo_OSA;

	//Constructores
	
	public ProductoRefrigerado() {
		super();
		this.codigo_OSA = "Sin codigo";
	}
	
	public ProductoRefrigerado(String fecha_de_caducidad,int numero_de_lote,String codigo_OSP) {
		super(fecha_de_caducidad, numero_de_lote);
		this.codigo_OSA = codigo_OSP;
	}
	
	
}
