package actividadesEntregable;

import java.util.Scanner;

public class Actividad1_3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introduce la primera calificacion");
		int calificacion_1 = scanner.nextInt();
		System.out.println("Introduce el segundo numero");
		int calificacion_2 = scanner.nextInt();
		System.out.println("Introduce el tercer numero");
		int calificacion_3 = scanner.nextInt();
		double media = (calificacion_1 + calificacion_2 + calificacion_3) /3.0;
		boolean resultado = media >= 5 && calificacion_1 >= 3 && calificacion_2 >=3 && calificacion_3 >=3;
	
		System.out.println(resultado ? "Aprobado" : "Suspenso");
		
	}

}
