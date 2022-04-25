package Package.ExerciseSeventeen;

import java.util.ArrayList;
import java.util.List;

public class Main {

    static Double sumaElectrodomesticos = 0.0;
    static Double sumaLavadoras = 0.0;
    static Double sumaTelevisores = 0.0;

    public static void main(String[] args) {

        List<Electrodomestico> arrayElectrodomestico = new ArrayList<>();

        arrayElectrodomestico.add(new Television(83.0, 21));
        arrayElectrodomestico.add(new Electrodomestico(120.0, 50));
        arrayElectrodomestico.add(new Television(100.0, 80));
        arrayElectrodomestico.add(new Lavadora(200.0, 87));
        arrayElectrodomestico.add(new Electrodomestico(300.0, 21));
        arrayElectrodomestico.add(new Lavadora(78.0, 10));
        arrayElectrodomestico.add(new Lavadora(200.0, 40));
        arrayElectrodomestico.add(new Electrodomestico(56.0, 21));
        arrayElectrodomestico.add(new Electrodomestico(45.0, 36));
        arrayElectrodomestico.add(new Television(89.0, 78));


        for (int i = 0; i < arrayElectrodomestico.size(); i++) {
            sumaElectrodomesticos += arrayElectrodomestico.get(i).precioFinal();
        }

        for (int i = 0; i < arrayElectrodomestico.size(); i++) {
            Boolean sacarLavadoras = arrayElectrodomestico instanceof Lavadora;
            if (sacarLavadoras) {
                sumaLavadoras = sumaLavadoras + 1;
            }
        }

        for (int i = 0; i < arrayElectrodomestico.size(); i++) {
            Boolean sacarTV = arrayElectrodomestico instanceof Television;
            if (sacarTV) {
                sumaTelevisores = sumaTelevisores + 1;
            }
        }

    }


}
