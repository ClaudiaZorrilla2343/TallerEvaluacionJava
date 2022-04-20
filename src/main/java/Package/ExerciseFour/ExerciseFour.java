package Package.ExerciseFour;

import javax.swing.*;

/**
 * Este programa nos permite calcular el iva del valor de un producto ingresado por consola
 * @author Claudia Zorrilla
 */
public class ExerciseFour {

    public double finalPrice() {

        String price = JOptionPane.showInputDialog("Ingrese el precio del producto");
        Double priceProduct = Double.parseDouble(price);

        final double valueIVA = 0.21;

        IVA iva = (double x) -> ((x * valueIVA)+ x);

        return iva.calculateIVA(priceProduct);
    }

    public static void main(String[] args) {
        ExerciseFour app = new ExerciseFour();
        System.out.println("El precio a pagar incluido con iva es: "+app.finalPrice());


    }
}
