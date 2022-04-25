package Package.ExerciseSeventeen;

public class Television extends Electrodomestico {

    private Integer resolucion;
    private Boolean sintonizadorTDT;

    public Television() {
    }

    public Television(Double precioBase, Integer peso) {
        super(precioBase, peso);
        this.resolucion = 20;
        this.sintonizadorTDT = false;
    }

    public Television(
            Colors colors,
            Double precioBase,
            Character consumoEnergetico,
            Integer peso) {
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
        Double incremento = null;

        if (resolucion < 40) {
            incremento = precioBase * 0.40;
            incremento = precioBase + incremento;
            return incremento;

        } else if (resolucion < 40 && (sintonizadorTDT)) {
            incremento = incremento + 50;
            return incremento;
        }

        return super.precioFinal();
    }
}
