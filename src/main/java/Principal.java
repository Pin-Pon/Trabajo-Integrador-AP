public class Principal {
    public static void main(String[] args) {
        // Crear participantes
        Participante participante1 = new Participante("Juan");
        Participante participante2 = new Participante("María");
        Participante participante3 = new Participante("Pedro");




        // Crear competencia y agregar participantes

        //        this.participantes = new ArrayList<>(); llamo al constructor que me crea una lista de
        //        this.resultados = new HashMap<>();participantes y map con resultados
        //
        Prode campeonato = new Prode();
        campeonato.agregarParticipante(participante1);
        campeonato.agregarParticipante(participante2);
        campeonato.agregarParticipante(participante3);
        System.out.println(campeonato);

        // Crear pronósticos y
        System.out.println("");
        Pronosticos pronostico1 = Pronosticos.LOCAL_GANO;
        Pronosticos pronostico2 = Pronosticos.EMPATE;
        Pronosticos pronostico3 = Pronosticos.VISITANTE_GANO;


        Pronosticos pronostico = new Pronosticos(participante1.GANA_LOCAL, 2, 1);
        Partido partido = new Partido("BOCA", "Tirol", pronostico, 1);

    }
}






