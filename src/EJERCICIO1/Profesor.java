package EJERCICIO1;

public class Profesor extends Empleado{
	private String cargo;
	private int antiguedadDocente;
	
	//Constructores
	
	public Profesor() {
		super();
		
	}
	
	public Profesor(String nombre,int edad, String cargo, int antiguedadDocente) {
		super(nombre,edad);
		this.cargo = cargo;
		this.antiguedadDocente = antiguedadDocente;
	}
	
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getAntiguedadDocente() {
        return antiguedadDocente;
    }

    public void setAntiguedadDocente(int antiguedadDocente) {
        this.antiguedadDocente = antiguedadDocente;
    }
	
	@Override
    public String toString() {
       return super.toString() + ", Cargo:" + cargo + ", Antiguedad Docente:" + antiguedadDocente + "\n";
    }
	
}
