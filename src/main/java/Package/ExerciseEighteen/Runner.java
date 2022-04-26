package Package.ExerciseEighteen;

public class Runner implements ServicioRunner{

    @Override
    public void iniciar() {
        Json jsonObjects = new Json();
        entregar(jsonObjects);
        contar(jsonObjects);
        elementoSuperior(jsonObjects);
    }

    @Override
    public void entregar(Json json) {
        json.getSeries().get(1).entregable();
        json.getSeries().get(3).entregable();

        json.getVideojuegos().get(1).entregable();
        json.getVideojuegos().get(4).entregable();
    }

    @Override
    public void contar(Json json) {
        int contados = 0;

        for (Serie serie: json.getSeries()) {
            if(serie.isEntregado()) {
                contados += 1;
            }
        }

        for (Videojuego videojuego: json.getVideojuegos()) {
            if(videojuego.isEntregado()) {
                contados += 1;
            }
        }

        System.out.println("Hay " + contados + " entregados");
    }

    @Override
    public void elementoSuperior(Json json) {

    }
}
