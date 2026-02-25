package test.com.dam.danalvtam;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.dam.danalvtam.CartaBrisca;
import com.dam.danalvtam.Palo;
import com.dam.danalvtam.PartidaBrisca;

public class PartidaBriscaTest {
    @Test
    public void testGanaPrimeraCartasMismoPaloSinTriunfo() {
        PartidaBrisca partida = new PartidaBrisca();
        CartaBrisca c1 = new CartaBrisca(1, Palo.BASTOS);
        CartaBrisca c2 = new CartaBrisca(11, Palo.BASTOS);
        boolean resultado1 = partida.ganaPrimera(c1, c2, true, Palo.OROS);
        assertTrue(resultado1);
        boolean resultado2 = partida.ganaPrimera(c1, c2, false, Palo.OROS);
        assertTrue(resultado2);
    }

    @Test
    public void testGanaPrimeraCartasDistintoPaloSinTriunfo() {
        PartidaBrisca partida = new PartidaBrisca();
        CartaBrisca c1 = new CartaBrisca(1, Palo.OROS);
        CartaBrisca c2 = new CartaBrisca(11, Palo.BASTOS);
        boolean resultado1 = partida.ganaPrimera(c1, c2, true, Palo.COPAS);
        assertTrue(resultado1);
        boolean resultado2 = partida.ganaPrimera(c1, c2, false, Palo.COPAS);
        assertFalse(resultado2);
    }

    @Test
    public void testGanaPrimeraCartasDistintoPaloConTriunfo() {
        PartidaBrisca partida = new PartidaBrisca();
        CartaBrisca c1 = new CartaBrisca(1, Palo.OROS);
        CartaBrisca c2 = new CartaBrisca(11, Palo.BASTOS);
        boolean resultado1 = partida.ganaPrimera(c1, c2, true, Palo.BASTOS);
        assertFalse(resultado1);
        boolean resultado2 = partida.ganaPrimera(c1, c2, false, Palo.BASTOS);
        assertFalse(resultado2);
    }

        @Test
    public void testGanaPrimeraCartasMismoPaloConTriunfo() {
        PartidaBrisca partida = new PartidaBrisca();
        CartaBrisca c1 = new CartaBrisca(1, Palo.BASTOS);
        CartaBrisca c2 = new CartaBrisca(11, Palo.BASTOS);
        boolean resultado1 = partida.ganaPrimera(c1, c2, true, Palo.BASTOS);
        assertTrue(resultado1);
        boolean resultado2 = partida.ganaPrimera(c1, c2, false, Palo.BASTOS);
        assertTrue(resultado2);
    }
}
