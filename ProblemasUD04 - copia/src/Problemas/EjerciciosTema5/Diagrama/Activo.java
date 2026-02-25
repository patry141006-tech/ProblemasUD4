package Problemas.EjerciciosTema5.Diagrama;

public class Activo {

    protected String nombre;
    protected double valor;

    public Activo(String nombre, double valor) {
        this.nombre = nombre;
        this.valor = valor;
    }

    public Activo(Activo otro) {
        this.nombre = otro.nombre;
        this.valor = otro.valor;
    }

    public String getNombre() {
        return nombre;
    }

    public double getValor() {
        return valor;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Activo other = (Activo) obj;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        if (Double.doubleToLongBits(valor) != Double.doubleToLongBits(other.valor))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Activo [nombre=" + nombre + ", valor=" + valor + "]";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
