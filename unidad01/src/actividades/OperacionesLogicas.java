package actividades;

import java.util.Scanner;

public class OperacionesLogicas {

	public static void main(String[] args) {
		
	//Ejercicio1
//		Scanner scanner = new Scanner(System.in); 
//		System.out.println("Introduce tu edad");
//		int edad = scanner.nextInt();
//		boolean resultado = edad >=18;
//		System.out.println(resultado);
//	
	
	//Ejercicio2
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Introduce un numero");
//		int numero = scanner.nextInt();
//		boolean par = (numero % 2) == 0;
//		System.out.println("El resultado de si es par " + par);
//	
	
	//Ejercicio3
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Introduce una edad");	
//		int edad = scanner.nextInt();
//		boolean resultado = (edad >=16) && (edad <67);
//		System.out.println("El resultado si es en la edad permitida es " + resultado);
//		
		
	//Ejercicio4
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("¿Esta lloviendo?");
//		boolean lluvia = scanner.nextBoolean();
//		System.out.println("¿Has terminado las tareas?");
//		boolean tareas = scanner.nextBoolean();
//		System.out.println("¿Tenemos que ir a la bibliteca?");
//		boolean biblioteca = scanner.nextBoolean();
//		boolean calle = biblioteca || (tareas && !lluvia);
//		//Forma 1(integrada al sysout),para en vez de devolver que si es true muestre una cosa y si es false muestre otra
//		System.out.println(calle ? "Puedes salir a la calle:" : "No puedes salir a la calle");
//	
//		//Forma 2 directamente con un String
//		String mensaje = calle ? "Puedes salir a la calle" : "No puedes salir a la calle";
//		
		
	//Ejercicio5 Un frutero 
		
		Scanner scanner = new Scanner(System.in);
		double manzanas = 2.35;
		double peras = 1.95;
		
		System.out.println("Inserte un peso en Kg en el primer semestre de manzanas");
		double semestreManzanas1 = scanner.nextDouble();
		
		System.out.println("Inserte un peso en Kg en el segundo semestre de manzanas");
		double semestreManzanas2 = scanner.nextDouble();

		System.out.println("Inserte un peso en Kg en el primer semestre de peras");
		double semestrePeras1 = scanner.nextDouble();

		System.out.println("Inserte un peso en Kg en el segundo semestre de peras");
		double semestrePeras2 = scanner.nextDouble();

		double importeManzanasTotal = manzanas * (semestreManzanas1 + semestreManzanas2);
		double importePerasTotal = peras * (semestrePeras1 + semestrePeras2);
		
		System.out.printf("El total de ventas de manzanas y peras es de: %.2f ",importePerasTotal + importeManzanasTotal);
		
	}

}
