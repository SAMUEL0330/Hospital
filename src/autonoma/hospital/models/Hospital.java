package autonoma.hospital.models;

import java.util.Date;

/**
 * Representa al hospital en su conjunto.
 * @author Samuel Esteban Herrera Bedoya & Alejandra Zapata Castañeda
 * @version 0.0.1
 * @since 2024-04-8
 */
public class Hospital
{
    ///////Atributos////////
    private String nombre;
    private String direccion;
    private String telefono;
    private Integer presupuesto;
    private Integer metaAnualVenta;
    private Date fechaFundacion;
    private Boolean estado;
    private Coordenada localizacion;
    
    //////Constructor////////
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
