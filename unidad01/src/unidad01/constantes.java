package unidad01;

public class constantes {

	public static void main(String[] args) {

		double importe = 60.0;
		
		//Los porcentajes los expresamos siempre en tanto por 1
		//Las constantes las definimos con la palabra reservada final
		final double DESCUENTO = 0.15;
		
		double totalConDescuento = importe * (1 - DESCUENTO);
		
		//No se puede modificar el valor de una constante
		//que he,mos asignado un valor inicial
		//DESCUENTO = 0.20;
		
	}

}
