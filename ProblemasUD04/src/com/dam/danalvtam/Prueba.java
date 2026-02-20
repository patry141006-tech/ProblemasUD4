package com.dam.danalvtam;

import com.danalvtam.consola.Amico;

public class Prueba extends Carta {

    public Prueba(int numero, Palo palo) {
        super(numero, palo);
        // TODO Auto-generated constructor stub
    }

    public static void main(String[] args) {
        Amico.bp();
        Carta c1 = new Carta(12, Palo.ESPADAS);
        CartaBrisca c2 = new CartaBrisca(11, Palo.COPAS);
        CartaBrisca c3 = new CartaBrisca(11, Palo.BASTOS);
        CartaBrisca c4 = new CartaBrisca(11, Palo.OROS);

        MazoCartasBrisca mazo = new MazoCartasBrisca();
        mazo.barajarMazo();
        mazo.extraerCarta().dibujar(1, 1);
        mazo.extraerCarta().dibujar(10, 1);
        mazo.extraerCarta().dibujar(20, 1);
        mazo.getMuestra().dibujar(60, 1);
        printReverso(40, 1);
    }


}
