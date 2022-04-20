package Package;

import java.util.function.Function;

/**
 * Este programa nos permite reemplazar la vocal a por e de una cadena de texto ya dada.
 * @author Claudia Zorrilla
 */
public class ExerciseNine {

    private Function<String, String> convert = x -> x.replaceAll("a", "e");
    private Function<String, String> concatenate = x -> x.concat("se sonriente y mantente feliz");

    public void print(Function<String, String> function, String value) {
        System.out.println(function.apply(value));
    }
    public static void main(String[] args) {

        ExerciseNine app = new ExerciseNine();
        String initialText = "La sonrisa sera la mejor arma contra la tristeza";
        app.print(app.convert, initialText);
        app.print(app.concatenate, "");

    }

}
