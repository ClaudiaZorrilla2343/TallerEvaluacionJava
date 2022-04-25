package Package.ExerciseSeventeen;

public class Lavadora extends  Electrodomestico {

    private Integer carga;

    public  Lavadora() {}

    public Lavadora(Double precioBase, Integer peso) {
        super(precioBase, peso);
        this.carga = 5;
    }

    public Lavadora(
            Colors colors,
            Double precioBase,
            Character consumoEnergetico,
            Integer peso, Integer carga)
    {
        super(colors, precioBase, consumoEnergetico, peso);
        this.carga = 5;
    }

    public Integer getCarga() {
        return carga;
    }

    public Double precioFinal() {

        if(carga > 30) {
            precioBase = precioBase + 50;
            return precioBase;
        }
        return super.precioFinal();
    }

}
