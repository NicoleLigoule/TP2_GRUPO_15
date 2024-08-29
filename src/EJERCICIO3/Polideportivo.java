package EJERCICIO3;

public class Polideportivo extends Edificio  implements instalacionDeportiva {
	private  String nombre;
 private int tipoDeInstalacion;
 
 
 
 
public Polideportivo() {
	super();
	  this.nombre="sin nombre";
	  this.tipoDeInstalacion=-1;
}




public Polideportivo(double superficie,String nombre,int tipo) {
	super(superficie);
  this.nombre=nombre;
  this.tipoDeInstalacion=tipo;
}




public String getNombre() {
	return nombre;
}




public void setNombre(String nombre) {
	this.nombre = nombre;
}




@Override
public int getTipoDeInstalacion() {
	
	return tipoDeInstalacion;
}




	@Override
	public String toString() {
	    return "Polideportivo [Nombre=" + nombre + ", Superficie=" + getSuperficie() + ", Tipo de Instalación=" + tipoDeInstalacion + "]";
	}
}
