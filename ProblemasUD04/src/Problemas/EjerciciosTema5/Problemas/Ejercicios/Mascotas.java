package Problemas.EjerciciosTema5.Problemas.Ejercicios;

public class Mascotas {
    int numPatas;
    String nombre;
    String voz;
    double peso;

    public Mascotas(int numPatas, String nombre, String voz, double peso) {
        this.numPatas = numPatas;
        this.nombre = nombre;
        this.voz = voz;
        this.peso = peso;
    }

    public int getNumPatas() {
        return numPatas;
    }

    public void setNumPatas(int numPatas) {
        this.numPatas = numPatas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getVoz() {
        return voz;
    }

    public void setVoz(String voz) {
        this.voz = voz;
    }

    public double getPeso() {
        return peso;
    }

    public void come(double cantidad) {
        peso = peso + cantidad;
    }

    public boolean juega(double minutos) {
        double pesoTmp = peso - (minutos / 2);

        if (pesoTmp <= 0) {
            return false;
        } else {
            peso = pesoTmp;
            return true;
        }
    }

    @Override
    public String toString() {
        return "Mascotas" + nombre + ", " + numPatas + ", " + voz + ", " + peso;
    }
}
