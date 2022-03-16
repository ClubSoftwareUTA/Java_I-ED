/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clubejercicio;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class CalculadoraClaseCondicionales {

    //se desea realizar una calculadora con las 4 operaciones basicas 
    public static void main(String[] args) {
        float num1, num2, resultado = 0; // num1-> primer numero, num2-> segundo numero
        int op; //para la seleccion de la opcion
        boolean errorDivCero = false; //en caso de que sea una division para 0

        Scanner tecla = new Scanner(System.in);

        System.out.println("CALCULADORA SIMPLE");
        //pide el primero numero num2 guarda su valor en num1
        System.out.print("Primer Número: ");
        num1 = Float.valueOf(tecla.nextLine());
        //pide el segundo numero num2 guarda su valor en num2
        System.out.print("Segundo Número: ");
        num2 = Float.valueOf(tecla.nextLine());
        //muestra el menu
        System.out.printf("\n%10s%s\n%10s%s\n%10s%s\n%10s%s\n\n",
                "", "1.- Sumar",
                "", "2.- Restar",
                "", "3.- Multiplicar",
                "", "4.- Dividir");
        //pide que leccione una operacion num2 guarda su valor en op
        System.out.print("Opción(1-4): ");
        op = Integer.valueOf(tecla.nextLine());
        if (op < 1 || op > 4) {
            System.out.println("ERROR:  números válidos solo del 1 al 4...");
        }

        //aplica el condicional switch con la variable op
        switch (op) {
            case 1://suma
                resultado = num1 + num2;
                break;
            case 2://resta
                resultado = num1 - num2;
                break;
            case 3://multiplicacion
                resultado = num1 * num2;
                break;
            case 4://division
                if (num2 != 0) {//mientras el divisor sea diferenta de 0 se opera normalmente
                    resultado = num1 / num2;
                } else {//en caso de que sea una division para 0 
                    errorDivCero = true;//se activa el error cambiando su valor a verdadero
                }
                break;
        }

        if (errorDivCero == true) {//si existe un error muestra el mensaje
            System.out.println("--- No se puede realizar una división para 0 ---");
        } else {//si no hay errores muestra el resultado
            System.out.println("El resultado de la opeación es: " + resultado);
        }
    }
}
