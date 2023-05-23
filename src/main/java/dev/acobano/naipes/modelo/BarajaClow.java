package dev.acobano.naipes.modelo;

import java.io.IOException;

/**
 * Clase extendida de Baraja que representa un mazo de cartas del Tarot.
 * @author Álvaro Cobano
 */
public class BarajaClow extends Baraja
{
    /**
     * Constructor que instancia una baraja de cartas Clow.
     */
    public BarajaClow()
    {
        this.mazo = new CartaClow[NombresCartasClow.values().length];
        this.indiceBaraja = 0;
        
        try
        {
            for (int i=1; i<=this.mazo.length; i++)
                this.mazo[i-1] = new CartaClow(i);
        }
        catch (IOException ioe) {}
    }
}