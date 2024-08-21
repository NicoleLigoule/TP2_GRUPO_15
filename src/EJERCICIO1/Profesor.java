package EJERCICIO1;

public class Profesor extends Empleado{
	private String cargo;
	private int antiguedadDocente;
	
	//Constructores
	
	public Profesor() {
		super();
		
	}
	
	public Profesor(int id, String nombre,int edad, String cargo, int antiguedadDocente) {
		super(id,nombre,edad);
		this.antiguedadDocente = antiguedadDocente;
	}
	
	
}
