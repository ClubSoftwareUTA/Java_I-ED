package For3;

import java.util.Scanner;

/**
 * @author Steeven Lopez
 */
/*
 * Se desea conocer las tablas de multiplicar de un rango de numeros, con limite
 * definido por el usuario
 */
public class For3 {

	public static void main(String[] args) {
		// Declarar de variables
		Scanner teclado = new Scanner(System.in);
		int numeroInicial;
		int numeroFinal;
		int limite;
		int resultado;

		// Muestra en pantalla y recopilacion de datos
		System.out.println("----  Tablas de multiplicar de un rango de numeros definidos por el usuario ---");
		System.out.print("Numero inicial: ");
		numeroInicial = Integer.valueOf(teclado.nextLine());
		System.out.print("Numero final: ");
		numeroFinal = Integer.valueOf(teclado.nextLine());
		System.out.print("Limite: ");
		limite = Integer.valueOf(teclado.nextLine());
		System.out.println("\n\nTablas del " + numeroInicial + ", hasta el " + numeroFinal
				+ " con un limite de " + limite + "\n");

		// Implementacion de los ciclos con tablas impresas de forma vertical
		for (int j = numeroInicial; j <= numeroFinal; j++) {
			for (int i = 0; i <= limite; i++) {
				resultado = i * j;
				System.out.println(j + " x " + i + " = " + resultado);
			}
			System.out.println("");
		}
		teclado.close();
	}

}
