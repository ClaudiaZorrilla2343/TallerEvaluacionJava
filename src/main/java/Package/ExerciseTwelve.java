package Package;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Este programa compara dos palabras ingresadas por teclado y muestra sus diferencias
 * @author Claudia Zorrilla
 */

public class ExerciseTwelve {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese la primer palabra");
        String wordOne = read.nextLine();
        System.out.println("Ingrese la segunda palabra");
        String wordTwo = read.nextLine();

        List<Character> characters = new ArrayList<>();


        if(wordOne.equals(wordTwo)){
            System.out.println("Las dos palabras son iguales");
        }else{
            System.out.println("Las dos palabras son dierentes");
        }

        if(wordOne.length() < wordTwo.length()){
            for (int i = 0; i < wordOne.length(); i++){
                if (wordOne.charAt(i) != wordTwo.charAt(i)){
                    characters.add(wordOne.charAt(i));
                }
            }
        }else if(wordOne.length() > wordTwo.length()){
            for (int i = 0; i <wordTwo.length(); i++){
                if (wordOne.charAt(i)!= wordTwo.charAt(i)){
                    characters.add(wordTwo.charAt(i));
                }
            }
        }else if (wordOne.length()==wordTwo.length()){
            for (int i = 0; i <wordOne.length(); i++){
                if (wordOne.charAt(i) != wordTwo.charAt(i)){
                    characters.add(wordTwo.charAt(i));
                }
            }
        }
        System.out.println("Son diferentes en los caracteres "+characters);

    }
}
