package Package.ExerciseEighteen;

import java.util.Arrays;
import java.util.List;

public class Serie extends Base{

    private Integer numeroTemporada = 3;
    private String creador = "";

    public Serie() {}

    public Serie(String titulo, String creador) {
        this.titulo = titulo;
        this.creador = creador;
    }

    public Serie(String titulo, Integer numeroTemporada, String genero, String creador) {
        this.titulo = titulo;
        this.numeroTemporada = numeroTemporada;
        this.genero = genero;
        this.creador = creador;
    }

    public Integer getNumeroTemporada() {
        return numeroTemporada;
    }

    public Serie setNumeroTemporada(Integer numeroTemporada) {
        this.numeroTemporada = numeroTemporada;
        return this;
    }

    public String getCreador() {
        return creador;
    }

    public Serie setCreador(String creador) {
        this.creador = creador;
        return this;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "titulo='" + titulo + '\'' +
                ", numeroTemporada=" + numeroTemporada +
                ", entregado=" + entregado +
                ", genero='" + genero + '\'' +
                ", creador='" + creador + '\'' +
                '}';
    }

    public static List<Serie> toSerie(Serie... series) {
        return Arrays.stream(series).toList();
    }

    public Boolean compareTo(Object o) {
        Serie serie = (Serie) o;
        return this.numeroTemporada.equals(serie.numeroTemporada);
    }

}
