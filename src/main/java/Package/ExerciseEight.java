package Package;

import java.util.Optional;
import java.util.Scanner;

/**
 * Este programa nos permite ingresar un dia por consola y arrojarnos si es un día laboral o no.
 * @author Claudia Zorrilla
 */
public class ExerciseEight {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese un día de la semana");
        String dayEntered = read.nextLine();
        dayEntered = dayEntered.toUpperCase();


        try{
            switch (dayEntered){
                case "LUNES":
                    System.out.println("Es un día laboral");
                    break;
                case "MARTES":
                    System.out.println("Es un día laboral");
                    break;
                case "MIERCOLES":
                    System.out.println("Es un día laboral");
                    break;
                case "JUEVES":
                    System.out.println("Es un día laboral");
                    break;
                case "VIERNES":
                    System.out.println("No es un día laboral");
                    break;
                case "SABADO":
                    System.out.println("No es un día laboral");
                    break;
                case "DOMINGO":
                    System.out.println("No es un día laboral");
                    break;
                default:
                    System.out.println("Día inexistente");
            }
        }catch (Exception e){
            System.out.println("¡ERROR!");
        }

    }

}
