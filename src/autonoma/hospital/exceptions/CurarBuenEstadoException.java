package autonoma.hospital.exceptions;

/**
 *
 * @author Samuel Esteban Herrera Bedoya & Alejandra Zapata Castañeda
 */
public class CurarBuenEstadoException extends Exception
{
    public CurarBuenEstadoException()
    {
        super("El hospital San José está en quiebra, debe registrar patrocinio y no puede registrar más medicamentos.");
    }
    
    public CurarBuenEstadoException(String mensaje)
    {
        super(mensaje);
    }
}