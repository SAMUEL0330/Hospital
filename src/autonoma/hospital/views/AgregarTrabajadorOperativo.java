package autonoma.hospital.views;
/**
 *
 * @author Samuel Esteban Herrera Bedoya & Alejandra Zapata Castañeda
 * @version 1.0.0
 * @since 2024-04-17
 */
public class AgregarTrabajadorOperativo extends javax.swing.JDialog
{
    /**
     * Creates new form AgregarMedicamento
     */
    public AgregarTrabajadorOperativo(java.awt.Frame parent, boolean modal)
    {
        super(parent, modal);
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondoAgregarTrabajador = new javax.swing.JPanel();
        fondoTituloAgregarTrabajador = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnVolverAddTrabajador = new javax.swing.JButton();
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

        fondoAgregarTrabajador.setBackground(new java.awt.Color(204, 204, 204));

        fondoTituloAgregarTrabajador.setBackground(new java.awt.Color(204, 0, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("AGREGAR TRABAJADOR OPERATIVO");

        javax.swing.GroupLayout fondoTituloAgregarTrabajadorLayout = new javax.swing.GroupLayout(fondoTituloAgregarTrabajador);
        fondoTituloAgregarTrabajador.setLayout(fondoTituloAgregarTrabajadorLayout);
        fondoTituloAgregarTrabajadorLayout.setHorizontalGroup(
            fondoTituloAgregarTrabajadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoTituloAgregarTrabajadorLayout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        fondoTituloAgregarTrabajadorLayout.setVerticalGroup(
            fondoTituloAgregarTrabajadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoTituloAgregarTrabajadorLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        btnVolverAddTrabajador.setBackground(new java.awt.Color(255, 0, 0));
        btnVolverAddTrabajador.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnVolverAddTrabajador.setText("<- VOLVER ");
        btnVolverAddTrabajador.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true));
        btnVolverAddTrabajador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVolverAddTrabajadorMouseClicked(evt);
            }
        });
        btnVolverAddTrabajador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverAddTrabajadorActionPerformed(evt);
            }
        });

        Nombre.setText("NOMBRE");

        NumeroDocumento.setText("NUMERO DOCUMENTO");

        Edad.setText("EDAD");

        SalarioBase.setText("SALARIO BASE");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/hospital/images/Empleado50.png"))); // NOI18N
        jLabel2.setText("CONFIRMAR");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        SalarioBase1.setText("AREA DE TRABAJO");

        javax.swing.GroupLayout fondoAgregarTrabajadorLayout = new javax.swing.GroupLayout(fondoAgregarTrabajador);
        fondoAgregarTrabajador.setLayout(fondoAgregarTrabajadorLayout);
        fondoAgregarTrabajadorLayout.setHorizontalGroup(
            fondoAgregarTrabajadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondoTituloAgregarTrabajador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoAgregarTrabajadorLayout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVolverAddTrabajador)
                .addGap(23, 23, 23))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoAgregarTrabajadorLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(fondoAgregarTrabajadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(fondoAgregarTrabajadorLayout.createSequentialGroup()
                        .addComponent(SalarioBase1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(inputSalarioBaseTrabajador1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fondoAgregarTrabajadorLayout.createSequentialGroup()
                        .addComponent(SalarioBase)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(inputSalarioBaseTrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fondoAgregarTrabajadorLayout.createSequentialGroup()
                        .addGroup(fondoAgregarTrabajadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Edad)
                            .addComponent(NumeroDocumento)
                            .addComponent(Nombre))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addGroup(fondoAgregarTrabajadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputNombreTrabajador, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputNumeroDocumentoTrabajador, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputEdadTrabajador, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(40, 40, 40))
        );
        fondoAgregarTrabajadorLayout.setVerticalGroup(
            fondoAgregarTrabajadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoAgregarTrabajadorLayout.createSequentialGroup()
                .addComponent(fondoTituloAgregarTrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(fondoAgregarTrabajadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputNombreTrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Nombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fondoAgregarTrabajadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputNumeroDocumentoTrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NumeroDocumento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fondoAgregarTrabajadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputEdadTrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Edad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fondoAgregarTrabajadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputSalarioBaseTrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SalarioBase))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fondoAgregarTrabajadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputSalarioBaseTrabajador1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SalarioBase1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(fondoAgregarTrabajadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoAgregarTrabajadorLayout.createSequentialGroup()
                        .addComponent(btnVolverAddTrabajador)
                        .addGap(19, 19, 19)))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondoAgregarTrabajador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondoAgregarTrabajador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverAddTrabajadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverAddTrabajadorMouseClicked
        this.dispose();
    }//GEN-LAST:event_btnVolverAddTrabajadorMouseClicked

    private void btnVolverAddTrabajadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverAddTrabajadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVolverAddTrabajadorActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Edad;
    private javax.swing.JLabel Nombre;
    private javax.swing.JLabel NumeroDocumento;
    private javax.swing.JLabel SalarioBase;
    private javax.swing.JLabel SalarioBase1;
    private javax.swing.JButton btnVolverAddTrabajador;
    private javax.swing.JPanel fondoAgregarTrabajador;
    private javax.swing.JPanel fondoTituloAgregarTrabajador;
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