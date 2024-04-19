package autonoma.hospital.main;

import autonoma.hospital.views.VentanaPrincipal;
import autonoma.hospital.models.Hospital;
import autonoma.hospital.models.Inventario;
import autonoma.hospital.models.Medicamento;
import autonoma.hospital.models.Paciente;
import autonoma.hospital.models.Padecimiento;
import autonoma.hospital.models.Trabajador;
import java.io.FileNotFoundException;
import java.util.ArrayList;
/**
 *
 * @author Samuel Esteban Herrera Bedoya & Alejandra Zapata Castañeda
 */
public class HospitalMain 
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException
    {
        // Lectura archivo Hospital
        Hospital hospital = Hospital.creaGerenteDeDocumento();
        
       // Lectura archivos Medicamentos 
        ArrayList<Medicamento> listaMedicamentos = Medicamento.crearMedicamentoDeDocumento();
        //Lectura Archivo Padecimientos
        ArrayList<Padecimiento> listaPadecimientos = Padecimiento.crearPadecimientos(listaMedicamentos);
        // Lectura Archivo Pacientes
        ArrayList<Paciente> listaPacientes = Paciente.crearPacientesDeDocumento(listaPadecimientos);
        //Lectura Archivo Trabajadores
        ArrayList<Trabajador> listaTrabajadores = Trabajador.crearTrabajadorDeDocumento();
        
        //Inicializar Inventario
        Inventario inventario = new Inventario("UAM_INV_0001", 2024, null);
        inventario.setMedicamentos(listaMedicamentos);
        
        // Completar informacion Hospital
        hospital.setTrabajadores(listaTrabajadores);
        hospital.setPacientes(listaPacientes);
        hospital.setInventario(inventario);
        
        //Inicializacion Pantallas
        VentanaPrincipal ventana=new VentanaPrincipal(hospital);
        ventana.setVisible(true);
    }
}
