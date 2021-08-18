/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;
import controlador.control;
import dominio.*;
import java.awt.event.KeyEvent;
import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Antonio
 */
public class VentanaRegistroInstructor extends javax.swing.JFrame {
    Empresa registro;
    Instructores instruc;
    ArrayList<Personal> personal;

    /**
     * Creates new form VentanaInstructores
     */
    public VentanaRegistroInstructor() {
        initComponents();
        control inicio = new control (this);
        inicio.inicializarVentana(this, "src/imagenes/instructor.png");
        control iniciar = new control (cancelar,agregar,turnoCombo,cedulaTxt,nombreApellidoTxt,telfTxt,direccionTxt,sueldoTxt,rutinaTxt,nutricionTxt,areaTxt);
        iniciar.activa_Desactiva_Agregar_Cancelar_Atras(true);
        registro = inicio.devolverEmpresa();
        iniciar.llenarComboTurno();
        iniciar.llenarComboRutina();
        jLabel12.setVisible(false);
        jLabel13.setVisible(false);
        jLabel14.setVisible(false);
        jLabel15.setVisible(false);
        jLabel17.setVisible(false);
        jLabel18.setVisible(false);
        jLabel19.setVisible(false);
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
        jLabel8 = new javax.swing.JLabel();
        agregar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        nutricionTxt = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        turnoCombo = new javax.swing.JComboBox();
        areaTxt = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        rutinaTxt = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("REGISTRAR INSTRUCTOR");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setOpaque(false);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/instructor.png"))); // NOI18N

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
        jLabel7.setText("  SUELDO");

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

        jLabel8.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel8.setText("AREA ENTRENAMIENTO");

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

        jLabel9.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel9.setText("RUTINA");

        jLabel10.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel10.setText("NUTRICION");

        nutricionTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nutricionTxtMousePressed(evt);
            }
        });
        nutricionTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nutricionTxtActionPerformed(evt);
            }
        });
        nutricionTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nutricionTxtKeyTyped(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel11.setText("TURNO");

        turnoCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                turnoComboActionPerformed(evt);
            }
        });

        areaTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                areaTxtMousePressed(evt);
            }
        });
        areaTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                areaTxtActionPerformed(evt);
            }
        });
        areaTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                areaTxtKeyTyped(evt);
            }
        });

        jLabel12.setForeground(new java.awt.Color(255, 0, 0));
        jLabel12.setText("*");

        jLabel13.setForeground(new java.awt.Color(255, 0, 0));
        jLabel13.setText("*");

        jLabel14.setForeground(new java.awt.Color(255, 0, 0));
        jLabel14.setText("*");

        jLabel15.setForeground(new java.awt.Color(255, 0, 0));
        jLabel15.setText("*");

        jLabel17.setForeground(new java.awt.Color(255, 0, 0));
        jLabel17.setText("*");

        jLabel18.setForeground(new java.awt.Color(255, 0, 0));
        jLabel18.setText("*");

        jLabel19.setForeground(new java.awt.Color(255, 0, 0));
        jLabel19.setText("*");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cedulaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nombreApellidoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(149, 149, 149)
                                .addComponent(turnoCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(50, 50, 50)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel5))
                                        .addGap(42, 42, 42))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(53, 53, 53)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel11)
                                                    .addComponent(jLabel9))
                                                .addGap(41, 41, 41))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addGap(41, 41, 41)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel10)
                                                    .addComponent(jLabel7))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nutricionTxt)
                                    .addComponent(rutinaTxt, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(agregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cancelar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(telfTxt)
                            .addComponent(direccionTxt)
                            .addComponent(sueldoTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(areaTxt)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cedulaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(nombreApellidoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4))
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(telfTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel14))
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(direccionTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel15)))
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sueldoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel17))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(turnoCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(rutinaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nutricionTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel18))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(areaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agregar)
                    .addComponent(cancelar)))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 330, 380));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FONDO INICIO_1.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void turnoComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_turnoComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_turnoComboActionPerformed

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

    private void nutricionTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nutricionTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nutricionTxtActionPerformed

    private void areaTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_areaTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_areaTxtActionPerformed

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
        // TODO add your handling code here:
        if (areaTxt.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Campo(s) Vacio");
            areaTxt.requestFocus();
            jLabel19.setEnabled(true);
            jLabel19.setVisible(true);
        }
        else {
            instruc = new Instructores ();
            if (instruc.buscarInstructor(Long.parseLong(cedulaTxt.getText()))){
                control inicio = new control(cancelar,agregar,turnoCombo,cedulaTxt,nombreApellidoTxt,telfTxt,direccionTxt,sueldoTxt,rutinaTxt,nutricionTxt,areaTxt);
                inicio.datosInstructor(registro, instruc);
                VentanaMenuDueño ventana = new VentanaMenuDueño();
                ventana.setLocationRelativeTo(null);
                ventana.setVisible(true);
                this.dispose();
            } 
            else{
                JOptionPane.showMessageDialog(null, "ESTE INSTRUCTOR YA EXISTE");
                VentanaMenuDueño ventana = new VentanaMenuDueño ();
                ventana.setLocationRelativeTo(null);
                ventana.setVisible(true);
                this.dispose();
            }
        }
    }//GEN-LAST:event_agregarActionPerformed

    private void cedulaTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cedulaTxtMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_cedulaTxtMousePressed

    private void cedulaTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cedulaTxtKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (((c < '0')||(c > '9'))&&(c != KeyEvent.VK_BACK_SPACE)&&(c != KeyEvent.VK_ENTER)){
            JOptionPane.showMessageDialog(null, "No se aceptan letras y/o espacios en blanco");
            evt.consume();
        }
    }//GEN-LAST:event_cedulaTxtKeyTyped

    private void nombreApellidoTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreApellidoTxtKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (((c < 'A')||(c > 'Z'))&&((c < 'a')||(c > 'z'))&&(c != KeyEvent.VK_BACK_SPACE)&&(c != KeyEvent.VK_ENTER)&&(c != KeyEvent.VK_SPACE)){
            JOptionPane.showMessageDialog(null, "No se aceptan numeros");
            evt.consume();
        }
    }//GEN-LAST:event_nombreApellidoTxtKeyTyped

    private void telfTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telfTxtKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (((c < '0')||(c > '9'))&&(c != KeyEvent.VK_BACK_SPACE)&&(c != KeyEvent.VK_ENTER)){
            JOptionPane.showMessageDialog(null, "No se aceptan letras y/o espacios en blanco");
            evt.consume();
        }
    }//GEN-LAST:event_telfTxtKeyTyped

    private void direccionTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_direccionTxtKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (((c < 'A')||(c > 'Z'))&&((c <'a')||(c > 'z'))&&(c != KeyEvent.VK_BACK_SPACE)&&(c != KeyEvent.VK_ENTER)&&(c != KeyEvent.VK_SPACE)){
            JOptionPane.showMessageDialog(null, "No se aceptan numeros");
            evt.consume();
        }
    }//GEN-LAST:event_direccionTxtKeyTyped

    private void sueldoTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sueldoTxtKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (((c < '0')||(c > '9'))&&(c != KeyEvent.VK_BACK_SPACE)&&(c != KeyEvent.VK_ENTER)){
            JOptionPane.showMessageDialog(null, "No se aceptan letras y/o espacios en blanco");
            evt.consume();
        }
    }//GEN-LAST:event_sueldoTxtKeyTyped

    private void nutricionTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nutricionTxtKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (((c < 'A')||(c > 'Z'))&&((c <'a')||(c > 'z'))&&(c != KeyEvent.VK_BACK_SPACE)&&(c != KeyEvent.VK_ENTER)&&(c != KeyEvent.VK_SPACE)){
            JOptionPane.showMessageDialog(null, "No se aceptan numeros");
            evt.consume();
        }
    }//GEN-LAST:event_nutricionTxtKeyTyped

    private void areaTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_areaTxtKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (((c < 'A')||(c > 'Z'))&&((c <'a')||(c > 'z'))&&(c != KeyEvent.VK_BACK_SPACE)&&(c != KeyEvent.VK_ENTER)&&(c != KeyEvent.VK_SPACE )){
            JOptionPane.showMessageDialog(null, "No se aceptan numeros");
            evt.consume();
        }
    }//GEN-LAST:event_areaTxtKeyTyped

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        // TODO add your handling code here:
        VentanaMenuDueño ventana = new VentanaMenuDueño ();
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cancelarActionPerformed

    private void nombreApellidoTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombreApellidoTxtMousePressed
        // TODO add your handling code here:
        if (cedulaTxt.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Campo Cedula Vacio");
            cedulaTxt.requestFocus();
            jLabel12.setEnabled(true);
            jLabel12.setVisible(true);
        }
    }//GEN-LAST:event_nombreApellidoTxtMousePressed

    private void telfTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_telfTxtMousePressed
        // TODO add your handling code here:
        if (nombreApellidoTxt.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Campo Nombre y Apellido Vacio");
            nombreApellidoTxt.requestFocus();
            jLabel13.setEnabled(true);
            jLabel13.setVisible(true);
        }
    }//GEN-LAST:event_telfTxtMousePressed

    private void direccionTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_direccionTxtMousePressed
        // TODO add your handling code here:
        if (telfTxt.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Campo Telefono Vacio");
            telfTxt.requestFocus();
            jLabel14.setEnabled(true);
            jLabel14.setVisible(true);
        }
    }//GEN-LAST:event_direccionTxtMousePressed

    private void sueldoTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sueldoTxtMousePressed
        // TODO add your handling code here:
        if (direccionTxt.getText().isEmpty()){
            JOptionPane.showMessageDialog (null,"Campo Direccion Vacio");
            direccionTxt.requestFocus();
            jLabel15.setEnabled(true);
            jLabel15.setVisible(true);
        }
    }//GEN-LAST:event_sueldoTxtMousePressed

    private void nutricionTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nutricionTxtMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_nutricionTxtMousePressed

    private void areaTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_areaTxtMousePressed
        // TODO add your handling code here:
        if (nutricionTxt.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Campo Nutricion Vacio");
            nutricionTxt.requestFocus();
            jLabel18.setEnabled(true);
            jLabel18.setVisible(true);
        }
    }//GEN-LAST:event_areaTxtMousePressed

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
            java.util.logging.Logger.getLogger(VentanaRegistroInstructor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistroInstructor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistroInstructor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistroInstructor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaRegistroInstructor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregar;
    private javax.swing.JTextField areaTxt;
    private javax.swing.JButton cancelar;
    private javax.swing.JTextField cedulaTxt;
    private javax.swing.JTextField direccionTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
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
    private javax.swing.JTextField nutricionTxt;
    private javax.swing.JComboBox rutinaTxt;
    private javax.swing.JTextField sueldoTxt;
    private javax.swing.JTextField telfTxt;
    private javax.swing.JComboBox turnoCombo;
    // End of variables declaration//GEN-END:variables
}