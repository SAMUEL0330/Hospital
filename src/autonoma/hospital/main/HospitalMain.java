package autonoma.hospital.main;

import autonoma.hospital.models.Administrador;
import autonoma.hospital.models.Coordenada;
import autonoma.hospital.views.VentanaPrincipal;
import autonoma.hospital.models.Hospital;
import javax.swing.JOptionPane;
import static autonoma.hospital.models.Reporte.escribirEnArchivo;
import static autonoma.hospital.models.Reporte.solicitarDatos;
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
        Coordenada localizacion = new Coordenada(-121.94667417922749, 37.25157313140872);
        Hospital hospital = new Hospital("San José", "2425 Samaritan Dr, CA 95124, Estados Unidos", "+1 408-559-2011", 10000000, 1945, Boolean.TRUE, localizacion);
        /*
        String enfermedad = JOptionPane.showInputDialog("Ingrese el nombre de la enfermedad:");
        String medicamento = JOptionPane.showInputDialog("Ingrese el nombre del medicamento para tratar la enfermedad:");

        String[] datos = solicitarDatos();
        escribirEnArchivo(args);

        JOptionPane.showMessageDialog(null, "Información guardada exitosamente en el archivo.");
        */
        VentanaPrincipal ventana=new VentanaPrincipal(hospital);
        ventana.setVisible(true);
    }
}
