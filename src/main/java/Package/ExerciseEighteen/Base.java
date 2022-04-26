package Package.ExerciseEighteen;

public class Base {
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
}
