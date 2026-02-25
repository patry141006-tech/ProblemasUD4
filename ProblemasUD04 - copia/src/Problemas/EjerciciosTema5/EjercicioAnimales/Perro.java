package Problemas.EjerciciosTema5.EjercicioAnimales;

import java.time.LocalDateTime;

public class Perro implements Animales {
    private LocalDateTime nace;

    @Override
    public void nace() {
        System.out.println("Nace de su madre");
        nace = LocalDateTime.now();
    }

    public LocalDateTime getNace() {
        return nace;
    }

    public void acompañayHabla(){
        System.out.println("Acompaña en la casa y habla");
    }

    public void utilidad(){
        System.out.println("Util");
    }

}
