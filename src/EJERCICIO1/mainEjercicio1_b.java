package EJERCICIO1;

import java.util.Iterator;
import java.util.TreeSet;



public class mainEjercicio1_b {
	public static void main(String[] args) {
		///(String nombre,int edad,String cargo,int antiguedadDocente) 
		Profesor[] prof = new Profesor[5];
		prof[0]=new Profesor("juan",26,"Docente",2);
		prof[1]=new Profesor("Tomas",46,"Preceptor",10);
		prof[2]=new Profesor("Ramiro",32,"Direcor",8);
		prof[3]=new Profesor("Manuel",42,"Docente",13);
		prof[4]=new Profesor("Felipe",52,"Preceptor",25);
		TreeSet<Profesor> profesores = new TreeSet<>();
		profesores.add(prof[0]);
		profesores.add(prof[1]);
		profesores.add(prof[2]);
		profesores.add(prof[3]);
		profesores.add(prof[4]);
		
		 Iterator<Profesor> iterador = profesores.iterator();
		 while(iterador.hasNext()){
			Profesor profesor =iterador.next();
			iterador.remove();
			System.out.println(profesor.toString());	
		}
		 
		 
			Profesor prof5 = new Profesor("juan",33,"Maestro",8);
			Profesor prof6 = new Profesor("juan",33,"Maestro",8);
			if(prof5.hashCode()==prof6.hashCode()) {
				System.out.println("son iguales");	
			}else {
				System.out.println("son Distntos");
			}
	}
	
}