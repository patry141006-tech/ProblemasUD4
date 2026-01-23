package Problemas;

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

public class Alumno {
    private final int nia;
    private final String nombre;
    private final double[] notas;

    public Alumno(int nia, String nombre, double[] notas) {
        this.nia = nia;
        this.nombre = nombre;
        this.notas = notas;
    }

    public Alumno(String nombre) {
        this.nia = generarNiaAleatorio();
        this.nombre = nombre;
        this.notas = new double[0]; // array vacío con notas a 0
    }

    public int getNia() {
        return nia;
    }

    public String getNombre() {
        return nombre;
    }

    public double[] getNotas() {
        return notas;
    }

    public double notaMedia() {
        if (notas.length == 0) {
            return 0.0;
        }

        double suma = 0;
        for (double nota : notas) {
            suma += nota;
        }
        return suma / notas.length;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nia=" + nia +
                ", nombre='" + nombre + '\'' +
                ", notas=" + Arrays.toString(notas) +
                ", notaMedia=" + notaMedia() +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Alumno alumno = (Alumno) obj;
        return nia == alumno.nia &&
                Objects.equals(nombre, alumno.nombre);

    }

    @Override
    public int hashCode() {
        return Objects.hash(nia, nombre);
    }

    private int generarNiaAleatorio() {
        return new Random().nextInt(900000) + 100000; // NIA de 6 cifras
    }
}
