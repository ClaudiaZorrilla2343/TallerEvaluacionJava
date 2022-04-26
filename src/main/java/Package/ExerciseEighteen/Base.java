package Package.ExerciseEighteen;

import java.util.Objects;

public class Base implements Entregable{
    protected String titulo;
    protected String genero;
    protected Boolean entregado = false;

    public String getTitulo() {
        return titulo;
    }

    public Base setTitulo(String titulo) {
        this.titulo = titulo;
        return this;
    }

    @Override
    public void entregable() {

    }

    @Override
    public void devolver() {

    }

    @Override
    public Boolean isEntregado() {
        return null;
    }

    @Override
    public Boolean compareTo(Object o) {
        return null;
    }
}
