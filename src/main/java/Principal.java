import static java.lang.Integer.MAX_VALUE;

public class Principal {
    public static void main(String[] args) {

        // Crear participantes
        Participante participante1 = new Participante("Juan", Pronosticos.EMPATE, 1);
        Participante participante2 = new Participante("María", Pronosticos.LOCAL_GANO, 2);
        Participante participante3 = new Participante("Mario", Pronosticos.VISITANTE_GANO, 3);

        Participante participante4 = new Participante("Pupa", Pronosticos.EMPATE, 4);
        Participante participante5 = new Participante("Tamara", Pronosticos.LOCAL_GANO, 5);
        Participante participante6 = new Participante("Roberto", Pronosticos.VISITANTE_GANO, 6);
        Participante participante7 = new Participante("Sofia", Pronosticos.EMPATE, 7);
        Participante participante8 = new Participante("Mamita", Pronosticos.LOCAL_GANO, 8);


        Partido fecha1 = new Partido("Boca", "Francia", Pronosticos.LOCAL_GANO, 1);
        Partido fecha2 = new Partido("River", "Paris", Pronosticos.EMPATE, 2);
        Partido fecha3 = new Partido("Tirol", "Angela", Pronosticos.VISITANTE_GANO, 3);
        Partido fecha4 = new Partido("Roca", "Fontana", Pronosticos.EMPATE, 4);
        Partido fecha5 = new Partido("Fontana", "Roca", Pronosticos.EMPATE, 5);
        Partido fecha6 = new Partido("Angela", "Tirol", Pronosticos.VISITANTE_GANO,6);
        Partido fecha7 = new Partido("Paris", "River", Pronosticos.LOCAL_GANO, 7);
        Partido fecha8 = new Partido("Francia", "Boca", Pronosticos.EMPATE, 8);

        participante3(Pronosticos.VISITANTE_GANO,"")


        //

        //        this.participantes = new ArrayList<>(); llamo al constructor que me crea una lista de
        //        this.resultados = new HashMap<>();participantes y map con resultados
        //
        Prode campeonato = new Prode();
        campeonato.agregarParticipante(participante1);
        campeonato.agregarParticipante(participante2);
        campeonato.agregarParticipante(participante3);
        campeonato.agregarParticipante(participante4);
        campeonato.agregarParticipante(participante5);
        campeonato.agregarParticipante(participante6);
        campeonato.agregarParticipante(participante7);
        campeonato.agregarParticipante(participante8);
        campeonato.agregarResultado(fecha1, Pronosticos.LOCAL_GANO);
        campeonato.agregarResultado(fecha2, Pronosticos.VISITANTE_GANO);
        campeonato.agregarResultado(fecha3, Pronosticos.EMPATE);
        campeonato.agregarResultado(fecha4, Pronosticos.LOCAL_GANO);
        campeonato.agregarResultado(fecha5, Pronosticos.VISITANTE_GANO);
        campeonato.agregarResultado(fecha6, Pronosticos.EMPATE);
        campeonato.agregarResultado(fecha7, Pronosticos.LOCAL_GANO);
        campeonato.agregarResultado(fecha8, Pronosticos.VISITANTE_GANO);
        System.out.println(campeonato);

       // campeonato.mostrarResultados();
        campeonato.mostrarResultados();
        System.out.println("Este es el ganador con mayor puntaje: \n" + campeonato.obtenerGanador());
        campeonato.obtenerGanador();



    }

        // Crear pronósticos y
        //System.out.println("");
        //Pronosticos pronostico1 = Pronosticos.LOCAL_GANO;
       // Pronosticos pronostico2 = Pronosticos.EMPATE;
        //Pronosticos pronostico3 = Pronosticos.VISITANTE_GANO;


       // Pronosticos pronostico = new Pronosticos();
        //Partido partido = new Partido("BOCA", "Tirol", pronostico, 1);


}







