package Problemas.EjerciciosTema5.Interfaces;

public interface I1 {
    public void carga (int Kg);
    default public boolean cabeMas(){
        return true;
    }
}
