import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.*;

public class Prode {
    private final List<Participante> participantes;
    private final Map<Partido, Pronosticos> resultados;


    public Prode() {
        this.participantes = new ArrayList<>();
        this.resultados = new HashMap<>();
    }

    public void agregarParticipante(Participante participante) {
        participantes.add(participante);
    }

    public void agregarResultado(Partido partido, Pronosticos pronostico) {
        resultados.put(partido, pronostico);
    }






    public void calcularPuntos() {
        for (Participante participante : participantes) {
            int puntos = 0;
            for (String partido : resultados.keySet()) {
                String resultado = resultados.get(partido);
                int pronostico = participante.getPuntos();

//esta linea del for no le gusta al intellij
                if () {
                } else {
                    int i = puntos++;
                }
            }
            participante.sumarPuntos(puntos);
        }
    }


    public void mostrarResultados() {
        Collections.sort(participantes, new Comparator<Participante>() {
            @Override
            public int compare(Participante p1, Participante p2) {
                return p2.getPuntos() - p1.getPuntos();
            }
        });

        System.out.println("Resultados:");
        int posicion = 1;
        for (Participante participante : participantes) {
            System.out.println(posicion + ". " + participante.getNombre() + ": " + participante.getPuntos() + " puntos");
            posicion++;
        }
    }

    }
}

