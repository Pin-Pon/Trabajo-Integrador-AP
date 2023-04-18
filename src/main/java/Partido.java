public class Partido {

    private int equipo1Goles;
    private int equipo2Goles;

    public Partido(int equipo1Goles, int equipo2Goles) {
        this.equipo1Goles = equipo1Goles;
        this.equipo2Goles = equipo2Goles;
    }

    public int getEquipo1Goles() {
        return equipo1Goles;
    }

    public void setEquipo1Goles(int equipo1Goles) {
        this.equipo1Goles = equipo1Goles;
    }

    public int getEquipo2Goles() {
        return equipo2Goles;
    }

    public void setEquipo2Goles(int equipo2Goles) {
        this.equipo2Goles = equipo2Goles;
    }

    @Override
    public String toString() {
        return "Partido{" +
                "equipo1Goles=" + equipo1Goles +
                ", equipo2Goles=" + equipo2Goles +
                '}';
    }


    Equipo equipo1 = new Equipo("Fontana","Los tanineros del barrio");
    Equipo equipo2 = new Equipo("Tirol", "Están todos locos");






}
