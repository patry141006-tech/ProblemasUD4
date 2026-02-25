package Problemas.EjerciciosTema5;

import java.util.Date;
import java.util.List;

public class Militares implements Aeronaves {
    BasesMilitares[] basesMilitares;
    List <Armamento> armamento ;
    Vuelos vuelo = new Vuelos();

    @Override
    public void aterrizar() {
        System.out.println("Estamos aterrizando");
        vuelo.setFechaLlegada(new Date());
    }

    @Override
    public void despegar() {
        System.out.println("Estamos despegando");
        vuelo.setFechaSalida(new Date());
    }

}
