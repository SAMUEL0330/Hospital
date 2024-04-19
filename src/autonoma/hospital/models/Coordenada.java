package autonoma.hospital.models;
/**
 * Representa la localización del hospital.
 * @author Samuel Esteban Herrera Bedoya & Alejandra Zapata Castañeda
 * @version 0.1.0
 * @since 2024-04-9
 */
public class Coordenada
{
    ///////Atributos///////
    /**
     * Latitud de la coordena
     */
    private double latitud;
    /**
     * Longitud de la coordenada
     */
    private double longitud;
    ///////Constructor///////
    /**
     * Inicializa el valor de las variables
     * @param longitud de la coordenada
     * @param latitud de la coordenada
     */
    public Coordenada(double latitud, double longitud)
    {
        this.latitud = latitud;
        this.longitud = longitud;
    }

    public Coordenada(double longitud)
    {
        this.longitud = longitud;
    }
    
    ///////Métodos de acceso///////
    public double getLongitud() 
    {
        return longitud;
    }

    public void setLongitud(double longitud) 
    {
        this.longitud = longitud;
    }

    public double getLatitud() 
    {
        return latitud;
    }

    public void setLatitud(double latitud) 
    {
        this.latitud = latitud;
    }
}
