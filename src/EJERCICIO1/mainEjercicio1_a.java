package EJERCICIO1;

import java.util.ArrayList;
import java.util.ListIterator;


public class mainEjercicio1_a {

	public static void main(String[] args) {
		ArrayList<Profesor> profesores = new ArrayList<>();
		
		Profesor[] prof = new Profesor[5];
		prof[0]=new Profesor("juan",26,"Docente",2);
		prof[1]=new Profesor("Tomas",46,"Preceptor",10);
		prof[2]=new Profesor("Ramiro",32,"Direcor",8);
		prof[3]=new Profesor("Manuel",42,"Docente",13);
		prof[4]=new Profesor("Felipe",52,"Preceptor",25);
		
		profesores.add(prof[0]);
		profesores.add(prof[1]);
		profesores.add(prof[2]);
		profesores.add(prof[3]);
		profesores.add(prof[4]);
		
		
		
		ListIterator<Profesor> iterador = profesores.listIterator();
		 while(iterador.hasNext()){
			Profesor profesor = iterador.next();
			iterador.remove();
			System.out.println(profesor.toString());	
		}
			
	}
}
