package dev.acobano.naipes.modelo;

/**
 * Clase Java que simula el comportamiento de una carta del juego de mesa 'UNO'.
 * @author Álvaro Cobano
 */
public class CartaUno extends Carta<ColoresUno>
{
    /****************/
    /*** ATRIBUTO ***/
    /****************/
    
    /**
     * Atributo de tipo 'ComodinesEspecialesUno' que representa si una carta de UNO 
     * pertenece al grupo de los comodines, y a cuál de estos en caso afirmativo.
     */
    private ComodinesEspecialesUno especial;
    
    
    
    /*******************/
    /*** CONSTRUCTOR ***/
    /*******************/
    
    /**
     * Constructor con parámetros de entrada que instancia una carta del juego
     * de mesa 'UNO'.
     * @param numero Parámetro de tipo entero que representa el número de la carta.
     * @param color Parámetro de tipo enumerado 'ColoresUno' que representa el
     * color de la carta.
     * @param especial Parámetro de tipo enumerado 'ComodinesEspecialesUno' que
     * representa si la carta posee algún atributo de comodín.
     */
    public CartaUno(int numero, ColoresUno color, ComodinesEspecialesUno especial)
    {
        super.numero = numero;
        super.palo = color;
        this.especial = especial;
    }
    
    
    
    /************************************/
    /*** MÉTODOS BOOLEANOS DE CONTROL ***/
    /************************************/
    
    /**
     * Método booleano que indica si la carta a la que se le está haciendo la
     * llamada a esta función es una carta normal, o lo que es lo mismo, no es
     * un comodín ni una carta especial.
     * @return Booleano.
     */
    public boolean esCartaNormal()
    {
        return this.especial == null;
    }
    
    /**
     * Método booleano que indica si la carta a la que se le está haciendo la
     * llamada a esta función es una carta especial o comodín.
     * @return Booleano.
     */
    public boolean esCartaEspecial()
    {
        return this.especial != null;
    }
    
    /**
     * Método booleano que indica si la carta a la que se le está haciendo la
     * llamada a esta función pertenece al color azul.
     * @return Booleano.
     */
    public boolean esAzul()
    {
        return this.getPalo() == ColoresUno.AZUL;
    }
    
    /**
     * Método booleano que indica si la carta a la que se le está haciendo la
     * llamada a esta función pertenece al color verde.
     * @return Booleano.
     */
    public boolean esVerde()
    {
        return this.getPalo() == ColoresUno.VERDE;
    }
    
    /**
     * Método booleano que indica si la carta a la que se le está haciendo la
     * llamada a esta función pertenece al color rojo.
     * @return Booleano.
     */
    public boolean esRojo()
    {
        return this.getPalo() == ColoresUno.ROJO;
    }
    
    /**
     * Método booleano que indica si la carta a la que se le está haciendo la
     * llamada a esta función pertenece al color amarillo.
     * @return Booleano.
     */
    public boolean esAmarillo()
    {
        return this.getPalo() == ColoresUno.AMARILLO;
    }
    
    /**
     * Método booleano que indica si la carta a la que se le está haciendo la
     * llamada a esta función pertenece al color negro.
     * @return Booleano.
     */
    public boolean esNegro()
    {
        return this.getPalo() == ColoresUno.NEGRO;
    }
    
    /**
     * Método booleano que indica si la carta a la que se le está haciendo la
     * llamada a esta función es un comodín que obliga al siguiente jugador a
     * coger dos cartas del mazo.
     * @return Booleano.
     */
    public boolean esChupateDos()
    {
        return this.especial == ComodinesEspecialesUno.CHUPATE_DOS;
    }
    
    /**
     * Método booleano que indica si la carta a la que se le está haciendo la
     * llamada a esta función es un comodín que obliga al siguiente jugador a
     * coger cuatro cartas del mazo.
     * @return Booleano.
     */
    public boolean esChupateCuatro()
    {
        return this.especial == ComodinesEspecialesUno.CHUPATE_CUATRO;
    }
    
    /**
     * Método booleano que indica si la carta a la que se le está haciendo la
     * llamada a esta función es un comodín que permite cambiar el color al que
     * lleve el turno de la partida.
     * @return Booleano.
     */
    public boolean esCambioColor()
    {
        return this.especial == ComodinesEspecialesUno.CAMBIO_COLOR;
    }
    
    /**
     * Método booleano que indica si la carta a la que se le está haciendo la
     * llamada a esta función es un comodín que cambia el sentido del juego.
     * @return Booleano.
     */
    public boolean esCambioSentido()
    {
        return this.especial == ComodinesEspecialesUno.CAMBIO_SENTIDO;
    }
    
    /**
     * Método booleano que indica si la carta a la que se le está haciendo la
     * llamada a esta función es un comodín que obliga al siguiente jugador a
     * saltar su turno.
     * @return Booleano.
     */
    public boolean esPierdeTurno()
    {
        return this.especial == ComodinesEspecialesUno.PIERDE_TURNO;
    }
    
    
    
    /**
     * Método sobreescrito de la superclase Object.
     * @return Cadena de texto con toda la información sobre la carta.
     */
    @Override
    public String toString()
    {
        if (this.esCambioColor() || this.esChupateCuatro())
            return this.especial.toString();
        else if (this.esChupateDos() || this.esCambioSentido() || this.esPierdeTurno())
            return this.especial.toString() + " - " + this.palo.toString();
        else
            return this.numero + " " + this.palo.toString();
    }
}