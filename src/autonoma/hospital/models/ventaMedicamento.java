package autonoma.hospital.models;

/**
 * Registro la información de una venta de medicamentos
 * @author Samuel Esteban Herrera Bedoya & Alejandra Zapata Castañeda
 * @version 1.0.0
 * @since 2024-04-17
 */
public class VentaMedicamento
{
    /**
     * ID de la venta
     */
    private Integer id;
    /**
     * precio de la venta total
     */
    private Integer valorTotal;

    /**
     * Inicializa el valor de las variables
     * @param id de la venta del medicamento
     * @param valorTotal de la venta
     */
    public VentaMedicamento(Integer id, Integer valorTotal)
    {
        this.id = id;
        this.valorTotal = valorTotal;
    }
    /**
     * Constructor sin parámetros
     */
    public VentaMedicamento(){}

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public Integer getValorTotal()
    {
        return valorTotal;
    }

    public void setValorTotal(Integer valorTotal)
    {
        this.valorTotal = valorTotal;
    }
}
