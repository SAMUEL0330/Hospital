package autonoma.hospital.exceptions;

/**
 *
 * @author Samuel Esteban Herrera Bedoya & Alejandra Zapata Castañeda
 */
public class CurarBuenEstadoException extends Exception
{
    public CurarBuenEstadoException()
    {
        super("El paciente se encuentra en buen estado, no hace falta curarlo");
    }
    
    public CurarBuenEstadoException(String mensaje)
    {
        super(mensaje);
    }
}