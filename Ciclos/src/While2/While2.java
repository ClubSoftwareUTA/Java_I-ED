package While2;

import java.util.Scanner;

/**
 *
 * @author Steeven Lopez
 */

/* programa que lee 10 calificaciones y muestra cuantos aprueban y cuantos no,
    se aprueba con calificaciones iguales o superiores a 7*/
public class While2 {

    public static void main(String[] args) {
        //Declarar variables
        Scanner teclado = new Scanner(System.in);
        int i = 1;
        float calificacion;
        int cantAprueba = 0;
        int cantReprueba = 0;

        //Implementacion ciclo
        while (i <= 10) {
            //Recoleccion de datos
            System.out.print("Calificacion " + i + ": ");
            calificacion = Float.valueOf(teclado.nextLine());

            //Condicional
            if (calificacion >= 7) {
                cantAprueba++;
            } else {
                cantReprueba++;
            }
            i++;
        }

        //Muestra de resultados
        System.out.println("\nHay " + cantAprueba + " calificaciones que aprueban y " + cantReprueba + " que reprueban");
    }
}
