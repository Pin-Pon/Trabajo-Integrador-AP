import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//@AllArgsConstructor
//@Getter
//@Setter
//@ToString

public class Participante {
    private String nombre;


    public Participante(String nombre) {
        this.nombre = nombre;

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

