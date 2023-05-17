package dev.acobano.naipes.modelo;

/**
 * Clase Java que simula el comportamiento de un naipe de la baraja española.
 * @author Álvaro Cobano
 */
public class CartaEspaniola extends Carta<PalosBarajaEspaniola>
{
    
    /*******************/
    /*** CONSTRUCTOR ***/
    /*******************/
    
    /**
     * Constructor con parámetros de entrada que representan los atrobutos del naipe.
     * @param numero Parámetro de tipo entero que representa el número de la carta.
     * @param palo Parámetro del tipo enumerado 'PalosBarajaEspaniola'
     * que representa el palo de la carta.
     */
    public CartaEspaniola(int numero, PalosBarajaEspaniola palo)
    {
        super(numero, palo);
    }
    
    
    
    /************************************/
    /*** MÉTODOS BOOLEANOS DE CONTROL ***/
    /************************************/
    
    /**
     * Método booleano que indica si la carta a la que se le está haciendo la
     * llamada a esta función pertenece o no al palo de Oros.
     * @return Booleano.
     */
    public boolean esOros()
    {
        return this.getPalo() == PalosBarajaEspaniola.OROS;
    }
    
    /**
     * Método booleano que indica si la carta a la que se le está haciendo la
     * llamada a esta función pertenece o no al palo de Copas.
     * @return Booleano.
     */
    public boolean esCopas()
    {
        return this.getPalo() == PalosBarajaEspaniola.COPAS;
    }
    
    /**
     * Método booleano que indica si la carta a la que se le está haciendo la
     * llamada a esta función pertenece o no al palo de Espadas.
     * @return Booleano.
     */
    public boolean esEspadas()
    {
        return this.getPalo() == PalosBarajaEspaniola.ESPADAS;
    }
    
    /**
     * Método booleano que indica si la carta a la que se le está haciendo la
     * llamada a esta función pertenece o no al palo de Bastos.
     * @return Booleano.
     */
    public boolean esBastos()
    {
        return this.getPalo() == PalosBarajaEspaniola.BASTOS;
    }
    
    /**
     * Método booleano que indica si la carta a la que se le está haciendo la
     * llamada a esta función es o no un número.
     * @return Booleano.
     */
    public boolean esNumero()
    {
        return !this.esComodin() && this.getNumero() < 10;
    }
    
    /**
     * Método booleano que indica si la carta a la que se le está haciendo la
     * llamada a esta función es o no una figura.
     * @return Booleano.
     */
    public boolean esFigura()
    {
        return this.getNumero() >= 10;
    }
    
    /**
     * Método booleano que indica si la carta a la que se le está haciendo la
     * llamada a esta función es o no un As.
     * @return Booleano.
     */
    public boolean esAs()
    {
        return this.getNumero() == 1;
    }
    
    /**
     * Método booleano que indica si la carta a la que se le está haciendo la
     * llamada a esta función es o no una Sota.
     * @return Booleano.
     */
    public boolean esSota()
    {
        return this.getNumero() == 10;
    }
    
    /**
     * Método booleano que indica si la carta a la que se le está haciendo la
     * llamada a esta función es o no un Caballo.
     * @return Booleano.
     */
    public boolean esCaballo()
    {
        return this.getNumero() == 11;
    }
    
    /**
     * Método booleano que indica si la carta a la que se le está haciendo la
     * llamada a esta función es o no un Rey.
     * @return Booleano.
     */
    public boolean esRey()
    {
        return this.getNumero() == 12;
    }
    
    /**
     * Método booleano que indica si la carta a la que se le está haciendo la
     * llamada a esta función es o no un comodín.
     * @return Booleano.
     */
    public boolean esComodin()
    {
        return this.palo.name().equals("COMODIN");
    }
    
    /**
     * Método booleano que indica si la carta a la que se le está haciendo la
     * llamada a esta función pertenece o no a un palo corto.
     * @return Booleano.
     */
    public boolean esCorto()
    {
        return this.getPalo() == PalosBarajaEspaniola.OROS ||
               this.getPalo() == PalosBarajaEspaniola.COPAS;
    }
    
    /**
     * Método booleano que indica si la carta a la que se le está haciendo la
     * llamada a esta función pertenece o no un palo largo.
     * @return Booleano.
     */
    public boolean esLargo()
    {
        return this.getPalo() == PalosBarajaEspaniola.BASTOS ||
               this.getPalo() == PalosBarajaEspaniola.ESPADAS;
    }
    
    
    
    /**
     * Método sobreescrito de la superclase Object.
     * @return Cadena de texto con toda la información sobre el naipe.
     */
    @Override
    public String toString()
    {
        //En primer lugar, discriminamos si la carta es un comodín:
        if (this.esComodin())
            return this.palo.toString();
        
        //En caso contrario, filtramos según su número y su palo:
        else
        {
            switch(this.getNumero())
            {
                case 1: return "AS de " + this.getPalo().toString();
                case 10: return "SOTA de " + this.getPalo().toString();
                case 11: return "CABALLO de " + this.getPalo().toString();
                case 12: return "REY de " + this.getPalo().toString();
                default: return this.getNumero() + " de " + this.getPalo().toString();
            }
        }
    }
}