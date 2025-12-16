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
        int n1= this.n;
        int n2= ra.n;

        if(d1 == d2){
            return new Racional((n1+n2), d1);
        } else{
            return new Racional((n1*d2 + n2 * d1), (d1*d2));
        }
    }
}
