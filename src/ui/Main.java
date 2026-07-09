package ui;

import data.GestorServicios;
import model.*;
import java.util.List;

/**
 * Clase "Main" para ejecutar la aplicación:
 */
public class Main
{
    /**
     * Punto de entrada para la aplicación.
     * @param args "Array" de argumentos pasados al inicializar la aplicación
     */
    public static void  main(String[] args) {
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

        System.out.println();

        // Se crea una nueva instancia de la clase "Gestor de Servicios":
        GestorServicios gestorTours = new GestorServicios();

        // Se crea una nueva lista "servicios nuevos" para almacenar la lista creada en el "gestor de servicios".
        List <ServicioTuristico> serviciosNuevos = gestorTours.crearServicioAlTurista();

        // Se implementa un título para mostrar por consola:
        System.out.println(" === LISTA DE NUEVOS SERVICIOS LLANQUIHUE TOURS === ");

        // Se establece un bucle FOREACH, para recorrer los elementos de la lista de objetos polimórficos creada:
        for (ServicioTuristico servicios : serviciosNuevos)
        {
            System.out.println(" ----------------------------------------- ");
            // Si uno de los elementos de la lista, es instancia de la Clase "Ruta Gastronómica":
            if (servicios instanceof RutaGastronomica)
            {
                // Ejecuta este bloque de instrucciones:
                RutaGastronomica ruta2 = (RutaGastronomica) servicios;
                System.out.println("→ Es una Ruta Gastronómica");
                ruta2.mostrarInformacion();
            }
            // Si uno de los elementos de la lista, es instancia de la Clase "Paseo Lacustre":
            else if (servicios instanceof  PaseoLacustre)
            {
                // Ejecuta este bloque de instrucciones:
                PaseoLacustre paseo2 = (PaseoLacustre) servicios;
                System.out.println("→ Es un Paseo Lacustre");
                paseo2.mostrarInformacion();
            }
            // Si uno de los elementos de la lista, es instancia de la Clase "Excursión Cultural":
            else if (servicios instanceof ExcursionCultural)
            {
                // Ejecuta este bloque de instrucciones:
                ExcursionCultural excursion2 = (ExcursionCultural) servicios;
                System.out.println("→ Es una Excursion Cultural");
                excursion2.mostrarInformacion();
            }
            // Si uno de los elementos de la lista, es instancia de la Clase "Servicio Turístico":
            else if (servicios instanceof ServicioTuristico)
            {
                // Ejecuta este bloque de instrucciones:
                ServicioTuristico servicio2 = (ServicioTuristico) servicios;
                System.out.println("Es una Servicio Turistico genérico");
                servicio2.mostrarInformacion();
            }
            // Si uno de los elementos de la lista, no pertenece a ninguna clase:
            else
            {
                // Ejecuta estas instrucciones:
                System.out.println("No se pudo determinar a qué Clase pertenece");
                System.out.println();
            }
        }
        System.out.println();

        List<Registrable> listaRegistrable = gestorTours.crearServicioRegistrable();

        for (Registrable registrable : listaRegistrable)
        {
            System.out.println("Aca se inicia el nuevo recorrido");
            registrable.mostrarResumen();
            if (registrable instanceof PaseoLacustre)
            {
                System.out.println("Este es un paseo lacustre");
            }
            else if (registrable instanceof ExcursionCultural)
            {
                System.out.println("Este es un excursion cultural");
            }
            else if (registrable instanceof RutaGastronomica)
            {
                System.out.println("Este es un ruta Gastronómica");
            }
            else
            {
                System.out.println("No es un registrable");
            }
        }

        // Se implementa esta utilidad para que se ejecute la GUI:
        javax.swing.SwingUtilities.invokeLater(new Runnable()
        {
            public void run()
            {
                new Pantalla().setVisible(true);
            }
        });
    }
}
