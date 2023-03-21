public class Pronostico {
    private Partido partido;
    private Equipo equipo;
    private ResultadoEnum resultadoPro;

    public Pronostico(Partido partido, Equipo equipo, ResultadoEnum resultadoPro) {
        this.partido = partido;
        this.equipo = equipo;
        this.resultadoPro = resultadoPro;
    }
    public Partido getPartido() {
        return partido;
    }
    public void setPartido(Partido partido) {
        this.partido = partido;
    }
    public Equipo getEquipo() {
        return equipo;
    }
    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public ResultadoEnum getResultadoPro() {
        return resultadoPro;
    }
    public void setResultadoPro(ResultadoEnum resultadoPro) {
        this.resultadoPro = resultadoPro;
    }

    public String toString() {
        return "Pronostico [partido=" + partido + ", equipo=" + equipo + ", resultadoPro=" + resultadoPro + "]";
    }

    public int selecPuntajes() {
        int puntos = 0;
        //Partido Equipo ResultadoEnum
        return puntos;
    }

}
