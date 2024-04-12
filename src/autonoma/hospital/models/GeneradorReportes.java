package autonoma.hospital.models;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * Genera reportes asociados a los distintos módulos del sistema.
 * @author Samuel Esteban Herrera Bedoya & Alejandra Zapata Castañeda
 * @version 0.0.1
 * @since 2024-04-8
 */
public class GeneradorReportes 
{
    public static void escribirEnArchivo(String enfermedad, String medicamento)
    {
        File fichero1 = new File("C:\\Users\\User\\OneDrive\\Documentos\\NetBeansProjects\\Hospital\\src\\autonoma\\hospital\\files\\Enfermedades.txt");
        try {
            FileWriter es = new FileWriter(fichero1, true); // true para que agregue al final del archivo
            PrintWriter im = new PrintWriter(es);
            im.println(enfermedad + " " + medicamento);
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
        }*/
    }
}