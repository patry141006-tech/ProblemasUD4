package Problemas.EjerciciosTema5.EjercicioAnimales;

import java.time.LocalDateTime;

public class Gallina implements Animales {
    private LocalDateTime nace;

    @Override
    public void nace() {
        System.out.println("Nace de un huevo");
        nace = LocalDateTime.now();
    }

    public void vuela() {
        System.out.println("Vuela");
    }

    public LocalDateTime getNace() {
        return nace;
    }

    public void utilidad() {
        System.out.println("Util");
    }

}
