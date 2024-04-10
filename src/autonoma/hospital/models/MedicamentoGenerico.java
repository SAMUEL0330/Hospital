package autonoma.hospital.models;
/**
 * Representa un medicamento genérico en el inventario de la farmacia.
 * @author Samuel Esteban Herrera Bedoya
 * @version 0.0.1
 * @since 2024-04-8
 */
public class MedicamentoGenerico extends Medicamento
{
    /////////Constructor//////
    public MedicamentoGenerico(String nombre, String descripcion, Integer costo, Integer precioVenta)
    {
        super(nombre, descripcion, costo, precioVenta);
    }
    
    ////////////Métodos///////////
    @Override
    public void calcularPrecioVenta()
    {
        
    }
}