package model;

/**
 * Se implementa la Clase 'Servicio Turístico' como SUPERCLASE
 * representa en forma genérica un servicio turístico ofrecido por Llanquihue Tour.
 */
public class ServicioTuristico
{
    private String nombre;          // Atributo para asignar un nombre a la Clase.
    private double duracionHoras;   // Atributo para asignar la duración de un servicio turístico.

    // Constructor de la Clase con parámetros:
    public ServicioTuristico(String nombre, double duracionHoras)
    {
        this.nombre = nombre;
        this.duracionHoras = duracionHoras;
    }

    // Constructor de la Clase sin parámetros:
    public ServicioTuristico()
    {
        this.nombre = "Sin nombre asignado";
        this.duracionHoras = 0.0;
    }

    // Se implementan los métodos "GETTERS":
    /**
     * Método para devolver el nombre del objeto creado.
     * @return 'nombre' del objeto creado.
     */
    public String getNombre() {return this.nombre;}

    /**
     * Método para devolver la duración en horas del objeto creado.
     * @return 'duración en horas' del objeto creado.
     */
    public double getDuracionHoras() {return this.duracionHoras;}

    // Se implementan los métodos "SETTERS":
    /**
     * Método para modificar el nombre del objeto creado.
     * @param nuevoNombre nuevo 'nombre' que se quiere asignar al objeto creado.
     */
    public void setNombre(String nuevoNombre){this.nombre = nuevoNombre;}
    /**
     * Método para modificar la duración en horas del objeto creado.
     * @param nuevaDuracion nueva 'duración' en horas que se quiere signar al objeto creado.
     */
    public void setDuracionHoras(double nuevaDuracion) {this.duracionHoras = nuevaDuracion;}

    // Se implementa un método "toString":
    /**
     * Método que devuleve información en una cadena de texto
     * @return una descripción del objeto, con 'nombre' y 'duración en horas'.
     */
    @Override
    public String toString()
    {
        return String.format("El nombre del servicio turístico es: %s y su duración es: %.2f horas.",
                nombre, duracionHoras);
    }
}
