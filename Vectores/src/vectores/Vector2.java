package vectores;

/**
 * @author stee
 */
//ordenar vector de menor a mayor
public class Vector2 {

    public static void main(String[] args) {
        //declarar variables
        int[] vector = {-11,5, 8, -7, 1, 9, 3, 4,-10};
        
        int aux = Integer.MIN_VALUE;
        int cont = 0;

        //algoritmo
        for (int i = 0; i < vector.length; i++) {
            for (int j = i + 1; j < vector.length; j++) {
                cont++;
                if (vector[i]>vector[j]) {
                    aux = vector[i];
                    vector[i]=vector[j];
                    vector[j]=aux;
                }
            }
        }
        
       
        
        for (int number : vector) {
            System.out.print(number+", ");
        }
        System.out.println("contador = " + cont);
        
    }

}
