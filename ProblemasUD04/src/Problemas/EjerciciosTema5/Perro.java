package Problemas.EjerciciosTema5;

public class Perro extends Mascotas {
    private String color;

    public Perro(int numPatas, String nombre, String voz, double peso, String color) {
        super(numPatas, nombre, voz, peso);
        this.color = color;
    }

    @Override
    public boolean juega(double minutos) {
        double pesoTmp = peso - (minutos / 2);

        if (pesoTmp <= 0) {
            super.come(minutos - 1);
            juega(minutos/2);
            return false;
        } else {
            peso = pesoTmp;
            return true;
        }
    }
}
