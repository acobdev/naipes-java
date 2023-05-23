package dev.acobano.naipes.modelo;

import java.io.IOException;

/**
 * Clase Java que simula a una carta de Clow, del anime 'Cardcaptor Sakura'.
 * @author Álvaro Cobano
 */
public class CartaClow extends Carta<NombresCartasClow>
{
    /****************/
    /*** ATRIBUTO ***/
    /****************/
    
    private NombresCartasClow[] cartas = NombresCartasClow.values();     //Array con los nombres de las cartas.
    
    
    /*******************/
    /*** CONSTRUCTOR ***/
    /*******************/
    
    /**
     * Constructor al que se le introduce un entero como parámetro de entrada.
     * @param numero Parámetro de tipo entero que representa el número de la carta.
     * @throws java.io.IOException Excepción lanzada en caso de introducir como
     * parámetro de entrada un número fuera del rango 1-52.
     */
    public CartaClow(int numero) throws IOException
    {
        //Validamos si el parámetro de entrada está en los niveles aceptables:
        validarNumero(numero);
        
        //Obtenemos el nombre correspondiente a la carta mediante el array:
        NombresCartasClow nombre = cartas[numero - 1];
        
        //Inicializamos los atributos de la clase padre Carta:
        super.numero = numero;
        super.palo = nombre;
    }
    
    /**
     * Constructor al que se le introduce un objeto de la clase Java enumerada
     * 'NombresCartasClow' como parámetro de entrada.
     * @param nombre Enumerado Java que representa el nombre de la carta.
     * @throws java.io.IOException Excepción lanzada en caso de introducir 'null'
     * como parámetro de entrada.
     */
    public CartaClow(NombresCartasClow nombre) throws IOException
    {
        validarNombre(nombre);
        
        for (int i=0; i<cartas.length; i++)
            if(cartas[i].equals(nombre)) {
                super.numero = i + 1;
                super.palo = nombre;
                break;
            }
    }
    
    
    //MÉTODOS PRIVADOS PARA VALIDAR LOS PARÁMETROS DE ENTRADA:
    private void validarNumero(int numero)
            throws IOException
    {
        if (numero <= 0 || numero > 52)
            throw new IOException("Una carta Clow únicamente acepta como parámetros de entrada la serie de números comprendidos entre 1 y 52.");
    }
    
    private void validarNombre(NombresCartasClow nombre)
            throws IOException
    {
        if (nombre == null)
            throw new IOException("Una carta Clow debe tener un valor enumerado 'NombresCartasClow' diferente a 'null'.");
    }
    
    
    
    /*************************/
    /*** MÉTODOS 'GETTERS' ***/
    /*************************/
    
    /**
     * Método 'getter' que deuvelve el kanji que representa a la carta Clow.
     * @return Cadena de texto con un kanji chino.
     */
    public String getKanji()
    {
        return switch (this.getNumero()) 
        {
            case 1 -> "風";
            case 2 -> "翔";
            case 3 -> "影";
            case 4 -> "水";
            case 5 -> "雨";
            case 6 -> "樹";
            case 7 -> "跳";
            case 8 -> "幻";
            case 9 -> "静";
            case 10 -> "雷";
            case 11 -> "剣";
            case 12 -> "花";
            case 13 -> "盾";
            case 14 -> "時";
            case 15 -> "力";
            case 16 -> "霧";
            case 17 -> "嵐";
            case 18 -> "浮";
            case 19 -> "消";
            case 20 -> "灯";
            case 21 -> "移";
            case 22 -> "闘";
            case 23 -> "輪";
            case 24 -> "眠";
            case 25 -> "歌";
            case 26 -> "小";
            case 27 -> "鏡";
            case 28 -> "迷";
            case 29 -> "戻";
            case 30 -> "撃";
            case 31 -> "甘";
            case 32 -> "駆";
            case 33 -> "大";
            case 34 -> "創";
            case 35 -> "替";
            case 36 -> "凍";
            case 37 -> "火";
            case 38 -> "矢";
            case 39 -> "泡";
            case 40 -> "波";
            case 41 -> "秤";
            case 42 -> "抜";
            case 43 -> "雪";
            case 44 -> "声";
            case 45 -> "錠";
            case 46 -> "雲";
            case 47 -> "夢";
            case 48 -> "砂";
            case 49 -> "光";
            case 50 -> "闇";
            case 51 -> "双";
            case 52 -> "地";
            default -> null;
        };
    }
    
    /**
     * Método 'getter' que devuelve la trascripción romaji del nombre
     * de la carta Clow.
     * @return Cadena de texto con la trascripción del nombre original japonés
     * al alfabeto latino, conocido como 'romaji'.
     */
    public String getRomaji()
    {
        return switch (this.getNumero()) 
        {
            case 1 -> "KAZE";
            case 2, 19, 26 -> "SHŌ";
            case 3 -> "KAGE";
            case 4 -> "MIZU";
            case 5 -> "AME";
            case 6 -> "KI";
            case 7 -> "ODO";
            case 8 -> "MABOROSHI";
            case 9 -> "SEI";
            case 10 -> "KAMINARI";
            case 11 -> "KEN";
            case 12 -> "HANA";
            case 13 -> "TATE";
            case 14 -> "TOKI";
            case 15 -> "CHIKARA";
            case 16 -> "KIRI";
            case 17 -> "ARASHI";
            case 18 -> "UKA";
            case 20 -> "AKARI";
            case 21 -> "UTSURI";
            case 22 -> "TŌ";
            case 23 -> "WA";
            case 24 -> "NEMURI";
            case 25 -> "UTA";
            case 27 -> "KAGAMI";
            case 28 -> "MEI";
            case 29 -> "MODO";
            case 30 -> "GEKI";
            case 31 -> "AMA";
            case 32 -> "KA";
            case 33 -> "DAI";
            case 34, 51 -> "SŌ";
            case 35 -> "KAWA";
            case 36 -> "KOO";
            case 37 -> "HI";
            case 38 -> "YA";
            case 39 -> "AWA";
            case 40 -> "NAMI";
            case 41 -> "HAKARI";
            case 42 -> "BATSU";
            case 43 -> "YUKI";
            case 44 -> "KOE";
            case 45 -> "JOE";
            case 46 -> "KUMO";
            case 47 -> "YUME";
            case 48 -> "SUNA";
            case 49 -> "HIKARI";
            case 50 -> "YAMI";
            case 52 -> "CHI";
            default -> null;
        };
    }
    
    /**
     * Método 'getter' que devuelve el nombre de la carta Clow en inglés,
     * tal y como aparece en el anverso de ésta.
     * @return Cadena de texto con el nombre en inglés de la carta.
     */
    public String getLabel()
    {
        return switch (this.getNumero()) 
        {
            case 1 -> "WINDY";
            case 2 -> "FLY";
            case 3 -> "SHADOW";
            case 4 -> "WATERY";
            case 5 -> "RAIN";
            case 6 -> "WOOD";
            case 7 -> "JUMP";
            case 8 -> "ILLUSION";
            case 9 -> "SILENT";
            case 10 -> "THUNDER";
            case 11 -> "SWORD";
            case 12 -> "FLOWER";
            case 13 -> "SHIELD";
            case 14 -> "TIME";
            case 15 -> "POWER";
            case 16 -> "MIST";
            case 17 -> "STORM";
            case 18 -> "FLOAT";
            case 19 -> "ERASE";
            case 20 -> "GLOW";
            case 21 -> "MOVE";
            case 22 -> "FIGHT";
            case 23 -> "LOOP";
            case 24 -> "SLEEP";
            case 25 -> "SONG";
            case 26 -> "LITTLE";
            case 27 -> "MIRROR";
            case 28 -> "MAZE";
            case 29 -> "RETURN";
            case 30 -> "SHOT";
            case 31 -> "SWEET";
            case 32 -> "DASH";
            case 33 -> "BIG";
            case 34 -> "CREATE";
            case 35 -> "CHANGE";
            case 36 -> "FREEZE";
            case 37 -> "FIREY";
            case 38 -> "ARROW";
            case 39 -> "BUBBLES";
            case 40 -> "WAVE";
            case 41 -> "LIBRA";
            case 42 -> "THROUGH";
            case 43 -> "SNOW";
            case 44 -> "VOICE";
            case 45 -> "LOCK";
            case 46 -> "CLOUD";
            case 47 -> "DREAM";
            case 48 -> "SAND";
            case 49 -> "LIGHT";
            case 50 -> "DARK";
            case 51 -> "TWINS";
            case 52 -> "EARTHY";
            default -> null;
        };
    }
    
    /**
     * Método sobreescrito de la superclase Object.
     * @return Cadena de texto con el nombre de la carta Clow.
     */
    @Override
    public String toString()
    {
        return this.getPalo().name();
    }
    
    /**
     * Método 'getter' que devuelve aquella carta sobre la cual aquella que ha
     * sido llamada es su subordinada, es decir, quién ejerce su jurisdicción
     * sobre ella.
     * @return Objeto de la clase 'CartaClow'.
     */
    public CartaClow getJurisdiccion()
    {
        try
        {
            if (this.esTierra())
                return new CartaClow(NombresCartasClow.TIERRA);
            else if (this.esAgua())
                return new CartaClow(NombresCartasClow.AGUA);
            else if (this.esFuego())
                return new CartaClow(NombresCartasClow.FUEGO);
            else if (this.esViento())
                return new CartaClow(NombresCartasClow.VENTISCA);
            else if (this.esLuz())
                return new CartaClow(NombresCartasClow.LUZ);
            else if (this.esOscuridad())
                return new CartaClow(NombresCartasClow.OSCURIDAD);
        }
        catch (IOException ioe) {}
        return null;    
    }
    
    
    
    /************************************/
    /*** MÉTODOS BOOLEANOS DE CONTROL ***/
    /************************************/
    
    /**
     * Método booleano que indica si la carta a la que se le está haciendo la
     * llamada a esta función es o no una carta Elemental.
     * @return Booleano.
     */
    public boolean esElemental()
    {
        return this.getPalo() == NombresCartasClow.AGUA ||
               this.getPalo() == NombresCartasClow.VENTISCA ||
               this.getPalo() == NombresCartasClow.OSCURIDAD ||
               this.getPalo() == NombresCartasClow.LUZ ||
               this.getPalo() == NombresCartasClow.TIERRA ||
               this.getPalo() == NombresCartasClow.FUEGO;
    }
    
    /**
     * Método booleano que indica si la carta a la que se le está haciendo la
     * llamada a esta función está o no bajo la jurisdicción de la Carta 'TIERRA'.
     * @return Booleano.
     */
    public boolean esTierra()
    {
        return this.getPalo() == NombresCartasClow.FLOR ||
               this.getPalo() == NombresCartasClow.ESCUDO ||
               this.getPalo() == NombresCartasClow.LAZO ||
               this.getPalo() == NombresCartasClow.ESPEJO ||
               this.getPalo() == NombresCartasClow.LABERINTO ||
               this.getPalo() == NombresCartasClow.EQUILIBRIO ||
               this.getPalo() == NombresCartasClow.CANDADO ||
               this.getPalo() == NombresCartasClow.ARENA ||
               this.getPalo() == NombresCartasClow.TIERRA;
    }
    
    /**
     * Método booleano que indica si la carta a la que se le está haciendo la
     * llamada a esta función está o no bajo la jurisdicción de la Carta 'AGUA'.
     * @return Booleano.
     */
    public boolean esAgua()
    {
        return this.getPalo() == NombresCartasClow.AGUA ||
               this.getPalo() == NombresCartasClow.LLOVIZNA ||
               this.getPalo() == NombresCartasClow.BOSQUE ||
               this.getPalo() == NombresCartasClow.NIEBLA ||
               this.getPalo() == NombresCartasClow.HIELO ||
               this.getPalo() == NombresCartasClow.BURBUJAS ||
               this.getPalo() == NombresCartasClow.OLA ||
               this.getPalo() == NombresCartasClow.NIEVE ||
               this.getPalo() == NombresCartasClow.NUBE;
    }
    
    /**
     * Método booleano que indica si la carta a la que se le está haciendo la
     * llamada a esta función está o no bajo la jurisdicción de la Carta 'FUEGO'.
     * @return Booleano.
     */
    public boolean esFuego()
    {
        return this.getPalo() == NombresCartasClow.TRUENO ||
               this.getPalo() == NombresCartasClow.ESPADA ||
               this.getPalo() == NombresCartasClow.PODER ||
               this.getPalo() == NombresCartasClow.LUCHA ||
               this.getPalo() == NombresCartasClow.DISPARO ||
               this.getPalo() == NombresCartasClow.FUEGO ||
               this.getPalo() == NombresCartasClow.FLECHA ||
               this.getPalo() == NombresCartasClow.ATRAVESAR ||
               this.getPalo() == NombresCartasClow.GEMELOS;
    }
    
    /**
     * Método booleano que indica si la carta a la que se le está haciendo la
     * llamada a esta función está o no bajo la jurisdicción de la Carta 'VENTISCA'.
     * @return Booleano.
     */
    public boolean esViento()
    {
        return this.getPalo() == NombresCartasClow.VENTISCA ||
               this.getPalo() == NombresCartasClow.VUELO ||
               this.getPalo() == NombresCartasClow.SALTO ||
               this.getPalo() == NombresCartasClow.TORMENTA ||
               this.getPalo() == NombresCartasClow.FLOTE ||
               this.getPalo() == NombresCartasClow.MOVIMIENTO ||
               this.getPalo() == NombresCartasClow.CANCIÓN ||
               this.getPalo() == NombresCartasClow.VELOCIDAD ||
               this.getPalo() == NombresCartasClow.VOZ;
    }
    
    /**
     * Método booleano que indica si la carta a la que se le está haciendo la
     * llamada a esta función está o no bajo la jurisdicción de la Carta 'LUZ'.
     * @return Booleano.
     */
    public boolean esLuz()
    {
        return this.getPalo() == NombresCartasClow.SOMBRA ||
               this.getPalo() == NombresCartasClow.BRILLO ||
               this.getPalo() == NombresCartasClow.PEQUEÑO ||
               this.getPalo() == NombresCartasClow.REGRESO ||
               this.getPalo() == NombresCartasClow.DULCE ||
               this.getPalo() == NombresCartasClow.GRANDE ||
               this.getPalo() == NombresCartasClow.CREACIÓN ||
               this.getPalo() == NombresCartasClow.LUZ;
    }
    
    /**
     * Método booleano que indica si la carta a la que se le está haciendo la
     * llamada a esta función está o no bajo la jurisdicción de la Carta 'OSCURIDAD'.
     * @return Booleano.
     */
    public boolean esOscuridad()
    {
        return this.getPalo() == NombresCartasClow.ILUSIÓN ||
               this.getPalo() == NombresCartasClow.SILENCIO ||
               this.getPalo() == NombresCartasClow.TIEMPO ||
               this.getPalo() == NombresCartasClow.BORRAR ||
               this.getPalo() == NombresCartasClow.DORMIR ||
               this.getPalo() == NombresCartasClow.CAMBIO ||
               this.getPalo() == NombresCartasClow.SUEÑO ||
               this.getPalo() == NombresCartasClow.OSCURIDAD;
    }
    
    /**
     * Método booleano que indica si la carta a la que se le está haciendo la
     * llamada a esta función está o no bajo el control de Keroberos, vinculado
     * con el poder del Sol y la magia Occidental.
     * @return Booleano.
     */
    public boolean esKeroberos()
    {
        return this.esLuz() || this.esTierra() || this.esFuego();
    }
    
    /**
     * Método booleano que indica si la carta a la que se le está haciendo la
     * llamada a esta función está o no bajo el control de Yue, vinculado con 
     * el poder de la Luna y la magia Oriental.
     * @return Booleano.
     */
    public boolean esYue()
    {
        return this.esOscuridad() || this.esAgua() || this.esViento();
    }
}