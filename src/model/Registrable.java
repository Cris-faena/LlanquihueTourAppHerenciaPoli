package model;

public interface Registrable
{
    public default String mostrarResumen()
    {
        return "Resumen no implementado";
    }
}
