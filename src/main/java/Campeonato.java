import java.util.ArrayList;

public class Campeonato {
    private ArrayList<Partido> listaDePartidos;


    public Campeonato(){
        listaDePartidos = new ArrayList<>();
    }
    public void agregarPartido(Partido nuevo){
        listaDePartidos.add(nuevo);
    }




    public int cantidadFechas(){
        return listaDePartidos.size();

    }

    @Override
    public String toString() {
        return "Campeonato{" +
                "listaDePartidos=" + listaDePartidos +
                '}';
    }
}
