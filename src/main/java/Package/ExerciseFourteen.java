package Package;

import java.util.Scanner;

/**
 * Este programa nos permite mostrar los números del 1 hasta el 1000 a partir del número ingresado por consola con saltos de 2
 * @author Claudia Zorrilla
 */
public class ExerciseFourteen {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int value =  read.nextInt();

        for (int i = value; i < 1000; i++ ){
            System.out.println(i);
            i = i + 1;
        }
    }
}
