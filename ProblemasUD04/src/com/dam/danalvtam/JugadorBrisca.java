package com.dam.danalvtam;

import java.util.ArrayList;
import java.util.List;

public class JugadorBrisca {
    private boolean humano;
    private int puntos;
    private List<CartaBrisca> cartas= new ArrayList<>();

    public JugadorBrisca(boolean humano) {
        this.humano = humano;
    }

    public void agregarCarta(CartaBrisca carta) {
        if (cartas.size() < 3) {
            cartas.add(carta);
        }
    }

    public void sumarPuntos(int puntos) {
        this.puntos += puntos;
    }

    public boolean isHumano() {
        return humano;
    }

    public int getPuntos() {
        return puntos;
    }

    public CartaBrisca getCarta(int i){
        return cartas.get(i);
    }

    public boolean quedanCartas(){
        return cartas.size()>0;
    }

    public void removeCarta(int i){
        cartas.remove(i);
    }
}
