package Package;

import java.util.Scanner;

/**
 * Este programa nos ofrece un ciclo hasta que el número ingresado por consola sea mayor o igual a cero.
 * @author Claudia Zorrilla
 */
public class ExerciseSeven {

    public static void main(String[] args) {

        try {
            Scanner read = new Scanner(System.in);
            Integer numberEntered;
            do {
                System.out.println("Ingrese el número a comparar");
                numberEntered = read.nextInt();
            } while (numberEntered != 0 || numberEntered >0);
            System.out.println("El número ingresado es: "+numberEntered);
        }catch (Exception e){
            System.out.println("¡ERROR!");
        }


    }

}
