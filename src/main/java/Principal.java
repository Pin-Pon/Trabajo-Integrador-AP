import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

import static java.lang.Integer.MAX_VALUE;

public class Principal {


    public static void main(String[] args) throws IOException, SQLException {



        Scanner teclado = new Scanner(System.in);
        System.out.println("INGRESE El ARCHIVO DE LOS PARTIDOS: ");
        String b = teclado.nextLine();
        Path archivo = Paths.get(b);
        Scanner sc = new Scanner(archivo);
        sc.useDelimiter("[;\\n\\r]+");
        ;
        //Partido partidoNuevo = new Partido();
        Prode prodeNuevo = new Prode();

        while (sc.hasNext()) {
            String local = sc.next();
            String visitante = sc.next();
            int fecha = sc.nextInt();
            Pronosticos resultado = Pronosticos.valueOf(sc.next());
            Partido nuevo = new Partido(local, visitante, fecha, Pronosticos.valueOf(String.valueOf(resultado)));
            prodeNuevo.agregarResultado(nuevo, resultado);
            System.out.println(nuevo);

        }

        sc.close();

        System.out.println("LECTURA ARCHIVO PRONOSTICOS.TXT");
        Scanner teclado2 = new Scanner(System.in);
        System.out.println("INGRESE El ARCHIVO DE LOS Pronósticos: ");
        String bb = teclado2.nextLine();
        Path archivo2 = Paths.get(bb);
        Scanner sc2 = new Scanner(archivo2);
        sc2.useDelimiter("[;\\n\\r]+");



        while (sc2.hasNextInt()) {
            int participanteFecha = sc2.nextInt();
            String participanteNombre = sc2.next();
            Pronosticos participanteResultados = Pronosticos.valueOf(sc2.next());
            prodeNuevo.agregarParticipante(new Participante(participanteFecha,participanteNombre,participanteResultados));

        }
        sc2.close();
        prodeNuevo.mostrarResultados();
        System.out.println(prodeNuevo.obtenerGanador());

    }
}
        /**
        //CONEXIÓN CON LA BASE DE DATOS...

        //ESTABLECER LA CONEXION
        Connection conector = DriverManager.getConnection("jdbc:mysql://localhost/Resultados", "root", "Placer2022");
        System.out.println(conector.isClosed() + "" + "--> Ak Pregunto si está cerrada la conexión? ");

        //obtener una sentencia
        Statement st = conector.createStatement();


        //ejecutar la consulta
        ResultSet rs = st.executeQuery("select * from partidos");//traeme todas las columnas

        while (rs.next()){
            int ronda = rs.getInt("fecha");
            String nomLocal = rs.getString("local");
            String nomVisitante = rs.getString("visitante");
            String resul = rs.getString("resultado");

            System.out.println("Fecha N°: " + ronda + " | " + nomLocal + " vs " + nomVisitante + " ==> " + resul);

        }



        //cerrar
        rs.close();
        conector.close();



        }

**/



























