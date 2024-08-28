package EJERCICIO3;

public class Polideportivo extends Edificio implements instalacionDeportiva{

	private String nombre;
	private int tipoDeInstalacion;
	
	//Constructores
	public Polideportivo() {
		super();
		
	}
	
	public Polideportivo(double superficie, String nombre) {
		super(superficie);
		this.nombre = nombre;
	}
		
	//Getter/Setters

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

    public void setTipoDeInstalacion(int tipoDeInstalacion) {
        this.tipoDeInstalacion = tipoDeInstalacion;
    }
	
	



}
