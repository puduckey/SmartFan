public class Estadistica {
    int fecha;
    String horaInicio, horaFin;
    int cliclos;
    float tPromedio;
    float consumo;

    public Estadistica(int fecha, String horaInicio, String horaFin, int cliclos, float tPromedio, float consumo) {
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.cliclos = cliclos;
        this.tPromedio = tPromedio;
        this.consumo = consumo;
    }

    public int getFecha() {
        return fecha;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public String getHoraFin() {
        return horaFin;
    }

    public int getCliclos() {
        return cliclos;
    }

    public float gettPromedio() {
        return tPromedio;
    }

    public float getConsumo() {
        return consumo;
    }
}
