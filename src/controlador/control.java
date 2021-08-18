/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import dominio.Socios;
import com.toedter.calendar.JDateChooser;
import dominio.*;
import java.text.DateFormat;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.ButtonGroup;
import javax.swing.JPasswordField;
import interfaz.VentanaEmpleadosInstructores;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.*;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;
import registrar.DatosEmpleadoXml;
import registrar.DatosInstructorXml;
import registrar.DatosSocioXml;

/**
 *
 * @author Antonio
 */
public class control {
    JFrame ventana;
    JButton personalBoton,salir,socioBoton,atras,menuAdministracion,menuPrincipal,aceptar,cancelar;
    JButton agregar,agregarEmpleado,agregarInstructor,consultarEmpleados,consultarSocios;
    JButton personalAdministrativo,empleados,dueno,menuSocio,pagar,menu,registrarSocio,consultarSocio,registrarPago;
    JComboBox turnoCombo,comboPago,comboEvento,rutinaTxt;
    JPasswordField claveTxt;
    int d;int m;int y;int dInscripcion;int mInscripcion; int yInscripcion;int dl; int ml; int yl;
    JTextField cedulaAlumnoTxt,nombreAlumnoTxt,montoAlumno,telfAlumnoTxt,edadTxt,AreaentrenarTxt;
    JTextField cedulaTxt,nombreApellidoTxt,telfTxt,direccionTxt,sueldoTxt,nutricionTxt,montoTxt,areaTxt;
    JTextField nombreEventoTxt,instructorEventoTxt,montoEventoTxt;
    JRadioButton credito, debito,efectivo,opcionEmpleados,opcionInstructores,opcionTodos; 
    JTextField jTextCedula,jTextNombreApellido,jTextTelf,jTextAreaEntrenamiento,jTextDia,jTextMes,jTextAnio;
    JButton jButtonSalir,jButtonSiguiente,BotonRegresar,jButtonRegistrar;
    JComboBox ComboNumero,area,TurnoCombo,TurnoPaquete;
     public static Ventas VentasActual = new Ventas();
    Socios socio;
    JTextField  jTextMontoMens;
    JButton instructores;
    JComboBox  Comboturno,comboPaquete;
    DatosSocioXml socXML = new DatosSocioXml();
    DatosEmpleadoXml datos = new DatosEmpleadoXml ();
    DatosInstructorXml datosIns = new DatosInstructorXml ();
    JDateChooser calendar;
    private boolean resultado = false;
//    Socios socio;
    private Object proyecto;
    public static final Empresa empresa = new Empresa();
    public static Empresa empresa1 = new Empresa();
    public static Eventos evento = new Eventos ();
    public static ArrayList<Personal> personal = new  ArrayList<Personal>();
    public static ArrayList<Socios> socioActual = new  ArrayList<Socios>();

    
    public Empresa devolverEmpresa(){
        return empresa;
    }
    public Eventos devolverEvento (){
        return evento;
    }
    public control (){
       
    }

    public control(JFrame ventana) {
        this.ventana = ventana;
    }
     public control(JComboBox ComboNumero) {
        this.ComboNumero = ComboNumero;
    }
     
     private Object jTextFnombreapellido;
     
     public control(JTextField jTextCedula, JTextField jTextNombreApellido, JComboBox ComboNumero, JTextField jTextTelf, JTextField jTextAreaEntrenamiento, JTextField jTextDia, JTextField jTextMes, JTextField jTextAnio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public control(JButton atras) {
        this.atras = atras;
    }

    public control(JButton personalBoton, JButton salir, JButton socioBoton) {
        this.personalBoton = personalBoton;
        this.salir = salir;
        this.socioBoton = socioBoton;
    }

    public control(JButton atras, JButton registrarSocio, JButton consultarSocio, JButton registrarPago) {
        this.atras = atras;
        this.registrarSocio = registrarSocio;
        this.consultarSocio = consultarSocio;
        this.registrarPago = registrarPago;
    }

    public control(JButton atras, JRadioButton opcionEmpleados, JRadioButton opcionInstructores, JRadioButton opcionTodos) {
        this.atras = atras;
        this.opcionEmpleados = opcionEmpleados;
        this.opcionInstructores = opcionInstructores;
        this.opcionTodos = opcionTodos;
    }

    public control(JButton aceptar, JButton cancelar, JPasswordField claveTxt) {
        this.aceptar = aceptar;
        this.cancelar = cancelar;
        this.claveTxt = claveTxt;
    }
    
    
    public control(JButton atras, JButton menuPrincipal, JTextField cedulaTxt, JTextField nombreApellidoTxt) {
        this.atras = atras;
        this.menuPrincipal = menuPrincipal;
        this.cedulaTxt = cedulaTxt;
        this.nombreApellidoTxt = nombreApellidoTxt;
    }

    public control(JButton cancelar, JButton agregar, JTextField cedulaTxt, JTextField nombreApellidoTxt, JTextField telfTxt, JTextField direccionTxt, JTextField sueldoTxt) {
        this.cancelar = cancelar;
        this.agregar = agregar;
        this.cedulaTxt = cedulaTxt;
        this.nombreApellidoTxt = nombreApellidoTxt;
        this.telfTxt = telfTxt;
        this.direccionTxt = direccionTxt;
        this.sueldoTxt = sueldoTxt;
    }
    public control(JButton cancelar, JButton agregar, JTextField cedulaTxt, JTextField nombreApellidoTxt, JTextField telfTxt, JTextField edadtxt,JDateChooser calendar,JTextField Areaentrenartxt, JComboBox turno, JComboBox paquete) {
        this.cancelar = cancelar;
        this.agregar = agregar;
        this.cedulaTxt = cedulaTxt;
        this.nombreApellidoTxt = nombreApellidoTxt;
        this.edadTxt= edadTxt;
        this.telfTxt = telfTxt;
        this.AreaentrenarTxt= Areaentrenartxt;
        this.edadTxt = edadtxt;
        this.calendar= calendar;
        this.TurnoCombo= turno;
        this.TurnoPaquete= paquete ;
    }
    public control(JButton cancelar, JButton agregar, JComboBox turnoCombo, JTextField cedulaTxt, JTextField nombreApellidoTxt, JTextField telfTxt, JTextField direccionTxt, JTextField sueldoTxt, JComboBox rutinaTxt, JTextField nutricionTxt, JTextField areaTxt) {
        this.cancelar = cancelar;
        this.agregar = agregar;
        this.turnoCombo = turnoCombo;
        this.cedulaTxt = cedulaTxt;
        this.nombreApellidoTxt = nombreApellidoTxt;
        this.telfTxt = telfTxt;
        this.direccionTxt = direccionTxt;
        this.sueldoTxt = sueldoTxt;
        this.rutinaTxt = rutinaTxt;
        this.nutricionTxt = nutricionTxt;
        this.areaTxt = areaTxt;
    }

    public control(JButton cancelar, JButton pagar, JTextField cedulaTxt, JTextField nombreApellidoTxt, JTextField montoTxt) {
        this.cancelar = cancelar;
        this.pagar = pagar;
        this.cedulaTxt = cedulaTxt;
        this.nombreApellidoTxt = nombreApellidoTxt;
        this.montoTxt = montoTxt;
    }

    
    public control(JButton atras, JButton agregarEmpleado, JButton agregarInstructor, JButton consultarEmpleados, JButton consultarSocios) {
        this.atras = atras;
        this.agregarEmpleado = agregarEmpleado;
        this.agregarInstructor = agregarInstructor;
        this.consultarEmpleados = consultarEmpleados;
        this.consultarSocios = consultarSocios;
    }

    public control(JButton empleados, JButton dueno) {
        this.empleados = empleados;
        this.dueno = dueno;
    }

    public control(JComboBox comboEvento, JTextField cedulaAlumnoTxt, JTextField nombreAlumnoTxt, JTextField montoAlumno, JTextField telfAlumnoTxt) {
        this.comboEvento = comboEvento;
        this.cedulaAlumnoTxt = cedulaAlumnoTxt;
        this.nombreAlumnoTxt = nombreAlumnoTxt;
        this.montoAlumno = montoAlumno;
        this.telfAlumnoTxt = telfAlumnoTxt;
    }
//    public control(JButton cancelar, JButton pagar) {
//        this.cancelar = cancelar;
//        this.pagar = pagar;
//    }

    public control(JComboBox turnoCombo, JTextField areaTxt) {
        this.turnoCombo = turnoCombo;
        this.areaTxt = areaTxt;
    }

    

    public control(JComboBox comboPago, JRadioButton credito, JRadioButton debito, JRadioButton efectivo) {
        this.comboPago = comboPago;
        this.credito = credito;
        this.debito = debito;
        this.efectivo = efectivo;
    }

    public control(int d, int m, int y, JTextField nombreEventoTxt, JTextField instructorEventoTxt, JTextField montoEventoTxt) {
        this.d = d;
        this.m = m;
        this.y = y;
        this.nombreEventoTxt = nombreEventoTxt;
        this.instructorEventoTxt = instructorEventoTxt;
        this.montoEventoTxt = montoEventoTxt;
    }

    public control(int dl, int ml, int yl, JTextField cedulaTxt, JTextField montoTxt, JRadioButton credito, JRadioButton debito, JRadioButton efectivo) {
        this.dl = dl;
        this.ml = ml;
        this.yl = yl;
        this.cedulaTxt = cedulaTxt;
        this.montoTxt = montoTxt;
        this.credito = credito;
        this.debito = debito;
        this.efectivo = efectivo;
    }
    
    public void inicializarVentana (JFrame ventana,String ruta){
        ventana.setLocationRelativeTo(null);
        ventana.setIconImage(new ImageIcon (ruta).getImage());
        ventana.setResizable(false);
        ventana.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    }
    public void activa_Desactiva_Agregar_Cancelar (boolean flag){
        agregar.setEnabled(flag);
        cancelar.setEnabled(flag);
    }
    public void activa_Desactiva_Aceptar_Cancelar (boolean flag){
        aceptar.setEnabled(flag);
        cancelar.setEnabled(flag);
    }
    public void activa_Desactiva_Atras_MenuAdministracion (boolean flag){
        atras.setEnabled(flag);
        menuAdministracion.setEnabled(flag);
    }
    public void activa_Desactiva_Atras_MenuPrincipal (boolean flag){
        atras.setEnabled(flag);
        menuPrincipal.setEnabled(flag);
    }
    public void activa_Desactiva_Agregar_Cancelar_Atras (boolean flag){
        agregar.setEnabled(flag);
        cancelar.setEnabled(flag);
    }
     public void activa_Desactiva_Atras (boolean flag){
         atras.setEnabled(flag);
     }
     public void activa_Desactiva_Button_Menudueno (boolean flag){
         atras.setEnabled(flag);
         agregarEmpleado.setEnabled(flag);
         agregarInstructor.setEnabled(flag);
         consultarEmpleados.setEnabled(flag);
     }
   
     public void activa_Desactiva_Button_Personal (boolean flag){
         empleados.setEnabled(flag);
         dueno.setEnabled(flag);
     }
     public void activa_Desactiva_Pago (boolean flag){
         pagar.setEnabled(flag);
         cancelar.setEnabled(flag);
     }
     public void activa_Desactiva_Registrar_Socio (boolean flag){
         agregar.setEnabled(flag);
         cancelar.setEnabled(flag);
     }
     public void activa_Desactiva_Menu_Principal (boolean flag){
         personalBoton.setEnabled(flag);
         salir.setEnabled(flag);
         socioBoton.setEnabled(flag);
     }
     public void activa_Desactiva_Boton_VentanaSocio (boolean flag){
         registrarSocio.setEnabled(flag);
         consultarSocio.setEnabled(flag);
         registrarPago.setEnabled(flag);
         atras.setEnabled(flag);
     }
     public void inicializarTextos (JTextField nombreApellidoTxt, JTextField cedulaTxt){
         nombreApellidoTxt.setText(null);
         cedulaTxt.setText(null);
     } 
     public void inicializarTextos (JTextField cedulaTxt,JTextField nombreApellidoTxt,JTextField telfTxt,JTextField direccionTxt,JTextField sueldoTxt){
         cedulaTxt.setText(null);
         nombreApellidoTxt.setText(null);
         telfTxt.setText(null);
         direccionTxt.setText(null);
         sueldoTxt.setText(null);
     }
     public void inicializarTextos (JTextField cedulaTxt,JTextField nombreApellidoTxt,JTextField telfTxt,JTextField direccionTxt,JTextField sueldoTxt,JTextField rutinaTxt,JTextField nutricionTxt){
         cedulaTxt.setText(null);
         nombreApellidoTxt.setText(null);
         telfTxt.setText(null);
         direccionTxt.setText(null);
         sueldoTxt.setText(null);
         rutinaTxt.setText(null);
         nutricionTxt.setText(null);
     }
     public void inicializarTextos (JTextField cedulaTxt,JTextField nombreApellidoTxt,JTextField montoTxt){
         cedulaTxt.setText(null);
         nombreApellidoTxt.setText(null);
         montoTxt.setText(null);
     }
     public void inicializarTextosEvento (JTextField nombreEventoTxt,JTextField instructorEventoTxt,JTextField montoEventoTxt){
         nombreEventoTxt.setText(null);
         instructorEventoTxt.setText(null);
         montoEventoTxt.setText(null);
     }
     
     public void agregarEmpleado(Personal personal){
        this.personal = empresa.agregarEmpleado(personal);
        System.out.println(this.personal.size());   
     }
     
     public ArrayList<Personal> devolverEmpleado(){
        return personal;
    }
     public Personal devolverPersonal (int posicion){
         return empresa.devolverPersona(posicion);
     }
     public int tamañoArray (ArrayList<Personal> x){
         return x.size();
     }
     
     public ArrayList<Personal> mostrarEmpleados (){
         return empresa.getPersonal();
     }
     
     public void llenarComboTurno (){
         turnoCombo.addItem("Mañana");
         turnoCombo.addItem("Mediodia");
         turnoCombo.addItem("Tarde");
     }
     
     public void llenarComboPago(){
         comboPago.addItem("Incripcion");
         comboPago.addItem("Compra");
     }
     
     public void llenarComboRutina(){
         rutinaTxt.addItem("Spinning");
         rutinaTxt.addItem("Bailoterapia");
         rutinaTxt.addItem("General");
     }
    
     
    public control(JTextField jTextCedula, JTextField jTextNombreApellido, JTextField jTextTelf, JTextField jTextAreaEntrenamiento, JTextField jTextDia, JTextField jTextMes, JTextField jTextAnio, JButton jButtonSalir, JButton jButtonSiguiente, JComboBox ComboNumero, Object jTextFnombreapellido) {
        this.jTextCedula = jTextCedula;
        this.jTextNombreApellido = jTextNombreApellido;
        this.jTextTelf = jTextTelf;
        this.jTextAreaEntrenamiento = jTextAreaEntrenamiento;
        this.jTextDia = jTextDia;
        this.jTextMes = jTextMes;
        this.jTextAnio = jTextAnio;
        this.jButtonSalir = jButtonSalir;
        this.jButtonSiguiente = jButtonSiguiente;
        this.ComboNumero = ComboNumero;
        this.jTextFnombreapellido = jTextFnombreapellido;
    }

   
     public void inicializarTxt(JTextField jTextCedula,JTextField jTextNombreApellido, JTextField jTextTelf,JTextField jTextAreaEntrenamiento,JTextField jTextDia,JTextField jTextMes,JTextField jTextAnio){
      jTextCedula.setText(null);
      jTextNombreApellido.setText(null);
      jTextTelf.setText(null);
      jTextAreaEntrenamiento.setText(null);
      jTextDia.setText(null);
      jTextMes.setText(null);
      jTextAnio.setText(null);
      
  }
     public void nuevaVentana (){
         VentanaEmpleadosInstructores ventana = new VentanaEmpleadosInstructores();
         ventana.setLocationRelativeTo(null);
         ventana.setVisible(true);
     }
     
     public void iniciaVentana(JFrame ventana){
        ventana.setLocationRelativeTo(null);      
        ventana.setResizable(false); 
        ventana.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);     
    } 
     
     public void datosEmpleado (Empresa registro,PersonalAdministrativo per){
         per.setCedulaEmpleado(Long.parseLong(cedulaTxt.getText()));
         per.setNombreEmpleado(nombreApellidoTxt.getText());
         per.setDireccionEmpleado(direccionTxt.getText());
         per.setTelefonoEmpleado(Long.parseLong(telfTxt.getText()));
         per.setSueldo(Long.parseLong(sueldoTxt.getText()));
         registro.agregarEmpleado(per);
         resultado = datos.nuevo(per);
     }
     
      public void datosSocios (Empresa registro,Socios soc){
          soc.setCedula(Long.parseLong(cedulaTxt.getText()));
          soc.setNombreSocio(jTextNombreApellido.getText());
          soc.setEdad(Long.parseLong(edadTxt.getText()));
          soc.setTelfSocio(Long.parseLong(telfTxt.getText()));
          this.dInscripcion = calendar.getCalendar().get(Calendar.DATE);
          this.mInscripcion = calendar.getCalendar().get(Calendar.MONTH);
          this.yInscripcion = calendar.getCalendar().get(Calendar.YEAR);
          soc.setDiaInscripcion(dInscripcion);
          soc.setMesInscripcion(mInscripcion);
          soc.setAnoInscripcion(yInscripcion);
          soc.setAreaEntrenar(AreaentrenarTxt.getText());
          TurnoCombo.getSelectedItem().toString();
          TurnoPaquete.getSelectedItem().toString();
        

         registro.incluirSocio(soc);
         resultado = socXML.nuevo(soc);
     }
      
     public void datosInstructor (Empresa registro, Instructores instruc){
         instruc.setCedulaEmpleado(Long.parseLong(cedulaTxt.getText()));
         instruc.setNombreEmpleado(nombreApellidoTxt.getText());
         instruc.setTelefonoEmpleado(Long.parseLong(telfTxt.getText()));
         instruc.setDireccionEmpleado(direccionTxt.getText());
         instruc.setAreaEntrenamiento(areaTxt.getText());
         instruc.setSueldo(Long.parseLong(sueldoTxt.getText()));
         instruc.setRutinas(rutinaTxt.getSelectedItem().toString());
         instruc.setTurno(turnoCombo.getSelectedItem().toString());
         instruc.setTipoDeNutricion(nutricionTxt.getText());
         registro.agregarEmpleado(instruc);
         resultado = datosIns.nuevoInstructor(instruc);
     }
     public void datosEvento (Empresa registro,Eventos agenda){
         agenda.setNombreEvento(nombreEventoTxt.getText());
         agenda.setNombreInstructor(instructorEventoTxt.getText());
         agenda.setPrecioEvento(Long.parseLong(montoEventoTxt.getText()));
         agenda.setDia(d);
         agenda.setMes(m);
         agenda.setAño(y);
         registro.agregarEvento(agenda);
     }
     public void datosMembresia (Socios registroSocio, Membresia mem){
         mem.setLastDay(dl);
         mem.setLastMonth(ml);
         mem.setLastYear(yl + 80);
         mem.setMonto(Long.parseLong(montoTxt.getText()));
         if (efectivo.isSelected() == true)
             mem.setPago("Efectivo");
         if (credito.isSelected() == true)
             mem.setPago("Credito");
         if (debito.isSelected() == true)
             mem.setPago("Debito");
         registroSocio.agregarMembresia(mem);
         registroSocio.setDiaInscripcion(dl);
         registroSocio.setMesInscripcion(ml);
         registroSocio.setAnoInscripcion(yl + 80);
         
     }
     public void datosAlumno(Eventos registroEvento, Participantes curso){
         curso.setCedulaParticipante(Long.parseLong(cedulaAlumnoTxt.getText()));
         curso.setNombreParticipante(nombreAlumnoTxt.getText());
         curso.setMontoCobrado(Long.parseLong(montoAlumno.getText()));
         curso.setTelefonoParticipante(Long.parseLong(telfAlumnoTxt.getText()));
         registroEvento.agregarAlumno(curso);
     }
     public boolean validarMorosidad (Socios registroSocio){
         int fdi = registroSocio.getDiaInscripcion();
         int fmi = registroSocio.getMesInscripcion();
         int fyi = registroSocio.getAnoInscripcion();
         String fechaInicial = Integer.toString(fdi)+"/"+Integer.toString(fmi)+"/"+Integer.toString(fyi);
         SimpleDateFormat conversion = new SimpleDateFormat ("dd-MM-yyyy");
         Date fecha1 = conversion.parse(fechaInicial,new ParsePosition(0));
         SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
         int cfd = date.getCalendar().get(Calendar.DATE);
         int cfm = date.getCalendar().get(Calendar.MONTH);
         int cfy = date.getCalendar().get(Calendar.YEAR);
         String fechaFinal = Integer.toString(cfd)+"/"+Integer.toString(cfm)+"/"+Integer.toString(cfy);
//         Date fecha2 = conversion.parse(fechaFinal,new ParsePosition(0));
//         System.out.println(fechaInicial);
//         System.out.println(fechaFinal);
//         System.out.println(fecha1.toString());
//         System.out.println(fecha2.toString());
         if ((cfm !=fmi)&&(fyi != cfy))
//         if (fecha2.before(fecha1))
             return false;
         else 
             return true;
     }
     public control(JFrame ventana, JButton personalBoton, JButton atras, JButton menuAdministracion, JButton menuPrincipal, JButton aceptar, JButton cancelar, JButton agregar, JButton agregarEmpleado, JButton agregarInstructor, JButton consultarEmpleados, JButton consultarSocios, JButton personalAdministrativo, JButton instructores, JButton dueno, JButton menuSocio, JButton pagar, JButton menu, JButton registrarSocio, JButton consultarSocio, JButton registrarPago, JComboBox area, JComboBox turnoCombo, JComboBox comboPago, JRadioButton credito, JRadioButton debito, JRadioButton efectivo, JTextField jTextCedula, JTextField jTextNombreApellido, JTextField jTextTelf, JTextField jTextAreaEntrenamiento, JTextField jTextDia, JTextField jTextMes, JTextField jTextAnio, JButton jButtonSalir, JButton jButtonSiguiente, JButton BotonRegresar, JButton jButtonRegistrar, JComboBox ComboNumero, JTextField jTextMontoMens, JComboBox Comboturno, JComboBox comboPaquete, Object jTextFnombreapellido) {
        this.ventana = ventana;
        this.personalBoton = personalBoton;
        this.atras = atras;
        this.menuAdministracion = menuAdministracion;
        this.menuPrincipal = menuPrincipal;
        this.aceptar = aceptar;
        this.cancelar = cancelar;
        this.agregar = agregar;
        this.agregarEmpleado = agregarEmpleado;
        this.agregarInstructor = agregarInstructor;
        this.consultarEmpleados = consultarEmpleados;
        this.consultarSocios = consultarSocios;
        this.personalAdministrativo = personalAdministrativo;
        this.instructores = instructores;
        this.dueno = dueno;
        this.menuSocio = menuSocio;
        this.pagar = pagar;
        this.menu = menu;
        this.registrarSocio = registrarSocio;
        this.consultarSocio = consultarSocio;
        this.registrarPago = registrarPago;
        this.area = area;
        this.turnoCombo = turnoCombo;
        this.comboPago = comboPago;
        this.credito = credito;
        this.debito = debito;
        this.efectivo = efectivo;
        this.jTextCedula = jTextCedula;
        this.jTextNombreApellido = jTextNombreApellido;
        this.jTextTelf = jTextTelf;
        this.jTextAreaEntrenamiento = jTextAreaEntrenamiento;
        this.jTextDia = jTextDia;
        this.jTextMes = jTextMes;
        this.jTextAnio = jTextAnio;
        this.jButtonSalir = jButtonSalir;
        this.jButtonSiguiente = jButtonSiguiente;
        this.BotonRegresar = BotonRegresar;
        this.jButtonRegistrar = jButtonRegistrar;
        this.ComboNumero = ComboNumero;
        this.jTextMontoMens = jTextMontoMens;
        this.Comboturno = Comboturno;
        this.comboPaquete = comboPaquete;
        this.jTextFnombreapellido = jTextFnombreapellido;
    }

   
     public void inicializarTxt1(JTextField jTextCedula,JTextField jTextNombreApellido, JTextField jTextTelf,JTextField jTextAreaEntrenamiento,JTextField jTextDia,JTextField jTextMes,JTextField jTextAnio){
      jTextCedula.setText(null);
      jTextNombreApellido.setText(null);
      jTextTelf.setText(null);
      jTextAreaEntrenamiento.setText(null);
      jTextDia.setText(null);
      jTextMes.setText(null);
      jTextAnio.setText(null);
      
  }
     public boolean verificar (JPasswordField claveTxt){
         char passValidar[] = claveTxt.getPassword();
         for (int l = 0; passValidar.length >l;l++){
             char v = passValidar[l];
             if (!Character.isLetterOrDigit(v))
                 return false;
         }
         String pass = new String (passValidar);
         if (pass.equals("hola000"))
             return true;
         else 
             return false;
     }
     
     
     
     public static void traerDatos(JTextField jTextNombreApellido,JTextField jTextEdad,JTextField jTextTelf,JTextField jTextAreaEntrenamiento,JComboBox Comboturno, JComboBox comboPaquete,Socios socio){
          jTextNombreApellido.setText(socio.getNombreSocio());// AQUI TOMA EXTRAE EL NOMBRE DEL SOCIO REGISTRADO PARA MODIFICARLO. TOMAR EN CUENTA QUE TIPO ES STRING
          jTextEdad.setText(String.valueOf(socio.getEdad()));// AQUI TOMA EXTRAE LA EDAD DEL SOCIO REGISTRADO PARA MODIFICARLO. TOMAR EN CUENTA QUE TIPO ES LONG
          jTextTelf.setText(String.valueOf(socio.getTelfSocio()));
//          combodia.setSelectedItem(socio.getDiaSocio()); AQUI TOMA EXTRAE EL DIA DEL SOCIO REGISTRADO PARA MODIFICARLO. TOMAR EN CUENTA QUE TIPO ES jCOMBO
          jTextAreaEntrenamiento.setText(socio.getAreaEntrenar());
          Comboturno.setSelectedItem(socio.getTurno());
          comboPaquete.setSelectedItem(socio.getPaquetesocio());
 }
    public static void activar_desactivar(boolean verdadFalso,JButton botonAgregar,JButton botonModificar,JButton botonEliminar,  JButton botonSalvar, JTextField txtCedula)
     {  botonAgregar.setEnabled(verdadFalso);
        botonModificar.setEnabled(verdadFalso);
        botonEliminar.setEnabled(verdadFalso);
        botonSalvar.setVisible(!verdadFalso);
        txtCedula.setEnabled(verdadFalso);
    } 
    
     
  public static void salvarPersona(JTextField jTextNombreApellido,JTextField jTextEdad,JTextField jTextTelf,JTextField jTextAreaEntrenamiento,JComboBox Comboturno, JComboBox comboPaquete,Socios socio){
     socio.setNombreSocio(jTextNombreApellido.getText()); // DE AQUI SALVO LOS CAMBIOS MIDIFICADOS TIPO STRING
     socio.setEdad(Long.parseLong(jTextEdad.getText()));// DE AQUI SALVO LOS CAMBIOS MIDIFICADOS TIPO LONG
     socio.setTelfSocio(Long.parseLong(jTextTelf.getText()));
//     socio.setDiaSocio(combodia.getSelectedItem().toString());// DE AQUI SALVO LOS CAMBIOS MIDIFICADOS TIPO JCOMBO
     
     socio.setAreaEntrenar(jTextAreaEntrenamiento.getText());
     socio.setTurno(Comboturno.getSelectedItem().toString());
     socio.setPaquetesocio(comboPaquete.getSelectedItem().toString());
     
     
     /*combodia.setSelectedItem(socio.getDiaSocio());*/
     
//     Estudiante est = datosEst.buscarPersona(Integer.parseInt(txtCedula.getText()));
//                est.setNomApe(txtNombres.getText());
//                est.setEficiencia(Float.parseFloat(txtEficiencia.getText()));
//                datosEst.actualizarPersona(est);
 }
    
    
  public static void limpia(JTextField jTextCedula,JTextField jTextNombreApellido,JTextField jTextEdad,JTextField jTextTelf,JTextField jTextAreaEntrenamiento,JComboBox Comboturno, JComboBox comboPaquete) {
        jTextCedula.setText("");
        jTextNombreApellido.setText("");
        jTextEdad.setText("");
        jTextTelf.setText("");
        jTextAreaEntrenamiento.setText("");
        Comboturno.setAction(null);
        comboPaquete.setAction(null);
        jTextCedula.requestFocus();
    }
   
}
