package autonoma.hospital.models;
/**
 * Representa al encargado de la gerencia del hospital.
 * @author Samuel Esteban Herrera Bedoya & Alejandra Zapata Castañeda
 * @version 0.0.1
 * @since 2024-04-8
 */
public class Administrador
{
  ////////////Atributos
    
   private String nombre;
   private String numeroIdentificacion;
   private Integer edad;
   private String carrera;
   
   //////////////Constructor/////////////////////////

    public Administrador(String nombre, String numeroIdentificacion, Integer edad, String carrera)
    {
        this.nombre = nombre;
        this.numeroIdentificacion = numeroIdentificacion;
        this.edad = edad;
        this.carrera = carrera;
    }
   
    //////////////Metodos De Acceso///////////////////////////////////////

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
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