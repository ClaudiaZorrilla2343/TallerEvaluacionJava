package Package;

/**
 Este programa imprime por consola los números pares e impares del 1 al 100 con el ciclo for
 * @author Claudia Zorrilla
 */
public class ExerciseSix {

    public static void main(String[] args) {

        int[] pairNumbers = new int [50];
        int pairCounter = 0;
        int[] OddNumbers = new int [50];
        int oddCounter = 0;

        for (int i=1; i<=100; i++){
            if (i % 2 == 0){
                pairNumbers[pairCounter] = i;
                pairCounter = pairCounter + 1;
            }else if(i % 2 == 1){
                OddNumbers[oddCounter] = i;
                oddCounter = oddCounter +1;
            }
        }

        System.out.println("Los números pares son:");
        for (int i=0; i<pairNumbers.length-1; i++){
            System.out.println(pairNumbers[i]);
        }
        System.out.println("Los números impares son:");
        for (int i=0; i<OddNumbers.length-1; i++){
            System.out.println(OddNumbers[i]);
        }
    }

}
