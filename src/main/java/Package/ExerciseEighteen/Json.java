package Package.ExerciseEighteen;

import java.util.ArrayList;
import java.util.List;

import static Package.ExerciseEighteen.Serie.toSerie;
import static Package.ExerciseEighteen.Videojuego.toVideojuego;

public class Json {
    private final List<Serie> series;
    private final List<Videojuego> videojuegos;

    public Json() {
        series = new ArrayList<>();
        videojuegos = new ArrayList<>();

        series.addAll(toSerie(
                new Serie("Punto ciego", 4, "Misterio", "Cristopher Nolan"),
                new Serie("Palpito", 10, "Romantico", "Steven Spielberg"),
                new Serie("Archivos", 2, "Acción", "Martin Scorsese"),
                new Serie("La última noche", 6, "Terror", "Stanley Kubrick"),
                new Serie("Mariam", 8, "Suspenso", "Hayao Hitchcook")));

        videojuegos.addAll(toVideojuego(
                new Videojuego("Free fire", 200, "Battle Royale", "Sega"),
                new Videojuego("BTD6", 100, "BTD", "Annapurna"),
                new Videojuego("Spiderman", 700, "Moba", "Riot"),
                new Videojuego("Doom", 5, "Accion de muerte", "Sony"),
                new Videojuego("The last of", 2, "Ya se me fue la imaginacion", "Nintendo")));

    }

    public List<Serie> getSeries() {
        return series;
    }

    public List<Videojuego> getVideojuegos() {
        return videojuegos;
    }
}
