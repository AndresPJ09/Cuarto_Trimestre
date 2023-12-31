/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.ProductoC;
import Model.Entity.Producto;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ariel
 */
public class ProductoV extends javax.swing.JFrame {

    /**
     * Creates new form ProductoV
     */
    public ProductoV() {
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

        jPanel1 = new javax.swing.JPanel();
        jbnModificar = new javax.swing.JButton();
        jbnEliminarFisco = new javax.swing.JButton();
        lblCodigo4 = new java.awt.Label();
        txtId = new java.awt.TextField();
        jbnConsultar = new javax.swing.JButton();
        jbnGuardar = new javax.swing.JButton();
        lblCodigo = new java.awt.Label();
        txtCodigo = new java.awt.TextField();
        txtNombre = new java.awt.TextField();
        lblCodigo1 = new java.awt.Label();
        txtPrecio = new java.awt.TextField();
        lblCodigo2 = new java.awt.Label();
        txtCantidad = new java.awt.TextField();
        lblCodigo3 = new java.awt.Label();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jbnEliminarLogico = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 0, 0));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jbnModificar.setBackground(new java.awt.Color(51, 153, 255));
        jbnModificar.setForeground(new java.awt.Color(0, 0, 0));
        jbnModificar.setText("Modificar");
        jbnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnModificarActionPerformed(evt);
            }
        });

        jbnEliminarFisco.setBackground(new java.awt.Color(51, 153, 255));
        jbnEliminarFisco.setForeground(new java.awt.Color(0, 0, 0));
        jbnEliminarFisco.setText("Eliminar Fisico");
        jbnEliminarFisco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnEliminarFiscoActionPerformed(evt);
            }
        });

        lblCodigo4.setText("Código");

        txtId.setBackground(new java.awt.Color(204, 204, 204));

        jbnConsultar.setBackground(new java.awt.Color(51, 153, 255));
        jbnConsultar.setForeground(new java.awt.Color(0, 0, 0));
        jbnConsultar.setText("Consultar");
        jbnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnConsultarActionPerformed(evt);
            }
        });

        jbnGuardar.setBackground(new java.awt.Color(51, 153, 255));
        jbnGuardar.setForeground(new java.awt.Color(0, 0, 0));
        jbnGuardar.setText("Guardar");
        jbnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnGuardarActionPerformed(evt);
            }
        });

        lblCodigo.setText("Id");

        txtCodigo.setBackground(new java.awt.Color(204, 204, 204));

        txtNombre.setBackground(new java.awt.Color(204, 204, 204));
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        lblCodigo1.setText("Nombre");

        txtPrecio.setBackground(new java.awt.Color(204, 204, 204));

        lblCodigo2.setText("Precio");

        txtCantidad.setBackground(new java.awt.Color(204, 204, 204));
        txtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadActionPerformed(evt);
            }
        });

        lblCodigo3.setText("Cantidad");

        jTable2.setBackground(new java.awt.Color(204, 204, 204));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Código", "Nombre", "Precio", "Cantidad"
            }
        ));
        jTable2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable2.setSelectionBackground(new java.awt.Color(51, 153, 255));
        jScrollPane2.setViewportView(jTable2);

        jbnEliminarLogico.setBackground(new java.awt.Color(51, 153, 255));
        jbnEliminarLogico.setForeground(new java.awt.Color(0, 0, 0));
        jbnEliminarLogico.setText("Eliminar Logico");
        jbnEliminarLogico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnEliminarLogicoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Palatino Linotype", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Tienda ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 878, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lblCodigo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lblCodigo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblCodigo4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblCodigo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(56, 56, 56)
                        .addComponent(jbnGuardar)
                        .addGap(18, 18, 18)
                        .addComponent(jbnEliminarFisco)
                        .addGap(18, 18, 18)
                        .addComponent(jbnEliminarLogico)
                        .addGap(18, 18, 18)
                        .addComponent(jbnModificar)
                        .addGap(18, 18, 18)
                        .addComponent(jbnConsultar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCodigo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbnEliminarFisco)
                        .addComponent(jbnEliminarLogico)
                        .addComponent(jbnModificar)
                        .addComponent(jbnConsultar)
                        .addComponent(jbnGuardar)))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCodigo4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCodigo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCodigo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCodigo3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void jbnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnGuardarActionPerformed
        //Definir datos de entrada}
        Long id;
        String codigo;
        String nombre;
        Double precio;
        Long cantidad;

        //Capturar datos de entrada
        id = Long.parseLong(txtId.getText());
        codigo = txtCodigo.getText();
        nombre = txtNombre.getText();
        precio = Double.parseDouble(txtPrecio.getText());
        cantidad = Long.parseLong(txtCantidad.getText());

        ProductoC productoC = new ProductoC();
        productoC.GuardarRegistro(id, codigo, nombre, precio, cantidad);
    }//GEN-LAST:event_jbnGuardarActionPerformed

    private void jbnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnConsultarActionPerformed
        // TODO add your handling code here:
        
                      
    }//GEN-LAST:event_jbnConsultarActionPerformed

    private void jbnEliminarFiscoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnEliminarFiscoActionPerformed
        // TODO add your handling code here:
         // Obtener el ID del producto a eliminar físicamente
        Long id = Long.parseLong(txtId.getText());

        // Crear una instancia del controlador de productos
        ProductoC productoC = new ProductoC();

        // Llamar al método de eliminación física en el controlador
        productoC.EliminarRegistro(id);
    }//GEN-LAST:event_jbnEliminarFiscoActionPerformed

    private void jbnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnModificarActionPerformed
        // TODO add your handling code here:
        Long Id;
        String codigo;
        String nombre;
        Double precio;
        Long cantidad;

        //Capturar datos de entrada
        Id = Long.parseLong(txtId.getText());
        codigo = txtCodigo.getText();
        nombre = txtNombre.getText();
        precio = Double.parseDouble(txtPrecio.getText());
        cantidad = Long.parseLong(txtCantidad.getText());

        ProductoC productoC = new ProductoC();
        productoC.ModificarRegistro(Id,codigo, nombre, precio, cantidad);
    }//GEN-LAST:event_jbnModificarActionPerformed

    private void jbnEliminarLogicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnEliminarLogicoActionPerformed
        // TODO add your handling code here:
        Long id = Long.parseLong(txtId.getText());
        
        ProductoC productoC = new ProductoC();
        productoC.EliminarRegistro2(id);
    }//GEN-LAST:event_jbnEliminarLogicoActionPerformed

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
            java.util.logging.Logger.getLogger(ProductoV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProductoV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProductoV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductoV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProductoV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JButton jbnConsultar;
    private javax.swing.JButton jbnEliminarFisco;
    private javax.swing.JButton jbnEliminarLogico;
    private javax.swing.JButton jbnGuardar;
    private javax.swing.JButton jbnModificar;
    private java.awt.Label lblCodigo;
    private java.awt.Label lblCodigo1;
    private java.awt.Label lblCodigo2;
    private java.awt.Label lblCodigo3;
    private java.awt.Label lblCodigo4;
    private java.awt.TextField txtCantidad;
    private java.awt.TextField txtCodigo;
    private java.awt.TextField txtId;
    private java.awt.TextField txtNombre;
    private java.awt.TextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
