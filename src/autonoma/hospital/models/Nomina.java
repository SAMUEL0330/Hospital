package autonoma.hospital.models;

import java.util.Date;

/**
 * Permite generar un recuento/nómina de todos los tipos de empleados
 * @author Samuel Esteban Herrera Bedoya & Alejandra Zapata Castañeda
 * @version 0.0.1
 * @since 2024-04-8
 */
public class Nomina
{
    /////atributos/////
    /**
     * Sueldo registrado del empleado
     */
    private Integer totalDevengado;
    /**
     * Fecha de registro de la nomina
     */
    private Date fecha;
    /**
     * ID de la nomina
     */
    private String unicoID;
    
    /////constructor/////
    /**
     * Inicializa el valor de las variables
     * @param totalDevengado del según el contrato
     * @param fecha de registro de la nomina
     * @param unicoID de la nomina
     */
    public Nomina(Integer totalDevengado, Date fecha, String unicoID)
    {
        this.totalDevengado = totalDevengado;
        this.fecha = fecha;
        this.unicoID = unicoID;
    }
    
    //////metodos de acceso///
    public Integer getSalarioTotal()
    {
        return totalDevengado;
    }

    public void setSalarioTotal(Integer salarioTotal)
    {
        this.totalDevengado = salarioTotal;
    }

    public Date getFecha()
    {
        return fecha;
    }

    public void setFecha(Date fecha)
    {
        this.fecha = fecha;
    }

    public String getUnicoID()
    {
        return unicoID;
    }
    
    public void setUnicoID(String unicoID)
    {
        this.unicoID = unicoID;
    }
}