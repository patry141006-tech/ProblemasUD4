package PracticaParaExamen1;

public class CocheElectrico extends Vehiculo {
    private int autonomiaKm;

    public CocheElectrico(int velocidadMaxima, int autonomiaKm) {
        super(velocidadMaxima);
        this.autonomiaKm= autonomiaKm;
    }

    @Override
    public String tipoDeCombustible() {
        // TODO Auto-generated method stub
        return "Electrico";
    }

    @Override
    public void conducir() {
        // TODO Auto-generated method stub
        super.conducir();
        System.out.println("Conduciendo");
    }



}
