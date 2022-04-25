package Package.ExerciseSeventeen;

public class Television extends Electrodomestico{

    private  Integer resolucion = 20;
    private  Boolean sintonizadorTDT = false;

    public Television() {}

    public Television(Double precioBase, Integer peso) {
        super(precioBase, peso);
    }

    public Television(
            Colors colors,
            Double precioBase,
            Character consumoEnergetico,
            Integer peso)
    {
        super(colors, precioBase, consumoEnergetico, peso);
        this.resolucion = 20;
        this.sintonizadorTDT = false;
    }

    public Integer getResolucion() {
        return resolucion;
    }

    public Boolean getSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public Double precioFinal() {
        if (resolucion < 40) {
            Double incremento = precioBase * 0.40;
            return incremento;
        }else if (resolucion < 40 && (sintonizadorTDT)) {
            return precioBase = precioBase + 50.0;
        }
        return super.precioFinal();
    }
}
