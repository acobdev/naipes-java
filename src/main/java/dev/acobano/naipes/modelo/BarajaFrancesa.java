package dev.acobano.naipes.modelo;

/**
 *Clase extendida de Baraja que representa un mazo de cartas de póker.
 * @author Álvaro Cobano
 */
public class BarajaFrancesa extends Baraja
{
    /**
     * Constructor que instancia una baraja ordenada de cartas de póker.
     * @param numeroJoker Parámetro de tipo entero que indica el número 
     * de comodines que se desea en la baraja.
     */
    public BarajaFrancesa(int numeroJoker)
    {
        //Instrucción de control por si se introduce un número negativo de comodines:
        if (numeroJoker < 0)
            numeroJoker = 0;
        
        //Instanciación de los atributos de la clase padre:
        super.indiceBaraja = 0;
        super.mazo = new CartaFrancesa[52 + numeroJoker];
        
        //Creamos un array de palos para poder recorrerlos posteriormente:
        PalosBarajaFrancesa[] palos = PalosBarajaFrancesa.values();
        
        //Se inicializa el contador para la baraja de cartas:
        int contador = 0;
        
        //Recorremos todos los palos (menos el último, al ser los comodines) de la baraja:
        for (int i=0; i<palos.length-1; i++)
            
            //Dentro de cada palo, recorremos todos los números que tendrá dicho palo:
            for (int j=1; j<=13; j++, contador++)
                    super.mazo[contador] = new CartaFrancesa(j, palos[i]);
        
        //Por último, añadimos los comodines que se hayan indicado:
        if (numeroJoker != 0)
            for(int k=1; k<=numeroJoker; k++, contador++)
                super.mazo[contador] = new CartaFrancesa(0, PalosBarajaFrancesa.JOKER);
    }
    
    
    /**
     * Constructor que instancia una baraja ordenada de naipes españoles compuesta
     * por un número variable de mazos.
     * @param numeroBarajas Parámetro de tipo entero que expone el número de barajas
     * que se desee introducir dentro del mazo instanciado.
     * @param numeroJoker Parámetro de tipo entero que indica el número 
     * de comodines que se desea en la baraja.
     */
    public BarajaFrancesa(int numeroBarajas, int numeroJoker)
    {
        //Instrucción de control por si se introduce un número negativo de comodines:
        if (numeroJoker < 0)
            numeroJoker = 0;
        
        //Instrucción de control por si se introduce un número negativo de barajas:
        if (numeroBarajas < 1)
            numeroBarajas = 1;
        
        //Instanciación de los atributos de la clase padre:
        super.indiceBaraja = 0;
        super.mazo = new CartaFrancesa[(52 * numeroBarajas) + numeroJoker];
        
        //Creamos un array de palos para poder recorrerlos posteriormente:
        PalosBarajaFrancesa[] palos = PalosBarajaFrancesa.values();
        
        //Se inicializa el contador para la baraja de cartas:
        int contador = 0;
        
        //Se rellena la baraja con las cartas de póker:
        for (int a=1; a<=numeroBarajas; a++)
            for (int i=0; i<palos.length-1; i++)
                for (int j=1; j<=13; j++, contador++)
                        super.mazo[contador] = new CartaFrancesa(j, palos[i]);
        
        //Por último, añadimos los comodines que se hayan indicado:
        if (numeroJoker != 0)
            for(int k=1; k<=numeroJoker; k++, contador++)
                super.mazo[contador] = new CartaFrancesa(0, PalosBarajaFrancesa.JOKER);
    }
}