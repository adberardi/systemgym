/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;
import controlador.*;
import controlador.control;
import dominio.*;
import java.util.ArrayList;

/**
 *
 * @author Antonio
 */
public class VentanaMenu extends javax.swing.JFrame {
    /**
     * Creates new form VentanaMenu
     */
    public VentanaMenu() {
        initComponents();
        control Inicio = new control (this);
        Inicio.inicializarVentana(this, "src/imagenes/logo.png");
        control Iniciar = new control (personalBoton,salir,socioBoton);
        Iniciar.activa_Desactiva_Menu_Principal(true);
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
        personalBoton = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        socioBoton = new javax.swing.JButton();
        eventosBoton = new javax.swing.JButton();
        productosBoton = new javax.swing.JButton();
        ventasBoton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        FondoMenu = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("MENU ENERGYM 3000");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        personalBoton.setText("EMPRESA");
        personalBoton.setOpaque(false);
        personalBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personalBotonActionPerformed(evt);
            }
        });
        jPanel1.add(personalBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 110, -1));

        salir.setText("SALIR");
        salir.setOpaque(false);
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        jPanel1.add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 110, -1));

        socioBoton.setText("MENU SOCIO");
        socioBoton.setOpaque(false);
        socioBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                socioBotonActionPerformed(evt);
            }
        });
        jPanel1.add(socioBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 110, -1));

        eventosBoton.setText("EVENTOS");
        eventosBoton.setOpaque(false);
        eventosBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eventosBotonActionPerformed(evt);
            }
        });
        jPanel1.add(eventosBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 110, -1));

        productosBoton.setText("PRODUCTOS");
        productosBoton.setOpaque(false);
        productosBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productosBotonActionPerformed(evt);
            }
        });
        jPanel1.add(productosBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 110, -1));

        ventasBoton.setText("VENTAS");
        ventasBoton.setOpaque(false);
        ventasBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ventasBotonActionPerformed(evt);
            }
        });
        jPanel1.add(ventasBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 110, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 320, 260));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("    ENERGYM 3000");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 160, 30));

        FondoMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FONDO INICIO_1.png"))); // NOI18N
        FondoMenu.setMaximumSize(new java.awt.Dimension(1000, 300));
        getContentPane().add(FondoMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void personalBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personalBotonActionPerformed
        // TODO add your handling code here:
        VentanaPersonal ventana = new VentanaPersonal();
        ventana.setLocationRelativeTo(null);
//        ventana.setResizable(false);
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_personalBotonActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_salirActionPerformed

    private void socioBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_socioBotonActionPerformed
        // TODO add your handling code here:
        VentanaMenuSocio ventana = new VentanaMenuSocio();
        ventana.setLocationRelativeTo(null);
        ventana.setVisible (true);
        this.dispose();
    }//GEN-LAST:event_socioBotonActionPerformed

    private void eventosBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eventosBotonActionPerformed
        // TODO add your handling code here:
        VentanaMenuEventos ventana = new VentanaMenuEventos ();
        ventana.setLocationRelativeTo(null);
        ventana.setVisible (true);
        this.dispose();
    }//GEN-LAST:event_eventosBotonActionPerformed

    private void ventasBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ventasBotonActionPerformed
        // TODO add your handling code here:
        MenudeVentas ventana = new MenudeVentas ();
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ventasBotonActionPerformed

    private void productosBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productosBotonActionPerformed
        // TODO add your handling code here:
        VentanaProductos ventana = new VentanaProductos();
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
        dispose();
    }//GEN-LAST:event_productosBotonActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FondoMenu;
    private javax.swing.JButton eventosBoton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton personalBoton;
    private javax.swing.JButton productosBoton;
    private javax.swing.JButton salir;
    private javax.swing.JButton socioBoton;
    private javax.swing.JButton ventasBoton;
    // End of variables declaration//GEN-END:variables
}
