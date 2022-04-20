package Package;

import java.util.Scanner;
import java.util.function.Function;

/**
 * Este programa nos permite eliminar los espacios de una cadena de texto leida por consola.
 * @author Claudia Zorrilla
 */

public class ExerciseTen {

    private Function<String, String> removeSpaces = x -> x.replaceAll(" ", "");

    public void print(Function<String, String> function, String value) {
        System.out.println(function.apply(value));
    }
    public static void main(String[] args) {

        ExerciseTen app = new ExerciseTen();

        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese la frase a eliminar espacios");
        String enteredPhrase = read.nextLine();

        app.print(app.removeSpaces, enteredPhrase);

    }
}
