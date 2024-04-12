package autonoma.hospital.exceptions;
/**
 * 
 * @author Samuel Esteban Herrera Bedoya & Alejandra Zapata Castañeda
 */
public class HospitalEnQuiebraException extends Exception
{
    public HospitalEnQuiebraException()
    {
        super("El hospital está en banca rota, debe registrar patrocinio");
    }
}
