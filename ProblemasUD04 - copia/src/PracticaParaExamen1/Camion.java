package PracticaParaExamen1;

public class Camion extends Vehiculo{
    private int capacidadCarga;

    public Camion (int velocidadMaxima, int capacidadCarga){
        super(velocidadMaxima);
        this.capacidadCarga= capacidadCarga;
    }

    @Override
    public String tipoDeCombustible() {
        // TODO Auto-generated method stub
        return "diesel";
    }

    @Override
    public void conducir() {
        // TODO Auto-generated method stub
        super.conducir();
        System.out.println("Transporta mercancias");
    }
    
}
