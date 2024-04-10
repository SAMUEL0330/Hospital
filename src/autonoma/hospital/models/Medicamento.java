package autonoma.hospital.models;
/**
 * Representa un medicamento en el inventario de la farmacia.
 * @author Samuel Esteban Herrera Bedoya & Alejandra Zapata Castañeda
 * @version 1.0.0
 * @since 2024-04-9
 */
public abstract class Medicamento
{
    //////////Atributos/////////
    /**
     * Nombre del medicamento
     */
    private String nombre;
    /**
     * Descripcion del medicamento
     */
    private String descripcion;
    /**
     * Cuanto fue el costo del medicamento
     */
    private Integer costo;
    /**
     * Precio de venta del medicamento
     */
    private Integer precioVenta;
    
    //////////Constructor/////////
    /**
     * Inicializa el valor de las variables
     * @param nombre del medicamento
     * @param descripcion del medicamento
     * @param costo del medicamento
     * @param precioVenta del medicamento
     */
    public Medicamento(String nombre, String descripcion, Integer costo, Integer precioVenta)
    {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.costo = costo;
        this.precioVenta = precioVenta;
    }
    
    /////////Métodos de acceso////////
    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getDescripcion()
    {
        return descripcion;
    }

    public void setDescripcion(String descripcion)
    {
        this.descripcion = descripcion;
    }

    public Integer getCosto()
    {
        return costo;
    }

    public void setCosto(Integer costo)
    {
        this.costo = costo;
    }

    public Integer getPrecioVenta()
    {
        return precioVenta;
    }

    public void setPrecioVenta(Integer precioVenta)
    {
        this.precioVenta = precioVenta;
    }
    
    ////////Métodos//////////
    /**
     * Método del que heredan el cual permitirá calcular el precio de venta de los medicamentos
     */
    public abstract void calcularPrecioVenta();
}