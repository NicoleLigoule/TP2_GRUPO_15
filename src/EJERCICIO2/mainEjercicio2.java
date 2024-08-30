package EJERCICIO2;

public class mainEjercicio2 {

	public static void main(String[] args) {
		
		ProductoCongelado Cong = new ProductoCongelado("01/01/2025", 100001, -10);
		ProductoFresco Fresco=new ProductoFresco("12/10/2026",1,"Bolsa","argentina");
		ProductoRefrigerado Refri=new ProductoRefrigerado("12/10/2023",1,"22");
		
		System.out.println(Cong);
		System.out.println(Fresco);
		System.out.println(Refri);

	}

}
