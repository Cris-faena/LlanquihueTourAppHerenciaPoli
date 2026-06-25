package ui;

import data.GestorServicios;
import model.ExcursionCultural;
import model.PaseoLacustre;
import model.RutaGastronomica;
import model.ServicioTuristico;

/**
 * Clase "Main" para ejecutar la aplicación:
 */
public class Main
{
    /**
     * Punto de entrada para la aplicación.
     * @param args "Array" de argumentos pasados al inicializar la aplicación
     */
    public static void  main(String[] args)
    {
        // 1. Se crea un objeto "gs" (gestor de servicios), para implementar los métodos de dicha Clase:
        GestorServicios gs = new GestorServicios();

        // 2. Se crea un primer objeto llamado "ruta gastronómica 1", llamando al método "crearRutaGastronómica1":
        RutaGastronomica rutaGastronomica1 = gs.creaRutaGastronomica1();
        // Se imprime el resultado por consola para comprobar el correcto funcionamiento:
        System.out.println(rutaGastronomica1);
        // Se imprime el resultado de un método específico del objeto, para comprobar que funciona:
        System.out.println(rutaGastronomica1.getParadas());

        // 3. Se crea un segundo objeto llamado "ruta gastronómica 2", llamando al método "crearRutaGastronómica2":
        RutaGastronomica rutaGastronomica2 = gs.crearRutaGastronomica2();
        // Se imprime el resultado por consola para comprobar el correcto funcionamiento:
        System.out.println(rutaGastronomica2);
        // Se imprime el resultado de un método específico del objeto, para comprobar que funciona:
        System.out.println(rutaGastronomica2.getParadas());

        // 4. Se crea un primer objeto llamado "paseo lacustre 1", llamando al método "crearPaseoLacustre1":
        PaseoLacustre paseoLacustre1 = gs.crearPaseoLacustre1();
        // Se imprime el resultado por consola para comprobar el correcto funcionamiento:
        System.out.println(paseoLacustre1);
        // Se imprime el resultado de un método específico del objeto, para comprobar que funciona:
        System.out.println(paseoLacustre1.getTipoEmbarcacion());

        // 5. Se crea un segundo objeto llamado "paseo lacustre 2", llamando al método "crearPaseoLacustre2":
        PaseoLacustre paseoLacustre2 = gs.crearPaseoLacustre2();
        // Se imprime el resultado por consola para comprobar el correcto funcionamiento:
        System.out.println(paseoLacustre2);
        // Se imprime el resultado de un método específico del objeto, para comprobar que funciona:
        System.out.println(paseoLacustre2.getTipoEmbarcacion());

        // 6. Se crea un primer objeto llamado "excursión cultural 1", llamando al método "crearExcursionCultural1":
        ExcursionCultural excursionCultural1 = gs.crearExcursionCultural1();
        // Se imprime el resultado por consola para comprobar el correcto funcionamiento:
        System.out.println(excursionCultural1);
        // Se imprime el resultado de un método específico del objeto, para comprobar que funciona:
        System.out.println(excursionCultural1.getLugarHistorico());

        // 7. Se crea un segundo objeto llamado "excursión cultural 2", llamando al método "crearExcursionCultural2":
        ExcursionCultural excursionCultural2 = gs.crearExcursionCultural2();
        // Se imprime el resultado por consola para comprobar el correcto funcionamiento:
        System.out.println(excursionCultural2);
        // Se imprime el resultado de un método específico del objeto, para comprobar que funciona:
        System.out.println(excursionCultural2.getLugarHistorico());
    }
}
