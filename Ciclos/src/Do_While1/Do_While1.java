package Do_While1;

import java.util.Scanner;
/**
 * @author Steeven Lopez
 */

/*
 * Pedir al usuario un numero entre 1 y 5, si no es correcto volver a pedir el numero.
 */
public class Do_While1 {
	public static void main(String[] args) {
		int numero;
		Scanner teclado = new Scanner(System.in); 
		do {
			 System.out.println("Numero entre 1 y 5");
			numero = Integer.valueOf(teclado.nextLine());
		} while (numero<=1 ||numero>=5);
		teclado.close();
	}
}
