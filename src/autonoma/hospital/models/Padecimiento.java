package autonoma.hospital.models;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Representa los problemas/enfermedades de los pacientes
 * @author Samuel Esteban Herrera Bedoya & Alejandra Zapata Castañeda
 * @version 0.0.1
 * @since 2024-04-9
 */
public class Padecimiento
{
    /////////////////////////Atributos///////////////////
   /**
    * Nombre de la enfermedad 
    */
   private String nombre;
   /**
    * Descripcion de enfermedad 
    */
   private String descripcion;
   /**
    * Lista de los medicamentos
    */
   private ArrayList<Medicamento> medicamentos;
   ////////////////////Constructor///////////////////////
    /**
     * Inicializa valores de las variables 
     * @param nombre de la enfermedad
     * @param descripcion de la enfermedad 
     */
    public Padecimiento(String nombre, String descripcion)
    {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public Padecimiento(String nombre, String descripcion, ArrayList<Medicamento> medicamentos)
    {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.medicamentos = medicamentos;
    }

    public Padecimiento(){
    }
    
    ///////////////////Metodos De Acceso///////////////////
    public String getNombre() 
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getDescripcion() 
    {
        return descripcion;
    }

    public void setDescripcion(String descripcion)
    {
        this.descripcion = descripcion;
    }

    public ArrayList<Medicamento> getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(ArrayList<Medicamento> medicamentos) {
        this.medicamentos = medicamentos;
    }
    
    /**
     * Agrega un nuevo padecimiento al inventario.
     * @param padecimiento Objeto de tipo Padecimiento que se agregará a la lista de enfermedades.
     * @return verdadero si el padecimiento se agregó exitosamente y si no falso.
     */
    /*
    public boolean agregarPadecimiento(Padecimiento padecimiento)
    { 
        return this.padecimientos.add(padecimiento);
    }
    */
    public static ArrayList<Padecimiento> crearPadecimientos(ArrayList<Medicamento> medicamentos) throws FileNotFoundException{
        
        
        File fichero = new File("C:\\Users\\User\\OneDrive\\Documentos\\NetBeansProjects\\Hospital\\src\\autonoma\\hospital\\files\\Padecimientos.txt");
        Scanner scanner = null;
        ArrayList<Padecimiento> padecimientos = new ArrayList<>();
        ArrayList<Medicamento> medicamentosLeidos= new ArrayList<>();
        try 
        {
            scanner = new Scanner(fichero);
            while (scanner.hasNextLine())
            {
                Padecimiento padecimientoNuevo = new Padecimiento();
                String linea = scanner.nextLine();
                String[] partes = linea.split(";");
                
                padecimientoNuevo.setNombre(partes[0]);
                padecimientoNuevo.setDescripcion(partes[1]);
                String[] medicamentosStr = partes[2].split(": ")[1].split(","); // Obtener los nombres de los medicamentos
                for (String medicamentoStr : medicamentosStr)
                {
                    Medicamento m = Medicamento.buscarMedicamento(medicamentos, medicamentoStr.trim());
                    if(m != null){
                        medicamentosLeidos.add(m);
                    }
                }
                padecimientoNuevo.setMedicamentos(medicamentosLeidos);
                padecimientos.add(padecimientoNuevo);
            }
            return padecimientos;
        } catch (FileNotFoundException ex) {
                System.out.println("Mensaje: " + ex.getMessage());
        } finally {
                try 
                {
                    if (scanner != null)
                        scanner.close();
                } catch (Exception ex2) {
                        System.out.println("Mensaje 2: " + ex2.getMessage());
                }
        }
        return null;
    }   
    /**
     * Agrega un nuevo medicamento al inventario.
     * @param padecimientos Arreglo de tipo Padecimiento que contiene la lista de los padecimientos.
     * @param nombre del padecimiento
     * @return verdadero si el medicamento se agrega exitosamente y falso si no.
     */
    public static Padecimiento buscarPadecimiento(ArrayList<Padecimiento> padecimientos, String nombre)
    { 
        for (Padecimiento padecimiento : padecimientos)
        {
            if(padecimiento.getNombre().equals(nombre))
            {
                return padecimiento;
            }
        }
        return null;
    }
    /**
     * Permite guardar los cambios en la ejecución para que no se pierdan una vez deje de ejecutarse
     * @param padecimiento o enfermedad del paciente
     * @param tipo del padecimiento
     * @throws IOException 
     */
    public static void guardarPadecimiento(Padecimiento padecimiento, Integer tipo) throws IOException
    {
        File fichero = new File("C:\\Users\\User\\OneDrive\\Documentos\\NetBeansProjects\\Hospital\\src\\autonoma\\hospital\\files\\Medicamentos.txt");
        FileWriter writer = new FileWriter(fichero,false);
        PrintWriter pw = new PrintWriter(writer);
        
        pw.println(padecimiento.getNombre()+";"+padecimiento.getDescripcion()+";"+ padecimiento.getMedicamentos());
        pw.close();
    }
}
