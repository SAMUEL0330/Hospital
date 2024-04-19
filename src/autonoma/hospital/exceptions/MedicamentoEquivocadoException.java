package autonoma.hospital.exceptions;
/**
 *
 * @author Samuel Esteban Herrera Bedoya & Alejandra Zapata Castañeda
 */
public class MedicamentoEquivocadoException extends Exception
{
    public MedicamentoEquivocadoException()
    {
        super("El hospital está en banca rota, debe registrar patrocinio para hacer una nueva nómina");
    }
}