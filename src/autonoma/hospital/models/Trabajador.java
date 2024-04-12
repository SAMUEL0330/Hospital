package autonoma.hospital.models;
/**
 * Clase base para todos los tipos de empleados
 * @author Samuel Esteban Herrera Bedoya & Alejandra Zapata Castañeda
 * @version 1.0.0
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
    private String numeroDocumento;
    /**
     * Edad del trabajador
     */
    private String edad;
    /**
     * Salario base del trabajador
     */
    private Integer salarioBase;
    
    //////////////Constructor////////////////////////
    /**
     * Inicializa valores de las variables 
     * @param nombre del trabajador
     * @param numeroDocumento del trabajador
     * @param edad del trabajador
     * @param salarioBase del trabajador
     */
    public Trabajador(String nombre, String numeroDocumento, String edad, Integer salarioBase)
    {
        this.nombre = nombre;
        this.numeroDocumento = numeroDocumento;
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

    public String getNumeroDocumento()
    {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento)
    {
        this.numeroDocumento = numeroDocumento;
    }

    public String getEdad()
    {
        return edad;
    }

    public void setEdad(String edad)
    {
        this.edad = edad;
    }

    public Integer getSalarioBase()
    {
        return salarioBase;
    }

    public void setSalarioBase(Integer salarioBase)
    {
        this.salarioBase = salarioBase;
    }
    ////////Métodos////////
    /**
     * Método del que heredan el cual permitirá calcular el salario del empleado
     * @param salarioBase 
     */
    public abstract void calcularSalario(Integer salarioBase);
}