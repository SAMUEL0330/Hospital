package autonoma.hospital.models;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Clase base para todos los tipos de empleados
 * @author Samuel Esteban Herrera Bedoya & Alejandra Zapata Castañeda
 * @version 1.0.0
 * @since 2024-04-8
 */
public abstract class Trabajador
{
    /**
     * Nombre del trabajador
     */
    private String nombre;
    /**
     * Id del trabajador 
     */
    private String numeroDocumento;
    /**
     * Edad del trabajador
     */
    private String edad;
    /**
     * Salario base del trabajador
     */
    public Integer salarioBase;
    /**
     * Hospital al que trabajan los empleados
     */
    /**
     * Variable que guardará el salario total calculado del trabajador
     */
    protected Double salarioTotal;

    public Trabajador(){}

    public Trabajador(String nombre, String numeroDocumento, String edad, Integer salarioBase, Double salarioTotal)
    {
        this.nombre = nombre;
        this.numeroDocumento = numeroDocumento;
        this.edad = edad;
        this.salarioBase = salarioBase;
        this.salarioTotal = salarioTotal;
    }
    
    //////////////Metodos De Acceso////////////////
    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getNumeroDocumento()
    {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento)
    {
        this.numeroDocumento = numeroDocumento;
    }

    public String getEdad()
    {
        return edad;
    }

    public void setEdad(String edad)
    {
        this.edad = edad;
    }

    public Integer getSalarioBase()
    {
        return salarioBase;
    }

   
    
    public void setSalarioBase(Integer salarioBase)
    {
        this.salarioBase = salarioBase;
    }

    public Double getSalarioTotal()
    {
        return salarioTotal;
    }

    public void setSalarioTotal(Double salarioTotal)
    {
        this.salarioTotal = salarioTotal;
    }
    
    ////////Métodos////////
    /**
     * Método del que heredan el cual permitirá calcular el salario del empleado
     * @param hospital
     * @return 
     */
    public static ArrayList<Trabajador> crearTrabajadorDeDocumento()
    {
        File fichero = new File("C:\\Users\\User\\OneDrive\\Documentos\\NetBeansProjects\\Hospital\\src\\autonoma\\hospital\\files\\Trabajadores.txt");
        Scanner scanner = null;
        Double salarioTotal=0.0;
        ArrayList<Trabajador> trabajadores = new ArrayList<>();
        ArrayList<String> lineasActualizadas = new ArrayList<>();
        try 
        {
            scanner = new Scanner(fichero);
            while (scanner.hasNextLine())
            {
                String linea = scanner.nextLine();
                String[] partes = linea.split(";");
                
                if(partes[4].equals("Operativo"))
                {
                    Trabajador trabajador = new TrabajadorOperativo(partes[0], partes[1] , partes[2], Integer.parseInt(partes[3]), partes[5], salarioTotal);
                    trabajadores.add(trabajador);
                    if(partes.length == 6)
                    {
                        linea += ";" + trabajador.getSalarioTotal();
                    }
                }else{
                    Trabajador trabajador = new TrabajadorSalud(partes[0], partes[1] , partes[2], Integer.parseInt(partes[3]), partes[5], Integer.parseInt(partes[6]), salarioTotal);
                    trabajadores.add(trabajador);
                    if(partes.length == 7)
                    {
                        linea += ";" + trabajador.getSalarioTotal();
                    }
                }
                lineasActualizadas.add(linea);
            }
            return trabajadores;
        } catch (FileNotFoundException ex) {
                System.out.println("Mensaje: " + ex.getMessage());
        } finally {
            try 
            {
                if (scanner != null)
                {
                    scanner.close();
                }
                actualizarSalariosArchivo(lineasActualizadas, "C:\\Users\\User\\OneDrive\\Documentos\\NetBeansProjects\\Hospital\\src\\autonoma\\hospital\\files\\Trabajadores.txt");
            } catch (Exception ex2) {
                    System.out.println("Mensaje 2: " + ex2.getMessage());
            }
        }
        return null;
    }
    
    public static Trabajador buscarTrabajador(ArrayList<Trabajador> trabajadores, String nombre)
    { 
        for (Trabajador trabajador : trabajadores)
        {
            if(trabajador.getNombre().equals(nombre))
            {
                return trabajador;
            }
        }
        return null;
    }
    
    public static void guardarTrabajadorSalud(TrabajadorSalud trabajador, String tipo) throws IOException
    {
        File rutaArchivo = new File("C:\\Users\\User\\OneDrive\\Documentos\\NetBeansProjects\\Hospital\\src\\autonoma\\hospital\\files\\Trabajadores.txt");
        String lineaNueva= (trabajador.getNombre()+";"+trabajador.getNumeroDocumento()+";"+ trabajador.getEdad()+";"+ trabajador.getSalarioBase()+";"+ tipo + ";" +trabajador.getEspecialidad()+ ";"+ trabajador.getNumeroHorasTrabajadas()+";"+trabajador.getSalarioTotal());
       
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

    public abstract void calcularSalarioTotal();
    
    public static void actualizarSalariosArchivo(ArrayList<String> lineas, String rutaArchivo)
    {
        try
        {
            FileWriter escritor = new FileWriter(rutaArchivo);
            for (String linea : lineas)
            {
                escritor.write(linea + "\n");
            }
            escritor.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static void guardarTrabajadorOperativo(TrabajadorOperativo trabajador, String tipo) throws IOException
    {
        File rutaArchivo = new File("C:\\Users\\User\\OneDrive\\Documentos\\NetBeansProjects\\Hospital\\src\\autonoma\\hospital\\files\\Trabajadores.txt");
        String lineaNueva= (trabajador.getNombre()+";"+trabajador.getNumeroDocumento()+";"+ trabajador.getEdad()+";"+ trabajador.getSalarioBase()+";"+ tipo + ";" + trabajador.getSalarioTotal());
       
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