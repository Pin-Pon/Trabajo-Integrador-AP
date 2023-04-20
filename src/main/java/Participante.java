import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//@AllArgsConstructor
//@Getter
//@Setter
@ToString

public class Participante {
    private String nombre;

    private Pronosticos mi_pronostico;
    private int fecha;

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

    public Participante(String nombre, Pronosticos mi_pronostico, int fecha) {
        this.nombre = nombre;
        this.mi_pronostico = mi_pronostico;
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    //HACER EL METODO DE AGREGAR RESULTADO AL MAP
   // public void agregaraResultado(Pronosticos pronostico) {
     //   return; Participante
    }

