package For2;

import java.util.Scanner;

/**
 * @author Steeven Lopez
 */
/*
 * Programa que lee un numero inicial y final,
 * posteriormente muestra los multiplos de 3, de 5 y cuantos hay en total de
 * cada uno
 */
public class For2 {

	public static void main(String[] args) {
		// declarar variables
		Scanner teclado = new Scanner(System.in);
		int numeroInicial;
		int numeroFinal;
		int cantMult3 = 0;
		int cantMult5 = 0;

		// Muestra en pantalla y recopilacion de datos
		System.out.println("----  Numeros multiplos de 3 y 5 entre 2 numero elegidos por el usuario ---");
		System.out.print("Numero inicial: ");
		numeroInicial = Integer.valueOf(teclado.nextLine());
		System.out.print("Numero final: ");
		numeroFinal = Integer.valueOf(teclado.nextLine());
		System.out.println("\n\nMultiplos de 3 y 5 entre " + numeroInicial + " y " + numeroFinal + "\n");

		// Implementacion del ciclo
		for (int i = numeroInicial; i <= numeroFinal; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				cantMult3++;
				cantMult5++;
				System.out.println(i + " es multiplo de 3 y 5 ");
			} else if (i % 3 == 0) {
				cantMult3++;
				System.out.println(i + " es multiplo de 3 ");
			} else if (i % 5 == 0) {
				cantMult5++;
				System.out.println(i + " es multiplo de 5 ");
			}
		}

		// Mostrar la cantidad de multiplos de 3 y 5
		System.out.println("Entre " + numeroInicial + " y " + numeroFinal + " existen "
				+ cantMult3 + " multiplos de 3 y "
				+ cantMult5 + " multiplos de 5");
	}

}
