package dev.acobano.naipes.modelo;

/**
 * Clase Java que simula el comportamiento de un naipe de la baraja francesa.
 * @author acobano
 */
public class CartaFrancesa extends Carta<PalosBarajaFrancesa>
{
     
    /*******************/
    /*** CONSTRUCTOR ***/
    /*******************/
    
    /**
     * Constructor con parámetros de entrada que representan los atributos de la carta.
     * @param numero Parámetro de tipo entero que representa el número de la carta.
     * @param palo Parámetro del tipo enumerado 'PalosBarajaFrancesa'
     * que representa el palo de la carta.
     */
    public CartaFrancesa(int numero, PalosBarajaFrancesa palo)
    {
        super(numero, palo);
    }
    
    
    
    /************************************/
    /*** MÉTODOS BOOLEANOS DE CONTROL ***/
    /************************************/
    
    /**
     * Método booleano que indica si la carta a la que se le está haciendo la
     * llamada a esta función pertenece o no a un palo de color rojo.
     * @return Booleano.
     */
    public boolean esRoja()
    {
        return this.esCorazones() || this.esDiamantes();
    }
    
    /**
     * Método booleano que indica si la carta a la que se le está haciendo la
     * llamada a esta función pertenece o no a un palo de color negro.
     * @return Booleano.
     */
    public boolean esNegra()
    {
        return this.esPicas() || this.esTreboles();
    }
    
    /**
     * Método booleano que indica si la carta a la que se le está haciendo la
     * llamada a esta función pertenece o no al palo de Corazones.
     * @return Booleano.
     */
    public boolean esCorazones()
    {
        return this.getPalo() == PalosBarajaFrancesa.CORAZONES;
    }
    
    /**
     * Método booleano que indica si la carta a la que se le está haciendo la
     * llamada a esta función pertenece o no al palo de Diamantes.
     * @return Booleano.
     */
    public boolean esDiamantes()
    {
        return this.getPalo() == PalosBarajaFrancesa.DIAMANTES;
    }
    
    /**
     * Método booleano que indica si la carta a la que se le está haciendo la
     * llamada a esta función pertenece o no al palo de Picas.
     * @return Booleano.
     */
    public boolean esPicas()
    {
        return this.getPalo() == PalosBarajaFrancesa.PICAS;
    }
    
    /**
     * Método booleano que indica si la carta a la que se le está haciendo la
     * llamada a esta función pertenece o no al palo de Tréboles.
     * @return Booleano.
     */
    public boolean esTreboles()
    {
        return this.getPalo() == PalosBarajaFrancesa.TREBOLES;
    }
    
    /**
     * Método booleano que indica si la carta a la que se le está haciendo la
     * llamada a esta función es o no un número.
     * @return Booleano.
     */
    public boolean esNumero()
    {
        return !this.esJoker() && this.getNumero() <= 10;
    }
    
    /**
     * Método booleano que indica si la carta a la que se le está haciendo la
     * llamada a esta función es o no una figura.
     * @return Booleano.
     */
    public boolean esFigura()
    {
        return this.getNumero() > 10;
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
     * llamada a esta función es o no un Jack o Jota.
     * @return Booleano.
     */
    public boolean esJota()
    {
        return this.getNumero() == 11;
    }
    
    /**
     * Método booleano que indica si la carta a la que se le está haciendo la
     * llamada a esta función es o no una Reina.
     * @return Booleano.
     */
    public boolean esReina()
    {
        return this.getNumero() == 12;
    }
    
    /**
     * Método booleano que indica si la carta a la que se le está haciendo la
     * llamada a esta función es o no un Rey.
     * @return Booleano.
     */
    public boolean esRey()
    {
        return this.getNumero() == 13;
    }
    
    /**
     * Método booleano que indica si la carta a la que se le está haciendo la
     * llamada a esta función es o no un joker.
     * @return Booleano.
     */
    public boolean esJoker()
    {
        return this.getPalo().name().equals("JOKER");
    }
    
    
    
    /**
     * Método sobreescrito de la superclase Object.
     * @return Cadena de texto con toda la información sobre el naipe.
     */
    @Override
    public String toString()
    {
        //En primer lugar, discriminamos si la carta es un comodín:
        if(this.esJoker())
            return this.getPalo().toString();
        
        //En caso contrario, filtramos según su número y su palo:
        else
        {
            switch(this.getNumero())
            {
                case 1: return "AS de " + this.getPalo().toString();
                case 11: return "JOTA de " + this.getPalo().toString();
                case 12: return "REINA de " + this.getPalo().toString();
                case 13: return "REY de " + this.getPalo().toString();
                default: return this.getNumero() + " de " + this.getPalo().toString();
            }
        }
    }
}