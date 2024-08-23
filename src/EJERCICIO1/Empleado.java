package EJERCICIO1;

public class Empleado {


	private final int id;
	private String nombre;
	private int edad;
	
	static int contador = 999;
	
	//Constructores
	
		public Empleado() {
			contador++;
			id = contador;
			nombre ="sin nombre";
			edad = 99;		
		}
		public Empleado(String nombre,int edad){
			contador++;
			this.id=contador;
			this.nombre =nombre;
			this.edad=edad;
		}
		
		// Getters y Setters
		public int getEdad() {
			return edad;
		}
		public void setEdad(int edad) {
			this.edad = edad;
		}
		public static int getContador() {
			return contador;
		}
		public static void setContador(int contador) {
			Empleado.contador = contador;
		}
		
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		
		// Metodos
		public static int devuelveProximoId() {
			return contador+1;
		}
		
		@Override
		public String toString() {
			return "Empleado: ID:" + id + ", Nombre:" + nombre +", Edad:" + edad;
		}
		
		
		
	
		
		
}