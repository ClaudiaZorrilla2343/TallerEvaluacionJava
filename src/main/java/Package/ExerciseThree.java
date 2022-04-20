package Package;

import javax.swing.*;

/**
 * Este programa nos permite calcular el area de un circulo indicandole por consola su radio
 * @author Claudia Zorrilla
 */
public class ExerciseThree {

    public static void main(String[] args) {
        String radioInput;
        double radio;
        double circleArea;


        radioInput = JOptionPane.showInputDialog("Ingrese el radio del circulo");
        radio = Double.parseDouble(radioInput);

        circleArea = Math.PI*Math.pow(radio,2);

        JOptionPane.showMessageDialog(null,"El area del circulo es: "+circleArea);
    }

}
