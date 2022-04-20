package Package;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * Este programa nos permite leer dos variables por consola númericas e indicar cual es la mayor de los dos, o si son iguales.
 * @author Claudia Zorrilla
 */
public class ExerciseTwo {

    public static void main(String[] args) throws IOException {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(read);

        System.out.println("Ingrese el primer valor");
        String valueOne = buffer.readLine();
        Integer valueOnee = Integer.parseInt(valueOne);
        System.out.println("Ingrese el segundo valor");
        String valueTwo = buffer.readLine();
        Integer valueTwoo = Integer.parseInt(valueTwo);

        Integer biggerNumber;

        if (valueOnee < valueTwoo) {
            biggerNumber = valueTwoo;
            System.out.println("El número mayor es: "+ biggerNumber);
        }else if (valueOnee > valueTwoo) {
            biggerNumber = valueOnee;
            System.out.println("El número mayor es: "+biggerNumber);
        } else if (valueOne == valueTwo){
            System.out.println("Los dos números son iguales");
        }


    }
}
