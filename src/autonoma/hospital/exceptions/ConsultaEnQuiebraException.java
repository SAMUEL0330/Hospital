package autonoma.hospital.exceptions;
/**
 *
 * @author Samuel Esteban Herrera Bedoya & Alejandra Zapata Castañeda
 */
public class ConsultaEnQuiebraException extends Exception
{
    public ConsultaEnQuiebraException()
    {
        super("El hospital está en banca rota, debe registrar patrocinio para hacer una nueva nómina");
    }
}