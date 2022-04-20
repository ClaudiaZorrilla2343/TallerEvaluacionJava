package Package;

import java.util.Scanner;

/**
 * Este programa nos permite conoces la longitud y el numero de vocales que se encuentran en una frase
 * @author Claudia Zorrilla
 */
public class ExerciseEleven {
    public static void main(String[] args) {

        int vowels= 0;
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String entry = read.nextLine();

        int entranceLength = entry.length();
        System.out.println("La frase tiene una longitud de: "+entranceLength);

        for (int i = 0; i<entry.length(); i++ ){
            char  vowel = entry.charAt(i);
            if (vowel == 'a' || vowel == 'e' || vowel == 'i' || vowel == 'o' || vowel =='u'){
                vowels++;
            }
        }
        System.out.println("La frase tiene "+vowels+ " vocales");
    }
}
