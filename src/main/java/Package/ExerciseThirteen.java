package Package;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Este programa nos permite consultar la fecha y hora actual
 * @author Claudia Zorrilla
 */
public class ExerciseThirteen {
    public static void main(String[] args) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println("AAAA/MM/DD HH:MM:SS "+dateTimeFormatter.format(LocalDateTime.now()));

    }
}
