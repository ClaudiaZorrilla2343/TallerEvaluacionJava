package Package.ExerciseEighteen;

public class Serie extends Base{

    private Integer numeroTemporadas = 3;
    private String creador = "";

    public Serie() {}

    public Serie(String titulo, String creador) {
        this.titulo = titulo;
        this.creador = creador;
    }

    public Serie(String titulo, Integer numeroDeTemporadas, String genero, String creador) {
        this.titulo = titulo;
        this.numeroTemporadas = numeroDeTemporadas;
        this.genero = genero;
        this.creador = creador;
    }
}
