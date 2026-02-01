package Problemas.EjerciciosTema5;

public class Circulo extends Figura2D {
    double radio;

    public Circulo(double radio, int x, int y) {
        this.radio = radio;
        this.x = x;
        this.y = y;
    }

    @Override
    public double area() {
        return Math.PI * radio * radio;
    }

    @Override
    public double perimetro() {
        return 2 * Math.PI * radio;
    }
}
