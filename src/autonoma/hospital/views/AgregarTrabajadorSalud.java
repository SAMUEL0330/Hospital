package autonoma.hospital.views;

import autonoma.hospital.models.Hospital;
import autonoma.hospital.models.Paciente;
import autonoma.hospital.models.Trabajador;
import autonoma.hospital.models.TrabajadorSalud;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Samuel Esteban Herrera Bedoya & Alejandra Zapata Castañeda
 * @version 1.0.0
 * @since 2024-04-17
 */
public class AgregarTrabajadorSalud extends javax.swing.JDialog
{
    private Hospital hospital;
    private VentanaPrincipal ventanaPrincipal;
    private Trabajador trabajador;
    
    public AgregarTrabajadorSalud(java.awt.Frame parent, boolean modal, VentanaPrincipal ventanaPrincipal, Hospital hospital)
    {
        super(parent, modal);
        initComponents();
        this.hospital=hospital;
        this.ventanaPrincipal=ventanaPrincipal;
        this.trabajador=trabajador;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondoAgregarTrabajador = new javax.swing.JPanel();
        fondoTituloAgregarTrabajador = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnVolverAddTrabajador = new javax.swing.JButton();
        inputNumeroDocumentoTrabajadorSalud = new javax.swing.JTextField();
        inputNombreTrabajadorSalud = new javax.swing.JTextField();
        inputSalarioBaseTrabajadorSalud = new javax.swing.JTextField();
        inputEdadTrabajadorSalud = new javax.swing.JTextField();
        Nombre = new javax.swing.JLabel();
        NumeroDocumento = new javax.swing.JLabel();
        Edad = new javax.swing.JLabel();
        SalarioBase = new javax.swing.JLabel();
        btnConfirmarAgregarTrabajadorSalud = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        inputEspecialidadTrabajadorSalud = new javax.swing.JTextField();
        SalarioBase1 = new javax.swing.JLabel();
        inputHorasTrabajadorSalud = new javax.swing.JTextField();
        SalarioBase2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        fondoAgregarTrabajador.setBackground(new java.awt.Color(204, 204, 204));

        fondoTituloAgregarTrabajador.setBackground(new java.awt.Color(204, 0, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("AGREGAR TRABAJADOR SALUD");

        javax.swing.GroupLayout fondoTituloAgregarTrabajadorLayout = new javax.swing.GroupLayout(fondoTituloAgregarTrabajador);
        fondoTituloAgregarTrabajador.setLayout(fondoTituloAgregarTrabajadorLayout);
        fondoTituloAgregarTrabajadorLayout.setHorizontalGroup(
            fondoTituloAgregarTrabajadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoTituloAgregarTrabajadorLayout.createSequentialGroup()
                .addGap(103, 103, 103)
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

        btnConfirmarAgregarTrabajadorSalud.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConfirmarAgregarTrabajadorSaludMouseClicked(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/hospital/images/Empleado50.png"))); // NOI18N
        jLabel2.setText("GUARDAR");

        javax.swing.GroupLayout btnConfirmarAgregarTrabajadorSaludLayout = new javax.swing.GroupLayout(btnConfirmarAgregarTrabajadorSalud);
        btnConfirmarAgregarTrabajadorSalud.setLayout(btnConfirmarAgregarTrabajadorSaludLayout);
        btnConfirmarAgregarTrabajadorSaludLayout.setHorizontalGroup(
            btnConfirmarAgregarTrabajadorSaludLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnConfirmarAgregarTrabajadorSaludLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnConfirmarAgregarTrabajadorSaludLayout.setVerticalGroup(
            btnConfirmarAgregarTrabajadorSaludLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnConfirmarAgregarTrabajadorSaludLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        SalarioBase1.setText("ESPECIALIDAD");

        SalarioBase2.setText("HORAS TRABAJADAS");

        javax.swing.GroupLayout fondoAgregarTrabajadorLayout = new javax.swing.GroupLayout(fondoAgregarTrabajador);
        fondoAgregarTrabajador.setLayout(fondoAgregarTrabajadorLayout);
        fondoAgregarTrabajadorLayout.setHorizontalGroup(
            fondoAgregarTrabajadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondoTituloAgregarTrabajador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoAgregarTrabajadorLayout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(btnConfirmarAgregarTrabajadorSalud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVolverAddTrabajador)
                .addGap(27, 27, 27))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoAgregarTrabajadorLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(fondoAgregarTrabajadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Edad)
                    .addComponent(NumeroDocumento)
                    .addComponent(Nombre)
                    .addComponent(SalarioBase)
                    .addComponent(SalarioBase1)
                    .addComponent(SalarioBase2))
                .addGroup(fondoAgregarTrabajadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fondoAgregarTrabajadorLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addComponent(inputNombreTrabajadorSalud, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))
                    .addGroup(fondoAgregarTrabajadorLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(fondoAgregarTrabajadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(inputEdadTrabajadorSalud, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputNumeroDocumentoTrabajadorSalud, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputSalarioBaseTrabajadorSalud, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputEspecialidadTrabajadorSalud, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputHorasTrabajadorSalud, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        fondoAgregarTrabajadorLayout.setVerticalGroup(
            fondoAgregarTrabajadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoAgregarTrabajadorLayout.createSequentialGroup()
                .addComponent(fondoTituloAgregarTrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(fondoAgregarTrabajadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputNombreTrabajadorSalud, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Nombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fondoAgregarTrabajadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputNumeroDocumentoTrabajadorSalud, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NumeroDocumento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fondoAgregarTrabajadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputEdadTrabajadorSalud, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Edad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fondoAgregarTrabajadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputSalarioBaseTrabajadorSalud, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SalarioBase))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fondoAgregarTrabajadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputEspecialidadTrabajadorSalud, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SalarioBase1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fondoAgregarTrabajadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputHorasTrabajadorSalud, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SalarioBase2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(fondoAgregarTrabajadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoAgregarTrabajadorLayout.createSequentialGroup()
                        .addComponent(btnVolverAddTrabajador)
                        .addGap(42, 42, 42))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoAgregarTrabajadorLayout.createSequentialGroup()
                        .addComponent(btnConfirmarAgregarTrabajadorSalud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))))
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

    private void btnConfirmarAgregarTrabajadorSaludMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfirmarAgregarTrabajadorSaludMouseClicked
        
        try
        {
            String nombre = this.inputNombreTrabajadorSalud.getText();
            String numeroIdentificacion = this.inputNumeroDocumentoTrabajadorSalud.getText();
            String edad = this.inputEdadTrabajadorSalud.getText();
            Integer salarioBase = Integer.parseInt(this.inputSalarioBaseTrabajadorSalud.getText());
            String especialidad = this.inputEspecialidadTrabajadorSalud.getText();
            Integer numeroHorasTrabajadas = Integer.parseInt(this.inputHorasTrabajadorSalud.getText());
            String tipo= "Salud";
            
            TrabajadorSalud trabajador = new TrabajadorSalud(nombre, numeroIdentificacion, edad, salarioBase, especialidad, numeroHorasTrabajadas, 0.0);
            if(this.hospital.agregarTrabajadorSalud(trabajador, tipo))
            {
                JOptionPane.showMessageDialog(this, "El paciente "+nombre+" ha sido agregado exitosamente");
                this.dispose();
            }else{
                
                JOptionPane.showMessageDialog(this, "Ha ocurrido un error");
                this.dispose();
            }
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Algo salió mal");
            this.inputEdadTrabajadorSalud.setText("");
            this.inputSalarioBaseTrabajadorSalud.setText("");
            this.inputHorasTrabajadorSalud.setText("");
        } catch (IOException ex) {
            Logger.getLogger(AgregarTrabajadorSalud.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnConfirmarAgregarTrabajadorSaludMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Edad;
    private javax.swing.JLabel Nombre;
    private javax.swing.JLabel NumeroDocumento;
    private javax.swing.JLabel SalarioBase;
    private javax.swing.JLabel SalarioBase1;
    private javax.swing.JLabel SalarioBase2;
    private javax.swing.JPanel btnConfirmarAgregarTrabajadorSalud;
    private javax.swing.JButton btnVolverAddTrabajador;
    private javax.swing.JPanel fondoAgregarTrabajador;
    private javax.swing.JPanel fondoTituloAgregarTrabajador;
    private javax.swing.JTextField inputEdadTrabajadorSalud;
    private javax.swing.JTextField inputEspecialidadTrabajadorSalud;
    private javax.swing.JTextField inputHorasTrabajadorSalud;
    private javax.swing.JTextField inputNombreTrabajadorSalud;
    private javax.swing.JTextField inputNumeroDocumentoTrabajadorSalud;
    private javax.swing.JTextField inputSalarioBaseTrabajadorSalud;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}