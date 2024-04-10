package autonoma.hospital.models;

import java.util.Date;

/**
 * Representa al hospital en su conjunto.
 * @author Samuel Esteban Herrera Bedoya & Alejandra Zapata Castañeda
 * @version 0.1.1
 * @since 2024-04-8
 */
public class Hospital
{
    ///////Atributos////////
    /**
     * Nombre del hospital
     */
    private String nombre;
    /**
     * Direccion del hospital
     */
    private String direccion;
    /**
     * Telefono del hospital
     */
    private String telefono;
    /**
     * Presupuesto del hospital
     */
    private Integer presupuesto;
    /**
     * Presupuesto del hospital
     */
    private Integer metaAnualVenta;
    /**
     * Meta anual venta del hospital
     */
    private Date fechaFundacion;
    /**
     * Fecha de fundacion del hospital
     */
    private Boolean estado;
    /**
     * Estado del hospital
     */
    private Coordenada localizacion;
    /**
     * Localizacion del hospital
     */
    
    //////Constructor/////////////////
    
    /**
     * Inicializa valores de las variables 
     * @param nombre del hospital
     * @param direccion del hospital
     * @param telefono del hospital
     * @param presupuesto del hospital
     * @param metaAnualVenta del hospital
     * @param fechaFundacion del hospital
     * @param estado del hospital
     * @param localizacion del hospital
     */
    public Hospital(String nombre, String direccion, String telefono, Integer presupuesto, Integer metaAnualVenta, Date fechaFundacion, Boolean estado, Coordenada localizacion)
    {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.presupuesto = presupuesto;
        this.metaAnualVenta = metaAnualVenta;
        this.fechaFundacion = fechaFundacion;
        this.estado = estado;
        this.localizacion = localizacion;
    }
}
