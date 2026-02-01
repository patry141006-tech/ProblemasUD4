package Problemas.EjerciciosTema5.Diagrama;

public class Hardware extends Activo {

    private int vidaUtil;

    public Hardware(String nombre, double valor, int vidaUtil) {
        super(nombre, valor);
        this.vidaUtil = vidaUtil;
    }

    public int getVidaUtil() {
        return vidaUtil;
    }

    public void setVidaUtil(int vidaUtil) {
        this.vidaUtil = vidaUtil;
    }

    @Override
    public String toString() {
        return "Hardware [vidaUtil=" + vidaUtil + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        Hardware other = (Hardware) obj;
        if (vidaUtil != other.vidaUtil)
            return false;
        return true;
    }
}
