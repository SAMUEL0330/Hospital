package autonoma.hospital.models;

import java.util.Date;

/**
 * Hace alusion a la cita de un paciente.
 * @author Samuel Esteban Herrera Bedoya & Alejandra Zapata Castañeda
 * @version 0.0.1
 * @since 2024-04-8
 */
public class Consulta
{
    //////////Atributos//////////
    private Paciente paciente;
    private TrabajadorSalud medico;
    private Date fecha;
    private Integer costoCita;

    //////////Constructor//////////
    public Consulta(Paciente paciente, TrabajadorSalud medico, Date fecha, Integer costoCita)
    {
        this.paciente = paciente;
        this.medico = medico;
        this.fecha = fecha;
        this.costoCita = costoCita;
    }
    
    //////////Métodos de acceso//////////
    public Paciente getPaciente()
    {
        return paciente;
    }

    public void setPaciente(Paciente paciente)
    {
        this.paciente = paciente;
    }

    public TrabajadorSalud getMedico()
    {
        return medico;
    }

    public void setMedico(TrabajadorSalud medico)
    {
        this.medico = medico;
    }

    public Date getFecha()
    {
        return fecha;
    }

    public void setFecha(Date fecha)
    {
        this.fecha = fecha;
    }

    public Integer getCostoCita()
    {
        return costoCita;
    }

    public void setCostoCita(Integer costoCita)
    {
        this.costoCita = costoCita;
    }
    
    //////////Métodos//////////
    /**
     * Permite la gestión de las enfermedades.
     */
    public void gestionarEnfermedades()
    {
        
    }
    
    /**
     * Brinda el medicamento para tratar la enfermedad.
     */
    public void recetarMedicina()
    {
        
    }
}