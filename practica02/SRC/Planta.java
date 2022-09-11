import java.util.ArrayList;
<<<<<<< HEAD
=======

public class Planta extends Entidad{
>>>>>>> 3ff7dd55cb63145e033f8a9b7b27f1bad1e7c7c4

/**
 *
 * Clase que implementa un tipo de planta en el vivero
 *
 * @version 1.0 Septiembre 2022
 * @author Paw Patrols
 * @since Fundamentos de Bases de Datos
 *
 */

public class Planta extends Entidad {

    /* Atributos */
    int llave;
    String nombre, genero, cuidados, sustrato, luz, fechaGerminacion, riegaFrequencia;
    int precio, cantidad;

    /**
     * Constructor de una planta
     *
     * @param Llave            ID único de la planta
     * @param Precio           costo de la planta
     * @param Cantidad         número de plantas en el invernadero
     * @param Nombre           de la planta
     * @param Genero           que tipo de planta es
     * @param Cuidados         asistencia que la planta necesita
     * @param Sustrato         tipo de sustrato
     * @param Luz              si es de sol o sombre
     * @param FechaGerminacion de la planta
     * @param RiegaFrequencia  cada cuanto se riega
     */
    public Planta(int Llave, int Precio, int Cantidad, String Nombre,
            String Genero, String Cuidados, String Sustrato, String Luz,
            String FechaGerminacion, String RiegaFrequencia) {
        llave = Llave;
        precio = Precio;
        cantidad = Cantidad;
        nombre = Nombre;
        genero = Genero;
        cuidados = Cuidados;
        sustrato = Sustrato;
        luz = Luz;
        fechaGerminacion = FechaGerminacion;
        riegaFrequencia = RiegaFrequencia;
    }
<<<<<<< HEAD
=======
    public Planta(ArrayList<String> atributos) {
        llave = Integer.parseInt(atributos.get(0));
        precio = Integer.parseInt(atributos.get(1));
        cantidad = Integer.parseInt(atributos.get(2));
        nombre = atributos.get(3);
        genero = atributos.get(4);
        cuidados = atributos.get(5);
        sustrato = atributos.get(6);
        luz = atributos.get(7);
        fechaGerminacion = atributos.get(8);
        riegaFrequencia = atributos.get(9);
    }
    
>>>>>>> 3ff7dd55cb63145e033f8a9b7b27f1bad1e7c7c4

    /**
     * Planta con un arreglo de atributos??
     *
     * @param atributos
     */
    public Planta(ArrayList<String> atributos) {
        llave = Integer.parseInt(atributos.get(0));
        precio = Integer.parseInt(atributos.get(1));
        cantidad = Integer.parseInt(atributos.get(2));
        nombre = atributos.get(3);
        genero = atributos.get(4);
        cuidados = atributos.get(5);
        sustrato = atributos.get(6);
        luz = atributos.get(7);
        fechaGerminacion = atributos.get(8);
        riegaFrequencia = atributos.get(9);
    }

    /* Arreglo de atributos de una planta */
    public static String[] atributos = { "precio", "cantidad",
            "nombre", "genero", "cuidados", "sustrato",
            "luz", "fechaGerminacion", "riegaFrequencia" };

    /**
     * Método para convertir un ArrayList a un string
     */
    public String[] toArray() {
        /*
         * return String[] de
         * {llave, precio...}
         */
        return new String[] { Integer.toString(llave), Integer.toString(precio), Integer.toString(cantidad), nombre,
                genero, cuidados, sustrato, luz, fechaGerminacion, riegaFrequencia };
    }

    /* Método para obtener los atributos */
    public String[] getAtributos() {
        return atributos;
    }

}
