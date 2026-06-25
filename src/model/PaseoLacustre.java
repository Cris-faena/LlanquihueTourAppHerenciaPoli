package model;

/**
 * Se implementa una Clase 'Paseo Lacustre' como 'Clase hija'.
 * Representa un recorrido por lagos y ríos de la región, en todo tipo de embarcaciones según disponibilidad.
 */
public class PaseoLacustre extends ServicioTuristico
{
    private String tipoEmbarcacion;     // Atributo de la Clase para describir el tipo de embarcación utilizada

    // Constructor de la clase con parámetros. Hereda de la superclase algunos atributos:
    public PaseoLacustre(String nombre, double duracionHoras, String tipoEmbarcacion)
    {
        super(nombre, duracionHoras);       // Atributos heredados de la Clase Servicio Turístico.
        this.tipoEmbarcacion = tipoEmbarcacion; // Atributo propio de la Clase hija.
    }

    // Constructor de la clase sin parámetros. Hereda de la superclase algunos atributos:
    public PaseoLacustre()
    {
        super("Sin nombre asignado", 0); // Atributos heredados de la Clase Servicio Turístico.
        this.tipoEmbarcacion = "Sin embarcación asignada"; // Atributo propio de la Clase hija.
    }

    // Se implementa un método "Getter". Cabe señalar que los otros métodos "Getters" los hereda de la superclase:
    /**
     * Método que devuelve el tipo de embarcación considerada para los desplazamientos.
     * @return 'tipo y nombre' del medio de transporte.
     */
    public String getTipoEmbarcacion() {return tipoEmbarcacion;}

    // Se implementa un método "Setter". Cabe señalar que los otros métodos "Setters" los hereda de la superclase:
    /**
     * Método que modifica el medio de transporte empleado para el paseo.
     * @param nuevaEmbarcacion nuevo 'tipo y nombre' que se quiere asignar al objeto
     */
    public void setTipoEmbarcacion(String nuevaEmbarcacion) {this.tipoEmbarcacion = nuevaEmbarcacion;}

    // Se implementa un método "toString". Cabe señalar que hereda este método de la super clase, y agrega información específica de este objeto.
    /**
     * Método que devuelve información del objeto creado en forma de cadena de texto.
     * Hereda su contenido de la superclase 'Servicio Turístico' y se agrega información específica de este objeto.
     * @return descripción del servicio con 'nombre' del tour, 'duración' en horas y 'tipo' de embarcación empleada.
     * */
    @Override
    public String toString()
    {
        return super.toString() + "," + " " + "Tipo de embarcación: " + tipoEmbarcacion;
    }
}
