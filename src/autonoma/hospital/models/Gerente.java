package autonoma.hospital.models;
/**
 * Representa al encargado de la gerencia del hospital.
 * @author Samuel Esteban Herrera Bedoya & Alejandra Zapata Castañeda
 * @version 0.0.1
 * @since 2024-04-8
 */
public class Gerente
{
   ///////////Atributos//////////
   /**
    * Nombre del gerente 
    */ 
   private String nombreGerente;
   /**
    * ID del gerente
    */
   private String numeroIdentificacion;
   /**
    * edad del gerente
    */
   private Integer edad;
   /**
    * profesion del gerente
    */
   private String carrera;
   
   //////////////Constructor/////////////////////////
    /**
     * Inicializa valores de las variables 
     * @param nombreGerente del gerente
     * @param numeroIdentificacion del gerente 
     * @param edad del gerente
     * @param carrera o profesion del gerente
     */
    public Gerente(String nombreGerente, String numeroIdentificacion, Integer edad, String carrera)
    {
        this.nombreGerente = nombreGerente;
        this.numeroIdentificacion = numeroIdentificacion;
        this.edad = edad;
        this.carrera = carrera;
    }
   
    //////////////Metodos De Acceso///////////////////////////////////////
    public String getNombreGerente()
    {
        return nombreGerente;
    }

    public void setNombreGerente(String nombreGerente) 
    {
        this.nombreGerente = nombreGerente;
    }

    public String getNumeroIdentificacion()
    {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(String numeroIdentificacion)
    {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public Integer getEdad()
    {
        return edad;
    }

    public void setEdad(Integer edad)
    {
        this.edad = edad;
    }

    public String getCarrera()
    {
        return carrera;
    }

    public void setCarrera(String carrera) 
    {
        this.carrera = carrera;
    }
}