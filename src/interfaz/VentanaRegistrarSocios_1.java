/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import controlador.control;
import dominio.*;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import dominio.Socios;
import dominio.SystemGym;
import interfaz.VentanaMenuSocio;
import interfaz.VentanaMenuSocio;
import java.util.InputMismatchException;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;
import registrar.DatosSocioXml;

/**
 *
 * @author A
 */
public class VentanaRegistrarSocios_1 extends javax.swing.JFrame {
    
    DatosSocioXml datos1 = new DatosSocioXml ();
    ArrayList<Socios> lista;
    control inicio;
    
    private boolean resultado = false;
    
    public static Socios socio;
    Empresa registro;
    control ctrl;
    int dInscripcion;int mInscripcion; int yInscripcion;
    private Object Dominio;
    
    DateFormat df = DateFormat.getDateInstance();
    
    public VentanaRegistrarSocios_1() {
        initComponents(); 
        control inicio = new control (this);
        inicio.inicializarVentana(this, "src/imagenes/logo.png");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    public void Limpiar () {
    muestra.setText("");
    }
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel15 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jTextAreaEntrenamiento = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Comboturno = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        comboPaquete = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        muestra = new javax.swing.JTextArea();
        jButtonSalir = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonModificar = new javax.swing.JButton();
        jButtonSiguiente = new javax.swing.JButton();
        fechaInscripcion = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        jTextTelf = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextEdad = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextNombreApellido = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextCedula = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        jLabel15.setText("jLabel15");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("REGISTRAR SOCIO");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setOpaque(false);

        jLabel12.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel12.setText("MEMBRESIA");

        jTextAreaEntrenamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextAreaEntrenamientoActionPerformed(evt);
            }
        });
        jTextAreaEntrenamiento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextAreaEntrenamientoKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel5.setText("AREA DE ENTRENAMIENTO");

        jLabel11.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel11.setText("TURNO");

        Comboturno.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "MA??ANA", "TARDE", "NOCHE", "DIA COMPLETO" }));
        Comboturno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboturnoActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel13.setText("PAQUETE");

        comboPaquete.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ORO", "PLATA", "BRONCE" }));
        comboPaquete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboPaqueteActionPerformed(evt);
            }
        });

        muestra.setColumns(20);
        muestra.setRows(5);
        jScrollPane1.setViewportView(muestra);

        jButtonSalir.setText("Salir");
        jButtonSalir.setOpaque(false);
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });

        jButtonEliminar.setText("Eliminar");
        jButtonEliminar.setOpaque(false);
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.setOpaque(false);
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonModificar.setText("Modificar");
        jButtonModificar.setOpaque(false);
        jButtonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarActionPerformed(evt);
            }
        });

        jButtonSiguiente.setText("Agregar");
        jButtonSiguiente.setOpaque(false);
        jButtonSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSiguienteActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel7.setText("FECHA DE INSCRIPCION");

        jTextTelf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextTelfKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel4.setText("TELEFONO");

        jTextEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextEdadActionPerformed(evt);
            }
        });
        jTextEdad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextEdadKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel6.setText("EDAD");

        jTextNombreApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNombreApellidoActionPerformed(evt);
            }
        });
        jTextNombreApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextNombreApellidoKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel1.setText("NOMBRE Y APELLIDO");

        jTextCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCedulaActionPerformed(evt);
            }
        });
        jTextCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextCedulaKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel3.setText("CEDULA");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel2.setText("INDIQUE LOS DATOS PARA INGRESAR SOCIO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(223, 223, 223)
                        .addComponent(jLabel12))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel13)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(50, 50, 50)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Comboturno, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(comboPaquete, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextAreaEntrenamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel3))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextTelf, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(fechaInscripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextNombreApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextNombreApellido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextTelf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fechaInscripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextAreaEntrenamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Comboturno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboPaquete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalir)
                    .addComponent(jButtonEliminar)
                    .addComponent(jButtonSalvar)
                    .addComponent(jButtonModificar)
                    .addComponent(jButtonSiguiente))
                .addGap(22, 22, 22))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 19, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FONDO INICIO_1.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 670));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
         VentanaMenuSocio iniciarsocio = new VentanaMenuSocio();
         iniciarsocio.setLocationRelativeTo(null);
        iniciarsocio.setVisible(true);
        dispose();
 
        
        
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jButtonSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSiguienteActionPerformed
//       String FechaObtenida= df.format(jCalendario.getDayChooser());
//         jTextFecha.setText(FechaObtenida);
         try { 
             dInscripcion = fechaInscripcion.getCalendar().get(Calendar.DATE);
             mInscripcion = fechaInscripcion.getCalendar().get(Calendar.MONTH);
             yInscripcion = fechaInscripcion.getCalendar().get(Calendar.YEAR);
             
            inicio = new control(jButtonSalir,jButtonSiguiente,jTextCedula,jTextNombreApellido,jTextTelf,jTextEdad,fechaInscripcion,jTextAreaEntrenamiento,Comboturno,comboPaquete);
            socio = new Socios();
            inicio.datosSocios(inicio.devolverEmpresa(), socio);
            JOptionPane.showMessageDialog(null, "GUARDADO EXITOSO");       
            VentanaMenuSocio iniciarsocio = new VentanaMenuSocio();   
            iniciarsocio.setLocationRelativeTo(null);
            iniciarsocio.setVisible(true);
            dispose();   
//        VentanaMembresia nuevo = new VentanaMembresia();
//        this.dispose();                                                             
//        nuevo.setVisible(true);
          
            
                   
            
      
        }
    catch( NumberFormatException ex){
           JOptionPane.showMessageDialog(null, "Por favor llene todas las casillas");
       }
        
       
        
        
    }//GEN-LAST:event_jButtonSiguienteActionPerformed

    private void jTextCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextCedulaActionPerformed

    private void jTextCedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextCedulaKeyTyped
       char c = evt.getKeyChar();
        if ((c<'0'||c>'9')&&(c!=KeyEvent.VK_BACK_SPACE)&&(c!=KeyEvent.VK_ENTER)){
            evt.consume();
            JOptionPane.showMessageDialog(null, "No se pueden Ingresar caracteres alfabeticos");
            
        }


    }//GEN-LAST:event_jTextCedulaKeyTyped

    private void jTextNombreApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextNombreApellidoKeyTyped

      char c = evt.getKeyChar();
        if ((c<'A'||c>'Z')&&(c<'a'||c>'z')&&(c!=KeyEvent.VK_BACK_SPACE)&&(c != KeyEvent.VK_SPACE)&&(c != KeyEvent.VK_ENTER)) {
            evt.consume();
            JOptionPane.showMessageDialog(null,"No se pueden Ingresar numeros o caracteres alfanumericos");
        }

    }//GEN-LAST:event_jTextNombreApellidoKeyTyped

    private void jTextTelfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextTelfKeyTyped

       char c = evt.getKeyChar();
        if ((c<'0'||c>'9')&&(c!=KeyEvent.VK_BACK_SPACE)&&(c!=KeyEvent.VK_ENTER)){
            evt.consume();
            JOptionPane.showMessageDialog(null, "No se pueden Ingresar caracteres alfabeticos");
            
        }
    }//GEN-LAST:event_jTextTelfKeyTyped

    private void jTextEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextEdadActionPerformed
        
    }//GEN-LAST:event_jTextEdadActionPerformed

    private void jTextEdadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextEdadKeyTyped
          char c = evt.getKeyChar();
        if ((c<'0'||c>'9')&&(c!=KeyEvent.VK_BACK_SPACE)&&(c!=KeyEvent.VK_ENTER)){
            evt.consume();
            JOptionPane.showMessageDialog(null, "No se pueden Ingresar caracteres alfabeticos");
            
        }
    }//GEN-LAST:event_jTextEdadKeyTyped

    private void jTextAreaEntrenamientoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextAreaEntrenamientoKeyTyped
        char c = evt.getKeyChar();
        if ((c<'A'||c>'Z')&&(c<'a'||c>'z')&&(c!=KeyEvent.VK_BACK_SPACE)&&(c != KeyEvent.VK_SPACE)&&(c != KeyEvent.VK_ENTER)) {
            evt.consume();
            JOptionPane.showMessageDialog(null,"No se pueden Ingresar numeros o caracteres alfanumericos");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jTextAreaEntrenamientoKeyTyped

    private void comboPaqueteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboPaqueteActionPerformed
        
         if ( comboPaquete.getSelectedIndex() == 0 ) {
            Limpiar();     
            muestra.append("Podr?? disfrutar de todas nuestras instalaciones\n");
            muestra.append("sin limites de tiempo y con un entrenador personal.\n");
        }
        else if ( comboPaquete.getSelectedIndex() == 1) {
            Limpiar();
            muestra.append("Podr?? disfrutar de todas nuestras instalaciones\n");
            muestra.append("sin limites de tiempo.\n");
        }
        else if ( comboPaquete.getSelectedIndex() == 2) {
            Limpiar();
            muestra.append("Podr?? disfrutar de todas nuestras instalaciones\n");
            muestra.append("pero con un l??mite de tiempo de 5 horas.\n");
        }
        
        
    }//GEN-LAST:event_comboPaqueteActionPerformed

    private void jTextAreaEntrenamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextAreaEntrenamientoActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_jTextAreaEntrenamientoActionPerformed

    private void ComboturnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboturnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboturnoActionPerformed

    private void jTextNombreApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNombreApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNombreApellidoActionPerformed

    private void jButtonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarActionPerformed
        // TODO add your handling code here:
         if(jTextCedula.getText().isEmpty()){
       JOptionPane.showMessageDialog(null, "Introduzca Primero la Cedula para Modificar el Socio");
       }
       else{
          
      int Cedula = Integer.parseInt(jTextCedula.getText());
     
      
         lista = datos1.todosLosSocios();
        for (Socios socio1 : lista){
         if(socio1.getCedula()==Cedula){
             socio = socio1;
             break;
         }
        } 
        
        if ( socio != null ) {
          jTextNombreApellido.setText(socio.getNombreSocio());
          jTextEdad.setText(Long.toString(socio.getEdad()));
          jTextTelf.setText(Long.toString(socio.getTelfSocio()));
//        fechaInscripcion.setCalendar();
          jTextAreaEntrenamiento.setText(socio.getAreaEntrenar());
          DateFormat formatter1 = DateFormat.getDateInstance();
          String fecha = (Long.toString(socio.getDiaInscripcion()))+"/"+Long.toString(socio.getMesInscripcion())+"/"+Long.toString(socio.getA??oInscripcion());
          try {
              fechaInscripcion.setDate(formatter1.parse(fecha));
          } catch (ParseException ex) {
              Logger.getLogger(VentanaRegistrarSocios_1.class.getName()).log(Level.SEVERE, null, ex);
          }
          
          
      control.activar_desactivar(false, jButtonSiguiente, jButtonModificar, jButtonEliminar,  jButtonSalvar, jTextCedula);
       } 
      else
      JOptionPane.showMessageDialog(null, "Socio inexistente"); 
           
           
           
       }
       
        
    }//GEN-LAST:event_jButtonModificarActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        // TODO add your handling code here:
        
               control.salvarPersona( jTextNombreApellido,jTextEdad,jTextTelf,jTextAreaEntrenamiento,Comboturno,comboPaquete,socio);
               control.activar_desactivar(true, jButtonSiguiente, jButtonModificar, jButtonEliminar,  jButtonSalvar, jTextCedula);
               control.limpia(jTextCedula,jTextNombreApellido,jTextEdad,jTextTelf,jTextAreaEntrenamiento,Comboturno,comboPaquete);
                 VentanaRegistrarSocios_1 iniciarsocio = new VentanaRegistrarSocios_1(); 
                 iniciarsocio.setLocationRelativeTo(null);
                 dispose();
                iniciarsocio.setVisible(true);
        
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        // TODO add your handling code here:
        if(jTextCedula.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Introduzca Primero la Cedula para Eliminar el Socio");
        }
        else{

            int Cedula = Integer.parseInt(jTextCedula.getText());
            //socio = empresa.loadCliente(Cedula);
            if ( socio != null ) {

                //          socioActual.getCedula().remove();
                //          socio.getNombreSocio().remove();

                //      control.traerDatos( jTextNombreApellido,jTextEdad,jTextTelf,combodia,combomes,comboanio,jTextAreaEntrenamiento,Comboturno,comboPaquete,jTextMontoMens,socio);
                //      control.activar_desactivar(false, jButtonSiguiente, jButtonModificar, jButtonEliminar,  jButtonSalvar, jTextCedula);
            }
            else
            JOptionPane.showMessageDialog(null, "Socio inexistente");

        }

    }//GEN-LAST:event_jButtonEliminarActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaRegistrarSocios_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistrarSocios_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistrarSocios_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistrarSocios_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaRegistrarSocios_1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox Comboturno;
    private javax.swing.JComboBox comboPaquete;
    private com.toedter.calendar.JDateChooser fechaInscripcion;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonModificar;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JButton jButtonSiguiente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextAreaEntrenamiento;
    private javax.swing.JTextField jTextCedula;
    private javax.swing.JTextField jTextEdad;
    private javax.swing.JTextField jTextNombreApellido;
    private javax.swing.JTextField jTextTelf;
    private javax.swing.JTextArea muestra;
    // End of variables declaration//GEN-END:variables
}
