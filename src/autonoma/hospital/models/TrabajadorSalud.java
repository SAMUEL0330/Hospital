package autonoma.hospital.models;
/**
 * Subclase de Empleado para empleados del área de la salud.
 * @author Samuel Esteban Herrera Bedoya & Alejandra Zapata Castañeda
 * @version 0.0.1
 * @since 2024-04-8
 */
 public class TrabajadorSalud extends Trabajador
{
    ////////////Atributos///////////////
    /**
     * Reflejo del mejor desempeño del trabajador de la salud
     */
    private String especialidad;
    /**
     * Cantidad de horas trabajadas en la jornada
     */
    private Integer numeroHorasTrabajadas;
    
    //////////Constructor/////////////
    /**
     * Inicializa el valor de las variables
     * @param especialidad del trabajador de la salud
     * @param numeroHorasTrabajadas por el trabajador de la salud en la jornada
     * @param nombre del trabajador de la salud
     * @param numeroDeIdentificacion del trabajador de la salud
     * @param edad del trabajador de la salud
     * @param salarioBase del trabajador de la salud
     */
    public TrabajadorSalud(String nombre, String numeroDeIdentificacion, String edad, Integer salarioBase, String especialidad, Integer numeroHorasTrabajadas, Double salarioTotal)
    {
        super(nombre, numeroDeIdentificacion, edad, salarioBase, salarioTotal);
        this.especialidad = especialidad;
        this.numeroHorasTrabajadas = numeroHorasTrabajadas;
        calcularSalarioTotal();
    }

    public TrabajadorSalud(){
    }

    public TrabajadorSalud(String nombre, String numeroDocumentoTrabajadorSalud, Integer edadTrabajadorSalud, double salarioBaseTrabajadorSalud, String especialidadTrabajadorSalud, Integer horasTrabajadorSalud, Hospital hospital) {
        
    }
    
    ///////////////Metodos De Acceso////////////////////
    public String getEspecialidad()
    {
        return especialidad;
    }

    public void setEspecialidad(String especialidad)
    {
        this.especialidad = especialidad;
    }

    public Integer getNumeroHorasTrabajadas()
    {
        return numeroHorasTrabajadas;
    }

    public void setNumeroHorasTrabajadas(Integer numeroHorasTrabajadas)
    {
        this.numeroHorasTrabajadas = numeroHorasTrabajadas;
    }

    /**
     * Método heredado para calcular el salario de un trabajador de la salud
     * @param salarioBase de del trabajador de la salud
     */
    
    public void calcularSalarioTotal() {
        Double base = salarioBase * 0.012;
        Double valorHoras = base * getNumeroHorasTrabajadas();
        salarioTotal = salarioBase + valorHoras;
    }
 }