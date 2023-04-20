public class ResultadoPartidos {
    private String resultado;

    public ResultadoPartidos(String resultado) {
        this.resultado = resultado;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    @Override
    public String toString() {
        return "ResultadoPartidos{" +
                "resultado='" + resultado + '\'' +
                '}';
    }
}
