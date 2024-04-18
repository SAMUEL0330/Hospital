/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package autonoma.hospital.views;

import autonoma.hospital.models.Hospital;

/**
 *
 * @author User
 */
public class GestionPacientes extends javax.swing.JDialog {

    private Hospital hospital;
    private VentanaPrincipal ventanaPricipal;
    public GestionPacientes(java.awt.Frame parent, boolean modal, Hospital hospital, VentanaPrincipal ventanaPrincipal)
    {
        super(parent, modal);
        initComponents();
        this.hospital=hospital;
        this.ventanaPricipal=ventanaPrincipal;
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
                .addContainerGap(153, Short.MAX_VALUE))
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

        btnAgregarPaciente.setText("Agregar");

        btnActualizarPaciente.setText("Actualizar");

        btnEliminarPaciente.setText("Eliminar");

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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnActualizarPaciente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEliminarPaciente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
