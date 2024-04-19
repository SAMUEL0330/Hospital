package autonoma.hospital.views;

import autonoma.hospital.models.Hospital;
import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;

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

        btnGenerarReporte.setBackground(new java.awt.Color(255, 204, 102));
        btnGenerarReporte.setText("GENERAR");
        btnGenerarReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarReporteActionPerformed(evt);
            }
        });

        listaOpcionesReporte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaOpcionesReporteMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout fondoGestionReportesLayout = new javax.swing.GroupLayout(fondoGestionReportes);
        fondoGestionReportes.setLayout(fondoGestionReportesLayout);
        fondoGestionReportesLayout.setHorizontalGroup(
            fondoGestionReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondoTituloReportes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(fondoGestionReportesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(listaOpcionesReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(fondoGestionReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnVolverReportes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGenerarReporte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        fondoGestionReportesLayout.setVerticalGroup(
            fondoGestionReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoGestionReportesLayout.createSequentialGroup()
                .addComponent(fondoTituloReportes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(fondoGestionReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGenerarReporte)
                    .addComponent(listaOpcionesReporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnVolverReportes)
                .addContainerGap(20, Short.MAX_VALUE))
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

    private void listaOpcionesReporteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaOpcionesReporteMouseClicked
        // Crear un arreglo de opciones
        String[] opciones = {"Farmacia", "Empleado", "Paciente"};
        
        // Mostrar un menú emergente con las opciones
        String opcionSeleccionada = (String) JOptionPane.showInputDialog
        (
            this, // Componente padre
            "Selecciona una opción", // Mensaje
            "Opciones", // Título
            JOptionPane.PLAIN_MESSAGE, // Tipo de mensaje
            null, // Icono (usamos null para no mostrar icono)
            opciones, // Opciones
            opciones[0] // Opción seleccionada por defecto
        );
        
        // Verificar si se seleccionó una opción
        if (opcionSeleccionada != null)
        {
            // Realizar acciones basadas en la opción seleccionada
            System.out.println("Opción seleccionada: " + opcionSeleccionada);
        }
    }//GEN-LAST:event_listaOpcionesReporteMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGenerarReporte;
    private javax.swing.JButton btnVolverReportes;
    private javax.swing.JPanel fondoGestionReportes;
    private javax.swing.JPanel fondoTituloReportes;
    private javax.swing.JLabel jLabel1;
    private java.awt.Choice listaOpcionesReporte;
    // End of variables declaration//GEN-END:variables
}
