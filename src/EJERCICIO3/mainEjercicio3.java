package EJERCICIO3;

import java.util.ArrayList;
import java.util.ListIterator;

import EJERCICIO1.Profesor;


public class mainEjercicio3 {

	public static void main(String[] args) {
		
		ArrayList<Edificio> edificiosList = new ArrayList<>();
		Edificio[] edificios = new Edificio[5];
		edificios[0]= new Polideportivo(34,"ferro",3);
		edificios[1]= new Polideportivo(120,"River",1);
		edificios[2]= new Polideportivo(300,"Estudiantes",2); 
		edificios[3]=new EdificioDeOficina(580,38);
		edificios[4]=new EdificioDeOficina(360,24);

		edificiosList.add(edificios[0]);
		edificiosList.add(edificios[1]);
		edificiosList.add(edificios[2]);
		edificiosList.add(edificios[3]);
		edificiosList.add(edificios[4]);
		
		ListIterator<Edificio> iterador = edificiosList.listIterator();
		
		 while(iterador.hasNext()){
			 Edificio Edi =iterador.next();
			iterador.remove();
			System.out.println(Edi.toString());	
		}
		

	}

}
