package data;

import model.*;

import java.util.ArrayList;
import java.util.List;


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

    /**
     * Método que crea una lista de objetos polimórficos.
     * Se debe agregar manualmente los objetos, respetando el constructor de cada Clase.
     * @return una "lista de objetos".
     */
    public ArrayList<ServicioTuristico> crearServicioAlTurista()
    {
        ArrayList<ServicioTuristico> servicios = new ArrayList<>();
        servicios.add(new RutaGastronomica("paseo a McDonald", 2, 1));
        servicios.add(new RutaGastronomica("Paseo a Chuck e Cheese", 2, 2));
        servicios.add(new PaseoLacustre("Recorrido submarino del Lago Villarica", 10, "submarino Scorpene"));
        servicios.add(new PaseoLacustre("Recorrido bajo el oceano pacífico", 5, "submarino O´Higgins"));
        servicios.add(new ExcursionCultural("Visita a la Municipalidad de Los Lagos", 3, "municipalidad comunal"));
        return servicios;
    }

    public List<Registrable> crearServicioRegistrable()
    {
        List<Registrable> registrables = new ArrayList<>();
        registrables.add(new RutaGastronomica("Paseo a Burger King", 2, 1));
        registrables.add(new RutaGastronomica("Paseo a Papa Johns", 2, 2));
        registrables.add(new PaseoLacustre("Vuelta en kayac al lago todos los santos", 4, "Kayac de madera"));
        return  registrables;
    }
}
