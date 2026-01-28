package Problemas.EjerciciosTema5.Problemas.Ejercicios;

public class Intervalo {
    private int menor, mayor;

    public Intervalo(int menor, int mayor) throws Exception {
        if (mayor == menor) {
            throw new Exception("Los numeros no pueden ser iguales");
        }

        if (mayor < menor) {
            int tmp = mayor;
            mayor = menor;
            menor = tmp;
        }
        this.mayor = mayor;
        this.menor = menor;
    }

    public int getMenor() {
        return menor;
    }

    public void setMenor(int menor) throws Exception {
        if (mayor == menor) {
            throw new Exception("Los numeros no pueden ser iguales");

        }
        this.menor = menor;

    }

    public int getMayor() {
        return mayor;
    }

    public void setMayor(int mayor) throws Exception {
        if (mayor == menor) {
            throw new Exception("Los numeros no pueden ser iguales");

        }
        this.mayor = mayor;
    }

    public boolean estaDentro(int x) {
        if (x <= mayor && x >= menor) {
            return true;
        } else {
            return false;

        }
    }
}
