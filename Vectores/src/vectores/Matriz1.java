package vectores;

/**
 * @author stee
 */
// usando matrices mostrar todas las combinaciones de nombres en la matriz
public class Matriz1 {

	public static void main(String[] args) {
		// declarar variables
		String[][] nombres = {
				{ "Juan", "Marcelo", "Maria" },
				{ "Lopez", "Martinez", "Saquinga", "Caicedo" }
		};
		// Juan Lopez
		System.out.println(nombres[0][0] + " " + nombres[1][0]);
		// Maria Martinez
		System.out.println(nombres[0][2] + " " + nombres[1][1]);

		// algoritmo
		for (int i = 0; i < nombres[0].length; i++) {
			for (int j = 0; j < nombres[1].length; j++) {
				System.out.println("Nombres: " + nombres[0][i] + " " + nombres[1][j]);
			}
		}
	}
}
