package autonoma.hospital.models;

import autonoma.hospital.models.MedicamentoMarca;
import autonoma.hospital.models.MedicamentoGenerico;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Representa un medicamento en el inventario de la farmacia.
 * @author Samuel Esteban Herrera Bedoya & Alejandra Zapata Castañeda
 * @version 1.0.0
 * @since 2024-04-9
 */
public abstract class Medicamento
{
    //////////Atributos/////////
    /**
     * Nombre del medicamento
     */
    private String nombre;
    /**
     * Descripcion del medicamento
     */
    private String descripcion;
    /**
     * Cuanto fue el costo del medicamento
     */
     Integer costo;
    /**
     * Precio de venta del medicamento
     */
    protected Double precioVenta;
    
    //Contructores
    public Medicamento(){}

    public Medicamento(String nombre, String descripcion, Integer costo, Double precioVenta)
    {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.costo = costo;
        this.precioVenta = precioVenta;
    }
    
    /////////Métodos de acceso////////
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

    public Integer getCosto()
    {
        return costo;
    }

    public void setCosto(Integer costo)
    {
        this.costo = costo;
    }

    public Double getPrecioVenta()
    {
        return precioVenta;
    }

    public void setPrecioVenta(Double precioVenta)
    {
        this.precioVenta = precioVenta;
    }

    ////////Métodos//////////
    public static ArrayList<Medicamento> crearMedicamentoDeDocumento()
    {
        File fichero = new File("C:\\Users\\User\\OneDrive\\Documentos\\NetBeansProjects\\Hospital\\src\\autonoma\\hospital\\files\\Medicamentos.txt");
        Scanner scanner = null;
        Double costoTotal =0.0;
        ArrayList<Medicamento> medicamentos = new ArrayList<>();
        ArrayList<String> lineasActualizadas = new ArrayList<>();
        try 
        {
            scanner = new Scanner(fichero);
            while (scanner.hasNextLine())
            {
                String linea = scanner.nextLine();
                String[] partes = linea.split(";");
                if(partes[3].equals("0"))
                {
                    Medicamento medicamento = new MedicamentoGenerico(partes[0],partes[1] ,Integer.parseInt(partes[2]), costoTotal);
                    medicamentos.add(medicamento);
                    if(partes.length ==4)
                    {
                        linea += ";" + medicamento.getPrecioVenta();
                    }
                }else{
                    Medicamento medicamento = new MedicamentoMarca(partes[0], partes[1] ,Integer.parseInt(partes[2]), costoTotal, partes[4]);
                    medicamentos.add(medicamento);
                    if(partes.length ==5)
                    {
                        linea += ";" + medicamento.getPrecioVenta();
                    }
                }
                lineasActualizadas.add(linea);
            }
            return medicamentos;
        } catch (FileNotFoundException ex) {
                System.out.println("Mensaje: " + ex.getMessage());
        } finally {
            try 
            {
                if (scanner != null)
                {
                    scanner.close();
                }
                actualizarCostoMedicamentoArchivo(lineasActualizadas, "C:\\Users\\User\\OneDrive\\Documentos\\NetBeansProjects\\Hospital\\src\\autonoma\\hospital\\files\\Medicamentos.txt");
            } catch (Exception ex2) {
                    System.out.println("Mensaje 2: " + ex2.getMessage());
            }
        }
        return null;
    }
    
    public static Medicamento buscarMedicamento(ArrayList<Medicamento> medicamentos, String nombre)
    { 
        for (Medicamento medicamento : medicamentos)
        {
            if(medicamento.getNombre().equals(nombre))
            {
                return medicamento;
            }
        }
        return null;
    }
    
    public static void guardarMedicamento(Medicamento medicamento, Integer tipo) throws IOException
    {
        File fichero = new File("C:\\Users\\User\\OneDrive\\Documentos\\NetBeansProjects\\Hospital\\src\\autonoma\\hospital\\files\\Medicamentos.txt");
        FileWriter writer = new FileWriter(fichero,false);
        PrintWriter pw = new PrintWriter(writer);
        
        pw.println(medicamento.getNombre()+";"+medicamento.getDescripcion()+";"+ medicamento.getCosto()+";"+ medicamento.getPrecioVenta()+";"+ tipo);
        pw.close();
    }
    
     public abstract void calcularCostoTotal();
     
      public static void actualizarCostoMedicamentoArchivo(ArrayList<String> lineas, String rutaArchivo)
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
}