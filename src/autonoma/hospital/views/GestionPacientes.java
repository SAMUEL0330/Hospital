package autonoma.hospital.views;

import autonoma.hospital.models.Hospital;
import autonoma.hospital.models.Paciente;
import autonoma.hospital.models.Padecimiento;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
/**
 *
 * @author Samuel Esteban Herrera Bedoya & Alejandra Zapata Castañeda
 */
public class GestionPacientes extends javax.swing.JDialog
{
    private Hospital hospital;
    private VentanaPrincipal ventanaPricipal;
    ArrayList<Paciente> pacientes;
    
    public GestionPacientes(java.awt.Frame parent, boolean modal, Hospital hospital, VentanaPrincipal ventanaPrincipal)
    {
        super(parent, modal);
        initComponents();
        this.hospital=hospital;
        this.ventanaPricipal=ventanaPrincipal;
        pacientes= hospital.obtenerListaPacientes();
        llenarTabla();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondoPacientes = new javax.swing.JPanel();
        fondoTituloPacientes = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tablaPacientes = new javax.swing.JTable();
        btnAgregarPaciente = new javax.swing.JButton();
        btnActualizarPaciente = new javax.swing.JButton();
        btnEliminarPaciente = new javax.swing.JButton();
        btnVolverPacientes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        fondoPacientes.setBackground(new java.awt.Color(204, 204, 204));

        fondoTituloPacientes.setBackground(new java.awt.Color(255, 255, 51));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("PACIENTES");

        javax.swing.GroupLayout fondoTituloPacientesLayout = new javax.swing.GroupLayout(fondoTituloPacientes);
        fondoTituloPacientes.setLayout(fondoTituloPacientesLayout);
        fondoTituloPacientesLayout.setHorizontalGroup(
            fondoTituloPacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoTituloPacientesLayout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        fondoTituloPacientesLayout.setVerticalGroup(
            fondoTituloPacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoTituloPacientesLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        tablaPacientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Precio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaPacientes.getTableHeader().setReorderingAllowed(false);

        btnAgregarPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/hospital/images/Paciente16.png"))); // NOI18N
        btnAgregarPaciente.setText("Agregar");
        btnAgregarPaciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarPacienteMouseClicked(evt);
            }
        });

        btnActualizarPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/hospital/images/editar16.png"))); // NOI18N
        btnActualizarPaciente.setText("Actualizar");
        btnActualizarPaciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnActualizarPacienteMouseClicked(evt);
            }
        });

        btnEliminarPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/hospital/images/Cancel.png"))); // NOI18N
        btnEliminarPaciente.setText("Eliminar");
        btnEliminarPaciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarPacienteMouseClicked(evt);
            }
        });

        btnVolverPacientes.setBackground(new java.awt.Color(255, 0, 0));
        btnVolverPacientes.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnVolverPacientes.setText("<- VOLVER ");
        btnVolverPacientes.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true));
        btnVolverPacientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVolverPacientesMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout fondoPacientesLayout = new javax.swing.GroupLayout(fondoPacientes);
        fondoPacientes.setLayout(fondoPacientesLayout);
        fondoPacientesLayout.setHorizontalGroup(
            fondoPacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondoTituloPacientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(fondoPacientesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fondoPacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fondoPacientesLayout.createSequentialGroup()
                        .addComponent(tablaPacientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(fondoPacientesLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(btnAgregarPaciente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnActualizarPaciente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminarPaciente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(btnVolverPacientes)
                        .addGap(14, 14, 14))))
        );
        fondoPacientesLayout.setVerticalGroup(
            fondoPacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoPacientesLayout.createSequentialGroup()
                .addComponent(fondoTituloPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tablaPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(fondoPacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarPaciente)
                    .addComponent(btnActualizarPaciente)
                    .addComponent(btnEliminarPaciente)
                    .addComponent(btnVolverPacientes))
                .addGap(0, 14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondoPacientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondoPacientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverPacientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverPacientesMouseClicked
        this.dispose();
    }//GEN-LAST:event_btnVolverPacientesMouseClicked

    private void btnAgregarPacienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarPacienteMouseClicked
        AgregarPaciente vAgregarPaciente = new AgregarPaciente(ventanaPricipal, rootPaneCheckingEnabled, hospital, ventanaPricipal);
        vAgregarPaciente.setVisible(true);
    }//GEN-LAST:event_btnAgregarPacienteMouseClicked

    private void btnActualizarPacienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarPacienteMouseClicked
        int fila = this.tablaPacientes.getSelectedRow();
        if(fila>=0)
        {
            Paciente p = this.pacientes.get(fila);
            ActualizarPaciente vActualizarPaciente = new ActualizarPaciente(ventanaPricipal, rootPaneCheckingEnabled);
            vActualizarPaciente.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(this, "Por favor seleccione el producto que desea eliminar");
        }
    }//GEN-LAST:event_btnActualizarPacienteMouseClicked

    public void llenarTabla()
    {
        DefaultTableModel modelDefault = new DefaultTableModel(new String[]{"Nombre","Documento", "Telefono", "Edad", "Enfermedades"}, this.pacientes.size());
        this.tablaPacientes.setModel(modelDefault);
        
        TableModel dataModel = tablaPacientes.getModel();
        for (int i = 0; i < this.pacientes.size(); i++) 
        {
            Paciente p = this.pacientes.get(i);
            
            dataModel.setValueAt(p.getNombre(),i,0);
            dataModel.setValueAt(p.getNumeroDocumento(),i,1);
            dataModel.setValueAt(p.getTelefono(),i,2);
            dataModel.setValueAt(p.getEdad(),i,3);
            String enfermedades= "";
            System.out.println("e:"+ p.getEnfermedades().size());
            for(Padecimiento e: p.getEnfermedades()){
                enfermedades = enfermedades + e.getNombre()+";";
            }
            dataModel.setValueAt(enfermedades,i,4);
            
        } 
    }
    private void btnEliminarPacienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarPacienteMouseClicked
        
    }//GEN-LAST:event_btnEliminarPacienteMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarPaciente;
    private javax.swing.JButton btnAgregarPaciente;
    private javax.swing.JButton btnEliminarPaciente;
    private javax.swing.JButton btnVolverPacientes;
    private javax.swing.JPanel fondoPacientes;
    private javax.swing.JPanel fondoTituloPacientes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTable tablaPacientes;
    // End of variables declaration//GEN-END:variables
}
