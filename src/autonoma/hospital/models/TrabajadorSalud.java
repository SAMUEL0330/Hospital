package autonoma.hospital.models;
/**
 * Subclase de Empleado para empleados del área de la salud.
 * @author Samuel Esteban Herrera Bedoya & Alejandra Zapata Castañeda
 * @version 0.0.1
 * @since 2024-04-8
 */
 public class TrabajadorSalud extends Trabajador
{
  ////////////////Atributos/////////////////////////////  
    
    private String especialidad;
    private Integer numeroHorasTrabajadas;
    
    //////////////Constructor///////////////////////////

    public TrabajadorSalud(String especialidad, Integer numeroHorasTrabajadas, String nombre, String numeroDeIdentificacion, String edad, Integer salarioBase) {
        super(nombre, numeroDeIdentificacion, edad, salarioBase);
        this.especialidad = especialidad;
        this.numeroHorasTrabajadas = numeroHorasTrabajadas;
    }
    
    ///////////////Metodos De Acceso////////////////////

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Integer getNumeroHorasTrabajadas() {
        return numeroHorasTrabajadas;
    }

    public void setNumeroHorasTrabajadas(Integer numeroHorasTrabajadas) {
        this.numeroHorasTrabajadas = numeroHorasTrabajadas;
    }

    @Override
    public void calcularSalario() {
    
    }
 }