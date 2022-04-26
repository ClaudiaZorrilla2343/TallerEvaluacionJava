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
}
