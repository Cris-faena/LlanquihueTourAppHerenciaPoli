package model;

/**
 * Se implementa una Clase 'Excursión Cultural' como 'Clase hija'.
 * Representa un recorrido por lugares históricos o tradicionales de la región.
 */
public class ExcursionCultural extends ServicioTuristico
{
    private String lugarHistorico;      // Atributo que representa un lugar histórico o tradicional para visitar.

    // Constructor de la clase con parámetros. Hereda de la superclase algunos atributos:
    public ExcursionCultural(String nombre, double duracionHoras, String lugarHistorico)
    {
        super(nombre, duracionHoras);           // Atributos heredados de la Clase Servicio Turístico.
        this.lugarHistorico = lugarHistorico;   // Atributo propio de la Clase hija.
    }

    // Constructor de la clase sin parámetros. Hereda de la superclase algunos atributos:
    public ExcursionCultural()
    {
        super("Sin nombre asignado", 0);                    // Atributos heredados de la Clase Servicio Turístico.
        this.lugarHistorico = "Sin un lugar histórico asignado para visitar";  // Atributo propio de la Clase hija.
    }

    // Se implementa un método "Getter". Cabe señalar que los otros métodos "Getters" los hereda de la superclase:
    /**
     * Método que devuelve el lugar histórico o tradicional considerado para la excursión.
     * @return 'lugar histórico' a visitar.
     */
    public String getLugarHistorico() {return lugarHistorico;}

    // Se implementa un método "Setter". Cabe señalar que los otros métodos "Setters" los hereda de la superclase:
    /**
     * Método que modifica el lugar histórico o tradicional a visitar.
     * @param nuevoLugarHistorico nuevo 'lugar' que se quiere asignar a la excursión.
     */
    public void setLugarHistorico(String nuevoLugarHistorico) {this.lugarHistorico = nuevoLugarHistorico;}

    // Se implementa un método "toString". Cabe señalar que hereda este método de la super clase, y agrega información específica de este objeto.
    /**
     * Método que devuelve información del objeto creado en forma de cadena de texto.
     * Hereda su contenido de la superclase 'Servicio Turístico' y se agrega información específica de este objeto.
     * @return descripción del servicio con 'nombre' del tour, 'duración' en horas y 'lugar histórico' a visitar.
     * */
    @Override
    public String toString()
    {
        return super.toString() + " , " + "Lugar histórico asignado: " + lugarHistorico;
    }
}

