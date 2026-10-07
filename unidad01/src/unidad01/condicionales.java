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
		
		//DIAPOSITIVA 96
		
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
		
		//DIAPOSITIVA 99
		
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
		
		//DIAPOSITIVA 100
		
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
		
		//DIAPOSITIVA 103 IF-ELSE
		
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
		
		//DIAPOSITIVA 104
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
		
		//DIAPOSITIVA 113
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingresa el primer numero");
		double primerNumero = scanner.nextDouble();
		System.out.println("Ingresa el segundo numero");
		double segundoNumero = scanner.nextDouble();
		System.out.print("Ingresar operador(-,+,*,/): ");
        String operador = scanner.next();
        switch (operador) {
		case "-": 
			System.out.printf("El resultado es %.2f \n",(primerNumero-segundoNumero));
			break;
		case "+":
			System.out.printf("El resultado es %.2f \n",(primerNumero+segundoNumero));
			break;
		case "*":
			System.out.printf("El resultado es %.2f \n",(primerNumero*segundoNumero));
			break;
		case "/":
			System.out.printf("El resultado es %.2f \n",(primerNumero*1.0/segundoNumero));
			break;

		default:
				System.out.println("El operador no es valido");
			}
        }
	
	
	
	
	
	}


