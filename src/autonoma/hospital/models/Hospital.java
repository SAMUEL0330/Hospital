package autonoma.hospital.models;

import java.io.File;
import java.io.FileNotFoundException;
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
     * Presupuesto del hospital
     */
    private Integer presupuesto;
    /**
     * Fecha de fundacion del hospital
     */
    private Integer fechaFundacion;
    /**
     * Estado del hospital
     */
    private Boolean estado;
    /**
     * Localizacion de hospital 
     */
    private Coordenada localizacion;
    /**
     * Administrador del hospital
     */
    private Administrador administrador;
    
    
    //////Constructor////////////////
    /**
     * Inicializa valores de las variables 
     * @param nombre del hospital
     * @param direccion del hospital
     * @param telefono del hospital
     * @param presupuesto del hospital
     * @param fechaFundacion del hospital
     * @param estado del hospital
     * @param localizacion del hospital
     * @param administrador del hospital
     */
    public Hospital(String nombre, String direccion, String telefono, Integer presupuesto, Integer fechaFundacion, Boolean estado, Coordenada localizacion, Administrador administrador)
    {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.presupuesto = presupuesto;
        this.fechaFundacion = fechaFundacion;
        this.estado = estado;
        this.localizacion = localizacion;
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

    public Boolean getEstado()
    {
        return estado;
    }

    public void setEstado(Boolean estado)
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

    public Administrador getAdministrador() {
        return administrador;
    }

    public void setAdministrador(Administrador administrador) {
        this.administrador = administrador;
    }
    
    
    
    public Integer calcularPresupuestoRestante()
    {
        return presupuesto;
    }
    
    public Boolean cambiarEstado(Boolean estado)
    {
        return false;
    }
    
    public void registrarPatrocinio()
    {
        
    }
    
    public static Hospital creaGerenteDeDocumento()
    {
        File fichero = new File("C:\\Users\\User\\OneDrive\\Documentos\\NetBeansProjects\\SimuladorCarro\\src\\autonoma\\simuladorcarro\\files\\TallerActualizar.txt");
        Scanner s = null;
        int contador =1;
        Administrador administrador = new Administrador(" ", " ", 0, " ");
        Coordenada localizacion = new Coordenada(-121.94667417922749, 37.25157313140872);
        Hospital h= new Hospital(" ", " "," " , 0, 0, true, localizacion, administrador);
        
        try 
        {
            s = new Scanner(fichero);
            while (s.hasNextLine())
            {
                Scanner lineaScanner = new Scanner(s.nextLine());
                lineaScanner.skip("\\w+\\s");
                String palabra = lineaScanner.next();
                if(contador == 1)
                {
                    h.setNombre(palabra);
                }else{
                    //m.setCilindraje(palabra);
                }
                System.out.println(palabra);
                lineaScanner.close();
                contador++;
            }
            h= new Hospital(" ", " "," " , 0, 0, true, localizacion, administrador);
            /*c.setTipoMotor(m);
            c.setTipoLlanta(l);*/
            return h;  
        } catch (FileNotFoundException ex) {
                System.out.println("Mensaje: " + ex.getMessage());
        } finally {
                try 
                {
                    if (s != null)
                        s.close();
                } catch (Exception ex2) {
                        System.out.println("Mensaje 2: " + ex2.getMessage());
                }
        }
    return null;
    }
}
