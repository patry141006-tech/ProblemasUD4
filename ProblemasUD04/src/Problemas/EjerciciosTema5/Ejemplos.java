package Problemas.EjerciciosTema5;

public class Ejemplos {
    public static void main(String[] args) {
        Mascotas a=new Mascotas(4, "pepe", "aguda", 20);
        Mascotas b=new Mascotas(a);
        System.out.println(b);
        a.setNombre("juan");
        System.out.println(b);
    }
}
