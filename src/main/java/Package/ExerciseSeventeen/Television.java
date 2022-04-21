package Package.ExerciseSeventeen;

public class Television extends Electrodomestico{

    private  Integer resolucion = 20;
    private  Boolean sintonizadorTDT = false;

    public Television() {}

    public Television(Integer precioBase, Integer peso) {
        super(precioBase, peso);
    }

    public Television(
            Colors colors,
            Integer precioBase,
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

    public Integer precioFinal() {
        if (resolucion < 40) {
            //TODO falta logica
        }else if (resolucion < 40 && (sintonizadorTDT)) {
            return precioBase = precioBase + 50;
        }
        return super.precioFinal();
    }
}
