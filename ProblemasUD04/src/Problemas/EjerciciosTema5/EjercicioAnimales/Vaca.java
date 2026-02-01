package Problemas.EjerciciosTema5.EjercicioAnimales;

import java.time.LocalDateTime;

public class Vaca implements Animales {
    private LocalDateTime nace;

    @Override
    public void nace() {
        System.out.println("Nace de su madre");
        nace = LocalDateTime.now();
    }

    public LocalDateTime getNace() {
        return nace;
    }

    public void utilidad() {
        System.out.println("Util");
    }
}
