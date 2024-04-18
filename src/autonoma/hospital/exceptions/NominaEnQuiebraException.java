package autonoma.hospital.exceptions;
/**
 * 
 * @author Samuel Esteban Herrera Bedoya & Alejandra Zapata Castañeda
 */
public class NominaEnQuiebraException extends Exception
{
    public NominaEnQuiebraException()
    {
        super("El hospital está en banca rota, debe registrar patrocinio para hacer una nueva nómina");
    }
}