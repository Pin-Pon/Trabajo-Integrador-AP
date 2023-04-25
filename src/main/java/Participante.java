import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//@AllArgsConstructor
//@Getter
//@Setter
//@ToString
//HAY QUE CABIAR EL TOsTRING SE VE MUY FEO
public class Participante {
    private int fecha;
    private String nombre;

    private Pronosticos mi_pronostico;


    public Pronosticos getMi_pronostico() {
        return mi_pronostico;
    }

    public void setMi_pronostico(Pronosticos mi_pronostico) {
        this.mi_pronostico = mi_pronostico;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public Participante(int fecha, String nombre, Pronosticos mi_pronostico) {
        this.fecha = fecha;
        this.nombre = nombre;
        this.mi_pronostico = mi_pronostico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "********Participantes************ \n" +
                "Nombre: " + nombre + '\n' +
                "Mi pronostico: " + mi_pronostico + '\n' +
                "Fecha: " + fecha + '\n' ;
    }


    //HACER EL METODO DE AGREGAR RESULTADO AL MAP
   // public void agregaraResultado(Pronosticos pronostico) {
     //   return; Participante
    }

