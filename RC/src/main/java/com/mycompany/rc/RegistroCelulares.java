/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.rc;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.List;

public class RegistroCelulares extends javax.swing.JFrame {
    private List<String[]> registros; 
    DefaultTableModel modelo=new DefaultTableModel();
    /**
     * Creates new form RegistroCelulares
     */
    public RegistroCelulares() {
        initComponents();
        registros = new ArrayList<>();
        this.setTitle("GESTIÓN CELULARES."); 
        this.setSize(600, 500);
        modelo.addColumn("MARCA");
        modelo.addColumn("MODELO");
        modelo.addColumn("RAM");
        modelo.addColumn("SO");
        modelo.addColumn("MEMORIA INTERNA");
        refrescartabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    public void refrescartabla(){
        tabla.setModel(modelo);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        txtModelo = new javax.swing.JTextField();
        cboSO = new javax.swing.JComboBox<>();
        cboMemoria = new javax.swing.JComboBox<>();
        btnAgregar = new javax.swing.JToggleButton();
        btnMostrar = new javax.swing.JToggleButton();
        btnBuscar = new javax.swing.JToggleButton();
        btnEliminar = new javax.swing.JToggleButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        cboRam = new javax.swing.JComboBox<>();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel1.setText("REGISTRO DE CELULARES");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 32, -1, 27));

        jLabel2.setText("MARCA:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 74, -1, -1));

        jLabel3.setText("MODELO:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 114, -1, -1));

        jLabel4.setText("SO:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 191, -1, -1));

        jLabel5.setText("RAM:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 157, -1, -1));

        jLabel6.setText("MEMORIA INTERNA:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 231, -1, -1));

        txtMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMarcaActionPerformed(evt);
            }
        });
        jPanel1.add(txtMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 71, 139, -1));

        txtModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModeloActionPerformed(evt);
            }
        });
        jPanel1.add(txtModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 111, 139, -1));

        cboSO.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Android", "iOS", "Sailfish OS" }));
        cboSO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboSOActionPerformed(evt);
            }
        });
        jPanel1.add(cboSO, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 188, -1, -1));

        cboMemoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "4GB a 32GB", "64GB a 128GB", "256GB a 512GB", "1TB o más" }));
        jPanel1.add(cboMemoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 228, -1, -1));

        btnAgregar.setBackground(new java.awt.Color(153, 153, 255));
        btnAgregar.setText("AGREGAR");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 268, -1, 24));

        btnMostrar.setBackground(new java.awt.Color(153, 153, 255));
        btnMostrar.setText("MOSTRAR");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 268, 86, 24));

        btnBuscar.setBackground(new java.awt.Color(153, 153, 255));
        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 268, -1, 24));

        btnEliminar.setBackground(new java.awt.Color(153, 153, 255));
        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 268, -1, 24));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(tabla);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 321, 378, 153));

        cboRam.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2 GB", "4 GB", "6 GB", "8 GB", "10 GB" }));
        cboRam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboRamActionPerformed(evt);
            }
        });
        jPanel1.add(cboRam, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 154, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboSOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboSOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboSOActionPerformed

    private void txtMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMarcaActionPerformed

    private void txtModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModeloActionPerformed

    private void cboRamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboRamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboRamActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        String marca = txtMarca.getText().trim();
        String modelo = txtModelo.getText().trim();
        String ram = cboRam.getSelectedItem().toString();
        String SO = cboSO.getSelectedItem().toString();
        String memoria = cboMemoria.getSelectedItem().toString();

        if (!marca.isEmpty() && !modelo.isEmpty() && !SO.isEmpty() && !memoria.isEmpty()) {
            String[] nuevoRegistro = {marca, modelo, ram, SO, memoria};
            registros.add(nuevoRegistro);

            DefaultTableModel model = (DefaultTableModel) tabla.getModel();
            model.addRow(nuevoRegistro);
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.");
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        String marca = txtMarca.getText().trim();
        String modelo = txtModelo.getText().trim();
        String ram = cboRam.getSelectedItem().toString();
        String SO = cboSO.getSelectedItem().toString();
        String memoria = cboMemoria.getSelectedItem().toString();

        DefaultTableModel model = (DefaultTableModel) tabla.getModel();
        model.setRowCount(0); 

        for (String[] registro : registros) {
            if ((marca.isEmpty() || registro[0].equalsIgnoreCase(marca)) &&
                (modelo.isEmpty() || registro[1].equalsIgnoreCase(modelo)) &&
                (ram.isEmpty() || registro[2].equalsIgnoreCase(ram)) &&
                (SO.isEmpty() || registro[3].equalsIgnoreCase(SO)) &&
                (memoria.isEmpty() || registro[4].equalsIgnoreCase(memoria))) {
                model.addRow(registro);
            }
        }       
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tabla.getModel();
        model.setRowCount(0); 

        for (String[] registro : registros) {
            model.addRow(registro);
        }
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        int selectedRow = tabla.getSelectedRow();
        if (selectedRow >= 0) {
            DefaultTableModel model = (DefaultTableModel) tabla.getModel();
            registros.remove(selectedRow);
            model.removeRow(selectedRow);
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione una fila para eliminar.");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

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
            java.util.logging.Logger.getLogger(RegistroCelulares.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroCelulares.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroCelulares.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroCelulares.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroCelulares().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnAgregar;
    private javax.swing.JToggleButton btnBuscar;
    private javax.swing.JToggleButton btnEliminar;
    private javax.swing.JToggleButton btnMostrar;
    private javax.swing.JComboBox<String> cboMemoria;
    private javax.swing.JComboBox<String> cboRam;
    private javax.swing.JComboBox<String> cboSO;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    // End of variables declaration//GEN-END:variables
}
