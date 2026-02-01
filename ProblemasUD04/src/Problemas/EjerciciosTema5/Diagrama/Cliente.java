package Problemas.EjerciciosTema5.Diagrama;

public class Cliente implements Amenazable {

    private String nombre;

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String[] getTipoAmenazas() {
        return new String[] { "Malware", "Phishing", "Fallo eléctrico" };
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "CLiente [nombre=" + nombre + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Cliente other = (Cliente) obj;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        return true;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
