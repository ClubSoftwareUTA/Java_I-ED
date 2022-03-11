package While1;

import java.util.Scanner;

/*
 * @author Steeven Lopez
 */

/* Se desea conocer desea conocer el factorial de un número ingresado por el usuario */
public class While1 {

	public static void main(String[] args) {
		// Declarar variables
		Scanner teclado = new Scanner(System.in);
		int i = 0;
		int factorial = 1;
		int numero;

		// Muestra en pantalla y recopilacion de datos
		System.out.println("----  Factorial de un numero ---");
		System.out.print("Numero: ");
		numero = Integer.valueOf(teclado.nextLine());

		// Implementacion del ciclo
		while (i < numero) {
			i++;
			factorial = factorial * i;
		}

		// Mostrar los resultados
		System.out.println("El factorial de " + numero + " es " + factorial);
	}

}
