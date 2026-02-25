package Problemas;

public class Racional {
    int n;
    int d;

    public Racional() {
        this.n = 1;
        this.d = 1;
    }

    public Racional(int n, int d) throws Exception {
        if (d == 0) {
            throw new Exception("El denominador no puede ser 0");
        }
        this.n = n;
        this.d = d;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    @Override
    public String toString() {
        return n + "/" + d;
    }

    public Racional suma(Racional ra) throws Exception {
        int d1 = this.d;
        int d2 = ra.d;
        int n1 = this.n;
        int n2 = ra.n;

        if (d1 == d2) {
            return new Racional((n1 + n2), d1);
        } else {
            return new Racional((n1 * d2 + n2 * d1), (d1 * d2));
        }
    }

    public Racional suma(Racional ra1, Racional ra2) throws Exception {
        int d1 = ra1.d;
        int d2 = ra2.d;
        int n1 = ra1.n;
        int n2 = ra2.n;

        if (d1 == d2) {
            return new Racional((n1 + n2), d1);
        } else {
            return new Racional((n1 * d2 + n2 * d1), (d1 * d2));
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Racional other = (Racional) obj;
        double div1 = (double) n / d;
        double div2 = ((double) other.n / other.d);

        if (div1 != div2) {
            return false;
        }
        return true;
    }

}
