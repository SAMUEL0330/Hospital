package autonoma.hospital.views;

import autonoma.hospital.models.Hospital;

/**
 *
 * @author Samuel Esteban Herrera Bedoya & Alejandra Zapata Castañeda
 * @version 1.0.0
 * @since 2024-04-13
 */
public class GestionReportes extends javax.swing.JDialog
{
    private Hospital hospital;
    private VentanaPrincipal ventanaPricipal;
    public GestionReportes(java.awt.Frame parent, boolean modal, Hospital hospital, VentanaPrincipal ventanaPrincipal)
    {
        super(parent, modal);
        initComponents();
        this.hospital=hospital;
        this.ventanaPricipal=ventanaPrincipal;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondoGestionReportes = new javax.swing.JPanel();
        fondoTituloReportes = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnVolverReportes = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnReporteNomina = new javax.swing.JButton();
        btnReporteFarmacia = new javax.swing.JButton();
        btnGenerarReporte = new javax.swing.JButton();
        listaOpcionesReporte = new java.awt.Choice();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        fondoGestionReportes.setBackground(new java.awt.Color(204, 204, 204));

        fondoTituloReportes.setBackground(new java.awt.Color(51, 255, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("REPORTES");

        javax.swing.GroupLayout fondoTituloReportesLayout = new javax.swing.GroupLayout(fondoTituloReportes);
        fondoTituloReportes.setLayout(fondoTituloReportesLayout);
        fondoTituloReportesLayout.setHorizontalGroup(
            fondoTituloReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoTituloReportesLayout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        fondoTituloReportesLayout.setVerticalGroup(
            fondoTituloReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoTituloReportesLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        btnVolverReportes.setBackground(new java.awt.Color(255, 0, 0));
        btnVolverReportes.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnVolverReportes.setText("<- VOLVER ");
        btnVolverReportes.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true));
        btnVolverReportes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVolverReportesMouseClicked(evt);
            }
        });

        jButton1.setText("Inventario");

        jButton2.setText("Trabajadores");

        btnReporteNomina.setText("Nomina");

        btnReporteFarmacia.setText("Farmacia");

        btnGenerarReporte.setBackground(new java.awt.Color(255, 204, 102));
        btnGenerarReporte.setText("GENERAR");
        btnGenerarReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarReporteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout fondoGestionReportesLayout = new javax.swing.GroupLayout(fondoGestionReportes);
        fondoGestionReportes.setLayout(fondoGestionReportesLayout);
        fondoGestionReportesLayout.setHorizontalGroup(
            fondoGestionReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondoTituloReportes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(fondoGestionReportesLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(fondoGestionReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(listaOpcionesReporte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(fondoGestionReportesLayout.createSequentialGroup()
                        .addGroup(fondoGestionReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnReporteNomina, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(fondoGestionReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnReporteFarmacia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(46, 46, 46)
                .addGroup(fondoGestionReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGenerarReporte)
                    .addGroup(fondoGestionReportesLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(btnVolverReportes)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        fondoGestionReportesLayout.setVerticalGroup(
            fondoGestionReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoGestionReportesLayout.createSequentialGroup()
                .addComponent(fondoTituloReportes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(fondoGestionReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReporteFarmacia)
                    .addComponent(jButton1)
                    .addComponent(btnGenerarReporte))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(fondoGestionReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(btnReporteNomina)
                    .addComponent(btnVolverReportes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(listaOpcionesReporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondoGestionReportes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondoGestionReportes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGenerarReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarReporteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGenerarReporteActionPerformed

    private void btnVolverReportesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverReportesMouseClicked
        this.dispose();
    }//GEN-LAST:event_btnVolverReportesMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGenerarReporte;
    private javax.swing.JButton btnReporteFarmacia;
    private javax.swing.JButton btnReporteNomina;
    private javax.swing.JButton btnVolverReportes;
    private javax.swing.JPanel fondoGestionReportes;
    private javax.swing.JPanel fondoTituloReportes;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private java.awt.Choice listaOpcionesReporte;
    // End of variables declaration//GEN-END:variables
}
