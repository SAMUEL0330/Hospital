package autonoma.hospital.models;
/**
 * Subclase de Empleado para empleados operativos 
 * @author Samuel Esteban Herrera Bedoya & Alejandra Zapata Castañeda
 * @version 0.0.1
 * @since 2024-04-8
 */
public class TrabajadorOperativo extends Trabajador
{
    ////////Atributos////////
    /**
     * Area de trabajo del empleado
     */
    private String areaTrabajo;
   
    ////////Constructor/////////
    /**
     * Inicializa el valor de las variables 
     * @param areaTrabajo del empleado
     */
    public TrabajadorOperativo(String areaTrabajo, String nombre, String numeroDeIdentificacion, String edad, Integer salarioBase)
    {
        super(nombre, numeroDeIdentificacion, edad, salarioBase);
        this.areaTrabajo = areaTrabajo;
    }
    
    //////////////////Metodos De Acceso/////////////////////
    public String getAreaTrabajo()
    {
        return areaTrabajo;
    }

    public void setAreaTrabajo(String areaTrabajo)
    {
        this.areaTrabajo = areaTrabajo;
    }

    ///////////Métodos////////////
    /**
     * Método heredado que permite calcular el salario del empleado operativo
     * @param salarioBase 
     */
    @Override
    public void calcularSalario(Integer salarioBase)
    {
       
    }
}