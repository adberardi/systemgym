/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import controlador.control;
import static controlador.control.empresa;
import interfaz.*;
import static controlador.control.socioActual;
import static controlador.control.VentasActual;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import dominio.Productos;
import dominio.Ventas;
import interfaz.VentanaProductos;
import static interfaz.VentanaRegistrarSocios_1.socio;
import registrar.DatosProductoXml;
import registrar.DatosSocioXml;

/**
 *
 * @author Administrador
 */
public class VentanaIngresarProducto_1 extends javax.swing.JFrame {

    DatosProductoXml datos = new DatosProductoXml ();
    
    private boolean resultado = false;

    private Object proyecto;
//controlador c;
    
    /**
     * Creates new form IngresarProducto
     */
    public VentanaIngresarProducto_1() {
        initComponents();
       // this.c = new Controlador(jTexnombreProduct,jTexprecioProduct,jTexcantidadProduct);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTexnombreProduct = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTexprecioProduct = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTexcantidadProduct = new javax.swing.JTextField();
        jButtonAgregar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setOpaque(false);

        jLabel2.setText("       Ingresar Producto");

        jLabel3.setText("Nombre del Producto");

        jTexnombreProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTexnombreProductActionPerformed(evt);
            }
        });
        jTexnombreProduct.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTexnombreProductKeyTyped(evt);
            }
        });

        jLabel4.setText("Precio del Producto");

        jTexprecioProduct.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTexprecioProductKeyTyped(evt);
            }
        });

        jLabel5.setText("Cantidad de Unidades");

        jTexcantidadProduct.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTexcantidadProductKeyTyped(evt);
            }
        });

        jButtonAgregar.setText("Agregar");
        jButtonAgregar.setOpaque(false);
        jButtonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarActionPerformed(evt);
            }
        });

        jButton2.setText("Atrás");
        jButton2.setOpaque(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(108, 108, 108)))
                .addGap(127, 127, 127)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTexnombreProduct, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                        .addComponent(jTexprecioProduct, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jTexcantidadProduct, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(jButtonAgregar))
                .addGap(30, 30, 30))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(174, 174, 174))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTexnombreProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTexprecioProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTexcantidadProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButtonAgregar))
                .addGap(33, 33, 33))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 480, 330));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FONDO INICIO_1.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarActionPerformed
        // TODO add your handling code here:
        
                
    try { 
        Productos ProductosActual = new Productos(jTexnombreProduct.getText(),Long.parseLong(jTexprecioProduct.getText()), Long.parseLong(jTexcantidadProduct.getText()));
       VentasActual.saveProducto(ProductosActual);
        System.out.println(VentasActual.cantidadProductos());
//     empresa.incluirProducto(ProductosActual);
     JOptionPane.showMessageDialog(null, "GUARDADO EXITOSO");  
     VentanaProductos ventana = new VentanaProductos ();
     this.dispose();
     ventana.setLocationRelativeTo(null);
     ventana.setVisible(true);
       
     resultado = datos.nuevo(ProductosActual);
        }
    catch( NumberFormatException ex){
           JOptionPane.showMessageDialog(null, "Por favor llene todas las casillas");
       }
        
       
                
                
    }//GEN-LAST:event_jButtonAgregarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
       VentanaProductos iniciarsocio = new VentanaProductos();   
       iniciarsocio.setLocationRelativeTo(null);
        iniciarsocio.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTexnombreProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTexnombreProductActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTexnombreProductActionPerformed

    private void jTexnombreProductKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTexnombreProductKeyTyped
        // TODO add your handling code here:
        
       char c = evt.getKeyChar();
        if ((c<'A'||c>'Z')&&(c<'a'||c>'z')&&(c!=KeyEvent.VK_BACK_SPACE)&&(c != KeyEvent.VK_SPACE)&&(c != KeyEvent.VK_ENTER)) {
            evt.consume();
            JOptionPane.showMessageDialog(null,"No se pueden Ingresar numeros o caracteres alfanumericos");
        }

        
    }//GEN-LAST:event_jTexnombreProductKeyTyped

    private void jTexprecioProductKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTexprecioProductKeyTyped
        // TODO add your handling code here:
        
         char c = evt.getKeyChar();
        if ((c<'0'||c>'9')&&(c!=KeyEvent.VK_BACK_SPACE)&&(c!=KeyEvent.VK_ENTER)){
            evt.consume();
            JOptionPane.showMessageDialog(null, "No se pueden Ingresar caracteres alfabeticos");
            
        }
    }//GEN-LAST:event_jTexprecioProductKeyTyped

    private void jTexcantidadProductKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTexcantidadProductKeyTyped
        // TODO add your handling code here:
         char c = evt.getKeyChar();
        if ((c<'0'||c>'9')&&(c!=KeyEvent.VK_BACK_SPACE)&&(c!=KeyEvent.VK_ENTER)){
            evt.consume();
            JOptionPane.showMessageDialog(null, "No se pueden Ingresar caracteres alfabeticos");
            
        }
    }//GEN-LAST:event_jTexcantidadProductKeyTyped

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
            java.util.logging.Logger.getLogger(VentanaIngresarProducto_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaIngresarProducto_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaIngresarProducto_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaIngresarProducto_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaIngresarProducto_1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonAgregar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTexcantidadProduct;
    private javax.swing.JTextField jTexnombreProduct;
    private javax.swing.JTextField jTexprecioProduct;
    // End of variables declaration//GEN-END:variables
}