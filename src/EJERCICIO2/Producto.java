package EJERCICIO2;

public class Producto {
	private String fecha_de_caducidad ;
	private int numero_de_lote;
	 
	 public Producto() {
	 this.fecha_de_caducidad="Sin fecha";
	 this.numero_de_lote=-1;
	 }	
	 public Producto(String fecha_de_caducidad,int numero_de_lote) {
		 this.fecha_de_caducidad=fecha_de_caducidad;
		 this.numero_de_lote=numero_de_lote;
		 }
	 
	public String getFecha_de_caducidad() {
		return fecha_de_caducidad;
	}
	public void setFecha_de_caducidad(String fecha_de_caducidad) {
		this.fecha_de_caducidad = fecha_de_caducidad;
	}
	public int getNúmero_de_lote() {
		return numero_de_lote;
	}
	public void setNúmero_de_lote(int número_de_lote) {
		this.numero_de_lote = número_de_lote;
	}
	@Override
	public String toString() {
		return "Fecha de caducidad: " + fecha_de_caducidad + ", Numero de lote=" + numero_de_lote;
	}
	 
}
