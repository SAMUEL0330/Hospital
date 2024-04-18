package autonoma.hospital.models;

import java.util.ArrayList;

/**
 * Contenedor de los medicamentos
 * @author Samuel Esteban Herrera Bedoya & Alejandra Zapata Castañeda
 * @version 0.1.3
 * @since 2024-04-9
 */
public class Inventario
{
    ////////Atributos/////////
    /**
     * Número de la actualización del inventario
     */
    private String codigo;
    /**
     * El año de actualización 
     */
    private Integer anoActualizacion;
    /**
     * Los tipos de medicinas que se almacenarán en el inventario.
     */
    private ArrayList<Medicamento> medicamentos;
    /**
     * Inicializa el valor de las variables
     * @param codigo de la actualización del inventario
     * @param anoActualizacion del inventario
     * @param medicamentos del inventario
     */
    public Inventario(String codigo, Integer anoActualizacion, ArrayList<Medicamento> medicamentos)
    {
        this.codigo = codigo;
        this.anoActualizacion = anoActualizacion;
        this.medicamentos = medicamentos;
    }

    //////////Métodos de acceso/////////

    public ArrayList<Medicamento> getMedicamentos()
    {
        return medicamentos;
    }

    public void setMedicamentos(ArrayList<Medicamento> medicamentos)
    {
        this.medicamentos = medicamentos;
    }
    
    public String getCodigo() 
    {
        return codigo;
    }

    public void setCodigo(String codigo)
    {
        this.codigo = codigo;
    }

    public Integer getAnoActualizacion()
    {
        return anoActualizacion;
    }

    public void setAnoActualizacion(Integer anoActualizacion)
    {
        this.anoActualizacion = anoActualizacion;
    }
    
    /**
     * Agrega un nuevo medicamento al inventario.
     * @param medicamento Objeto de tipo Medicamento que se agregará al inventario.
     * @return verdadero si el medicamento se agrega exitosamente y falso si no.
     */
    public boolean agregarMedicamento(Medicamento medicamento)
    { 
        return this.medicamentos.add(medicamento);
    }
    
    /**
     * Busca un medicamento en el inventario basándose en un objeto Medicamento.
     * @param medicamento que se desea buscar en el inventario.
     * @return el objeto Medicamento encontrado si existe en el inventario, null si no se encuentra.
     */
    public Medicamento buscarMedicamento(Medicamento medicamento)
    {    
        for(int i=0;i<this.medicamentos.size();i++)
        {
            Medicamento m = this.medicamentos.get(i);
            if(m.equals(medicamento))
            {
                return m;
            }
        }
        return null;
    }
    
    /**
     * Busca un producto en el inventario basándose en su ID.
     * @param id ID del producto que se desea buscar en el inventario.
     * @return El objeto Producto encontrado si existe en el inventario, null si no se encuentra.
     */
    /*
    public Medicamento buscarProducto(long id)
    {    
        for(int i=0;i<this.medicamentos.size();i++)
        {
            Medicamento p = this.medicamentos.get(i);
            if(p.getId() == id)
            {
                return p;
            }
        }
        return null;   
    }
    */
    /**
     * Busca un producto en el inventario basándose en su nombre.
     * @param medicamentos del inventario
     * @param nombre Nombre del producto que se desea buscar en el inventario.
     * @return El objeto Producto encontrado si existe en el inventario, null si no se encuentra.
     */
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
     * @param medicamento Nuevo objeto de tipo Medicamento que reemplazará al medicamento ya existente.
     * @return El objeto Producto actualizado si se encuentra y actualiza correctamente, null si no se encuentra.
     */
    public Medicamento actualizarMedicamento(Medicamento medicamento)
    {    
        for(int i = 0; i < this.medicamentos.size(); i++)
        {
            Medicamento m = this.medicamentos.get(i);
            if(m.equals(medicamento))
            {
                return m;
            }
        }
    return null;   
    }

    /**
     * Elimina un producto del inventario basándose en su ID.
     * @param medicamento El objeto de tipo Medicamento que será eliminado de la lista de los mismos.
     * @return El objeto Producto eliminado si se encuentra y se elimina correctamente, null si no se encuentra.
     */
    public Medicamento eliminarMedicamento(Medicamento medicamento)
    {    
        Medicamento eliminar = this.buscarMedicamento(medicamento);
        if (eliminar != null)
        {
            boolean eliminado = this.medicamentos.remove(eliminar);
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
     * Devuelve una representación en forma de cadena de todos los productos en el inventario.
     * @return Una cadena que contiene la representación de todos los productos en el inventario, separados por saltos de línea.
     */
    /*
    public String mostrarInventario()
    {
        String inventario = "";
        for(int i=0;i<this.medicamentos.size();i++)
        {
            Medicamento m = this.medicamentos.get(i);
            inventario += m.toString()+"\n";
        }
        return inventario;
    }
    */
    
}