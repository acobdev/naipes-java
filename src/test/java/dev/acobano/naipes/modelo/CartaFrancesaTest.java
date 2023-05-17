package dev.acobano.naipes.modelo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Clase de test unitarios para probar la clase CartaFrancesa.
 * @author Álvaro Cobano
 */
public class CartaFrancesaTest 
{    
    @Test
    public void asPicasTest()
    {
        CartaFrancesa asPicas = new CartaFrancesa(1, PalosBarajaFrancesa.PICAS);
        
        assertAll(
            () -> assertTrue(asPicas.esAs()),
            () -> assertTrue(asPicas.esPicas()),
            () -> assertFalse(asPicas.esCorazones()),
            () -> assertFalse(asPicas.esDiamantes()),
            () -> assertFalse(asPicas.esTreboles()),
            () -> assertTrue(asPicas.esNegra()),
            () -> assertFalse(asPicas.esRoja()),
            () -> assertTrue(asPicas.esNumero()),
            () -> assertFalse(asPicas.esFigura()),
            () -> assertFalse(asPicas.esJota()),
            () -> assertFalse(asPicas.esReina()),
            () -> assertFalse(asPicas.esRey()),
            () -> assertFalse(asPicas.esJoker()),
            () -> assertEquals(1, asPicas.getNumero()),
            () -> assertEquals(PalosBarajaFrancesa.PICAS, asPicas.getPalo()),
            () -> assertEquals("AS de PICAS", asPicas.toString())
        );
    }
    
    @Test
    public void sieteCorazonesTest()
    {
        CartaFrancesa sieteCorazones = new CartaFrancesa(7, PalosBarajaFrancesa.CORAZONES);
        
        assertAll(
            () -> assertTrue(sieteCorazones.esNumero()),
            () -> assertTrue(sieteCorazones.esCorazones()),
            () -> assertFalse(sieteCorazones.esPicas()),
            () -> assertFalse(sieteCorazones.esDiamantes()),
            () -> assertFalse(sieteCorazones.esTreboles()),
            () -> assertTrue(sieteCorazones.esRoja()),
            () -> assertFalse(sieteCorazones.esNegra()),
            () -> assertFalse(sieteCorazones.esFigura()),
            () -> assertFalse(sieteCorazones.esAs()),
            () -> assertFalse(sieteCorazones.esJota()),
            () -> assertFalse(sieteCorazones.esReina()),
            () -> assertFalse(sieteCorazones.esRey()),
            () -> assertFalse(sieteCorazones.esJoker()),
            () -> assertEquals(7, sieteCorazones.getNumero()),
            () -> assertEquals(PalosBarajaFrancesa.CORAZONES, sieteCorazones.getPalo()),
            () -> assertEquals("7 de CORAZONES", sieteCorazones.toString())
        );
    }
    
    @Test
    public void jotaDiamantesTest()
    {
        CartaFrancesa jotaDiamantes = new CartaFrancesa(11, PalosBarajaFrancesa.DIAMANTES);
        
        assertAll(
            () -> assertTrue(jotaDiamantes.esJota()),
            () -> assertTrue(jotaDiamantes.esDiamantes()),
            () -> assertFalse(jotaDiamantes.esPicas()),
            () -> assertFalse(jotaDiamantes.esCorazones()),
            () -> assertFalse(jotaDiamantes.esTreboles()),
            () -> assertTrue(jotaDiamantes.esRoja()),
            () -> assertFalse(jotaDiamantes.esNegra()),
            () -> assertFalse(jotaDiamantes.esNumero()),
            () -> assertTrue(jotaDiamantes.esFigura()),
            () -> assertFalse(jotaDiamantes.esAs()),
            () -> assertFalse(jotaDiamantes.esReina()),
            () -> assertFalse(jotaDiamantes.esRey()),
            () -> assertFalse(jotaDiamantes.esJoker()),
            () -> assertEquals(11, jotaDiamantes.getNumero()),
            () -> assertEquals(PalosBarajaFrancesa.DIAMANTES, jotaDiamantes.getPalo()),
            () -> assertEquals("JOTA de DIAMANTES", jotaDiamantes.toString())
        );
    }
    
    @Test
    public void reinaTrebolesTest()
    {
        CartaFrancesa reinaTreboles = new CartaFrancesa(12, PalosBarajaFrancesa.TREBOLES);
        
        assertAll(
            () -> assertTrue(reinaTreboles.esReina()),
            () -> assertTrue(reinaTreboles.esTreboles()),
            () -> assertFalse(reinaTreboles.esPicas()),
            () -> assertFalse(reinaTreboles.esCorazones()),
            () -> assertFalse(reinaTreboles.esDiamantes()),
            () -> assertTrue(reinaTreboles.esNegra()),
            () -> assertFalse(reinaTreboles.esRoja()),
            () -> assertFalse(reinaTreboles.esNumero()),
            () -> assertTrue(reinaTreboles.esFigura()),
            () -> assertFalse(reinaTreboles.esAs()),
            () -> assertFalse(reinaTreboles.esJota()),
            () -> assertFalse(reinaTreboles.esRey()),
            () -> assertFalse(reinaTreboles.esJoker()),
            () -> assertEquals(12, reinaTreboles.getNumero()),
            () -> assertEquals(PalosBarajaFrancesa.TREBOLES, reinaTreboles.getPalo()),
            () -> assertEquals("REINA de TREBOLES", reinaTreboles.toString())
        );
    }
    
    @Test
    public void reyPicasTest()
    {
        CartaFrancesa reyPicas = new CartaFrancesa(13, PalosBarajaFrancesa.PICAS);
        
        assertAll(
            () -> assertTrue(reyPicas.esRey()),
            () -> assertTrue(reyPicas.esPicas()),
            () -> assertFalse(reyPicas.esCorazones()),
            () -> assertFalse(reyPicas.esDiamantes()),
            () -> assertFalse(reyPicas.esTreboles()),
            () -> assertTrue(reyPicas.esNegra()),
            () -> assertFalse(reyPicas.esRoja()),
            () -> assertFalse(reyPicas.esNumero()),
            () -> assertTrue(reyPicas.esFigura()),
            () -> assertFalse(reyPicas.esAs()),
            () -> assertFalse(reyPicas.esJota()),
            () -> assertFalse(reyPicas.esReina()),
            () -> assertFalse(reyPicas.esJoker()),
            () -> assertEquals(13, reyPicas.getNumero()),
            () -> assertEquals(PalosBarajaFrancesa.PICAS, reyPicas.getPalo()),
            () -> assertEquals("REY de PICAS", reyPicas.toString())
        );
    }
    
    @Test
    public void jokerTest()
    {
        CartaFrancesa joker = new CartaFrancesa(0, PalosBarajaFrancesa.JOKER);
        
        assertAll(
            () -> assertTrue(joker.esJoker()),
            () -> assertFalse(joker.esPicas()),
            () -> assertFalse(joker.esCorazones()),
            () -> assertFalse(joker.esDiamantes()),
            () -> assertFalse(joker.esTreboles()),
            () -> assertFalse(joker.esRoja()),
            () -> assertFalse(joker.esNegra()),
            () -> assertFalse(joker.esNumero()),
            () -> assertFalse(joker.esFigura()),
            () -> assertFalse(joker.esAs()),
            () -> assertFalse(joker.esJota()),
            () -> assertFalse(joker.esReina()),
            () -> assertFalse(joker.esRey()),
            () -> assertEquals(0, joker.getNumero()),
            () -> assertEquals(PalosBarajaFrancesa.JOKER, joker.getPalo()),
            () -> assertEquals("JOKER", joker.toString())
        );
    }
}