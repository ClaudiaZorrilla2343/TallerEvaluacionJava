package Package;

/**
 Este programa imprime por consola los números pares e impares del 1 al 100 con el ciclo for
 * @author Claudia Zorrilla
 */
public class ExerciseSix {

    public static void main(String[] args) {

        int[] numPares = new int [50];
        int contadorPares = 0;
        int[] numImpares = new int [50];
        int contadorImpares = 0;

        for (int i=1; i<=100; i++){
            if (i % 2 == 0){
                numPares[contadorPares] = i;
                contadorPares = contadorPares + 1;
            }else if(i % 2 == 1){
                numImpares[contadorImpares] = i;
                contadorImpares = contadorImpares +1;
            }
        }

        System.out.println("Los números pares son:");
        for (int i=0; i<numPares.length-1; i++){
            System.out.println(numPares[i]);
        }
        System.out.println("Los números impares son:");
        for (int i=0; i<numImpares.length-1; i++){
            System.out.println(numImpares[i]);
        }
    }

}
