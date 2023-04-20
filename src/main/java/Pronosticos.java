public class Pronosticos {
    private String pronostico;

    public Pronosticos(String pronostico) {
        this.pronostico = pronostico;
    }

    public String getPronostico() {
        return pronostico;
    }

    public void setPronostico(String pronostico) {
        this.pronostico = pronostico;
    }

    @Override
    public String toString() {
        return "Pronosticos{" +
                "pronostico='" + pronostico + '\'' +
                '}';
    }
}
