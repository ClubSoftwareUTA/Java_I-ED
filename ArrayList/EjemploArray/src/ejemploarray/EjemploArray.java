package ejemploarray;

import java.util.ArrayList;
import java.util.Scanner;

public class EjemploArray {

    public static void main(String[] args) {
        //Declaración de variables
        String nombre,aux;
        ArrayList<String> estudiantes = new ArrayList<String>();
        Scanner teclado = new Scanner(System.in);

        // Procedimiento (Obtención de datos)
        do {
            System.out.println("Ingrese un nombre: ");
            nombre = teclado.nextLine();
            estudiantes.add(nombre); //Añadir el nombre a la lista
            //Control de ingreso de datos
            do{
            System.out.println("Desea ingresar otro estudiante (S/N):");
            aux=teclado.nextLine();
            if(!(aux.equalsIgnoreCase("S"))&& !(aux.equalsIgnoreCase("N"))){
                System.out.println("Valores Permitidos: S O N");
            }
            }while( !(aux.equalsIgnoreCase("S"))&& !(aux.equalsIgnoreCase("N")));
            
        } while (aux.equalsIgnoreCase("S"));
        
        System.out.println("Listado");
        
        // Impresión de datos
        for(int i = 0;i<estudiantes.size();i++){
            System.out.println(estudiantes.get(i));
        }
        

    }

}
