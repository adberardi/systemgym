/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;
import controlador.control;
import dominio.Personal;
import dominio.*;
import java.util.*;
import registrar.DatosEmpleadoXml;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import  controlador.control.*;


/**
 *
 * @author Antonio
 */
public class VentanaEmpleado extends javax.swing.JFrame {
    PersonalAdministrativo per;
    Empresa registroActual;
    control inicio;
    

    /**
     * Creates new form VentanaEmpleado
     */
    public VentanaEmpleado() {
        initComponents();
        control inicio = new control (this);
        inicio.inicializarVentana(this, "src/imagenes/empleado.jpg");
        control iniciar = new control (cancelar,agregar,cedulaTxt,nombreApellidoTxt,telfTxt,direccionTxt,sueldoTxt);
        iniciar.activa_Desactiva_Agregar_Cancelar(true);
        cedulaTxt.requestFocus();
        jLabel8.setVisible(false);
        jLabel9.setVisible(false);
        jLabel10.setVisible(false);
        jLabel11.setVisible(false);
        jLabel12.setVisible(false);
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
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cedulaTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        nombreApellidoTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        telfTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        direccionTxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        sueldoTxt = new javax.swing.JTextField();
        agregar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("REGISTRO EMPLEADO");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setOpaque(false);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/empleado.jpg"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel2.setText("CEDULA");

        cedulaTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cedulaTxtMousePressed(evt);
            }
        });
        cedulaTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cedulaTxtActionPerformed(evt);
            }
        });
        cedulaTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cedulaTxtKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel4.setText("NOMBRE Y APELLIDO");

        nombreApellidoTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nombreApellidoTxtMousePressed(evt);
            }
        });
        nombreApellidoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreApellidoTxtActionPerformed(evt);
            }
        });
        nombreApellidoTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombreApellidoTxtKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel5.setText("TELEFONO");

        telfTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                telfTxtMousePressed(evt);
            }
        });
        telfTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telfTxtActionPerformed(evt);
            }
        });
        telfTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                telfTxtKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel6.setText("DIRECCION");

        direccionTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                direccionTxtMousePressed(evt);
            }
        });
        direccionTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                direccionTxtActionPerformed(evt);
            }
        });
        direccionTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                direccionTxtKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel7.setText("SUELDO");

        sueldoTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                sueldoTxtMousePressed(evt);
            }
        });
        sueldoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sueldoTxtActionPerformed(evt);
            }
        });
        sueldoTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                sueldoTxtKeyTyped(evt);
            }
        });

        agregar.setText("AGREGAR");
        agregar.setOpaque(false);
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });

        cancelar.setText("CANCELAR");
        cancelar.setOpaque(false);
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        jLabel8.setForeground(new java.awt.Color(255, 51, 0));
        jLabel8.setText("*");
        jLabel8.setEnabled(false);

        jLabel9.setForeground(new java.awt.Color(255, 51, 0));
        jLabel9.setText("*");
        jLabel9.setEnabled(false);

        jLabel10.setForeground(new java.awt.Color(255, 51, 0));
        jLabel10.setText("*");
        jLabel10.setEnabled(false);

        jLabel11.setForeground(new java.awt.Color(255, 51, 0));
        jLabel11.setText("*");
        jLabel11.setEnabled(false);

        jLabel12.setForeground(new java.awt.Color(255, 51, 0));
        jLabel12.setText("*");
        jLabel12.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(agregar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cancelar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 4, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel12)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cedulaTxt)
                    .addComponent(nombreApellidoTxt)
                    .addComponent(telfTxt)
                    .addComponent(direccionTxt)
                    .addComponent(sueldoTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cedulaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nombreApellidoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel9))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(telfTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel10))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(direccionTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel11))
                        .addGap(26, 26, 26))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(34, 34, 34)
                        .addComponent(agregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sueldoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(cancelar)
                    .addComponent(jLabel12))
                .addGap(25, 25, 25))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 360, 260));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FONDO INICIO_1.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cedulaTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cedulaTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cedulaTxtActionPerformed

    private void nombreApellidoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreApellidoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreApellidoTxtActionPerformed

    private void telfTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telfTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telfTxtActionPerformed

    private void direccionTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_direccionTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_direccionTxtActionPerformed

    private void sueldoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sueldoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sueldoTxtActionPerformed

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
        // TODO add your handling code here:
        if (sueldoTxt.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Campo Sueldo Vacio");
            jLabel12.setEnabled(true);
            jLabel12.setVisible(true);
        }
            else{   
            per = new PersonalAdministrativo();
            if (per.buscarEmpleado(Long.parseLong(cedulaTxt.getText()))){
            inicio = new control (cancelar,agregar,cedulaTxt,nombreApellidoTxt,telfTxt,direccionTxt,sueldoTxt);
            inicio.datosEmpleado(inicio.devolverEmpresa(), per);
            inicio.inicializarTextos(cedulaTxt, nombreApellidoTxt,direccionTxt, telfTxt,  sueldoTxt);
            VentanaMenuDue??o ventana = new VentanaMenuDue??o ();
            ventana.setLocationRelativeTo(null);
            ventana.setVisible(true);
            this.dispose();
            }
            else{
                JOptionPane.showMessageDialog(null, "ESTE EMPLEADO YA EXISTE");
                VentanaMenuDue??o ventana = new VentanaMenuDue??o();
                ventana.setLocationRelativeTo(null);
                ventana.setVisible(true);
                this.dispose();
            }
        }
                
        
    }//GEN-LAST:event_agregarActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        // TODO add your handling code here:
        VentanaMenuDue??o ventana = new VentanaMenuDue??o ();
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cancelarActionPerformed

    private void cedulaTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cedulaTxtKeyTyped
        // TODO add your handling code here:
        char v = evt.getKeyChar();
        if (((v<'0')||(v>'9'))&&(v != KeyEvent.VK_ENTER)&&(v!=KeyEvent.VK_BACK_SPACE)){
            evt.consume();
            JOptionPane.showMessageDialog(null, "No se aceptan letras y/o espacios blancos");
        }
    }//GEN-LAST:event_cedulaTxtKeyTyped

    private void nombreApellidoTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreApellidoTxtKeyTyped
        // TODO add your handling code here:
        char v = evt.getKeyChar();
        if (((v<'A')||(v>'Z'))&&((v<'a')||(v>'z'))&&(v != KeyEvent.VK_ENTER)&&(v != KeyEvent.VK_BACK_SPACE)&&(v != KeyEvent.VK_SPACE)){
            evt.consume();
            JOptionPane.showMessageDialog(null, "No se aceptan caracteres n??mericos");
        }
    }//GEN-LAST:event_nombreApellidoTxtKeyTyped

    private void telfTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telfTxtKeyTyped
        // TODO add your handling code here:
        char v = evt.getKeyChar();
        if (((v<'0')||(v>'9'))&&(v != KeyEvent.VK_ENTER)&&(v != KeyEvent.VK_BACK_SPACE)){
            evt.consume();
            JOptionPane.showMessageDialog(null, "No se aceptan letras y/o espacios en blanco");
        }
    }//GEN-LAST:event_telfTxtKeyTyped

    private void direccionTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_direccionTxtKeyTyped
        // TODO add your handling code here:
        char v = evt.getKeyChar();
        if (((v < 'A')||(v > 'Z'))&&((v < 'a')||(v > 'z'))&&(v != KeyEvent.VK_ENTER)&&(v != KeyEvent.VK_SPACE)&&(v != KeyEvent.VK_BACK_SPACE)){
            evt.consume();
            JOptionPane.showMessageDialog(null, "No se aceptan caracteres n??meros");
        }
    }//GEN-LAST:event_direccionTxtKeyTyped

    private void sueldoTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sueldoTxtKeyTyped
        // TODO add your handling code here:
        char v = evt.getKeyChar();
        if (((v < '0')||(v > '9'))&&(v != KeyEvent.VK_ENTER)&&(v != KeyEvent.VK_BACK_SPACE)){
            evt.consume();
            JOptionPane.showMessageDialog(null, "No se aceptan letras y/o espacioes en blanco");
        }
    }//GEN-LAST:event_sueldoTxtKeyTyped

    private void cedulaTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cedulaTxtMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_cedulaTxtMousePressed

    private void nombreApellidoTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombreApellidoTxtMousePressed
        // TODO add your handling code here:
        if (cedulaTxt.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Campo Cedula Vacio");
            cedulaTxt.requestFocus();
            jLabel8.setEnabled(true);
            jLabel8.setVisible(true);
        }
    }//GEN-LAST:event_nombreApellidoTxtMousePressed

    private void telfTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_telfTxtMousePressed
        // TODO add your handling code here:
        if (nombreApellidoTxt.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Campo Nombre y Apellido Vacio");
            nombreApellidoTxt.requestFocus();
            jLabel9.setEnabled(true);
            jLabel9.setVisible (true);
        }
    }//GEN-LAST:event_telfTxtMousePressed

    private void direccionTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_direccionTxtMousePressed
        // TODO add your handling code here:
        if (telfTxt.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Campo Telefono Vacio");
            telfTxt.requestFocus();
            jLabel10.setEnabled(true);
            jLabel10.setVisible(true);
        }
    }//GEN-LAST:event_direccionTxtMousePressed

    private void sueldoTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sueldoTxtMousePressed
        // TODO add your handling code here:
        if (direccionTxt.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Campo Direccion Vacio");
            direccionTxt.requestFocus();
            jLabel11.setEnabled(true);
            jLabel11.setVisible(true);
        }
    }//GEN-LAST:event_sueldoTxtMousePressed

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
            java.util.logging.Logger.getLogger(VentanaEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaEmpleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregar;
    private javax.swing.JButton cancelar;
    private javax.swing.JTextField cedulaTxt;
    private javax.swing.JTextField direccionTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nombreApellidoTxt;
    private javax.swing.JTextField sueldoTxt;
    private javax.swing.JTextField telfTxt;
    // End of variables declaration//GEN-END:variables
}
