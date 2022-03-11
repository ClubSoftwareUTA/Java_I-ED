package vectores;

/**
 * @author Steeven
 */
// Usar los caracteres de una cadena para formar un vector de caracteres, e
// imprimir el vector
public class Vector1 {

	public static void main(String[] args) {
		// declarar variables
		String cadena = "Hola Mundo!";

		// algoritmo
		System.out.println(cadena.length());
		// char[] caracteres = new char[cadena.length()];
		// for (int i = 0; i < cadena.length(); i++) {
		// caracteres[i] = cadena.charAt(i);
		// }
		char[] caracteres = cadena.toCharArray();
		// impresion
		for (char caracter : caracteres) {
			System.out.println(caracter);
		}

	}
}
