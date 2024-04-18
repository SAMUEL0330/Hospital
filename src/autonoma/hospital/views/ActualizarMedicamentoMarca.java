package autonoma.hospital.views;

/**
 *
 * @author Samuel Esteban Herrera Bedoya & Alejandra Zapata Castañeda
 * @version 1.0.0
 * @since 2024-04-17
 */
public class ActualizarMedicamentoMarca extends javax.swing.JDialog
{
    /**
     * Creates new form AgregarMedicamento
     */
    public ActualizarMedicamentoMarca(java.awt.Frame parent, boolean modal)
    {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondoAgregarMedicamento = new javax.swing.JPanel();
        fondoTituloAgregarMedicamento = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnVolverAddMedicamento = new javax.swing.JButton();
        inputNumeroDocumentoTrabajador = new javax.swing.JTextField();
        inputNombreTrabajador = new javax.swing.JTextField();
        inputSalarioBaseTrabajador = new javax.swing.JTextField();
        inputEdadTrabajador = new javax.swing.JTextField();
        Nombre = new javax.swing.JLabel();
        NumeroDocumento = new javax.swing.JLabel();
        Edad = new javax.swing.JLabel();
        SalarioBase = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        inputSalarioBaseTrabajador1 = new javax.swing.JTextField();
        SalarioBase1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        fondoAgregarMedicamento.setBackground(new java.awt.Color(204, 204, 204));

        fondoTituloAgregarMedicamento.setBackground(new java.awt.Color(0, 153, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("ACTUALIZAR MEDICAMENTO POPULAR");

        javax.swing.GroupLayout fondoTituloAgregarMedicamentoLayout = new javax.swing.GroupLayout(fondoTituloAgregarMedicamento);
        fondoTituloAgregarMedicamento.setLayout(fondoTituloAgregarMedicamentoLayout);
        fondoTituloAgregarMedicamentoLayout.setHorizontalGroup(
            fondoTituloAgregarMedicamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoTituloAgregarMedicamentoLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        fondoTituloAgregarMedicamentoLayout.setVerticalGroup(
            fondoTituloAgregarMedicamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoTituloAgregarMedicamentoLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        btnVolverAddMedicamento.setBackground(new java.awt.Color(255, 0, 0));
        btnVolverAddMedicamento.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnVolverAddMedicamento.setText("<- VOLVER ");
        btnVolverAddMedicamento.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true));
        btnVolverAddMedicamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVolverAddMedicamentoMouseClicked(evt);
            }
        });
        btnVolverAddMedicamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverAddMedicamentoActionPerformed(evt);
            }
        });

        Nombre.setText("NOMBRE");

        NumeroDocumento.setText("DESCRIPCION");

        Edad.setText("COSTO");

        SalarioBase.setText("PRECIO DE VENTA");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/hospital/images/medicina50.png"))); // NOI18N
        jLabel2.setText(" CONFIRMAR");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        SalarioBase1.setText("FABRICANTE");

        javax.swing.GroupLayout fondoAgregarMedicamentoLayout = new javax.swing.GroupLayout(fondoAgregarMedicamento);
        fondoAgregarMedicamento.setLayout(fondoAgregarMedicamentoLayout);
        fondoAgregarMedicamentoLayout.setHorizontalGroup(
            fondoAgregarMedicamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondoTituloAgregarMedicamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoAgregarMedicamentoLayout.createSequentialGroup()
                .addGroup(fondoAgregarMedicamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(fondoAgregarMedicamentoLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVolverAddMedicamento))
                    .addGroup(fondoAgregarMedicamentoLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(SalarioBase1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                        .addComponent(inputSalarioBaseTrabajador1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34))
            .addGroup(fondoAgregarMedicamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(fondoAgregarMedicamentoLayout.createSequentialGroup()
                    .addGap(32, 32, 32)
                    .addGroup(fondoAgregarMedicamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(fondoAgregarMedicamentoLayout.createSequentialGroup()
                            .addComponent(SalarioBase)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(inputSalarioBaseTrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(fondoAgregarMedicamentoLayout.createSequentialGroup()
                            .addGroup(fondoAgregarMedicamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Edad)
                                .addComponent(NumeroDocumento)
                                .addComponent(Nombre))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(fondoAgregarMedicamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(inputNombreTrabajador, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(inputNumeroDocumentoTrabajador, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(inputEdadTrabajador, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGap(33, 33, 33)))
        );
        fondoAgregarMedicamentoLayout.setVerticalGroup(
            fondoAgregarMedicamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoAgregarMedicamentoLayout.createSequentialGroup()
                .addComponent(fondoTituloAgregarMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 175, Short.MAX_VALUE)
                .addGroup(fondoAgregarMedicamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputSalarioBaseTrabajador1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SalarioBase1))
                .addGap(31, 31, 31)
                .addGroup(fondoAgregarMedicamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoAgregarMedicamentoLayout.createSequentialGroup()
                        .addComponent(btnVolverAddMedicamento)
                        .addGap(19, 19, 19)))
                .addGap(27, 27, 27))
            .addGroup(fondoAgregarMedicamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(fondoAgregarMedicamentoLayout.createSequentialGroup()
                    .addGap(73, 73, 73)
                    .addGroup(fondoAgregarMedicamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(inputNombreTrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Nombre))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(fondoAgregarMedicamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(inputNumeroDocumentoTrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(NumeroDocumento))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(fondoAgregarMedicamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(inputEdadTrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Edad))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(fondoAgregarMedicamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(inputSalarioBaseTrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(SalarioBase))
                    .addContainerGap(73, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondoAgregarMedicamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondoAgregarMedicamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverAddMedicamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverAddMedicamentoMouseClicked
        this.dispose();
    }//GEN-LAST:event_btnVolverAddMedicamentoMouseClicked

    private void btnVolverAddMedicamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverAddMedicamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVolverAddMedicamentoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Edad;
    private javax.swing.JLabel Nombre;
    private javax.swing.JLabel NumeroDocumento;
    private javax.swing.JLabel SalarioBase;
    private javax.swing.JLabel SalarioBase1;
    private javax.swing.JButton btnVolverAddMedicamento;
    private javax.swing.JPanel fondoAgregarMedicamento;
    private javax.swing.JPanel fondoTituloAgregarMedicamento;
    private javax.swing.JTextField inputEdadTrabajador;
    private javax.swing.JTextField inputNombreTrabajador;
    private javax.swing.JTextField inputNumeroDocumentoTrabajador;
    private javax.swing.JTextField inputSalarioBaseTrabajador;
    private javax.swing.JTextField inputSalarioBaseTrabajador1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
