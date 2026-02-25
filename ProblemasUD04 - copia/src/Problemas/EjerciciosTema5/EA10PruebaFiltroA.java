package Problemas.EjerciciosTema5;

import java.io.File;
import java.io.IOException;

public class EA10PruebaFiltroA {
    public void main(String[] args) throws IOException {
        File[] fuentes = new File(".").listFiles(
                f -> f.getName().endsWith(".java"));
        for (int i = 0; i < fuentes.length; i++) {
            System.out.println(fuentes[i]);
        }
    }

}
