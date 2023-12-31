/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Conexion1.Conexion;
import Controller.MatriculaC;
import java.util.Date;

/**
 *
 * @author SENA
 */
public class Matricula extends javax.swing.JFrame {

    /**
     * Creates new form Matricula
     */
    public Matricula() {
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

        jLabel4 = new javax.swing.JLabel();
        txtestudiante_id = new java.awt.TextField();
        jLabel2 = new javax.swing.JLabel();
        jbnModificar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jbnEliminarLogico = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jbnGuardar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        txtmateria_id = new java.awt.TextField();
        txtfecha_matricula = new java.awt.TextField();
        txtmatricula_id = new java.awt.TextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel4.setText("Matricula id");

        txtestudiante_id.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setText("Estudiante id");

        jbnModificar.setBackground(new java.awt.Color(255, 177, 66));
        jbnModificar.setText("Modificar");
        jbnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnModificarActionPerformed(evt);
            }
        });

        jLabel3.setText("Materia id");

        jbnEliminarLogico.setBackground(new java.awt.Color(255, 177, 66));
        jbnEliminarLogico.setText("Eliminar logico");
        jbnEliminarLogico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnEliminarLogicoActionPerformed(evt);
            }
        });

        jLabel1.setText("Fecha de matricula");

        jbnGuardar.setBackground(new java.awt.Color(255, 177, 66));
        jbnGuardar.setText("Guardar");
        jbnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnGuardarActionPerformed(evt);
            }
        });

        jTable.setBackground(new java.awt.Color(204, 204, 204));
        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Matricula id", "Estudiante id", "Materia id", "Fecha de matricula"
            }
        ));
        jTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable.setSelectionBackground(new java.awt.Color(51, 153, 255));
        jScrollPane2.setViewportView(jTable);

        txtmateria_id.setBackground(new java.awt.Color(204, 204, 204));

        txtfecha_matricula.setBackground(new java.awt.Color(204, 204, 204));
        txtfecha_matricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfecha_matriculaActionPerformed(evt);
            }
        });

        txtmatricula_id.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtfecha_matricula, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtmateria_id, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtmatricula_id, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtestudiante_id, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(jbnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jbnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jbnEliminarLogico, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 712, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbnModificar)
                        .addComponent(jbnEliminarLogico)
                        .addComponent(jbnGuardar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(txtmatricula_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtestudiante_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtmateria_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtfecha_matricula, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnModificarActionPerformed
        // TODO add your handling code here:
        int matricula_id;
        int estudiante_id;
        int materia_id;
        Date fecha_matricula;
        Conexion conn = new Conexion();

        //Capturar datos de entrada
        matricula_id = Integer.parseInt(txtmatricula_id.getText());
        estudiante_id = txtestudiante_id.getText();
        materia_id = txtmateria_id.getText();
        fecha_matricula = txtfecha_matricula.getText();

        MatriculaC matriculaC = new MatriculaC();
        matriculaC.ModificarRegistro(materia_id, nombre_materia, profesor, NORMAL);
    }//GEN-LAST:event_jbnModificarActionPerformed

    private void jbnEliminarLogicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnEliminarLogicoActionPerformed
        // TODO add your handling code here:
        int matricula_id = Integer.parseInt(txtmatricula_id.getText());

        MatriculaC matriculaC = new MatriculaC();
        matriculaC.EliminarRegistro(WAIT_CURSOR);
    }//GEN-LAST:event_jbnEliminarLogicoActionPerformed

    private void jbnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnGuardarActionPerformed
        // TODO add your handling code here:
        int matricula_id;
        int estudiante_id;
        int materia_id;
        Date fecha_matricula;
        Conexion conn = new Conexion();

        //Capturar datos de entrada
        matricula_id = Integer.parseInt(txtmatricula_id.getText());
        estudiante_id = txtestudiante_id.getText();
        materia_id = txtmateria_id.getText();
        fecha_matricula = txt.getText();

        MatriculaC matriculaC = new MatriculaC();
        matriculaC.GuardarRegistro(matricula_id, estudiante_id, materia_id, fecha_matricula);
    }//GEN-LAST:event_jbnGuardarActionPerformed

    private void txtfecha_matriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfecha_matriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfecha_matriculaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Matricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Matricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Matricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Matricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Matricula().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable;
    private javax.swing.JButton jbnEliminarLogico;
    private javax.swing.JButton jbnGuardar;
    private javax.swing.JButton jbnModificar;
    private java.awt.TextField txtestudiante_id;
    private java.awt.TextField txtfecha_matricula;
    private java.awt.TextField txtmateria_id;
    private java.awt.TextField txtmatricula_id;
    // End of variables declaration//GEN-END:variables
}
