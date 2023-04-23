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

        // Crear pronósticos y
        //System.out.println("");
        //Pronosticos pronostico1 = Pronosticos.LOCAL_GANO;
       // Pronosticos pronostico2 = Pronosticos.EMPATE;
        //Pronosticos pronostico3 = Pronosticos.VISITANTE_GANO;


       // Pronosticos pronostico = new Pronosticos();
        //Partido partido = new Partido("BOCA", "Tirol", pronostico, 1);
    //
        /**
    Scanner teclado = new Scanner(System.in);
    System.out.println("INGRESE El ARCHIVO DE LOS PARTIDOS: ");
    String b = teclado.nextLine();
    Path archivo = Paths.get(b);
    Scanner sc = new Scanner(archivo);
    sc.useDelimiter("[;\\n\\r]+");
    //sc.useDelimiter("[;\\n\\r]");
    //sc.useDelimiter("[;\\n]" );
    Campeonato campeonatoNuevo = new Campeonato();

        while (sc.hasNext()) {
        String local = sc.next();
        String visitante = sc.next();
        int fecha = sc.nextInt();
        Pronosticos resultado = Pronosticos.valueOf(sc.next());
        Partido nuevo = new Partido(local,visitante,fecha,Pronosticos.valueOf(String.valueOf(resultado)));
        campeonatoNuevo.agregarPartido(nuevo);

        System.out.println(nuevo);

    }
        sc.close();

        Scanner teclado2 = new Scanner(System.in);
        System.out.println("INGRESE El ARCHIVO DE LOS Pronósticos: ");
        String bb = teclado.nextLine();
        Path archivo2 = Paths.get(bb);
        Scanner sc2 = new Scanner(archivo2);
        sc2.useDelimiter("[;\\n\\r]+");
        //sc.useDelimiter("[;\\n\\r]");
        //sc.useDelimiter("[;\\n]" );
        Prode prodeNuevo = new Prode();

        while (sc2.hasNext()) {

            String nombre = sc.next();
            String resultados = sc.next();
            int fecha = sc.nextInt();
            Pronosticos resultado = Pronosticos.valueOf(sc.next());



            //String linea = lector.nextLine();  otro metodo!!
            //linea.split(";") split devuelve un vector



            System.out.println();

        }
        sc.close();
**/
        //ESTABLECER LA CONEXION
        Connection conector = DriverManager.getConnection("jdbc:mysql://localhost/Resultados", "root", "Placer2022");

        System.out.println(conector.isClosed() + "" + "--> Ak Pregunto si está cerrada la conexión? ");
        //obtener una sentencia
        Statement st = conector.createStatement();


        //ejecutar la consulta
        ResultSet rs = st.executeQuery("select * from partidos");//traeme todas las columnas de la tabla de personas
        //traeme todas las columnas
        // de la tabla personas
        //recorro la consulta
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




    }
























