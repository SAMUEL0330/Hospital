package autonoma.hospital.models;

import java.util.Date;
/**
 * Contenedor de los medicamentos
 * @author Samuel Esteban Herrera Bedoya & Alejandra Zapata Castañeda
 * @version 0.1.3
 * @since 2024-04-9
 */
public class Inventario
{
    ////////Atributos/////////
    /**
     * Número de la actualización del inventario
     */
    private Integer codigo;
    /**
     * El año de actualización 
     */
    private Integer anoActualizacion;
    
    ////////Constructor//////////
    /**
     * Inicializa el valor de las variables
     * @param codigo de la actualización del inventario
     * @param anoActualizacion del inventario
     */
    public Inventario(Integer codigo, Integer anoActualizacion)
    {
        this.codigo = codigo;
        this.anoActualizacion = anoActualizacion;
    }
    
    //////////Métodos de acceso/////////
    public Integer getCodigo()
    {
        return codigo;
    }

    public void setCodigo(Integer codigo)
    {
        this.codigo = codigo;
    }

    public Integer getAnoActualizacion()
    {
        return anoActualizacion;
    }

    public void setAnoActualizacion(Integer anoActualizacion)
    {
        this.anoActualizacion = anoActualizacion;
    }
}