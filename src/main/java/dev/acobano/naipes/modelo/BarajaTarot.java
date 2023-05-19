package dev.acobano.naipes.modelo;

/**
 * Clase extendida de Baraja que representa un mazo de cartas del Tarot.
 * @author Álvaro Cobano
 */
public class BarajaTarot extends Baraja
{
    /**
     * Constructor que instancia una baraja de Tarot.
     * @param esFormatoExtendido Booleano que indica si se desean todas las 
     * cartas de la baraja (true) o únicamente los Arcanos Mayores (false).
     */
    public BarajaTarot (boolean esFormatoExtendido)
    {
        //Instanciación de los atributos de la clase padre:
        if (esFormatoExtendido)
            super.mazo = new CartaTarot[78];
        else
            super.mazo = new CartaTarot[22];
        
        super.indiceBaraja = 0;
        
        //Creamos un array de palos para poder recorrerlos posteriormente:
        PalosBarajaTarot[] palos = PalosBarajaTarot.values();
        
        //Se inicializa el contador para la baraja de cartas:
        int contador = 0;
        
        //Empezamos con los arcanos menores:
        if (esFormatoExtendido)
        {
           //Recorremos todos los palos (menos el último, al ser los arcanos mayores) de la baraja:
            for (int i=0; i<palos.length-1; i++)

                //Dentro de cada palo, recorremos todos los números que tendrá dicho palo:
                for (int j=1; j<=14; j++, contador++)
                    super.mazo[contador] = new CartaTarot(j, palos[i]); 
        }
        
        //Una vez terminado, ahora introducimos en la baraja los arcanos mayores:
        for (int k=0; k<22; k++, contador++)
            super.mazo[contador] = new CartaTarot(k, PalosBarajaTarot.ARCANOS_MAYORES);
    }
}