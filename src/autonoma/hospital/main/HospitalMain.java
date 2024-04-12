package autonoma.hospital.main;

import javax.swing.JOptionPane;
import autonoma.hospital.models.GeneradorReportes;
import static autonoma.hospital.models.GeneradorReportes.escribirEnArchivo;
/**
 *
 * @author Samuel Esteban Herrera Bedoya & Alejandra Zapata Castañeda
 */
public class HospitalMain 
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // Solicitar al usuario que ingrese la enfermedad y el medicamento
        String enfermedad = JOptionPane.showInputDialog("Ingrese el nombre de la enfermedad:");
        String medicamento = JOptionPane.showInputDialog("Ingrese el nombre del medicamento para tratar la enfermedad:");

        // Escribir la enfermedad y el medicamento en el archivo de texto
        escribirEnArchivo(enfermedad, medicamento);

        JOptionPane.showMessageDialog(null, "Información guardada exitosamente en el archivo.");
    }
}
