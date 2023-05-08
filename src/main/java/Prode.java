import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.*;
//@ToString
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


    public void mostrarResultados() {
        // Crear un map clave String valor int...
        HashMap<String, Integer> rondaParticipante = new HashMap<>();
        for (Participante participante : this.participantes) {
            int puntos = 0;
            String nom = participante.getNombre();
            for (Map.Entry<Partido, Pronosticos> entry : resultados.entrySet()) {
                Partido partido = entry.getKey();
                Pronosticos pronosticos = entry.getValue();
                // Comparo los resultados
                rondaParticipante.put(nom, puntos);
                if (pronosticos  == participante.getMi_pronostico()) {
                    if (participante.getFecha() == (partido.getFecha())) {
                        puntos++;
                    }
                }
            }
                }
        for (Map.Entry<String, Integer> entry3 : rondaParticipante.entrySet()) {
            System.out.println("El Participante: " + entry3.getKey() + " Obtuvo: " + entry3.getValue() + "puntos");
        }
            }
     //   for (Map.Entry<String, Integer> entry3 : rondaParticipante.entrySet()) {
       //     System.out.println(entry3.getKey() + entry3.getValue());
    public String obtenerGanador() {
        Participante ganador = null;
        int maxPuntos = Integer.MIN_VALUE;

        for (Participante participante : this.participantes) {
            int puntos = 0;

            for (Map.Entry<Partido, Pronosticos> entry : resultados.entrySet()) {
                Partido partido = entry.getKey();
                Pronosticos pronosticos = entry.getValue();
                if (pronosticos == participante.getMi_pronostico()) {
                    if (participante.getFecha() == (partido.getFecha()))
                        puntos++;

                }
            }

            if (puntos > maxPuntos) {
                maxPuntos = puntos;
                ganador = participante;
                System.out.println("Ganador: \n" + ganador + " Puntos obtenidos: " + puntos);
            }
        }
        return "Ganador: " + ganador + " Puntos obtenidos: " + maxPuntos;


    }

    @Override
    public String toString() {
        return "Prode: " +
                "Participantes: " + participantes +
                "Resultados: " + resultados ;
    }
}












    /**

    /**
     public float total(){
     //float suma = 0;

     //for (Item it: items.values())
     // suma += it.subtotal();
     return (float) items.values().stream().
     mapToDouble(Item::subtotal).
     sum();
     }
     public ArrayList<Persona> buscarPorNombre(String nombre) {
     ArrayList<Persona> encontradas = new ArrayList<>();

     for (Persona p : personas.values()) {
     if (p.getNombre().equals(nombre)) {
     encontradas.add(p);
     }
     }
     return encontradas;
     // return personas.values().stream().filter(persona -> persona.getNombre().equals(nombre)).toList();  FUNCIONAL
     }
     **/







