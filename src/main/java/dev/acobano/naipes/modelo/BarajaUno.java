package dev.acobano.naipes.modelo;

/**
 * Clase extendida de Baraja que representa un mazo de cartas del 'UNO'.
 * @author Álvaro Cobano
 */
public class BarajaUno extends Baraja
{
    /**
     * Constructor que instancia una baraja del juego de mesa 'UNO'.
     */
    public BarajaUno()
    {
        //Inicializamos los valores de la clase padre:
        super.mazo = new CartaUno[108];
        super.indiceBaraja = 0;
        
        //Variable contador para llevar la cuenta de la baraja:
        int contador = 0;
        
        //Creamos un array de colores del Uno para recorrerlos:
        ColoresUno[] colores = ColoresUno.values();
        
        for (int a=0; a<colores.length-1; a++)
        {
            //Inserción del número cero del color indicado (solo hay 1 carta)
            super.mazo[contador] = new CartaUno(0, colores[a], null);
            contador++;
            
            //Inserción del resto de números del color indicado (2 cartas de cada)
            for (int i=1; i<=9; i++)
                for (int j=1; j<=2; j++, contador++)
                    super.mazo[contador] = new CartaUno(i, colores[a], null);
            
            //Inserción de las cartas especiales que tiene cada color (2 cartas de cada)
            //(Chúpate dos, cambio de sentido, salto de turno)
            for (int u=1; u<=2; u++, contador++)
                super.mazo[contador] = new CartaUno(u, colores[a], ComodinesEspecialesUno.CHUPATE_DOS);
            
            for (int v=1; v<=2; v++, contador++)
                super.mazo[contador] = new CartaUno(v, colores[a], ComodinesEspecialesUno.CAMBIO_SENTIDO);
            
            for (int w=1; w<=2; w++, contador++)
                super.mazo[contador] = new CartaUno(w, colores[a], ComodinesEspecialesUno.PIERDE_TURNO);
        }
        
        //Por último, insertamos las cartas negras:
        for (int b=1; b<=4; b++, contador++)
            super.mazo[contador] = new CartaUno(b, ColoresUno.NEGRO, ComodinesEspecialesUno.CHUPATE_CUATRO);
        
        for (int c=1; c<=4; c++, contador++)
            super.mazo[contador] = new CartaUno(c, ColoresUno.NEGRO, ComodinesEspecialesUno.CAMBIO_COLOR);
    }
}