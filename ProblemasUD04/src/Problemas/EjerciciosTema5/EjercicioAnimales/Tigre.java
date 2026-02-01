package Problemas.EjerciciosTema5.EjercicioAnimales;

import java.time.LocalDateTime;

public class Tigre implements Animales {

    private LocalDateTime nace;

    @Override
    public void nace() {
        System.out.println("Nace de un huevo");
        nace = LocalDateTime.now();
    }

    public LocalDateTime getNace() {
        return nace;
    }


}
