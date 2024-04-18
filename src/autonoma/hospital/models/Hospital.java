package autonoma.hospital.models;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Representa al hospital en su conjunto.
 * @author Samuel Esteban Herrera Bedoya & Alejandra Zapata Castañeda
 * @version 0.1.1
 * @since 2024-04-8
 */
public class Hospital
{
    ///////Atributos////////
    /**
     * Nombre del hospital
     */
    private String nombre;
    /**
     * Direccion del hospital
     */
    private String direccion;
    /**
     * Telefono del hospital
     */
    private String telefono;
    /**
     * Logo del hospital
     */
    private String logo;
    /**
     * Presupuesto del hospital
     */
    private Integer presupuesto;
    /**
     * Fecha de fundacion del hospital
     */
    private Integer fechaFundacion;
    /**
     * Estado financiero del hospital
     */
    private String estado;
    /**
     * Localizacion de hospital 
     */
    private Coordenada localizacion;
    /**
     * Gerente del hospital
     */
    private Gerente gerente;
    
    private Inventario inventario;
    /**
     * Lista de empleados del hospital
     */
    private ArrayList<Trabajador> trabajadores;
    
    /**
     * Lista de pacientes del hospital
     */
    private ArrayList<Paciente> pacientes;
    
    //////Constructor////////////////
    public Hospital()
    {
    }

    public Hospital(String nombre, String direccion, String telefono, String logo, Integer presupuesto, Integer fechaFundacion, String estado, Coordenada localizacion, Gerente gerente, Inventario inventario, ArrayList<Trabajador> trabajadores, ArrayList<Paciente> pacientes) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.logo = logo;
        this.presupuesto = presupuesto;
        this.fechaFundacion = fechaFundacion;
        this.estado = estado;
        this.localizacion = localizacion;
        this.gerente = gerente;
        this.inventario = inventario;
        this.trabajadores = trabajadores;
        this.pacientes = pacientes;
    }

    

    /////////////////Metodos De Acceso/////////
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getDireccion()
    {
        return direccion;
    }

    public void setDireccion(String direccion)
    {
        this.direccion = direccion;
    }

    public String getTelefono()
    {
        return telefono;
    }

    public void setTelefono(String telefono)
    {
        this.telefono = telefono;
    }

    public String getLogo()
    {
        return logo;
    }

    public void setLogo(String logo)
    {
        this.logo = logo;
    }
    
    public Integer getPresupuesto()
    {
        return presupuesto;
    }

    public void setPresupuesto(Integer presupuesto)
    {
        this.presupuesto = presupuesto;
    }

    public Integer getFechaFundacion()
    {
        return fechaFundacion;
    }

    public void setFechaFundacion(Integer fechaFundacion)
    {
        this.fechaFundacion = fechaFundacion;
    }

    public String getEstado()
    {
        return estado;
    }

    public void setEstado(String estado)
    {
        this.estado = estado;
    }

    public Coordenada getLocalizacion()
    {
        return localizacion;
    }

    public void setLocalizacion(Coordenada localizacion)
    {
        this.localizacion = localizacion;
    }

    public Gerente getGerente()
    {
        return gerente;
    }

    public void setGerente(Gerente gerente)
    {
        this.gerente = gerente;
    }

    public Inventario getInventario() {
        return inventario;
    }

    public void setInventario(Inventario inventario) {
        this.inventario = inventario;
    }
    
    public ArrayList<Trabajador> getTrabajadores()
    {
        return trabajadores;
    }

    public void setTrabajadores(ArrayList<Trabajador> trabajadores)
    {
        this.trabajadores = trabajadores;
    }

    public ArrayList<Paciente> getPacientes() {
        return pacientes;
    }

    public void setPacientes(ArrayList<Paciente> pacientes) {
        this.pacientes = pacientes;
    }
    
     /// Metodos
    
    public void registrarPatrocinio()
    {
        
    }
    
    public static Hospital creaGerenteDeDocumento()
    {
        File fichero = new File("C:\\Users\\User\\OneDrive\\Documentos\\NetBeansProjects\\Hospital\\src\\autonoma\\hospital\\files\\Medicamentos.txt");
        Scanner scanner = null;
        Hospital hospitalNuevo= new Hospital();
        
        try 
        {
            scanner = new Scanner(fichero);
            while (scanner.hasNextLine())
            {
                String linea = scanner.nextLine();
                String[] partes = linea.split(":");

                if (partes.length >= 2)
                {
                    String clave = partes[0];
                    String valor = linea.substring(clave.length() + 1);

                    switch (clave)
                    {
                        case "Nombre":
                            hospitalNuevo.setNombre(valor);
                            System.out.println("Entré");
                            break;
                        case "Direccion":
                            hospitalNuevo.setDireccion(valor);
                            break;
                        case "Telefono":
                            hospitalNuevo.setTelefono(valor);
                            break;
                        case "Logo":
                            hospitalNuevo.setLogo(valor);
                            break;
                        case "Presupuesto":
                            hospitalNuevo.setPresupuesto(0);
                            break;
                        case "Fecha de fundacion":
                            hospitalNuevo.setFechaFundacion(0);
                            break;
                        case "Estado":
                            hospitalNuevo.setEstado(valor);
                            break;
                        case "Localizacion":
                            String[] coordenadas = valor.split(";");
                            double latitud = Double.parseDouble(coordenadas[0]);
                            double longitud = Double.parseDouble(coordenadas[1]);
                            hospitalNuevo.getLocalizacion().setLatitud(latitud);
                            break;
                        case "Nombre gerente":
                            hospitalNuevo.gerente.getNombreGerente();
                            break;
                        case "Numero de documento gerente":
                            hospitalNuevo.gerente.getNumeroIdentificacion();
                            break;
                        case "Edad gerente":
                            hospitalNuevo.gerente.getEdad();
                            break;
                        case "Carrera gerente":
                            hospitalNuevo.gerente.getCarrera();
                            break;
                        default:
                            // Ignorar líneas que no corresponden a datos del hospital
                            break;
                    }
                }
            }
            //System.out.println("Soy el archivo");
            //System.out.println("nombre" + hospitalNuevo.getNombre());
            //System.out.println("nombre gerente" + hospitalNuevo.getGerente().getNombreGerente() + hospitalNuevo.getLocalizacion().getLatitud() + " " + hospitalNuevo.getLocalizacion().getLongitud());
            
            return hospitalNuevo;  
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
    
      public Integer calcularPresupuestoRestante()
    {
        return presupuesto;
    }
    
    public Boolean cambiarEstado(Boolean estado)
    {
        return false;
    }
    
}