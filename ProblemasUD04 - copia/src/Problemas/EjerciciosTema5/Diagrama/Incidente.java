package Problemas.EjerciciosTema5.Diagrama;

public class Incidente {

    private double frecuenciaAnual;
    private double consecuencia;
    private Amenaza amenaza;

    public Incidente(double frecuenciaAnual, double consecuencia, Amenaza amenaza) {
        this.frecuenciaAnual = frecuenciaAnual;
        this.consecuencia = consecuencia;
        this.amenaza = amenaza;
    }

    public Amenaza getAmenaza() {
        return amenaza;
    }

    public double getFrecuenciaAnual() {
        return frecuenciaAnual;
    }

    public void setFrecuenciaAnual(double frecuenciaAnual) {
        this.frecuenciaAnual = frecuenciaAnual;
    }

    public double getConsecuencia() {
        return consecuencia;
    }

    public void setConsecuencia(double consecuencia) {
        this.consecuencia = consecuencia;
    }

    public void setAmenaza(Amenaza amenaza) {
        this.amenaza = amenaza;
    }

    @Override
    public String toString() {
        return "Incidente [frecuenciaAnual=" + frecuenciaAnual + ", consecuencia=" + consecuencia + ", amenaza="
                + amenaza + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Incidente other = (Incidente) obj;
        if (Double.doubleToLongBits(frecuenciaAnual) != Double.doubleToLongBits(other.frecuenciaAnual))
            return false;
        if (Double.doubleToLongBits(consecuencia) != Double.doubleToLongBits(other.consecuencia))
            return false;
        if (amenaza == null) {
            if (other.amenaza != null)
                return false;
        } else if (!amenaza.equals(other.amenaza))
            return false;
        return true;
    }
}
