package Package.ExerciseSeventeen;

public class Lavadora extends  Electrodomestico {

    private Integer carga;

    public  Lavadora() {}

    public Lavadora(Integer precioBase, Integer peso) {
        super(precioBase, peso);
    }

    public Lavadora(
            Colors colors,
            Integer precioBase,
            Character consumoEnergetico,
            Integer peso, Integer carga)
    {
        super(colors, precioBase, consumoEnergetico, peso);
        this.carga = carga;
    }

    public Integer getCarga() {
        return carga;
    }

    public Integer precioFinal() {

        if(carga > 30) {
            precioBase = precioBase + 50;
            return precioBase;
        }
        return super.precioFinal();
    }

}
