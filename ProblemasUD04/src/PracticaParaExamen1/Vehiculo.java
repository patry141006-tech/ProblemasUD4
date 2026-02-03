package PracticaParaExamen1;

public abstract class Vehiculo implements Conducible {
    private int velocidadMaxima;

    public void conducir() {
    }

    public Vehiculo(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public int getVelocidadMaxima() {
        return this.velocidadMaxima;
    }

    public abstract String tipoDeCombustible();

    public void mostrarInformacionBasico() {
        System.out
                .println("tipo de vehiculo: " + getClass().getCanonicalName() + velocidadMaxima + tipoDeCombustible());
    }

}
