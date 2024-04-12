package autonoma.hospital.models;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 * Genera reportes asociados a los distintos módulos del sistema.
 * @author Samuel Esteban Herrera Bedoya & Alejandra Zapata Castañeda
 * @version 0.1.3
 * @since 2024-04-8
 */
public class Reporte
{
    /*
    public static void escribirEnArchivo(Padecimiento padecimiento, Padecimiento padecimiento)
    {
        File fichero = new File("C:\\Users\\User\\OneDrive\\Documentos\\NetBeansProjects\\Hospital\\src\\autonoma\\hospital\\files\\Enfermedades.txt");
        try {
            FileWriter es = new FileWriter(fichero1, true); // true para que agregue al final del archivo
            PrintWriter im = new PrintWriter(es);
            im.println(padecimiento + " " + medicamento);
            im.close();
        } catch (IOException e){
            JOptionPane.showMessageDialog(null, "Error al escribir en el archivo.");
            e.printStackTrace();
        }/*finally {
            try 
            {
                if (pw != null)
                    pw.close();
            } catch (Exception ex2) {
                    System.out.println("Mensaje 2: " + ex2.getMessage());
            }
        }/
    }
    */
    public static String[] solicitarDatos() 
    {
       String nombreCompleto = JOptionPane.showInputDialog("Ingrese el nombre completo del paciente:");
       String enfermedad = JOptionPane.showInputDialog("Ingrese el nombre de la enfermedad:");
       String medicamento = JOptionPane.showInputDialog("Ingrese el nombre del medicamento para tratar la enfermedad:");

       return new String[]{nombreCompleto, enfermedad, medicamento};
    }

    public static void escribirEnArchivo(String[] datos)
    {
        File fichero = new File("C:\\Users\\User\\OneDrive\\Documentos\\NetBeansProjects\\Hospital\\src\\autonoma\\hospital\\files\\Enfermedades.txt");
        try
        {
            FileWriter escritor = new FileWriter(fichero, true); // true para que agregue al final del archivo
            PrintWriter impresor = new PrintWriter(escritor);
            impresor.println(datos[0] + " " + datos[1] + " " + datos[2]);
            impresor.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al escribir en el archivo.");
            e.printStackTrace();
        }
    }
}