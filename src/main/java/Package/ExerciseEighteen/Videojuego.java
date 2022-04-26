package Package.ExerciseEighteen;

public class Videojuego extends Base{
    private Integer horasEstimadas = 10;
    private String compañia = "";

    public Videojuego() {
    }

    public Videojuego(String titulo, Integer horasEstimadas) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
    }

    public Videojuego(String titulo, Integer horasEstimadas, String genero, String compañia) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.genero = genero;
        this.compañia = compañia;
    }

    public Integer getHorasEstimadas() {
        return horasEstimadas;
    }

    public Videojuego setHorasEstimadas(Integer horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
        return this;
    }

    public String getCompañia() {
        return compañia;
    }

    public Videojuego setCompañia(String compañia) {
        this.compañia = compañia;
        return this;
    }

    @Override
    public String toString() {
        return "Videojuego{" +
                "horasEstimadas=" + horasEstimadas +
                ", compañia='" + compañia + '\'' +
                ", titulo='" + titulo + '\'' +
                ", entregado=" + entregado +
                ", genero='" + genero + '\'' +
                '}';
    }

}
