package EJERCICIO3;

public class EdificioDeOficina extends Edificio {
private int NumeroDeOficina;

public int getNumeroDeOficina() {
	return NumeroDeOficina;
}

public void setNumeroDeOficina(int numeroDeOficina) {
	NumeroDeOficina = numeroDeOficina;
}

public EdificioDeOficina() {
	super();
	this.NumeroDeOficina=-1;
}

public EdificioDeOficina(double superficie,int oficinas) {
	super(superficie);
	this.NumeroDeOficina=oficinas;
}

public String toString() {
	return "Numero De Oficina: " + NumeroDeOficina + " "+super.toString();
}
}
