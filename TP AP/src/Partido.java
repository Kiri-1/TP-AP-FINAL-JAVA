
public class Partido {
    private Equipo equipo1;
    private Equipo equipo2;
    private int golesEquipo1;
    private int golesEquipo2;

//Contructor
    public Partido(Equipo equipo1, Equipo equipo2, int golesEquipo1, int golesEquipo2) {
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.golesEquipo1 = golesEquipo1;
        this.golesEquipo2 = golesEquipo2;
    }
//Get and set
    public Equipo getEquipo1() {
        return equipo1;
    }

    public void setEquipo1(Equipo equipo1) {
        this.equipo1 = equipo1;
    }

    public Equipo getEquipo2() {
        return equipo2;
    }

    public void setEquipo2(Equipo equipo2) {
        this.equipo2 = equipo2;
    }

    public int getGolesEquipo1() {
        return golesEquipo1;
    }

    public void setGolesEquipo1(int golesEquipo1) {
        this.golesEquipo1 = golesEquipo1;
    }

    public int getGolesEquipo2() {
        return golesEquipo2;
    }

    public void setGolesEquipo2(int golesEquipo2) {
        this.golesEquipo2 = golesEquipo2;
    }

    //Metodo resultados de un partido
    public ResultadoEnum resultado(Equipo equipo) {
        String resultado="";
        if (this.equipo1 == equipo) {
            if (this.golesEquipo1 > this.golesEquipo2) {
                resultado="GANADOR1";
                return ResultadoEnum.GANADOR;
            } else {
                resultado="PERDEDOR1";
                return ResultadoEnum.PERDEDOR;
            }
        } else if (this.equipo2 == equipo) {
            if (this.golesEquipo1 < this.golesEquipo2) {
                resultado="GANADOR2";
                return ResultadoEnum.GANADOR;
            } else {
                resultado="PERDEDOR2";
                return ResultadoEnum.PERDEDOR;
            }
        }
        resultado="EMPATE";
        return ResultadoEnum.EMPATE;
    }
}