package EJERCICIO2;

public class ProductoRefrigerado extends Producto {

	private String codigo_OSA;

	//Constructores
	
	public ProductoRefrigerado() {
		super();
		this.codigo_OSA = "Sin codigo";
	}
	
	public ProductoRefrigerado(String fecha_de_caducidad, int numero_de_lote, String codigo_OSA) {
	    super(fecha_de_caducidad, numero_de_lote);
	    this.codigo_OSA = codigo_OSA;  
	}

	
	public String getC�digo_del_organismo() {
		return codigo_OSA;
	}

	public void setC�digo_del_organismo(String codigo_del_organismo) {
		this.codigo_OSA = codigo_del_organismo;
	}
	@Override
	public String toString() {
		return "c�digo del organismo:" + codigo_OSA +" "+ super.toString();
	}
}
