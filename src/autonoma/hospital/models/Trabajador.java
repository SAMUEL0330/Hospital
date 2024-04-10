package autonoma.hospital.models;
/**
 * Clase base para todos los tipos de empleados
 * @author Samuel Esteban Herrera Bedoya & Alejandra Zapata Castañeda
 * @version 0.1.5
 * @since 2024-04-8
 */
public abstract class Trabajador
{
    /**
     * Nombre del trabajador
     */
    private String nombre;
    /**
     * Id del trabajador 
     */
    private String numeroDeIdentificacion;
    /**
     * Edad del trabajador
     */
    private String edad;
    /**
     * Salario base del trabajador
     */
    private String salarioBase;
    
    //////////////Constructor////////////////////////
    /**
     * Inicializa valores de las variables 
     * @param nombre del trabajador
     * @param numeroDeIdentificacion del trabajador
     * @param edad del trabajador
     * @param salarioBase del trabajador
     */
   
    public Trabajador(String nombre, String numeroDeIdentificacion, String edad, String salarioBase)
    {
        this.nombre = nombre;
        this.numeroDeIdentificacion = numeroDeIdentificacion;
        this.edad = edad;
        this.salarioBase = salarioBase;
    }
    
   ///////////////Metodos De Acceso/////////////////////////// 

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getNumeroDeIdentificacion()
    {
        return numeroDeIdentificacion;
    }

    public void setNumeroDeIdentificacion(String numeroDeIdentificacion)
    {
        this.numeroDeIdentificacion = numeroDeIdentificacion;
    }

    public String getEdad()
    {
        return edad;
    }

    public void setEdad(String edad)
    {
        this.edad = edad;
    }

    public String getSalarioBase()
    {
        return salarioBase;
    }

    public void setSalarioBase(String salarioBase)
    {
        this.salarioBase = salarioBase;
    }
    ////////Métodos////////
    /**
     * Método del que heredan el cual permitirá calcular el salario del empleado
     */
    public abstract void calcularSalario();
}