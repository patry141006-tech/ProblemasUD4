package Problemas.EjerciciosTema5.Problemas.Ejercicios;

public class Triangulo extends Figura2D {
    double base, altura;
    double lado1, lado2, lado3;

    public Triangulo(double base, double altura, double lado1, double lado2, double lado3, int x, int y) {
        this.base = base;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.x = x;
        this.y = y;
    }

    @Override
    public double area() {
        return (base * altura) / 2;
    }

    @Override
    public double perimetro() {
        return lado1 + lado2 + lado3;
    }

}
