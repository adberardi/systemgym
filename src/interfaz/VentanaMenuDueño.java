/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;
import dominio.*;
import javax.swing.ImageIcon;
import controlador.control;
import java.util.ArrayList;
/**
 *
 * @author Antonio
 */
public class VentanaMenuDueño extends javax.swing.JFrame {
    Empresa registroActual;
    ArrayList<Personal> Personal = new ArrayList<Personal>();

    /**
     * Creates new form VentanaMenuDueño
     */
    public VentanaMenuDueño() {
        initComponents();
        control inicio = new control (this);
        inicio.inicializarVentana(this, "src/imagenes/logo.png");
//        control iniciar = new control (atras,agregarEmpleado,agregarInstructor,consultarEmpleados);
//        iniciar.activa_Desactiva_Button_MenuDueño(true);
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
        agregarEmpleado = new javax.swing.JButton();
        agregarInstructor = new javax.swing.JButton();
        consultarEmpleados = new javax.swing.JButton();
        atras = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("MENU DUEÑO");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/jefe.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 60, 70));

        agregarEmpleado.setText("AGREGAR EMPLEADO");
        agregarEmpleado.setOpaque(false);
        agregarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarEmpleadoActionPerformed(evt);
            }
        });
        jPanel1.add(agregarEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 180, -1));

        agregarInstructor.setText("AGREGAR INSTRUCTOR");
        agregarInstructor.setOpaque(false);
        agregarInstructor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarInstructorActionPerformed(evt);
            }
        });
        jPanel1.add(agregarInstructor, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 180, -1));

        consultarEmpleados.setText("CONSULTAR EMPLEADOS");
        consultarEmpleados.setOpaque(false);
        consultarEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarEmpleadosActionPerformed(evt);
            }
        });
        jPanel1.add(consultarEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 180, -1));

        atras.setText("<< ATRAS");
        atras.setOpaque(false);
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });
        jPanel1.add(atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 180, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 340, 240));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FONDO INICIO_1.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 310));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agregarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarEmpleadoActionPerformed
        // TODO add your handling code here:
        VentanaEmpleado ventana = new VentanaEmpleado();
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_agregarEmpleadoActionPerformed

    private void agregarInstructorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarInstructorActionPerformed
        // TODO add your handling code here:
        VentanaRegistroInstructor ventana = new VentanaRegistroInstructor();
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_agregarInstructorActionPerformed

    private void consultarEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarEmpleadosActionPerformed
        // TODO add your handling code here:
        VentanaListaEmpleados ventana = new VentanaListaEmpleados();
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_consultarEmpleadosActionPerformed

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
        // TODO add your handling code here:
        VentanaPersonal ventana = new VentanaPersonal ();
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_atrasActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaMenuDueño.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaMenuDueño.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaMenuDueño.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaMenuDueño.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaMenuDueño().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarEmpleado;
    private javax.swing.JButton agregarInstructor;
    private javax.swing.JButton atras;
    private javax.swing.JButton consultarEmpleados;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
