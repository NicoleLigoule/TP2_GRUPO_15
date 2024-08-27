package EJERCICIO2;

public class ProductoCongelado extends Producto {

	  private int temperatura_c;

	  //Constructor
	  	public ProductoCongelado() {
	        super();
	        this.temperatura_c =0;
	    }
	  
	    public int getTemperatura_c() {
	        return temperatura_c;
	    }

	    public void setTemperatura_c(int temperatura_c) {
	        this.temperatura_c = temperatura_c;
	    }

}
