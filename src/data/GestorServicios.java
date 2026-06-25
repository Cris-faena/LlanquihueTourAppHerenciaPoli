package data;

import model.ExcursionCultural;
import model.PaseoLacustre;
import model.RutaGastronomica;
import model.ServicioTuristico;

/**
 * Se implementa una Clase "Gestor de Servicios".
 * Se utiliza para crear objetos de forma rápida.
 */
public class GestorServicios
{
    /**
     * Método para crear un primer objeto a partir de la Clase "Ruta Gastronómica".
     * @return "objeto de ruta gastronómica".
     */
    public RutaGastronomica creaRutaGastronomica1()
    {
        return new RutaGastronomica("Visita al 'Hotel Llanquihue' y dulcería 'Los Cisnes'", 10, 2);
    }

    /**
     * Método para crear un segundo objeto a partir de la Clase "Ruta Gastronómica".
     * @return "objeto de ruta gastronómica".
     */
    public RutaGastronomica crearRutaGastronomica2()
    {
        return new RutaGastronomica("Visita al restaurant 'La Fuente Italiana'", 4, 4);
    }

    /**
     * Método para crear un primer objeto a partir de la Clase "Paseo Lacustre".
     * @return "objeto de paseo lacustre".
     */
    public PaseoLacustre crearPaseoLacustre1()
    {
        return new PaseoLacustre("Vuelta en barco al 'Lago Llanquihue'", 4, "yate 'El Intrépido'");
    }

    /**
     * Método para crear un segundo objeto a partir de la Clase "Paseo Lacustre".
     * @return "objeto de paseo lacustre".
     */
    public PaseoLacustre crearPaseoLacustre2()
    {
        return new PaseoLacustre("Vuelta al fondo del 'Lago Rupanco'", 2, "submarino 'General Carrera'");
    }

    /**
     * Método para crear un primer objeto a partir de la Clase "Excursión Cultural".
     * @return "objeto de excursión cultural".
     */
    public ExcursionCultural crearExcursionCultural1()
    {
        return new ExcursionCultural("Visita a la 'Cripta de los Héroes del Lago'", 6, "Lugar de la última batalla entre Chile y España");
    }

    /**
     * Método para crear un segundo objeto a partir de la Clase "Excursión Cultural".
     * @return "objeto de excursión cultural".
     */
    public ExcursionCultural crearExcursionCultural2()
    {
        return new ExcursionCultural("Visita al 'Museo del Lago de Todos Los Santos'", 5, "Museo tradicional de la 'región de Los Lagos'");
    }
}
