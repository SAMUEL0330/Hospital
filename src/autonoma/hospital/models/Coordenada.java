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
     * Longitud de la coordenada
     */
    private double longitud;
    /**
     * Latitud de la coordena
     */
    private double latitud;
    
    ///////Constructor///////
    /**
     * Inicializa el valor de las variables
     * @param longitud de la coordenada
     * @param latitud de la coordenada
     */
    public Coordenada(double longitud, double latitud)
    {
        this.longitud = longitud;
        this.latitud = latitud;
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
