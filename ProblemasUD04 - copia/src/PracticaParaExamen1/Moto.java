package PracticaParaExamen1;

public class Moto extends Vehiculo {
    public Moto(int velocidadMaxima) {
        super(velocidadMaxima);
    }

    @Override
    public void conducir() {
        super.conducir();
        System.out.println("esta conduciendo");

    }

    @Override
    public String tipoDeCombustible() {
        return "Gasolina";
    }
}
