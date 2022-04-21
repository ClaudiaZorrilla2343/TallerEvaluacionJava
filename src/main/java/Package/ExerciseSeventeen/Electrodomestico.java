package Package.ExerciseSeventeen;

import java.util.Objects;
import java.util.Scanner;

public class Electrodomestico {
    protected Integer precioBase = 100;
    protected Character consumoEnergetico = 'F';
    protected Integer peso = 5;

    private Colors colors;

    public Electrodomestico() {
    }

    public Electrodomestico(Integer precioBase, Integer peso) {
        this.precioBase = Objects.requireNonNull(precioBase);
        this.peso = Objects.requireNonNull(peso);
    }

    public Electrodomestico(
            Colors colors,
            Integer precioBase,
            Character consumoEnergetico,
            Integer peso)
    {
        this.colors = colors;
        this.precioBase = Objects.requireNonNull(precioBase);
        this.consumoEnergetico = Objects.requireNonNull(consumoEnergetico);
        this.peso = Objects.requireNonNull(peso);
    }

    Scanner read = new Scanner(System.in);

    public enum Colors {
        BLANCO,
        NEGRO,
        ROJO,
        AZUL,
        GRIS
    }

    public Integer getPrecioBase() {
        return precioBase;
    }

    public Character getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public Integer getPeso() {
        return peso;
    }

    public Colors getColors() {
        return colors;
    }

    public Integer comprobarConsumoEnergetico(Character consumoEnergetico) {

        try {
            switch (consumoEnergetico) {
                case 'A':
                    precioBase = precioBase + 100;
                    break;
                case 'B':
                    precioBase = precioBase + 80;
                    break;
                case 'C':
                    precioBase = precioBase + 60;
                    break;
                case 'D':
                    precioBase = precioBase + 50;
                    break;
                case 'E':
                    precioBase = precioBase + 30;
                    break;
                case 'F':
                    precioBase = precioBase + 10;
                    break;
                default:
                    precioBase = precioBase + 10;
                    consumoEnergetico = 'F';
                    break;
            }
        }catch (Exception e){
            System.out.println("¡ERROR!");
        }

        return precioBase;
    }

    public void comprobarColor() {
        try {

            System.out.println("Colores disponibles para los electrodomesticos");
            Colors[] eleccion = Colors.values();
            for (int i = 0; i < eleccion.length; i++) {
                System.out.println((i + 1)+") "+eleccion[i]);
            }
            System.out.println("Elige el color");
            Integer opcionUsuario = read.nextInt();

            Colors valorColor = eleccion[opcionUsuario-1];
            System.out.println("El color seleccionado fue: "+valorColor);

        }catch (Exception e){
            System.out.println("¡ERROR!");
        }
    }

    public Integer precioFinal() {

        System.out.println("Ingrese la letra del consumo energetico");
        consumoEnergetico = read.nextLine().charAt(0);
        comprobarConsumoEnergetico(consumoEnergetico);

        if (peso >= 0 && peso < 20) {
            precioBase = precioBase + 10;
        }else if(peso >= 20 && peso < 50) {
            precioBase = precioBase + 50;
        }else if (peso >= 50 && peso < 80) {
            precioBase = precioBase + 80;
        }else if (peso >= 80) {
            precioBase = precioBase + 100;
        }
        Integer precioFinal = precioBase + precioBase;
        return precioFinal;
    }
}
