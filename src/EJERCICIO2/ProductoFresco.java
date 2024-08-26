package EJERCICIO2;

public class ProductoFresco extends Producto {
private	String fecha_de_envasado; 
private	 String el_pais_de_origen;
	 
public	 ProductoFresco() {
	super();
	this.fecha_de_envasado="Ayer";
	this.el_pais_de_origen="Angola";
}
public	 ProductoFresco(String fecha_ca,int Lote,String envase,String paisOrigen) {
	super(fecha_ca,Lote);
	this.fecha_de_envasado=envase;
	this.el_pais_de_origen=paisOrigen;
}
	 
	public String getFecha_de_envasado() {
		return fecha_de_envasado;
	}
	public void setFecha_de_envasado(String fecha_de_envasado) {
		this.fecha_de_envasado = fecha_de_envasado;
	}
	public String getEl_pais_de_origen() {
		return el_pais_de_origen;
	}
	public void setEl_pais_de_origen(String el_pais_de_origen) {
		this.el_pais_de_origen = el_pais_de_origen;
	}
	@Override
	public String toString() {
		return "fecha de envasado:" + fecha_de_envasado + ", el pais de origen:" + el_pais_de_origen+" "+ super.toString();
	}
	 
}
