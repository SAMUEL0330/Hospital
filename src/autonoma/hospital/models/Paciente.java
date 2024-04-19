package autonoma.hospital.models;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * Representa a un paciente del hospital.
 * @author Samuel Esteban Herrera Bedoya & Alejandra Zapata Castañeda
 * @version 0.0.1
 * @since 2024-04-8
 */
public class Paciente
{
    ////////Atributos///////////
    /**
     * Nombre del paciente
     */
    private String nombre;
    /**
     * Número de Identificación del paciente
     */
    private String numeroDocumento;
    /**
     * El número de teléfono del paciente
     */
    private String telefono;
    /**
     * La edad del paciente
     */
    private Integer edad;
    /**
     * El correo del paciente
     */
    private String correo;
    /**
     * Lista de enfermedades del paciente
     */
    private ArrayList<Padecimiento> enfermedades;
    /**
     * El estado de salud del paciente
     */
    private String estado;
    
    /////////Constructor//////////
    /**
     * Inicializa el valor de las variables
     * @param nombre del paciente
     * @param numeroDocumento del paciente
     * @param telefono del paciente
     * @param edad del paciente
     * @param correo del paciente
     * @param enfermedades del paciente
     * @param estado del paciente
     */
    public Paciente(String nombre, String numeroDocumento, String telefono, Integer edad, String correo, ArrayList<Padecimiento> enfermedades, String estado)
    {
        this.nombre = nombre;
        this.numeroDocumento = numeroDocumento;
        this.telefono = telefono;
        this.edad = edad;
        this.correo = correo;
        this.enfermedades = enfermedades;
        this.estado = estado;
    }

    public Paciente(){}

    public Paciente(String nombre, String numeroDocumento, String telefono, Integer edad, String correo)
    {
        this.nombre = nombre;
        this.numeroDocumento = numeroDocumento;
        this.telefono = telefono;
        this.edad = edad;
        this.correo = correo;
    }
    
    public String getNombre()    
    {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getCorreo()
    {
        return correo;
    }

    public void setCorreo(String correo)
    {
        this.correo = correo;
    }

    public ArrayList<Padecimiento> getEnfermedades()
    {
        return enfermedades;
    }

    public void setEnfermedades(ArrayList<Padecimiento> enfermedades)
    {
        this.enfermedades = enfermedades;
    }

    public String getEstado()
    {
        return estado;
    }

    ////////Métodos de acceso///////
    public void setEstado(String estado)
    {    
        this.estado = estado;
    }

    ///////Métodos/////////
    public static ArrayList<Paciente> crearPacientesDeDocumento(ArrayList<Padecimiento> padecimientos) throws FileNotFoundException {
        File fichero = new File("C:\\Users\\User\\OneDrive\\Documentos\\NetBeansProjects\\Hospital\\src\\autonoma\\hospital\\files\\Pacientes.txt");
        Scanner scanner = null;
        ArrayList<Paciente> pacientes = new ArrayList<>();
        ArrayList<Padecimiento> padecimientosLeidos= new ArrayList<>();
        try 
        {
            scanner = new Scanner(fichero);
            while (scanner.hasNextLine())
            {
                Paciente pacienteNuevo = new Paciente();
                //Paciente pacienteNuevo = new Paciente(partes[0], partes[1], partes[2], partes[3], partes[4], partes[5], partes[6]);
                String linea = scanner.nextLine();
                String[] partes = linea.split(";");
                
                pacienteNuevo.setNombre(partes[0]);
                pacienteNuevo.setNumeroDocumento(partes[1]);
                pacienteNuevo.setTelefono(partes[2]);
                pacienteNuevo.setEdad(Integer.parseInt(partes[3]));
                pacienteNuevo.setCorreo(partes[4]);
                String[] padecimientosStr = partes[5].split(": ")[1].split(","); // Obtener los nombres de los padecimientos

                for (String padecimientoStr : padecimientosStr)
                {
                    Padecimiento p = Padecimiento.buscarPadecimiento(padecimientos, padecimientoStr.trim());
                    if(p != null)
                    {
                        padecimientosLeidos.add(p);
                    }
                }
                pacienteNuevo.setEstado("0".equals(partes[6]) ? "Salud" : "Critico");
                pacienteNuevo.setEnfermedades(padecimientosLeidos);
                pacientes.add(pacienteNuevo);
                
                

            }
            return pacientes;
        } catch (FileNotFoundException ex) {
            System.out.println("Mensaje 1: " + ex.getMessage());
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
    
    
    public  void actualizarArchivoPaciente(Paciente paciente){
        String rutaArchivo = "C:\\Users\\User\\OneDrive\\Documentos\\NetBeansProjects\\Hospital\\src\\autonoma\\hospital\\files\\Pacientes.txt";
        // Texto a agregar
        String lineaNueva = paciente.getNombre() + ";" + paciente.getNumeroDocumento() + ";" + paciente.getTelefono() + ";" + paciente.getEdad() + ";" +  paciente.getCorreo()+ ";" + "Padecimiento: N/A" + ";"+ "0";
        
         try {
            // Instanciar FileWriter con el modo de agregar al final del archivo
            FileWriter fw = new FileWriter(rutaArchivo, true);
            // Instanciar BufferedWriter para escribir en el archivo
            BufferedWriter bw = new BufferedWriter(fw);

            // Escribir el texto en el archivo
            bw.write(lineaNueva);
            // Agregar un salto de línea
            bw.newLine();

            // Cerrar el BufferedWriter
            bw.close();

            System.out.println("Línea agregada correctamente al archivo.");
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo: " + e.getMessage());
        }

    }
}