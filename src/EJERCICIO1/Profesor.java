package EJERCICIO1;

public class Profesor extends Empleado{
	private String cargo;
	private int antiguedadDocente;
	
	//Constructores
	
	public Profesor() {
		super();
		
	}
	
	public Profesor(int id, String nombre,int edad, String cargo, int antiguedadDocente) {
		super(nombre,edad);
		this.cargo = cargo;
		this.antiguedadDocente = antiguedadDocente;
	}
	
	
	@Override
    public String toString() {
       return super.toString() + "\nCargo=" + cargo + "\nAntiguedad Docente=" + antiguedadDocente;
    }
	
}
