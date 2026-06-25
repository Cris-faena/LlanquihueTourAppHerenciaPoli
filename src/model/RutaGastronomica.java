package model;

/**
 * Se implementa una Clase 'Ruta Gastronómica' como 'Clase hija'.
 * Representa un paseo que considera distintas paradas para comer en diversos lugares turísticos de la región.
 */
public class RutaGastronomica extends ServicioTuristico
{
    private int paradas;    // Atributo de la Clase para asignar la cantidad de detenciones consideradas en el tour.

    // Constructor de la clase con parámetros. Hereda de la superclase algunos atributos:
    public RutaGastronomica(String nombre, double duracionHoras, int paradas)
    {
        super(nombre, duracionHoras);       // Atributos heredados de la Clase Servicio Turístico.
        this.paradas = paradas;             // Atributo propio de la Clase hija.
    }
    // Constructor de la clase sin parámetros. Hereda de la superclase algunos atributos:
    public RutaGastronomica()
    {
        super("Sin nombre asignado", 0);    // Atributos heredados de la superclase.
        this.paradas = 0;                                      // Atributo propio de la clase hija:
    }

    // Se implementa un método "Getter". Cabe señalar que los otros métodos "Getters" los hereda de la superclase:
    /**
     * Método que devuelve la cantidad de paradas de la ruta.
     * @return 'número de paradas' de la ruta.
     */
    public int getParadas() {return paradas;}

    // Se implementa un método "Setter". Cabe señalar que los otros métodos "Setters" los hereda de la superclase:
    /**
     * Método que modifica la cantidad de paradas de la ruta.
     * @param nuevaParada nueva cantidad de paradas que se desea asignar a la ruta.
     */
    public void setParadas(int nuevaParada) {this.paradas = nuevaParada;}

    // Se implementa un método "toString". Cabe señalar que hereda este método de la super clase, y agrega información específica de este objeto.
    /**
     * Método que devuelve información del objeto creado en forma de cadena de texto.
     * Hereda su contenido de la superclase 'Servicio Turístico' y se agrega información específica de este objeto.
     * @return descripción del servicio con 'nombre' del tour, 'duración' en horas y cantidad de 'paradas'.
     * */
    @Override
    public String toString()
    {
        return super.toString() + "," + " " + "Paradas de la ruta: " + paradas;
    }
}
