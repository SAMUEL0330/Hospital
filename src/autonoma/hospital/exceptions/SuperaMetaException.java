package autonoma.hospital.exceptions;
/**
 *
 * @author Samuel Esteban Herrera Bedoya & Alejandra Zapata Castañeda
 */
public class SuperaMetaException extends Exception
{
    public SuperaMetaException()
    {
        super("El hospital ha superado la meta anual de ventas, felicitaciones al gerente");
    }
}