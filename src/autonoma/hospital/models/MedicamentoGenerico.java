package autonoma.hospital.models;
/**
 * Representa un medicamento genérico en el inventario de la farmacia.
 * @author Samuel Esteban Herrera Bedoya & Alejandra Zapata Castañeda
 * @version 1.0.0
 * @since 2024-04-8
 */
public class MedicamentoGenerico extends Medicamento
{
    /////////Constructor//////
    public MedicamentoGenerico(String nombre, String descripcion, Integer costo, Double precioVenta)
    {
        super(nombre, descripcion, costo, precioVenta);
        calcularCostoTotal();
    }
    
    ////////////Métodos///////////
    @Override
    public void calcularCostoTotal()
    {
        precioVenta = costo + (costo * 0.1);
    }
}