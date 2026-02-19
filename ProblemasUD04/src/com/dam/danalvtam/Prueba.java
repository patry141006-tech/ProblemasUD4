package com.dam.danalvtam;

import com.danalvtam.consola.Amico;

public class Prueba {

    public static void main(String[] args) {
        Amico.bp();
        Carta c1 = new Carta(12, Palo.ESPADAS);
        CartaBrisca c2 = new CartaBrisca(11, Palo.BASTOS);

        MazoCartasBrisca mazo = new MazoCartasBrisca();

        c1.dibujar(1,1);
    }
}
