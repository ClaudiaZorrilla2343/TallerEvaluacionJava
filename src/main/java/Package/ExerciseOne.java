package Package;

/**
 * Este programa nos permite declarar 2 variables númericas e indicar cual es la mayor de los dos, o si son iguales.
 * @author Claudia Zorrilla
 */
public class ExerciseOne {

    public static void main(String[] args) {
        Integer valueOne = 6;
        Integer valueTwo= 9;
        Integer biggerNumber;

        if (valueOne < valueTwo) {
            biggerNumber = valueTwo;
            System.out.println("El número mayor es: "+ biggerNumber);
        }else if (valueOne > valueTwo) {
            biggerNumber = valueOne;
            System.out.println("El número mayor es: "+biggerNumber);
        } else if (valueOne == valueTwo){
            System.out.println("Los dos números son iguales");
        }
    }
}
