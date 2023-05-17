package dev.acobano.naipes.modelo;

/**
 * CLASE JAVA ABSTRACTA QUE REPRESENTA A UN MAZO ESTÁNDAR DE CARTAS
 * @author Álvaro Cobano
 */
public abstract class Baraja extends Object
{
    
    /*****************/
    /*** ATRIBUTOS ***/
    /*****************/
    
    /**
     * Array de cartas que representa la baraja.
     */
    protected Carta[] mazo;
    
    /**
     * Atributo de tipo entero que guarda el indice del array en el que se
     * encuentra actualmente la baraja cortada.
     */
    protected int indiceBaraja;
    
    
    
    /*********************/
    /*** CONSTRUCTORES ***/
    /*********************/
    
    /**
     * Constructor sin parámetros de entrada.
     */
    public Baraja() {}
    
    /**
     * Constructor con parámetros de entrada.
     * @param numCartas Parámetro de tipo entero que representa el número de
     * cartas que contendrá el mazo.
     */
    public Baraja(int numCartas)
    {
        this.mazo = new Carta[numCartas];
        this.indiceBaraja = 0;
    }
    
    
    
    /*****************/
    /***  MÉTODOS  ***/
    /*****************/
    
    /**
     * Método 'getter' que indica el número de cartas del que está compuesto la baraja.
     * @return Parámetro de tipo entero.
     */
    public int getNumeroTotalCartas()
    {
        return this.getBaraja().length;
    }
    
    /**
     * Método 'getter' que indica el número de cartas que ya han salido de la baraja.
     * @return Parámetro de tipo entero.
     */
    public int getNumeroCartasSacadas()
    {
        return this.indiceBaraja;
    }
    
    /**
     * Método 'getter' que indica el número de cartas que faltan por salir en la baraja.
     * @return Parámetro de tipo entero.
     */
    public int getNumeroCartasQueFaltan()
    {
        return this.getBaraja().length - this.indiceBaraja;
    }
    
    /**
     * Método 'getter' que devuelve el mazo entero.
     * @return Array de cartas que representa a la baraja.
     */
    public Carta[] getBaraja()
    {
        return this.mazo;
    }
    
    /**
     * Método 'getter' que proporciona la sección de cartas que ya ha sido
     * usadas con anterioridad en el mazo.
     * @return Array de objetos de la clase Carta, o 'null' en caso de no
     * haber sido la baraja estrenada.
     */
    public Carta[] getMazoDescarte()
    {
        if (this.getNumeroCartasSacadas() == 0)
            return null;
        else
        {
            Carta[] montonDescartes = new Carta[this.getNumeroCartasSacadas()];
            
            for (int i=0, j=this.indiceBaraja-1; i<this.indiceBaraja; i++, j--)
                montonDescartes[i] = this.getBaraja()[j];
            
            return montonDescartes;
        }
    }
    
    /**
     * Método 'getter' que proporciona la sección de cartas que 
     * todavía no han sido usadas en el mazo, pero sin avanzar el índice.
     * @return Array de objetos de la clase Carta, o 'null' en caso de
     * no quedar más cartas en la baraja.
     */
    public Carta[] getRestoBaraja()
    {
        if (!this.quedanCartas())
            return null;
        else
        {
            Carta[] restoDelMazo = new Carta[this.getNumeroCartasQueFaltan()];
            
            for (int i=0; i<getNumeroCartasQueFaltan(); i++)
                restoDelMazo[i] = this.getBaraja()[this.indiceBaraja + i];
            
            return restoDelMazo;
        }
    }
    
    /**
     * Método que baraja de manera pseudoaleatoria las cartas que integran
     * el mazo al que se le ha hecho la llamada.
     */
    public void barajar()
    {
        int posicionAleatoria;
        Carta aux;
        
        for (int i=0; i<this.getNumeroTotalCartas(); i++)
        {
            posicionAleatoria = (int) (Math.random() * (this.getBaraja().length - 1));
            
            aux = this.mazo[i];
            this.mazo[i] = this.mazo[posicionAleatoria];
            this.mazo[posicionAleatoria] = aux;
        }
    }
    
    /**
     * Método 'getter' que coge la próxima carta disponible en el mazo.
     * @return Objeto de la clase Carta, o 'null' en caso de 
     * haber llegado al final del mazo.
     */
    public Carta cogerCarta()
    {
        if (!this.quedanCartas())
            return null;
        else
            return this.getBaraja()[indiceBaraja++];
    }
    
    /**
     * Método 'getter' que da un array de cartas con un tamaño 
     * dado por parámetro de entrada, o todas aquellas que falten 
     * por salir en caso de no poder completar el cupo.
     * @param numCartas Parámetro de tipo entero que 
     * indica el número de cartas a repartir.
     * @return Array de objetos de la clase Carta, o 'null' en caso de haber 
     * llegado al final del mazo o de introducir un número negativo 
     * como parámetro de entrada.
     */
    public Carta[] cogerCartas(int numCartas)
    {
        Carta[] cartasADar = null;
        
        //CASO 1: Se pide un número negativo por parámetro de entrada.
        if (numCartas <= 0 || !this.quedanCartas())
            return null;
        //CASO 2: Se introduce un número mayor que las que quedan en el mazo.
        else if (numCartas > this.getNumeroCartasQueFaltan())
        {
            cartasADar = new Carta[this.getNumeroCartasQueFaltan()];
            
            for (int i=0; i<this.getNumeroCartasQueFaltan(); i++)
                cartasADar[i] = this.cogerCarta();
        }
        //CASO 3: Se pide un número de cartas correcto.
        else
        {
            cartasADar = new Carta[numCartas];
            
            for (int i=0; i<numCartas; i++)
                cartasADar[i] = this.cogerCarta();
        }
            
        return cartasADar;
    }
    
    /**
     * Método 'getter' que muestra la próxima carta del mazo, pero sin
     * avanzar el índice de la baraja.
     * @return Objeto de la clase Carta, o 'null' en caso de haber 
     * llegado al final del mazo.
     */
    public Carta mirarProximaCarta()
    {
        if (!this.quedanCartas())
            return null;
        else
            return this.getBaraja()[indiceBaraja + 1];
    }
    
    /**
     * Método 'getter' que muestra las próximas cartas disponibles en el mazo
     * cuyo rango se encuentre dentro de aquel introducido por parámetro de 
     * entrada, o todas aquellas que falten por salir en caso de no poder 
     * completar el cupo.
     * @param numCartas Parámetro de tipo entero que indica el número de
     * cartas que se desee mirar.
     * @return Array de objetos de la clase Carta, o 'null' en caso de no haber
     * más cartas para poder mirar o de introducir un número negativo 
     * como parámetro de entrada.
     */
    public Carta[] mirarCartas(int numCartas)
    {
        Carta[] cartasAMirar = null;
        
        //CASO 1: Se introduce un número negativo como parámetro de entrada.
        if (numCartas <= 0 || !this.quedanCartas())
            return null;
        //CASO 2: Se introduce un número mayor al de cartas que quedan por salir.
        else if (numCartas > this.getNumeroCartasQueFaltan())
        {
            cartasAMirar = new Carta[this.getNumeroCartasQueFaltan()];
            
            for (int i=0; i<this.getNumeroCartasQueFaltan(); i++)
                cartasAMirar[i] = this.getBaraja()[indiceBaraja + i];
        }
        //CASO 3: Se pide un número de cartas correcto.
        else
        {
            cartasAMirar = new Carta[numCartas];
            
            for (int i=0; i<numCartas; i++)
                cartasAMirar[i] = this.getBaraja()[indiceBaraja + i];
        }
        
        return cartasAMirar;
    }
    
    /**
     * Método 'getter' que muestra la última carta sacada del mazo.
     * @return Objeto de la clase Carta, o 'null' en caso de no 
     * haber sacado ninguna carta de la baraja todavía.
     */
    public Carta mirarUltimoDescarte()
    {
        if (this.getNumeroCartasSacadas() == 0)
            return null;
        else
            return this.getBaraja()[indiceBaraja - 1];
    }
    
    /**
     * Método 'getter' que muestra aquellas cartas que han sido ya empleadas
     * en la baraja, en el que la primera carta del array es la última
     * que ha sido usada, siguiendo una ordenación First In - Last Out.
     * @param numCartas Parámetro de tipo entero que indica el 
     * número de cartas que se desee mirar.
     * @return Array de objetos de la clase Carta, o 'null' en caso de no
     * haber sacado ninguna carta de la baraja todavía o de introducir 
     * un número negativo como parámetro de entrada.
     */
    public Carta[] mirarDescartes(int numCartas)
    {
        
        Carta[] cartasAMirar = null;
        
        //CASO 1: Se introduce un número negativo como parámetro de entrada.
        if (numCartas <= 0 || this.getNumeroCartasSacadas() == 0)
            return null;
        //CASO 2: Se introduce un número mayor al de cartas ya sacadas.
        else if(numCartas > this.getNumeroCartasSacadas())
        {
            cartasAMirar = new Carta[this.getNumeroCartasSacadas()];
            
            for (int i=0, j=this.indiceBaraja-1; j>=0; i++, j--)
                cartasAMirar[i] = this.getBaraja()[j];
        }
        //CASO 3: Se pide un número de cartas correcto.
        else
        {
            cartasAMirar = new Carta[numCartas];
            
            for (int i=0, j=this.indiceBaraja-1; i<=numCartas; i++, j--)
                cartasAMirar[i] = this.getBaraja()[j];
        }
        
        return cartasAMirar;
    }
    
    /**
     * Método que indica si aún quedan cartas en el mazo.
     * @return Booleano.
     */
    public boolean quedanCartas()
    {
        return this.indiceBaraja != this.getBaraja().length;
    }
    
    /**
     * Método que imprime en consola todas las cartas de la baraja.
     */
    public void imprimirBaraja()
    {
        for(int i=0; i<this.getNumeroTotalCartas(); i++)
            System.out.println(this.getBaraja()[i].toString());
    }
    
    /**
     * Método sobreescrito de la superclase Object.
     * @return Cadena de texto con toda la información de la baraja.
     */
    @Override
    public String toString()
    {
        String mensaje = "-- BARAJA en JAVA --\n";
        mensaje += "CLASE: " + this.getBaraja()[0].getClass().toString() + "\n";
        mensaje += this.getNumeroTotalCartas() + " cartas\n\n";
        
        for (int i=0; i<this.getNumeroTotalCartas(); i++)
            mensaje += (i+1) + " - " + this.getBaraja()[i].toString();
        
        return mensaje;
    }
}