import lombok.ToString;
import java.util.Comparator;
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
        //  Crear un map clave String valor int...
        HashMap<String, Integer> rondaParticipante = new HashMap<>();
        for (Participante participante : this.participantes) {
            int puntos = 0;
            String nom = participante.getNombre();
            Integer pronosticosParticipante = participante.getFecha();
            //System.out.println("Resultados para " + nom + ":");
            // Recorro el mapa de resultados
            for (Map.Entry<Partido, Pronosticos> entry : resultados.entrySet()) {
                Partido partido = entry.getKey();
                Pronosticos pronosticos = entry.getValue();
                //Comparo los resultados
                //Buscar en el map...el participante por nombre, obtener el valor y sumar uno
                for (Map.Entry<String,Integer> entry1 : rondaParticipante.entrySet()) {
                    nom = entry1.getKey();
                    pronosticosParticipante = entry1.getValue();
                    //
                    if (partido.getResultado() == participante.getMi_pronostico()) {
                        if (participante.getFecha() == (partido.getFecha()))
                            puntos++;
                            //System.out.println("Nombre del participante: " + nom + "Sus pronosticos: " + pronosticosParticipante + "Puntos obtenidos: " + puntos);
                    }
                    System.out.println("Nombre del participante: " + nom + "Sus pronosticos: " + pronosticosParticipante + "Puntos obtenidos: " + puntos);
                    System.out.println(partido.getEquipoLocal() + " vs " + partido.getEquipoVisitante() + " - " + participante.getMi_pronostico());
                    System.out.println("Puntos: " + puntos);
                }
            }
        }
    }
    public String obtenerGanador() {
        Participante ganador = null;
        int maxPuntos = Integer.MIN_VALUE;

        for (Participante participante : this.participantes) {
            int puntos = 0;

            for (Map.Entry<Partido, Pronosticos> entry : resultados.entrySet()) {
                Partido partido = entry.getKey();
                Pronosticos pronosticos = entry.getValue();

                if (partido.getResultado() == participante.getMi_pronostico()) {
                    if (participante.getFecha() == (partido.getFecha()))
                        puntos++;

                }
            }

            if (puntos > maxPuntos) {
                maxPuntos = puntos;
                ganador = participante;
                System.out.println("Ganador: "+ ganador +" Puntos obtenidos: " + puntos);
            }
        }

        return  "Ganador: "+ ganador +" Puntos obtenidos: " + maxPuntos;
    }

    @Override
    public String toString() {
        return "Prode " + '\n' +
                "Participantes: " + participantes + '\n' +
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







