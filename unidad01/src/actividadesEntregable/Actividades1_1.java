package actividadesEntregable;

import java.util.Scanner;

public class Actividades1_1 {

	public static void main(String[] args) {

		/*
		 * 8.Pide al usuario dos números y muestra la "distancia" 
		 * entre ellos (el valor absoluto de su diferencia, de modo que el resultado 
		 * sea siempre positivo). Pista: Math.abs() 
		 * para calcular el valor absoluto.
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce el primer numero");
		int numero1 = scanner.nextInt();
		System.out.println("Introduce el segundo numero");
		int numero2 = scanner.nextInt();
		int distancia = Math.abs(numero1 - numero2 );
		System.out.printf("La distancia entre los numeros introducidos es de: %d",distancia);
		
		
	}

}
