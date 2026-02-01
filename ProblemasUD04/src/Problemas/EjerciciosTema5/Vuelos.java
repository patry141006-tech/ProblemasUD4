package Problemas.EjerciciosTema5;

import java.util.Date;

public class Vuelos {
    private Date fechaSalida;
    private Date fechaLlegada;

    public void tiempoVuelo() {
        long segundos = (fechaLlegada.getTime() - fechaSalida.getTime()) / 1000;
        System.out.println(segundos);
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public Date getFechaLlegada() {
        return fechaLlegada;
    }

    public void setFechaLlegada(Date fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }

}
