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
     * @param nombre del trabajador
     * @param numeroDeIdentificacion del trabajador
     * @param edad del trabajador
     * @param salarioBase del trabajador
     * @param areaTrabajo del trabajador
     * @param hospital en el que trabaja el empleado
     * @param salarioTotal del trabajador
     */
    public TrabajadorOperativo(String nombre, String numeroDeIdentificacion, String edad, Integer salarioBase, String areaTrabajo, Double salarioTotal)
    {
        super(nombre, numeroDeIdentificacion, edad, salarioBase, salarioTotal);
        this.areaTrabajo = areaTrabajo;
        calcularSalarioTotal();
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
     */
    @Override
    public void calcularSalarioTotal()
    {
        Double base = salarioBase * 0.2;
        salarioTotal = salarioBase + base;
    }
}