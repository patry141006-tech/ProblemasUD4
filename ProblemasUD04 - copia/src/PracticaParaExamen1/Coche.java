package PracticaParaExamen1;

public class Coche extends Vehiculo {
    public Coche(int velocidadMaxima) {
        super(velocidadMaxima);
    }


    @Override
    public void conducir() {
        super.conducir();
        System.out.println("Esta conduciendo");
    }

    @Override
    public String tipoDeCombustible() {
        return "gasolina";
    }
}
