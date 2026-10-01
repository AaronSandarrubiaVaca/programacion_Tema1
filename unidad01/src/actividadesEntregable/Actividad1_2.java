package actividadesEntregable;

import java.util.Scanner;

public class Actividad1_2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduze cantidad de monedas de 1€");
		int euro_moneda1 = scanner.nextInt();
		System.out.println("Introduze cantidad de monedas de 2€");
		int euro_moneda2 = scanner.nextInt();
		System.out.println("Introduze cantidad de monedas de 50centimos");
		int moneda_50c = scanner.nextInt();
		System.out.println("Introduze cantidad de monedas de 20centimos");
		int moneda_20c = scanner.nextInt();
		System.out.println("Introduze cantidad de monedas de 10centimos");
		int moneda_10c = scanner.nextInt();

		int totalEuros = (euro_moneda1 + euro_moneda2 * 2);
		int totalCentimos = (moneda_10c * 10 + moneda_20c * 20 + moneda_50c * 50);
		int total€ = totalCentimos / 100 + totalEuros;
		int totalC = totalCentimos %100;
	
	System.out.printf("El es de %d euros y %d de centimos",total€,totalC);
	
	}

}
