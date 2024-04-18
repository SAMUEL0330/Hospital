package autonoma.hospital.views;

/**
 *
 * @author Samuel Esteban Herrera Bedoya & Alejandra Zapata Castañeda
 * @version 1.0.0
 * @since 2024-04-17
 */
public class ConfirmarGerente extends javax.swing.JDialog
{
    /**
     * Creates new form AgregarMedicamento
     */
    public ConfirmarGerente(java.awt.Frame parent, boolean modal)
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
        btnVolverAddGerente = new javax.swing.JButton();
        inputNumeroDocumentoTrabajador = new javax.swing.JTextField();
        inputNombreGerente = new javax.swing.JTextField();
        inputSalarioBaseTrabajador = new javax.swing.JTextField();
        inputEdadTrabajador = new javax.swing.JTextField();
        Nombre = new javax.swing.JLabel();
        NumeroDocumento = new javax.swing.JLabel();
        Edad = new javax.swing.JLabel();
        SalarioBase = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        fondoAgregarMedicamento.setBackground(new java.awt.Color(204, 204, 204));

        fondoTituloAgregarMedicamento.setBackground(new java.awt.Color(0, 153, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("REGISTRAR GERENTE");

        javax.swing.GroupLayout fondoTituloAgregarMedicamentoLayout = new javax.swing.GroupLayout(fondoTituloAgregarMedicamento);
        fondoTituloAgregarMedicamento.setLayout(fondoTituloAgregarMedicamentoLayout);
        fondoTituloAgregarMedicamentoLayout.setHorizontalGroup(
            fondoTituloAgregarMedicamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoTituloAgregarMedicamentoLayout.createSequentialGroup()
                .addGap(158, 158, 158)
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

        btnVolverAddGerente.setBackground(new java.awt.Color(255, 0, 0));
        btnVolverAddGerente.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnVolverAddGerente.setText("<- VOLVER ");
        btnVolverAddGerente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true));
        btnVolverAddGerente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVolverAddGerenteMouseClicked(evt);
            }
        });
        btnVolverAddGerente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverAddGerenteActionPerformed(evt);
            }
        });

        Nombre.setText("NOMBRE");

        NumeroDocumento.setText("NUMERO IDENTIFICACION");

        Edad.setText("EDAD");

        SalarioBase.setText("CARRERA");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/hospital/images/Gerente50.png"))); // NOI18N
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

        javax.swing.GroupLayout fondoAgregarMedicamentoLayout = new javax.swing.GroupLayout(fondoAgregarMedicamento);
        fondoAgregarMedicamento.setLayout(fondoAgregarMedicamentoLayout);
        fondoAgregarMedicamentoLayout.setHorizontalGroup(
            fondoAgregarMedicamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondoTituloAgregarMedicamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoAgregarMedicamentoLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 157, Short.MAX_VALUE)
                .addComponent(btnVolverAddGerente)
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
                                .addComponent(inputNombreGerente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(inputNumeroDocumentoTrabajador, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(inputEdadTrabajador, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGap(33, 33, 33)))
        );
        fondoAgregarMedicamentoLayout.setVerticalGroup(
            fondoAgregarMedicamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoAgregarMedicamentoLayout.createSequentialGroup()
                .addComponent(fondoTituloAgregarMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 196, Short.MAX_VALUE)
                .addGroup(fondoAgregarMedicamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoAgregarMedicamentoLayout.createSequentialGroup()
                        .addComponent(btnVolverAddGerente)
                        .addGap(19, 19, 19)))
                .addGap(27, 27, 27))
            .addGroup(fondoAgregarMedicamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(fondoAgregarMedicamentoLayout.createSequentialGroup()
                    .addGap(73, 73, 73)
                    .addGroup(fondoAgregarMedicamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(inputNombreGerente, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void btnVolverAddGerenteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverAddGerenteMouseClicked
        this.dispose();
    }//GEN-LAST:event_btnVolverAddGerenteMouseClicked

    private void btnVolverAddGerenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverAddGerenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVolverAddGerenteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Edad;
    private javax.swing.JLabel Nombre;
    private javax.swing.JLabel NumeroDocumento;
    private javax.swing.JLabel SalarioBase;
    private javax.swing.JButton btnVolverAddGerente;
    private javax.swing.JPanel fondoAgregarMedicamento;
    private javax.swing.JPanel fondoTituloAgregarMedicamento;
    private javax.swing.JTextField inputEdadTrabajador;
    private javax.swing.JTextField inputNombreGerente;
    private javax.swing.JTextField inputNumeroDocumentoTrabajador;
    private javax.swing.JTextField inputSalarioBaseTrabajador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
