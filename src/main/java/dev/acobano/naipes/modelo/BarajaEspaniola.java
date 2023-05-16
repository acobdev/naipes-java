package dev.acobano.naipes.modelo;

/**
 * Clase extendida de Baraja que representa un mazo de naipes españoles.
 * @author Álvaro Cobano
 */
public class BarajaEspaniola extends Baraja
{
    /**
     * Constructor que instancia una baraja ordenada de cartas españolas.
     * @param esFormatoExtendido Parámetro booleano que indica si se desea la baraja 
     * completa (true) o truncada por los ochos y los nueves (false).
     * @param numeroComodines Parámetro de tipo entero que indica el número 
     * de comodines que se desea en la baraja.
     */
    public BarajaEspaniola(boolean esFormatoExtendido, int numeroComodines)
    {
        super.indiceBaraja = 0;
        int cartasPorPalo;  //Variable entera que especifica el número de cartas que hay en cada palo.
        
        //Instrucción de control por si se introduce un número negativo de comodines:
        if (numeroComodines < 0)
            numeroComodines = 0;
        
        //Se exponen los límites del array que conforman la baraja
        //y especificamos el número de cartas por palo:
        if (esFormatoExtendido)
        {
            super.mazo = new CartaEspaniola[48 + numeroComodines];
            cartasPorPalo = 12;
        
        } else {
            
            super.mazo = new CartaEspaniola[40 + numeroComodines];
            cartasPorPalo = 10;
        }
        
        //Creamos un array de palos para poder recorrerlos posteriormente:
        PalosBarajaEspaniola[] palos = PalosBarajaEspaniola.values();
        
        //Se inicializa el contador para la baraja de cartas:
        int contador = 0;
        
        //Recorremos todos los palos (menos el último, al ser los comodines) de la baraja:
        for (int i=0; i<palos.length-1; i++)
        {
            //Dentro de cada palo, recorremos todos los números que tendrá dicho palo:
            for (int j=1; j<=cartasPorPalo; j++, contador++)
            {
                
                //Se discrimina en función al número de cartas que haya por palo:
                if (esFormatoExtendido)
                    super.mazo[contador] = new CartaEspaniola(j, palos[i]);
                else
                {
                    //Cartas del 1 al 7:
                    if (j <= 7)
                        super.mazo[contador] = new CartaEspaniola(j, palos[i]);
                    
                    //Cartas de figuras:
                    else
                        super.mazo[contador] = new CartaEspaniola(j+2, palos[i]);
                }
            }
        }
        
        //Por último, añadimos los comodines que se hayan indicado:
        if (numeroComodines != 0)
            for(int k=1; k<=numeroComodines; k++, contador++)
                super.mazo[contador] = new CartaEspaniola(0, PalosBarajaEspaniola.COMODIN);
    }
    
    
    /**
     * Constructor que instancia una baraja ordenada de naipes españoles compuesta
     * por un número variable de mazos.
     * @param numeroBarajas Parámetro de tipo entero que expone el número de barajas
     * que se desee introducir dentro del mazo instanciado.
     * @param esFormatoExtendido Parámetro booleano que indica si se desea la baraja 
     * completa (true) o truncada por los ochos y los nueves (false).
     * @param numeroComodines Entero que indica el número de comodines que 
     * se desea en la baraja.
     */
    public BarajaEspaniola(int numeroBarajas, boolean esFormatoExtendido, int numeroComodines)
    {
        super.indiceBaraja = 0;
        int cartasPorPalo;  //Variable entera que especifica el número de cartas que hay en cada palo.
        
        //Creamos un array de palos para poder recorrerlos posteriormente:
        PalosBarajaEspaniola[] palos = PalosBarajaEspaniola.values();
        
        //Se inicializa el contador para la baraja de cartas:
        int contador = 0;
        
        //Instrucción de control por si se introduce un número negativo de comodines:
        if (numeroComodines < 0)
            numeroComodines = 0;
        
        if (numeroBarajas <= 1)
        {
            //Se exponen los límites del array que conforman la baraja
            //y especificamos el número de cartas por palo:
            if (esFormatoExtendido)
            {
                super.mazo = new CartaEspaniola[48 + numeroComodines];
                cartasPorPalo = 12;

            } else {

                super.mazo = new CartaEspaniola[40 + numeroComodines];
                cartasPorPalo = 10;
            }
            
            //Recorremos todos los palos (menos el último, al ser los comodines) de la baraja:
            for (int i=0; i<palos.length-1; i++)
            {
                //Dentro de cada palo, recorremos todos los números que tendrá dicho palo:
                for (int j=1; j<=cartasPorPalo; j++, contador++)
                {

                    //Se discrimina en función al número de cartas que haya por palo:
                    if (esFormatoExtendido)
                        super.mazo[contador] = new CartaEspaniola(j, palos[i]);
                    else
                    {
                        //Cartas del 1 al 7:
                        if (j <= 7)
                            super.mazo[contador] = new CartaEspaniola(j, palos[i]);

                        //Cartas de figuras:
                        else
                            super.mazo[contador] = new CartaEspaniola(j+2, palos[i]);
                    }
                }
            }

            //Por último, añadimos los comodines que se hayan indicado:
            if (numeroComodines != 0)
                for(int k=1; k<=numeroComodines; k++, contador++)
                    super.mazo[contador] = new CartaEspaniola(0, PalosBarajaEspaniola.COMODIN);
        
        } else {
            
            if (esFormatoExtendido)
            {
                super.mazo = new CartaEspaniola[(48 * numeroBarajas) + numeroComodines];
                cartasPorPalo = 12;

            } else {

                super.mazo = new CartaEspaniola[(40 * numeroBarajas) + numeroComodines];
                cartasPorPalo = 10;
            }
            
            for (int a=1; a<=numeroBarajas; a++)
            {
                //Recorremos todos los palos (menos el último, al ser los comodines) de la baraja:
                for (int i=0; i<palos.length-1; i++)
                {
                    //Dentro de cada palo, recorremos todos los números que tendrá dicho palo:
                    for (int j=1; j<=cartasPorPalo; j++, contador++)
                    {

                        //Se discrimina en función al número de cartas que haya por palo:
                        if (esFormatoExtendido)
                            super.mazo[contador] = new CartaEspaniola(j, palos[i]);
                        else
                        {
                            //Cartas del 1 al 7:
                            if (j <= 7)
                                super.mazo[contador] = new CartaEspaniola(j, palos[i]);

                            //Cartas de figuras:
                            else
                                super.mazo[contador] = new CartaEspaniola(j+2, palos[i]);
                        }
                    }
                }
            }

            //Por último, añadimos los comodines que se hayan indicado:
            if (numeroComodines != 0)
                for(int k=1; k<=numeroComodines; k++, contador++)
                    super.mazo[contador] = new CartaEspaniola(0, PalosBarajaEspaniola.COMODIN);
        }
    }
}