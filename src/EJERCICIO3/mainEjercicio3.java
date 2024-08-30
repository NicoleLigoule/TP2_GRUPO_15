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
		edificios[3]= new EdificioDeOficina(500, 10);
        edificios[4]= new EdificioDeOficina(800, 20);

		edificiosList.add(edificios[0]);


	}

}
