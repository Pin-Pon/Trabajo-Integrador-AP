import lombok.ToString;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.*;
@ToString
//HAY QUE CABIAR EL TOsTRING SE VE MUY FEO
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
        // Recorro la lista de participantes
        // for (int i= 0 ; i<participantes.size()>; i++){
        //   System.out.println(" Estoy probando el for :" + participantes.get(i));
        for (Participante participante : this.participantes) {
            int puntosMayor= Integer.MAX_VALUE;
            int puntos = 0;
            String nom = participante.getNombre();

            System.out.println("Resultados para " + nom + ":");
            // Recorro el mapa de resultados
            for (Map.Entry<Partido, Pronosticos> entry : resultados.entrySet()) {
                Partido partido = entry.getKey();
                Pronosticos pronosticos = entry.getValue();
                //Comparo los resultados
                if (partido.getResultado() == participante.getMi_pronostico()) {

                    if (participante.getFecha() == (partido.getFecha()))
                    puntos++;


                    System.out.println("Felicitaciones usted  a ganado un punto");
                    System.out.println(partido.getEquipoLocal() + " vs " + partido.getEquipoVisitante() + " - " + participante.getMi_pronostico());
                    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                    System.out.println("Puntos: " + puntos);
                }
                else
                    System.out.println("No Gano nada vuelva a participar");
                    System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||");




                System.out.println("El jugador con más puntos es:  " + participante.getNombre() + " " + puntosMayor);
            }
        }
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







