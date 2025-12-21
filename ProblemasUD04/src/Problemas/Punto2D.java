package Problemas;

public class Punto2D {
    private double x;
    private double y;

    public Punto2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Punto2D() {
        this(0, 0);
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Punto2D suma(Punto2D otro) {
        return new Punto2D(this.x + otro.x, this.y + otro.y);
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    @Override
    public boolean equals(Object obj) {

        // es lo missmo
        if (this == obj) {
            return true;
        }

        // es nulo o distinta clase
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Punto2D otro = (Punto2D) obj;

        if (this.x == otro.x && this.y == otro.y) {
            return true;
        }
        return false;
    }

}
