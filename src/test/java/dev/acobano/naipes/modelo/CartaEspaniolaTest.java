package dev.acobano.naipes.modelo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Clase de test unitarios para probar la clase CartaEspaniola.
 * @author Álvaro Cobano
 */
public class CartaEspaniolaTest 
{   
    @Test
    public void asBastosTest()
    {
        CartaEspaniola asBastos = new CartaEspaniola(1, PalosBarajaEspaniola.BASTOS);
        
        assertAll(
            () -> assertTrue(asBastos.esAs()),
            () -> assertTrue(asBastos.esBastos()),
            () -> assertFalse(asBastos.esEspadas()),
            () -> assertFalse(asBastos.esCopas()),
            () -> assertFalse(asBastos.esOros()),
            () -> assertFalse(asBastos.esSota()),
            () -> assertFalse(asBastos.esCaballo()),
            () -> assertFalse(asBastos.esRey()),
            () -> assertTrue(asBastos.esNumero()),
            () -> assertFalse(asBastos.esFigura()),
            () -> assertFalse(asBastos.esComodin()),
            () -> assertTrue(asBastos.esLargo()),
            () -> assertFalse(asBastos.esCorto()),
            () -> assertEquals(1, asBastos.getNumero()),
            () -> assertEquals(PalosBarajaEspaniola.BASTOS, asBastos.getPalo()),
            () -> assertEquals("AS de BASTOS", asBastos.toString())
        );
    }
    
    @Test
    public void cuatroBastosTest()
    {
        CartaEspaniola cuatroBastos = new CartaEspaniola(4, PalosBarajaEspaniola.BASTOS);
        
        assertAll(
            () -> assertTrue(cuatroBastos.esBastos()),
            () -> assertTrue(cuatroBastos.esNumero()),
            () -> assertFalse(cuatroBastos.esOros()),
            () -> assertFalse(cuatroBastos.esCopas()),
            () -> assertFalse(cuatroBastos.esEspadas()),
            () -> assertFalse(cuatroBastos.esFigura()),
            () -> assertFalse(cuatroBastos.esAs()),
            () -> assertFalse(cuatroBastos.esSota()),
            () -> assertFalse(cuatroBastos.esCaballo()),
            () -> assertFalse(cuatroBastos.esRey()),
            () -> assertFalse(cuatroBastos.esComodin()),
            () -> assertTrue(cuatroBastos.esLargo()),
            () -> assertFalse(cuatroBastos.esCorto()),
            () -> assertEquals(4, cuatroBastos.getNumero()),
            () -> assertEquals(PalosBarajaEspaniola.BASTOS, cuatroBastos.getPalo()),
            () -> assertEquals("4 de BASTOS", cuatroBastos.toString())
        );
    }
    
    @Test
    public void sotaOrosTest()
    {
        CartaEspaniola sotaOros = new CartaEspaniola(10, PalosBarajaEspaniola.OROS);
        
        assertAll(
            () -> assertTrue(sotaOros.esSota()),
            () -> assertTrue(sotaOros.esOros()),
            () -> assertFalse(sotaOros.esCopas()),
            () -> assertFalse(sotaOros.esEspadas()),
            () -> assertFalse(sotaOros.esBastos()),
            () -> assertFalse(sotaOros.esAs()),
            () -> assertFalse(sotaOros.esCaballo()),
            () -> assertFalse(sotaOros.esRey()),
            () -> assertFalse(sotaOros.esNumero()),
            () -> assertTrue(sotaOros.esFigura()),
            () -> assertFalse(sotaOros.esComodin()),
            () -> assertTrue(sotaOros.esCorto()),
            () -> assertFalse(sotaOros.esLargo()),
            () -> assertEquals(10, sotaOros.getNumero()),
            () -> assertEquals(PalosBarajaEspaniola.OROS, sotaOros.getPalo()),
            () -> assertEquals("SOTA de OROS", sotaOros.toString())
        );
    }
    
    @Test
    public void caballoEspadasTest()
    {
        CartaEspaniola caballoEspadas = new CartaEspaniola(11, PalosBarajaEspaniola.ESPADAS);
        
        assertAll(
            () -> assertTrue(caballoEspadas.esCaballo()),
            () -> assertTrue(caballoEspadas.esEspadas()),
            () -> assertFalse(caballoEspadas.esOros()),
            () -> assertFalse(caballoEspadas.esCopas()),
            () -> assertFalse(caballoEspadas.esBastos()),
            () -> assertFalse(caballoEspadas.esAs()),
            () -> assertFalse(caballoEspadas.esSota()),
            () -> assertFalse(caballoEspadas.esRey()),
            () -> assertFalse(caballoEspadas.esNumero()),
            () -> assertTrue(caballoEspadas.esFigura()),
            () -> assertFalse(caballoEspadas.esComodin()),
            () -> assertTrue(caballoEspadas.esLargo()),
            () -> assertFalse(caballoEspadas.esCorto()),
            () -> assertEquals(11, caballoEspadas.getNumero()),
            () -> assertEquals(PalosBarajaEspaniola.ESPADAS, caballoEspadas.getPalo()),
            () -> assertEquals("CABALLO de ESPADAS", caballoEspadas.toString())
        );
    }
    
    @Test
    public void reyCopasTest()
    {
        CartaEspaniola reyCopas = new CartaEspaniola(12, PalosBarajaEspaniola.COPAS);
        
        assertAll(
            () -> assertTrue(reyCopas.esRey()),
            () -> assertTrue(reyCopas.esCopas()),
            () -> assertFalse(reyCopas.esOros()),
            () -> assertFalse(reyCopas.esEspadas()),
            () -> assertFalse(reyCopas.esBastos()),
            () -> assertFalse(reyCopas.esNumero()),
            () -> assertTrue(reyCopas.esFigura()),
            () -> assertFalse(reyCopas.esComodin()),
            () -> assertFalse(reyCopas.esAs()),
            () -> assertFalse(reyCopas.esSota()),
            () -> assertFalse(reyCopas.esCaballo()),
            () -> assertTrue(reyCopas.esCorto()),
            () -> assertFalse(reyCopas.esLargo()),
            () -> assertEquals(12, reyCopas.getNumero()),
            () -> assertEquals(PalosBarajaEspaniola.COPAS, reyCopas.getPalo()),
            () -> assertEquals("REY de COPAS", reyCopas.toString())
        );
    }
    
    @Test
    public void comodinTest()
    {
        CartaEspaniola comodin = new CartaEspaniola(0, PalosBarajaEspaniola.COMODIN);
        
        assertAll(
            () -> assertTrue(comodin.esComodin()),
            () -> assertFalse(comodin.esOros()),
            () -> assertFalse(comodin.esCopas()),
            () -> assertFalse(comodin.esEspadas()),
            () -> assertFalse(comodin.esBastos()),
            () -> assertFalse(comodin.esNumero()),
            () -> assertFalse(comodin.esFigura()),
            () -> assertFalse(comodin.esAs()),
            () -> assertFalse(comodin.esSota()),
            () -> assertFalse(comodin.esCaballo()),
            () -> assertFalse(comodin.esRey()),
            () -> assertFalse(comodin.esCorto()),
            () -> assertFalse(comodin.esLargo()),
            () -> assertEquals(0, comodin.getNumero()),
            () -> assertEquals(PalosBarajaEspaniola.COMODIN, comodin.getPalo()),
            () -> assertEquals("COMODIN", comodin.toString())
        );
    }
}