package EJERCICIO2;

public class ProductoCongelado extends Producto {

	  private int temperatura_c;

	  //Constructor
	  	public ProductoCongelado() {
	        super();
	        this.temperatura_c =0;
	    }
	  	
	  	public ProductoCongelado(String fecha_de_caducidad,int numero_de_lote,int Temp) {
	  		super(fecha_de_caducidad,numero_de_lote);
	  		this.temperatura_c=Temp;
	  	}
	  
	    public int getTemperatura_c() {
	        return temperatura_c;
	    }

	    public void setTemperatura_c(int temperatura_c) {
	        this.temperatura_c = temperatura_c;
	    }
	    @Override
	    public String toString() {
	    	return "temperatura de congelación recomendada:" + temperatura_c +" "+ super.toString();
	    }

}
