package autonoma.hospital.models;
/**
 * Representa los problemas/enfermedades de los pacientes
 * @author Samuel Esteban Herrera Bedoya & Alejandra Zapata Castañeda
 * @version 0.0.1
 * @since 2024-04-9
 */
public class Padecimiento
{
    /////////////////////////Atributos///////////////////
   /**
    * Nombre de la enfermedad 
    */
   private String nombre;
   /**
    * Descripcion de enfermedad 
    */
   private String descripcion;
   
   ////////////////////Constructor///////////////////////
    /**
     * Inicializa valores de las variables 
     * @param nombre de la enfermedad
     * @param descripcion de la enfermedad 
     */
    public Padecimiento(String nombre, String descripcion)
    {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
   
    ///////////////////Metodos De Acceso///////////////////

    public String getNombre() 
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getDescripcion() 
    {
        return descripcion;
    }

    public void setDescripcion(String descripcion)
    {
        this.descripcion = descripcion;
    }
    
    
   
}
