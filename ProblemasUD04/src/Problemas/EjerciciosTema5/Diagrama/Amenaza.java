package Problemas.EjerciciosTema5.Diagrama;

public class Amenaza {
    final String nombre;
    final String tipo;

    public Amenaza(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public Amenaza setNombre(String nombre) {
        return new Amenaza(nombre, this.tipo);
    }

    public Amenaza setTipo(String tipo) {
        return new Amenaza(this.nombre, tipo);
    }
}
