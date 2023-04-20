import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.HashMap;


public class Partido {
    private String equipoLocal;
    private String equipoVisitante;
    private Pronosticos resultado;
    private int fecha;

    public Partido(String equipoLocal, String equipoVisitante, Pronosticos resultado, int fecha) {
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.resultado = resultado;
        this.fecha = fecha;
    }
    // public Partido(String equipoLocal, String equipoVisitante,Pronosticos resultado, int fecha) {
   //     this.equipoLocal = equipoLocal;
   //     this.equipoVisitante = equipoVisitante;
   //     this.fecha = fecha;
   // }

    public String getEquipoLocal() {
        return equipoLocal;
    }

    public String getEquipoVisitante() {
        return equipoVisitante;
    }



    public int getFecha() {
        return fecha;
    }
}
