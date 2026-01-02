package Problemas;

import java.util.Objects;

public class CuentaBancaria {
    private final int entidad;
    private final int oficina;
    private final int dc;
    private final long cuenta;
    private String titular;
    private double saldo;

    public CuentaBancaria(int entidad, int oficina, long cuenta,
            String titular, double saldo) {

        validar(entidad, 4);
        validar(oficina, 4);
        validar(cuenta, 10);

        if (titular == null || titular.isBlank()) {
            throw new IllegalArgumentException("El titular es obligatorio");
        }

        this.entidad = entidad;
        this.oficina = oficina;
        this.cuenta = cuenta;
        this.dc = calcularDC(entidad, oficina, cuenta);
        this.titular = titular;
        this.saldo = saldo;
    }

    public CuentaBancaria(String titular) {
        this(1, 2, 0L, titular, 0.0);
    }

    private void validar(long valor, int digitos) {
        long min = (long) Math.pow(10, digitos - 1);
        long max = (long) Math.pow(10, digitos) - 1;
        if (valor < min || valor > max) {
            throw new IllegalArgumentException(
                    "Debe tener exactamente " + digitos + " dígitos");
        }
    }

    private int calcularDC(int entidad, int oficina, long cuenta) {
        int suma = entidad + oficina + (int) (cuenta % 100);
        return suma % 100;
    }

    public int getEntidad() {
        return entidad;
    }

    public int getOficina() {
        return oficina;
    }

    public int getDc() {
        return dc;
    }

    public long getCuenta() {
        return cuenta;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setTitular(String titular) {
        if (titular != null && !titular.isBlank()) {
            this.titular = titular;
        }
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void ingresar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
        }
    }

    public void retirar(double cantidad) {
        if (cantidad <= saldo) {
            saldo -= cantidad;
        } else {
            throw new RuntimeException("Saldo insuficiente");
        }
    }

    @Override
    public String toString() {
        return String.format(
                "{cuenta:\"%04d-%04d-%02d-%010d\", titular:\"%s\", saldo:%.2f}",
                entidad, oficina, dc, cuenta, titular, saldo);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;

        }
        if (!(o instanceof CuentaBancaria)) {
            return false;

        }
        CuentaBancaria that = (CuentaBancaria) o;
        return entidad == that.entidad &&
                oficina == that.oficina &&
                dc == that.dc &&
                cuenta == that.cuenta;
    }

    @Override
    public int hashCode() {
        return Objects.hash(entidad, oficina, dc, cuenta);
    }
}
