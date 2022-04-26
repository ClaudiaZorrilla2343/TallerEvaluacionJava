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
        this.entregado = true;
    }

    @Override
    public void devolver() {
        this.entregado = false;
    }

    @Override
    public Boolean isEntregado() {
        return this.entregado;
    }

    @Override
    public Boolean compareTo(Object o) {
        Base base = (Base) o;
        return Objects.equals(this.titulo, base.titulo);
    }
}
