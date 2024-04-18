package autonoma.hospital.models;

/**
 *
 * @author Samuel Esteban Herrera Bedoya & Alejandra Zapata Castañeda
 * @version 1.0.0
 * @since 2024-04-17
 */
public class ventaMedicamento
{
    private Integer id;
    private Integer valorTotal;

    public ventaMedicamento(Integer id, Integer valorTotal)
    {
        this.id = id;
        this.valorTotal = valorTotal;
    }
    
    public ventaMedicamento(){}

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
