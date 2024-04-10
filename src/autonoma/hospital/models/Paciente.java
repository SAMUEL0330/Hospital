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
    private String nombre;
    private String numeroDocumento;
    private String telefono;
    private Integer edad;
    private String correo;
    private ArrayList<Padecimiento> padecimiento;
    private Date fechaFundacion;
    private String estado;
    
    /////////Constructor//////////
    public Paciente(String nombre, String numeroDocumento, String telefono, Integer edad, String correo, ArrayList<Padecimiento> padecimiento, Date fechaFundacion, String estado) {
        this.nombre = nombre;
        this.numeroDocumento = numeroDocumento;
        this.telefono = telefono;
        this.edad = edad;
        this.correo = correo;
        this.padecimiento = padecimiento;
        this.fechaFundacion = fechaFundacion;
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
        return padecimiento;
    }

    public void setPadecimiento(ArrayList<Padecimiento> padecimiento)
    {
        this.padecimiento = padecimiento;
    }

    public Date getFechaFundacion()
    {
        return fechaFundacion;
    }

    public void setFechaFundacion(Date fechaFundacion) {
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
    
    ///////Métodos/////////
    
}