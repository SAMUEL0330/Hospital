package autonoma.hospital.models;

import java.util.ArrayList;
import java.util.Date;

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
    private Date fechaFundacion;
    private Boolean estado;
    
    /////////Constructor//////////
    public Paciente(String nombre, String numeroDocumento, String telefono, Integer edad, String correo, ArrayList<Padecimiento> enfermedades, Date fechaFundacion, Boolean estado)
    {
        this.nombre = nombre;
        this.numeroDocumento = numeroDocumento;
        this.telefono = telefono;
        this.edad = edad;
        this.correo = correo;
        this.enfermedades = enfermedades;
        this.estado = estado;
    }
    
    ////////Métodos de acceso///////
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

    public String getTelefono()
    {
        return telefono;
    }

    public void setTelefono(String telefono)
    {
        this.telefono = telefono;
    }

    public Integer getEdad()
    {
        return edad;
    }

    public void setEdad(Integer edad)
    {
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

    public ArrayList<Padecimiento> getPadecimiento()
    {
        return enfermedades;
    }

    public void setPadecimiento(ArrayList<Padecimiento> enfermedades)
    {
        this.enfermedades = enfermedades;
    }
    
    public Boolean getEstado()
    {
        return estado;
    }

    public void setEstado(Boolean estado)
    {
        this.estado = estado;
    }
    
    ///////Métodos/////////
}