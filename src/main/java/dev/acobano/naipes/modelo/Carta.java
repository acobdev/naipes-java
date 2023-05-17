package dev.acobano.naipes.modelo;

/**
 * CLASE ABSTRACTA QUE REPRESENTA LA BASE SOBRE LA QUE SE CONSTRUIRÁ
 * CUALQUIER CARTA DE LOS MAZOS EMPLEADOS EN ESTE PROYECTO
 * @author Álvaro Cobano
 * @param <T> Clase enumerada mutable que representa el palo de la carta.
 */
public abstract class Carta<T> extends Object
{
    
    /*****************/
    /*** ATRIBUTOS ***/
    /*****************/
    
    /**
     * Atributo de tipo entero que guarda el número de la carta.
     */
    protected int numero;
    
    /**
     * Atributo de tipo mutable que representa el palo de la carta.
     */
    protected T palo;
    
    
    
    /*********************/
    /*** CONSTRUCTORES ***/
    /*********************/
    
    /**
     * Constructor sin parámetros de entrada.
     */
    public Carta() {}
    
    /**
     * Constructor con parámetros de entrada.
     * @param numero Parámetro de tipo entero que representa el número de la carta.
     * @param palo Parámetro de tipo mutable que representa el palo de la carta.
     */
    public Carta(int numero, T palo) 
    {
        this.numero = numero;
        this.palo = palo;
    }
    
    
    
    /*************************/
    /*** MÉTODOS 'GETTERS' ***/
    /*************************/
    
    /**
     * Método 'getter' que devuelve el número de la carta.
     * @return Parámetro de tipo entero.
     */
    public int getNumero() 
    {
        return numero;
    }

    /**
     * Método 'getter' que devuelve el palo de la carta.
     * @return Parámetro de tipo variable.
     */
    public T getPalo() 
    {
        return palo;
    }   
}