package Package;

/**
 * Este programa imprime por consola los números pares e impares del 1 al 100 con el ciclo while
 * @author Claudia Zorrilla
 */
public class ExerciseFive {

    public void storeEvenNumbers() {
        int num = 1;
        int[] numPares = new int [50];
        int contadorPares = 0;

        while (num <=100) {

            if (num % 2 == 0) {
                numPares[contadorPares] = num;
                contadorPares = contadorPares + 1;
            }
            num = num + 1;
        }
        System.out.println("Los números pares son:");
        for (int i=0; i<numPares.length-1; i++){
            System.out.println(numPares[i]);
        }
    }

    public void storeOddNumbers() {
        int num = 1;
        int[] numImpares = new int [50];
        int contadorImpares = 0;

        while (num <=100){

            if(num % 2 == 1){
                numImpares[contadorImpares] = num;
                contadorImpares = contadorImpares +1;
            }
            num = num + 1;
        }

        System.out.println("Los números impares son:");
        for (int i=0; i<numImpares.length-1; i++){
            System.out.println(numImpares[i]);
        }

    }

    public static void main(String[] args) {
        ExerciseFive app = new ExerciseFive();
        app.storeEvenNumbers();
        app.storeOddNumbers();

    }
}
