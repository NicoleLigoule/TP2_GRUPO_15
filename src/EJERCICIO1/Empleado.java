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
		
		public int getId() {
			return id;
		}
		@Override
		public String toString() {
			return "Empleado: ID:" + id + " Nombre:" + nombre +" Edad:" + edad;
		}
		
		public int compareTo() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + edad;
			result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Empleado other = (Empleado) obj;
			if (edad != other.edad)
				return false;
			if (nombre == null) {
				if (other.nombre != null)
					return false;
			} else if (!nombre.equals(other.nombre))
				return false;
			return true;
		}
		
	
		
		
}