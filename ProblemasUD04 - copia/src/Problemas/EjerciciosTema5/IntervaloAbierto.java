package Problemas.EjerciciosTema5;

public class IntervaloAbierto extends Intervalo {
    boolean abiertoAbajo, abiertoArriba;

    public IntervaloAbierto(boolean abiertoAbajo, boolean abiertoArriba) throws Exception {
        this.abiertoAbajo = abiertoAbajo;
        this.abiertoArriba = abiertoArriba;
    }

    public IntervaloAbierto(int menor, int mayor, boolean abiertoAbajo, boolean abiertoArriba) throws Exception {
        super(menor, mayor);
        this.abiertoAbajo = abiertoAbajo;
        this.abiertoArriba = abiertoArriba;
    }

    @Override
    public boolean estaDentro(int x) {
        if (abiertoAbajo && abiertoArriba) {
            if (super.getMenor() < x && x < super.getMayor()) {
                return true;
            }
        }
        if (abiertoAbajo && !abiertoArriba) {
            if (super.getMenor() < x && x <= super.getMayor()) {
                return true;
            }
        }
        if (!abiertoAbajo && abiertoArriba) {
            if (super.getMenor() <= x && x < super.getMayor()) {
                return true;
            }
        }
        if (!abiertoAbajo && !abiertoArriba) {
            if (super.getMenor() <= x && x <= super.getMayor()) {
                return true;
            }
        }

        return false;
    }
}
