package For1;

import java.util.Scanner;

/**
 * @author Steeven Lopez
 */

/*
 * Se desea conocer la tabla de multiplicar de un numero, con limite definido
 * por el usuario
 */
public class For1 {

	public static void main(String[] args) {
		// Declarar de variables
		Scanner teclado = new Scanner(System.in);
		int numero;
		int limite;
		int resultado;

		// Muestra en pantalla y recopilacion de datos
		System.out.println("----  Tabla de multiplicar de un numero definido por el usuario ---");
		System.out.print("Numero: ");
		numero = Integer.valueOf(teclado.nextLine());
		System.out.print("Limite: ");
		limite = Integer.valueOf(teclado.nextLine());
		System.out.println("\n\nTabla del " + numero + ", hasta el " + limite + "\n");

		// Implementacion del ciclo
		for (int i = 0; i <= limite; i++) {
			resultado = i * numero;
			System.out.println(numero + " x " + i + " = " + resultado);
		}
	}
}
