package autonoma.hospital.models;
/**
 * Representa un medicamento de marca reconocida en el inventario de la farmacia.
 * @author Samuel Esteban Herrera Bedoya & Alejandra Zapata Castañeda
 * @version 0.0.1
 * @since 2024-04-8
 */
public class MedicamentoMarca extends Medicamento
{
    ////////Atributo//////////
    /**
     * El lugar (laboratorio) en donde se creó la medicina
     */
    private String fabricante;
    
    ////////////Constructor///////
    /**
     * Inicializa el valor de las variables
     * @param fabricante del medicamento
     * @param nombre del medicamento
     * @param descripcion del medicamento
     * @param costo del medicamento
     * @param precioVenta del medicamento
     */
    public MedicamentoMarca(String fabricante, String nombre, String descripcion, Integer costo, Integer precioVenta)
    {
        super(nombre, descripcion, costo, precioVenta);
        this.fabricante = fabricante;
    }
    
    ///////Métodos de acceso////////
    public String getFabricante()
    {
        return fabricante;
    }

    public void setFabricante(String fabricante)
    {
        this.fabricante = fabricante;
    }
    ////////Métodos///////
    /**
     * 
     */
    @Override
    public void calcularPrecioVenta()
    {
        
    }   
}