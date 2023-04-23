import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Integer.MAX_VALUE;

public class Principal {
    public Principal() throws IOException {
    }

    public static void main(String[] args) throws IOException {
/**
        // Crear participantes
        Participante participante1 = new Participante(1,"Juan", Pronosticos.EMPATE);
        Participante participante2 = new Participante(2,"María", Pronosticos.LOCAL_GANO);
        Participante participante3 = new Participante(3,"Mario", Pronosticos.VISITANTE_GANO);

        Participante participante4 = new Participante(4,"Pupa", Pronosticos.EMPATE);
        Participante participante5 = new Participante(5,"Tamara", Pronosticos.LOCAL_GANO);
        Participante participante6 = new Participante(6,"Roberto", Pronosticos.VISITANTE_GANO);
        Participante participante7 = new Participante(7,"Sofia", Pronosticos.EMPATE);
        Participante participante8 = new Participante(8,"Mamita", Pronosticos.LOCAL_GANO);


        Partido fecha1 = new Partido(1, "Francia", "Boca", Pronosticos.LOCAL_GANO);
        Partido fecha2 = new Partido(2, "Paris", "River", Pronosticos.EMPATE);
        Partido fecha3 = new Partido(3, "Angela","Tirol" , Pronosticos.VISITANTE_GANO);
        Partido fecha4 = new Partido(4, "Fontana",  "Roca",Pronosticos.EMPATE);
        Partido fecha5 = new Partido(5, "Roca", "Fontana", Pronosticos.EMPATE);
        Partido fecha6 = new Partido(6, "Tirol", "Angela",Pronosticos.VISITANTE_GANO);
        Partido fecha7 = new Partido(7, "River","Paris" , Pronosticos.LOCAL_GANO);
        Partido fecha8 = new Partido(8, "Boca", "Francia", Pronosticos.EMPATE);

        //

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
**/
        // Crear pronósticos y
        //System.out.println("");
        //Pronosticos pronostico1 = Pronosticos.LOCAL_GANO;
       // Pronosticos pronostico2 = Pronosticos.EMPATE;
        //Pronosticos pronostico3 = Pronosticos.VISITANTE_GANO;


       // Pronosticos pronostico = new Pronosticos();
        //Partido partido = new Partido("BOCA", "Tirol", pronostico, 1);
    //
    Scanner teclado = new Scanner(System.in);
    System.out.println("INGRESE El ARCHIVO DE LOS PARTIDOS: ");
    String b = teclado.nextLine();
    Path archivo = Paths.get(b);
    Scanner sc = new Scanner(archivo);
    sc.useDelimiter("[;\\n\\r]+");
    Campeonato campeonatoNuevo = new Campeonato();
        while (sc.hasNextInt()) {
        int fecha = sc.nextInt();
        String local = sc.next();
        String visitante = sc.next();
        resultado= sc.next();


            //String linea = lector.nextLine();  otro metodo!!
        //linea.split(";") split devuelve un vector

        Partido nuevo = new Partido(fecha,local,visitante,resultado);
        campeonatoNuevo.agregarPartido(nuevo);

        System.out.println(nuevo);
        sc.close();
    }
    }
}
















