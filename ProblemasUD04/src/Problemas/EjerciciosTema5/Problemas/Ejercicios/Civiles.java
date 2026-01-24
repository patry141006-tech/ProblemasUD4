package Problemas.EjerciciosTema5.Problemas.Ejercicios;

public class Civiles implements Aeronaves {
    int numMaxPasajeros;
    Aeropuertos[] aeropuertos;

    @Override
    public void aterrizar() {
        System.out.println("Estamos aterrizando");
    }

    @Override
    public void despegar() {
        System.out.println("Estamos despegando");
    }

}
