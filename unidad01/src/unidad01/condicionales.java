package unidad01;

import java.util.IllegalFormatCodePointException;
import java.util.Scanner;

public class condicionales {

	public static void main(String[] args) {

//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Introduce el primer numero entero");
//		int primerNumero = scanner.nextInt();
//		System.out.println("Introduce el segundo numero entero");
//		int segundoNumero = scanner.nextInt();
//		
//		boolean resultado = primerNumero != segundoNumero || primerNumero ==0 || segundoNumero ==0;
//		
//		System.out.printf("El resultado es %b \n",resultado);
//		
//		
//		
//		
//		boolean multiplo = (primerNumero % segundoNumero ==0);
//		
//		System.out.printf("%d es multiplo de %d:  %b  ",primerNumero,segundoNumero,multiplo);
//		
//		

		// DIAPOSITIVA 96

//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Introduce un numero entero");
//		int numero = scanner.nextInt();
//		String esPar = "es Impar";
//		if (numero%2!=0) {	
//		esPar = "Es par";
//			}
//		{
//		System.out.println(esPar);
//		}
//		

		// DIAPOSITIVA 99

//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Introduce el primer numero entero");
//		int primerNumero = scanner.nextInt();
//		System.out.println("Introduce el segundo numero entero");
//		int segundoNumero = scanner.nextInt();
//	
//		if (primerNumero == segundoNumero) {
//			System.out.println("Los numeros si son iguales");
//		}else {
//			System.out.println("Los numeros no son iguales");
//		}
//		

		// DIAPOSITIVA 100

//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Introduce el primer numero entero");
//		int primerNumero = scanner.nextInt();
//		System.out.println("Introduce el segundo numero entero");
//		int segundoNumero = scanner.nextInt();
//		if (primerNumero > segundoNumero) {
//			System.out.printf("El numero %d es mayor \n ",primerNumero);
//			
//		}else {
//			System.out.printf("El numero %d es mayor \n",segundoNumero);
//		}
//		
//		

		// DIAPOSITIVA 103 IF-ELSE

//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Dime un numero entre 0 y 99999");
//		int numero = scanner.nextInt();
//	
//		if (numero<0) {
//			System.out.println("El numero no esta en el rango permitido");
//		}
//		else if(numero<=9) {
//			System.out.println("El numero tiene 1 cifra");
//		}else if (numero<=99) {
//			System.out.println("El numero tiene 2 cifras");
//		}else if (numero<=999) {
//			System.out.println("El numero tiene 3 cifras");
//		}else if (numero<=9999) {
//			System.out.println("El numero tiene 4 cifras");
//		}else if (numero<=99999) {
//			System.out.println("El numero tiene 5 cifras");
//		}else {
//			System.out.println("El numero no esta entre 0 y 99999");
//		}
//			
//}
//		
//		
//		

		// DIAPOSITIVA 104
//		
//		Scanner sc = new Scanner(System.in);
//        System.out.println("Dime el primer número: ");
//        int numeroA = sc.nextInt();
//        System.out.println("Dime el segundo número: ");
//        int numeroB = sc.nextInt();
//        System.out.println("Dime el tercer número: ");
//        int numeroC = sc.nextInt();
//        
//        //A > B > C
//        //A > C > B
//        //B > A > C
//        //B > C > A
//        //C > A > B
//        //C > B > A
//        
//        if (numeroA > numeroB && numeroB > numeroC) {
//            System.out.printf("El orden es %d > %d > %d. \n", numeroA, numeroB, numeroC);
//        } else if (numeroA > numeroC && numeroC > numeroB) {
//            System.out.printf("El orden es %d > %d > %d. \n", numeroA, numeroC, numeroB);
//        } else if (numeroB > numeroA && numeroA > numeroC) {
//            System.out.printf("El orden es %d > %d > %d. \n", numeroB, numeroA, numeroC);
//        } else if (numeroB > numeroC && numeroC > numeroA) {
//            System.out.printf("El orden es %d > %d > %d. \n", numeroB, numeroC, numeroA);
//        } else if (numeroC > numeroA && numeroA > numeroB) {
//            System.out.printf("El orden es %d > %d > %d. \n", numeroC, numeroA, numeroB);
//        } else if (numeroC > numeroB && numeroB > numeroA) {
//            System.out.printf("El orden es %d > %d > %d. \n", numeroC, numeroB, numeroA);
//        } else {
//            System.out.println("Alguno de los números es igual a otro. ");
//        }
//		

		// DIAPOSITIVA 113

//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Ingresa el primer numero");
//		double primerNumero = scanner.nextDouble();
//		System.out.println("Ingresa el segundo numero");
//		double segundoNumero = scanner.nextDouble();
//		System.out.print("Ingresar operador(-,+,*,/): ");
//        String operador = scanner.next();
//        switch (operador) {
//		case "-": 
//			System.out.printf("El resultado es %.2f \n",(primerNumero-segundoNumero));
//			break;
//		case "+":
//			System.out.printf("El resultado es %.2f \n",(primerNumero+segundoNumero));
//			break;
//		case "*":
//			System.out.printf("El resultado es %.2f \n",(primerNumero*segundoNumero));
//			break;
//		case "/":
//			System.out.printf("El resultado es %.2f \n",(primerNumero*1.0/segundoNumero));
//			break;
//
//		default:
//				System.out.println("El operador no es valido");
//			}
// 

		// DIAPOSITIVA 114 (2.11)

//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Introduce un numero comprendido entre 0 a 9999");
//		int numero = scanner.nextInt();
//
//		if (numero < 0) {
//			System.out.println("El numero introducido no es valido");
//		} else if (numero <= 9) {
//			System.out.println("El numero introducido es capicua");
//
//		} else if (numero <= 99) {
//			int decenas = numero / 10;
//			int unidades = numero % 10;
//			boolean Capicua = decenas == unidades;
//			System.out.println(Capicua ? "El numero es capicua" : "El numero no es capicua");
//		} else if (numero <= 999) {			
//			int centenas = numero / 100;
//			int unidades = numero % 100;
//			boolean Capicua = centenas == unidades;
//			System.out.println(Capicua ? "El numero es capicua" : "El numero no es capicua");
//
//		} else if (numero <= 9999) {
//			int centenas = (numero % 1000)/100;
//			int decenas = (numero % 100)/10;
//			int millares = numero / 1000;
//			int unidades = numero % 10;
//			boolean Capicua = (unidades == millares) && (decenas == centenas);
//			System.out.println(Capicua ? "El numero es capicua" : "El numero no es capicua");
//			
//		}else {
//				System.out.println("El numero introducido no es esta en el rangos");
//
//			}			
//			
//			
//		}
//	}

		// DIAPOSITIVA 114 2.12
//
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Introduce un numero entero de 8 digitos");
//		int numero = scanner.nextInt();
//		String letra = "";
//		int modulo = numero % 23;
//		switch (modulo) {
//		case 0 -> letra = "T";
//		case 1 -> letra = "R";
//		case 2 -> letra = "W";
//		case 3 -> letra = "A";
//		case 4 -> letra = "G";
//		case 5 -> letra = "M";
//		case 6 -> letra = "Y";
//		case 7 -> letra = "F";
//		case 8 -> letra = "P";
//		case 9 -> letra = "D";
//		case 10 -> letra = "X";
//		case 11 -> letra = "B";
//		case 12 -> letra = "N";
//		case 13 -> letra = "J";
//		case 14 -> letra = "Z";
//		case 15 -> letra = "S";
//		case 16 -> letra = "Q";
//		case 17 -> letra = "V";
//		case 18 -> letra = "H";
//		case 19 -> letra = "L";
//		case 20 -> letra = "C";
//		case 21 -> letra = "K";
//		case 22 -> letra = "E";
//		default -> System.out.println("El numero introducido no esta en el rango");
//		
//		
//		}
//		System.out.printf("La letra asignada a es %d es %s ",numero,letra);
//	}
//}

		// DIAPOSITIVA 115 (2.13)

//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Introduce una cantidad de comida para los animales");
//		double comidaDiaria = scanner.nextDouble();
//		System.out.println("Introduce el numero de animales a alimentar");
//		int numAnimales = scanner.nextInt();
//		System.out.println("Introduce la cantidad de kilos por animal");
//		double kilosPorAnimal = scanner.nextDouble();
//		double disponibilidadAlimento = (comidaDiaria/numAnimales);
//		boolean determinacionAlimento = (disponibilidadAlimento >= kilosPorAnimal);
//
//		if (determinacionAlimento) {
//			System.out.println("Tiene suficiente alimento para la cantidad de animales");
//		}else {
//			System.out.printf("No tiene suficiente comida y la racion seria %.2f",disponibilidadAlimento);
//		}
//		
//
//	}
//
//}

		
//		//DIAPOSITIVA 115 (2.14)
//		
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Introduce un numero entre 1 y 99");
//		int numero = scanner.nextInt();
//		String pasarLetra = "";
//		int modulo = numero % 100;
//		switch (modulo) {
//		case 1 -> pasarLetra = "Uno";
//		case 2 -> pasarLetra = "Dos";
//		case 3 -> pasarLetra = "Tres";
//		case 4 -> pasarLetra = "Cuatro";
//		case 5 -> pasarLetra = "Cinco";
//		case 6 -> pasarLetra = "Seis";
//		case 7 -> pasarLetra = "Siete";
//		case 8 -> pasarLetra = "Ocho";
//		case 9 -> pasarLetra = "Nueve";
//		case 10 -> pasarLetra = "Diez";
//		case 11 -> pasarLetra = "Once";
//		case 12 -> pasarLetra = "Doce";
//		case 13 -> pasarLetra = "Trece";
//		case 14 -> pasarLetra = "Catorce";
//		case 15 -> pasarLetra = "Quince";
//		case 16 -> pasarLetra = "Dieciséis";
//		case 17 -> pasarLetra = "Diecisiete";
//		case 18 -> pasarLetra = "Dieciocho";
//		case 19 -> pasarLetra = "Diecinueve";
//		case 20 -> pasarLetra = "Veinte";
//		case 21 -> pasarLetra = "Veintiuno";
//		case 22 -> pasarLetra = "Veintidós";
//		case 23 -> pasarLetra = "Veintitrés";
//		case 24 -> pasarLetra = "Veinticuatro";
//		case 25 -> pasarLetra = "Veinticinco";
//		case 26 -> pasarLetra = "Veintiséis";
//		case 27 -> pasarLetra = "Veintisiete";
//		case 28 -> pasarLetra = "Veintiocho";
//		case 29 -> pasarLetra = "Veintinueve";
//		case 30 -> pasarLetra = "Treinta";
//		case 31 -> pasarLetra = "Treinta y uno";
//		case 32 -> pasarLetra = "Treinta y dos";
//		case 33 -> pasarLetra = "Treinta y tres";
//		case 34 -> pasarLetra = "Treinta y cuatro";
//		case 35 -> pasarLetra = "Treinta y cinco";
//		case 36 -> pasarLetra = "Treinta y seis";
//		case 37 -> pasarLetra = "Treinta y siete";
//		case 38 -> pasarLetra = "Treinta y ocho";
//		case 39 -> pasarLetra = "Treinta y nueve";
//		case 40 -> pasarLetra = "Cuarenta";
//		case 41 -> pasarLetra = "Cuarenta y uno";
//		case 42 -> pasarLetra = "Cuarenta y dos";
//		case 43 -> pasarLetra = "Cuarenta y tres";
//		case 44 -> pasarLetra = "Cuarenta y cuatro";
//		case 45 -> pasarLetra = "Cuarenta y cinco";
//		case 46 -> pasarLetra = "Cuarenta y seis";
//		case 47 -> pasarLetra = "Cuarenta y siete";
//		case 48 -> pasarLetra = "Cuarenta y ocho";
//		case 49 -> pasarLetra = "Cuarenta y nueve";
//		case 50 -> pasarLetra = "Cincuenta";
//		case 51 -> pasarLetra = "Cincuenta y uno";
//		case 52 -> pasarLetra = "Cincuenta y dos";
//		case 53 -> pasarLetra = "Cincuenta y tres";
//		case 54 -> pasarLetra = "Cincuenta y cuatro";
//		case 55 -> pasarLetra = "Cincuenta y cinco";
//		case 56 -> pasarLetra = "Cincuenta y seis";
//		case 57 -> pasarLetra = "Cincuenta y siete";
//		case 58 -> pasarLetra = "Cincuenta y ocho";
//		case 59 -> pasarLetra = "Cincuenta y nueve";
//		case 60 -> pasarLetra = "Sesenta";
//		case 61 -> pasarLetra = "Sesenta y uno";
//		case 62 -> pasarLetra = "Sesenta y dos";
//		case 63 -> pasarLetra = "Sesenta y tres";
//		case 64 -> pasarLetra = "Sesenta y cuatro";
//		case 65 -> pasarLetra = "Sesenta y cinco";
//		case 66 -> pasarLetra = "Sesenta y seis";
//		case 67 -> pasarLetra = "Sesenta y siete";
//		case 68 -> pasarLetra = "Sesenta y ocho";
//		case 69 -> pasarLetra = "Sesenta y nueve";
//		case 70 -> pasarLetra = "Setenta";
//		case 71 -> pasarLetra = "Setenta y uno";
//		case 72 -> pasarLetra = "Setenta y dos";
//		case 73 -> pasarLetra = "Setenta y tres";
//		case 74 -> pasarLetra = "Setenta y cuatro";
//		case 75 -> pasarLetra = "Setenta y cinco";
//		case 76 -> pasarLetra = "Setenta y seis";
//		case 77 -> pasarLetra = "Setenta y siete";
//		case 78 -> pasarLetra = "Setenta y ocho";
//		case 79 -> pasarLetra = "Setenta y nueve";
//		case 80 -> pasarLetra = "Ochenta";
//		case 81 -> pasarLetra = "Ochenta y uno";
//		case 82 -> pasarLetra = "Ochenta y dos";
//		case 83 -> pasarLetra = "Ochenta y tres";
//		case 84 -> pasarLetra = "Ochenta y cuatro";
//		case 85 -> pasarLetra = "Ochenta y cinco";
//		case 86 -> pasarLetra = "Ochenta y seis";
//		case 87 -> pasarLetra = "Ochenta y siete";
//		case 88 -> pasarLetra = "Ochenta y ocho";
//		case 89 -> pasarLetra = "Ochenta y nueve";
//		case 90 -> pasarLetra = "Noventa";
//		case 91 -> pasarLetra = "Noventa y uno";
//		case 92 -> pasarLetra = "Noventa y dos";
//		case 93 -> pasarLetra = "Noventa y tres";
//		case 94 -> pasarLetra = "Noventa y cuatro";
//		case 95 -> pasarLetra = "Noventa y cinco";
//		case 96 -> pasarLetra = "Noventa y seis";
//		case 97 -> pasarLetra = "Noventa y siete";
//		case 98 -> pasarLetra = "Noventa y ocho";
//		case 99 -> pasarLetra = "Noventa y nueve";
//		default -> System.out.println("El numero introducido no esta en el rango");
//
//		}
//		System.out.printf("El numero a es %d es y el pasar a palabra %s ", numero, pasarLetra);
//	}
//}

		
		//DIAPOSITIVA (2.17)
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		