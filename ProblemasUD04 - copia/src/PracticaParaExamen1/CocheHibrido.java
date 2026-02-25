package PracticaParaExamen1;

public class CocheHibrido extends Vehiculo{
    private int autonomiaElectricaKm;
    private int autonomiaCombustionKm;
    
    public CocheHibrido (int velocidadMaxima, int autonomiaCombustionKm, int autonomiaElectricaKm){
        super(velocidadMaxima);
        this.autonomiaCombustionKm= autonomiaCombustionKm;
        this.autonomiaElectricaKm=autonomiaElectricaKm;
    }
    
    @Override
    public String tipoDeCombustible() {
        // TODO Auto-generated method stub
        return "Hibrido";
    }

    @Override
    public void conducir() {
        // TODO Auto-generated method stub
        super.conducir();
        System.out.println("Conduce con gasolina y Electrico");
    }

    
}
