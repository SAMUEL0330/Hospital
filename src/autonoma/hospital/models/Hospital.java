package autonoma.hospital.models;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
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
    
    private Paciente pacienteModel = new Paciente();
    
    private Trabajador trabajadorSaludModel = new TrabajadorSalud();
    
    //////Constructor////////////////
    public Hospital(){}

    public Hospital(String nombre, String direccion, String telefono, String logo, Integer presupuesto, Integer fechaFundacion, String estado, Coordenada localizacion, Gerente gerente, Inventario inventario, ArrayList<Trabajador> trabajadores, ArrayList<Paciente> pacientes)
    {
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
    public String getNombre()
    {
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

    public Inventario getInventario()
    {
        return inventario;
    }

    public void setInventario(Inventario inventario)
    {
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

    public ArrayList<Paciente> getPacientes()
    {
        return pacientes;
    }

    public void setPacientes(ArrayList<Paciente> pacientes)
    {
        this.pacientes = pacientes;
    }
    
     /// Metodos
    public void registrarPatrocinio()
    {
        
    }
    
    public static Hospital creaGerenteDeDocumento()
    {
        File fichero = new File("C:\\Users\\User\\OneDrive\\Documentos\\NetBeansProjects\\Hospital\\src\\autonoma\\hospital\\files\\Informacion.txt");
        Scanner scanner = null;
        Hospital hospitalNuevo= new Hospital();
        Coordenada coordenadas = new Coordenada(0);
        Gerente gerente = new Gerente();
        
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
                            hospitalNuevo.setNombre(valor.trim());
                            System.out.println("Entré");
                            break;
                        case "Direccion":
                            hospitalNuevo.setDireccion(valor.trim());
                            break;
                        case "Telefono":
                            hospitalNuevo.setTelefono(valor.trim());
                            break;
                        case "Logo":
                            hospitalNuevo.setLogo(valor.trim());
                            break;
                        case "Presupuesto":
                            hospitalNuevo.setPresupuesto(Integer.parseInt(valor.trim()));
                            break;
                        case "Fecha de fundacion":
                            hospitalNuevo.setFechaFundacion(Integer.parseInt(valor.trim()));
                            break;
                        case "Estado":
                            hospitalNuevo.setEstado(valor.trim());
                            break;
                        case "Latitud":                            
                            double latitud = Double.parseDouble(valor.trim());
                            coordenadas.setLatitud(latitud);
                            break;
                        case "Longitud":
                            double longitud = Double.parseDouble(valor.trim());
                            coordenadas.setLongitud(longitud);
                            hospitalNuevo.setLocalizacion(coordenadas);
                            break;
                        case "Nombre gerente":
                            gerente.setNombreGerente(valor.trim());
                            break;
                        case "Numero de documento gerente":
                            gerente.setNumeroIdentificacion(valor.trim());
                            break;
                        case "Edad gerente":
                            gerente.setEdad(Integer.parseInt(valor.trim()));
                            break;
                        case "Carrera gerente":
                            gerente.setCarrera(valor.trim());
                            hospitalNuevo.setGerente(gerente);
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
    
    /**
     * Agrega un nuevo medicamento al inventario.
     * @param paciente La instancia de tipo Paciente que se agregará al hospital.
     * @return verdadero si el medicamento se agrega exitosamente y falso si no.
     */
    public boolean agregarPaciente(Paciente paciente)
    { 
        
        pacienteModel.actualizarArchivoPaciente(paciente);
        return this.pacientes.add(paciente);
        
    }
    
    /**
     * Busca un medicamento en el inventario basándose en un objeto Medicamento.
     * @param paciente La instancia de tipo Paciente que se desea buscar en el inventario
     * @return el objeto Medicamento encontrado si existe en el inventario, null si no se encuentra.
     */
    public Paciente buscarPaciente(Paciente paciente)
    {    
        for(int i=0;i<this.pacientes.size();i++)
        {
            Paciente p = this.pacientes.get(i);
            if(p.equals(paciente))
            {
                return p;
            }
        }
        return null;
    }
    
    /**
     * Busca un producto en el inventario basándose en su nombre.
     * @param pacientes Conjunto de objetos de tipo Paciente.
     * @param nombre Nombre del paciente que se desea buscar en el hospital.
     * @return El objeto Producto encontrado si existe en el inventario, null si no se encuentra.
     */
    public static Paciente buscarPaciente(ArrayList<Paciente> pacientes, String nombre)
    {
        for (Paciente paciente : pacientes)
        {
            if(paciente.getNombre().equals(nombre))
            {
                return paciente;
            }
        }
        return null;
    }
    /*
    public Medicamento buscarMedicamento(String nombre)
    {    
        for(int i=0;i<this.medicamentos.size();i++)
        {
            Medicamento p = this.medicamentos.get(i);
            if(p.getNombre().equals(nombre))
            {
                return p;
            }
        }
        return null;   
    }
    */
    /**
     * Actualiza un paciente en el hospital basándose en un objeto Paciente.
     * @param paciente Nueva instancia de tipo Paciente que reemplazará al paciente ya existente
     * @return El objeto Paciente actualizado si se encuentra y actualiza correctamente, null si no se encuentra.
     */
    public Paciente actualizarPaciente(Paciente paciente)
    {    
        for(int i = 0; i < this.pacientes.size(); i++)
        {
            Paciente p = this.pacientes.get(i);
            if(p.equals(paciente))
            {
                return p;
            }
        }
    return null;   
    }

    /**
     * Elimina un producto del inventario basándose en su ID.
     * @param paciente La instancia de tipo Paciente que será eliminada de la lista de las mismas
     * @return El objeto Producto eliminado si se encuentra y se elimina correctamente, null si no se encuentra.
     */
    public Paciente eliminarPaciente(Paciente paciente)
    {    
        Paciente eliminar = this.buscarPaciente(paciente);
        if (eliminar != null)
        {
            boolean eliminado = this.pacientes.remove(eliminar);
            if (eliminado)
            {
                return eliminar;
            } else {
                // Si el medicamento no fue eliminado correctamente de la lista, 
                // podría ser útil lanzar una excepción u otro manejo de error.
                // Aquí devolvemos null como indicación de que no se pudo eliminar.
                return null;
            }
        } else {
            // Si el medicamento no se encontró en la lista, devolvemos null.
            return null;
        }
    }
    
    /**
     * Agrega un nuevo medicamento al inventario.
     * @param trabajador La instancia de tipo Trabajador que se agregará al hospital.
     * @param tipo
     * @return verdadero si el medicamento se agrega exitosamente y falso si no.
     * @throws java.io.IOException
     */
    public boolean agregarTrabajadorSalud(TrabajadorSalud trabajador, String tipo) throws IOException
    { 
        trabajadorSaludModel.guardarTrabajadorSalud(trabajador, tipo);
        return this.trabajadores.add(trabajador);
    }
    
     public boolean agregarTrabajadorOperativo(TrabajadorOperativo trabajador, String tipo) throws IOException
    { 
        trabajadorSaludModel.guardarTrabajadorOperativo(trabajador, tipo);
        return this.trabajadores.add(trabajador);
    }
    
    /**
     * Busca un medicamento en el inventario basándose en un objeto Medicamento.
     * @param trabajador La instancia de tipo Trabajador que se desea buscar en el hospital
     * @return el objeto Medicamento encontrado si existe en el inventario, null si no se encuentra.
     */
    public Trabajador buscarTrabajador(Trabajador trabajador)
    {    
        for(int i=0;i<this.trabajadores.size();i++)
        {
            Trabajador t = this.trabajadores.get(i);
            if(t.equals(trabajador))
            {
                return t;
            }
        }
        return null;
    }
    
    /**
     * Busca un producto en el inventario basándose en su nombre.
     * @param trabajadores Conjunto de objetos de tipo Trabajador
     * @param nombre Nombre del paciente que se desea buscar en el hospital.
     * @return El objeto Producto encontrado si existe en el inventario, null si no se encuentra.
     */
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
    /*
    public Medicamento buscarMedicamento(String nombre)
    {    
        for(int i=0;i<this.medicamentos.size();i++)
        {
            Medicamento p = this.medicamentos.get(i);
            if(p.getNombre().equals(nombre))
            {
                return p;
            }
        }
        return null;   
    }
    */
    /**
     * Actualiza un medicamento en el inventario basándose en un objeto Medicamento.
     * @param trabajador Nueva instancia de tipo Trabajador que reemplazará al trabajador ya existente.
     * @return El objeto Producto actualizado si se encuentra y actualiza correctamente, null si no se encuentra.
     */
    public Trabajador actualizarTrabajador(Trabajador trabajador)
    {    
        for(int i = 0; i < this.trabajadores.size(); i++)
        {
            Trabajador t = this.trabajadores.get(i);
            if(t.equals(trabajador))
            {
                return t;
            }
        }
    return null;   
    }

    /**
     * Elimina un producto del inventario basándose en su ID.
     * @param trabajador La instancia de tipo Trabajador que será eliminada de la lista de trabajadores
     * @return El objeto Producto eliminado si se encuentra y se elimina correctamente, null si no se encuentra.
     */
    public Trabajador eliminarTrabajador(Trabajador trabajador)
    {    
        Trabajador eliminar = this.buscarTrabajador(trabajador);
        if (eliminar != null)
        {
            boolean eliminado = this.trabajadores.remove(eliminar);
            if (eliminado)
            {
                return eliminar;
            } else {
                // Si el medicamento no fue eliminado correctamente de la lista, 
                // podría ser útil lanzar una excepción u otro manejo de error.
                // Aquí devolvemos null como indicación de que no se pudo eliminar.
                return null;
            }
        } else {
            // Si el medicamento no se encontró en la lista, devolvemos null.
            return null;
        }
    }
    
    public  void actualizarHospitalArchivo(ArrayList<String> lineas)
    {
        String rutaArchivo="C:\\Users\\User\\OneDrive\\Documentos\\NetBeansProjects\\Hospital\\src\\autonoma\\hospital\\files\\Informacion.txt";
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
    
    public ArrayList<Paciente> obtenerListaPacientes(){
        return this.pacientes;
    }
    
    public ArrayList<Trabajador> obtenerListaTrabajadores(){
        return this.trabajadores;
    }
    
}