package Problemas.EjerciciosTema5.Problemas.Ejercicios;

public class Rectangulo extends Figura2D {
    double base, altura;

    public Rectangulo(int x, int y, double base, double altura) {
        this.base = base;
        this.altura = altura;
        this.x = x;
        this.y = y;
    }

    @Override
    public double area() {
        return base * altura;
    }

    @Override
    public double perimetro() {
        return 2 * (base + altura);
    }

}
