package unidad01;

import java.util.Scanner;

public class Actividad_1_5 {

	public static void main(String[] args) {
	
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce el tipo de clasificacion de la uva entre A Y B");
		String uva = scanner.next();
		System.out.println("Introduce el tamaño  entre 1 y 2");
		int tamano = scanner.nextInt();
		System.out.println("Introduce una cantidad de kilos");
		double kilos = scanner.nextDouble();
		System.out.println("Cual es el precio inicial");
		double precioInicial = scanner.nextInt();
		
		double precioFinal = precioInicial;
		
        if (uva.equals("A")) {
            if (tamano == 1) {
                precioFinal = precioInicial + 0.20;
            } else if (tamano == 2) {
                precioFinal = precioInicial + 0.30;
            }
        } else if (uva.equals("B")) {
            if (tamano == 1) {
                precioFinal = precioInicial - 0.30;
            } else if (tamano == 2) {
                precioFinal = precioInicial - 0.50;
            }
        }

        double total = precioFinal * kilos;

        System.out.println("Precio final por kilo: " + precioFinal + " euros");
        System.out.printf("Importe total: %.2f euros",total);
	}

}