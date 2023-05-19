package dev.acobano.naipes.modelo;

/**
 * Clase Java que simula el comportamiento de un naipe de la baraja del Tarot.
 * @author Álvaro Cobano
 */
public class CartaTarot extends Carta<PalosBarajaTarot>
{
    
    /****************/
    /*** ATRIBUTO ***/
    /****************/
    
    private ArcanosMayoresTarot[] arcanos = ArcanosMayoresTarot.values();     //Array con los arcanos mayores.
    
    
    /*******************/
    /*** CONSTRUCTOR ***/
    /*******************/
    
    /**
     * Constructor con parámetros de entrada que representan los atributos del naipe.
     * @param numero Parámetro de tipo entero que representa el número de la carta.
     * @param palo Parámetro del tipo enumerado 'PalosBarajaTarot'
     * que representa el palo de la carta.
     */
    public CartaTarot(int numero, PalosBarajaTarot palo)
    {
        super(numero, palo);
    }
    
    
    
    /************************************/
    /*** MÉTODOS BOOLEANOS DE CONTROL ***/
    /************************************/
    
    /**
     * Método booleano que indica si la carta a la que se le está haciendo la
     * llamada a esta función es o no un Arcano Mayor.
     * @return Booleano.
     */
    public boolean esArcanoMayor()
    {
        return this.getPalo().name().equals("ARCANOS_MAYORES");
    }
    
    /**
     * Método booleano que indica si la carta a la que se le está haciendo la
     * llamada a esta función es o no un Arcano Menor.
     * @return Booleano.
     */
    public boolean esArcanoMenor()
    {
        return !this.esArcanoMayor();
    }
    
    /**
     * Método booleano que indica si la carta a la que se le está haciendo la
     * llamada a esta función pertenece o no al palo de Oros.
     * @return Booleano.
     */
    public boolean esOros()
    {
        return this.esArcanoMenor() && this.getPalo() == PalosBarajaTarot.OROS;
    }
    
    /**
     * Método booleano que indica si la carta a la que se le está haciendo la
     * llamada a esta función pertenece o no al palo de Copas.
     * @return Booleano.
     */
    public boolean esCopas()
    {
        return this.esArcanoMenor() && this.getPalo() == PalosBarajaTarot.COPAS;
    }
    
    /**
     * Método booleano que indica si la carta a la que se le está haciendo la
     * llamada a esta función pertenece o no al palo de Espadas.
     * @return Booleano.
     */
    public boolean esEspadas()
    {
        return this.esArcanoMenor() && this.getPalo() == PalosBarajaTarot.ESPADAS;
    }
    
    /**
     * Método booleano que indica si la carta a la que se le está haciendo la
     * llamada a esta función pertenece o no al palo de Bastos.
     * @return Booleano.
     */
    public boolean esBastos()
    {
        return this.esArcanoMenor() && this.getPalo() == PalosBarajaTarot.BASTOS;
    }
    
    /**
     * Método booleano que indica si la carta a la que se le está haciendo la
     * llamada a esta función es o no un número.
     * @return Booleano.
     */
    public boolean esNumero()
    {
        return this.esArcanoMenor() && this.getNumero() <= 10;
    }
    
    /**
     * Método booleano que indica si la carta a la que se le está haciendo la
     * llamada a esta función es o no una carta de Corte.
     * @return Booleano.
     */
    public boolean esCorte()
    {
        return this.esArcanoMenor() && this.getNumero() > 10;
    }
    
    /**
     * Método booleano que indica si la carta a la que se le está haciendo la
     * llamada a esta función es o no un As.
     * @return Booleano.
     */
    public boolean esAs()
    {
        return this.esArcanoMenor() && this.getNumero() == 1;
    }
    
    /**
     * Método booleano que indica si la carta a la que se le está haciendo la
     * llamada a esta función es o no una Sota.
     * @return Booleano.
     */
    public boolean esSota()
    {
        return this.esCorte() && this.getNumero() == 11;
    }
    
    /**
     * Método booleano que indica si la carta a la que se le está haciendo la
     * llamada a esta función es o no un Caballero.
     * @return Booleano.
     */
    public boolean esCaballero()
    {
        return this.esCorte() && this.getNumero() == 12;
    }
    
    /**
     * Método booleano que indica si la carta a la que se le está haciendo la
     * llamada a esta función es o no una Reina.
     * @return Booleano.
     */
    public boolean esReina()
    {
        return this.esCorte() && this.getNumero() == 13;
    }
    
    /**
     * Método booleano que indica si la carta a la que se le está haciendo la
     * llamada a esta función es o no un Rey.
     * @return Booleano.
     */
    public boolean esRey()
    {
        return this.esCorte() && this.getNumero() == 14;
    }
    
    /**
     * Método booleano que indica si la carta a la que se le está haciendo la
     * llamada a esta función pertenece o no un palo Yin.
     * @return Booleano.
     */
    public boolean esYin()
    {
        return this.esArcanoMenor() && 
               (this.getPalo() == PalosBarajaTarot.OROS || 
                this.getPalo() == PalosBarajaTarot.COPAS);
    }
    
    /**
     * Método booleano que indica si la carta a la que se le está haciendo la
     * llamada a esta función pertenece o no un palo Yang.
     * @return Booleano.
     */
    public boolean esYang()
    {
        return this.esArcanoMenor() && 
               (this.getPalo() == PalosBarajaTarot.ESPADAS || 
                this.getPalo() == PalosBarajaTarot.BASTOS);
    }
    
    /**
     * Método booleano que indica si la carta a la que se le está haciendo la
     * llamada a esta función pertenece o no un palo activo.
     * @return Booleano.
     */
    public boolean esActiva()
    {
        return this.esYang();
    }
    
    /**
     * Método booleano que indica si la carta a la que se le está haciendo la
     * llamada a esta función pertenece o no un palo pasivo.
     * @return Booleano.
     */
    public boolean esPasiva()
    {
        return this.esYin();
    }
    
    
    
    /*********************/
    /*** OTROS MÉTODOS ***/
    /*********************/
    
    /**
     * Método 'getter' que devuelve un objeto de la clase enumerada
     * 'ArcanosMayoresTarot' con la información del Arcano Mayor en cuestión,
     * en caso de serlo.
     * @return Arcano Mayor que compone la carta de Tarot al que se le ha realizado
     * la llamada sobre esta función, o 'null' en caso de ser un Arcano Menor.
     */
    public ArcanosMayoresTarot getArcanoMayor()
    {
        if (esArcanoMayor())
            return this.arcanos[this.numero];
        else
            return null;
    }
    
    /**
     * Método sobreescrito de la superclase Object.
     * @return Cadena de texto con toda la información sobre el naipe.
     */
    @Override
    public String toString()
    {
       //Discriminamos la carta según si es un arcano mayor o menor:
        if(esArcanoMayor())
            return this.numero + " - " + getArcanoMayor().toString();
        else
        {
            switch(this.numero)
            {
                case 1: return "AS de " + this.palo.toString();
                case 11: return "SOTA de " + this.palo.toString();
                case 12: return "CABALLERO de " + this.palo.toString();
                case 13: return "REINA de " + this.palo.toString();
                case 14: return "REY de " + this.palo.toString();
                default: return this.numero + " de " + this.palo.toString();
            }
        }
    }
}