/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registrar;
import dominio.*;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;
import org.jdom.output.XMLOutputter;

/**
 *
 * @author Antonio
 */
public class DatosInstructorXml {
    private Element root;
    private String fileLocation = "src//archivo//instructores.xml";
    
    public DatosInstructorXml (){
        try {
            SAXBuilder builder = new SAXBuilder (false);
            Document doc = null;
            doc = builder.build(fileLocation);
            root = doc.getRootElement();
        }
        catch (JDOMException exception){
            JOptionPane.showMessageDialog(null, "NO SE PUDO INICIAR LA OPERACION POR: "+ exception.getMessage());
        }
        catch (IOException exception){
            JOptionPane.showMessageDialog(null, "NO SE PUDO INICIAR LA OPERACION POR: "+ exception.getMessage());
        }
    }
    
    private Element InstructoresXmlElement (Instructores nInstructor){
        Element Instructoresp = new Element ("Instrutores");
        Element cedula = new Element ("cedula");
        cedula.setText(Long.toString(nInstructor.getCedulaEmpleado()));
        Element nombre = new Element ("nombre");
        nombre.setText(nInstructor.getNombreEmpleado());
        Element telefono = new Element ("telefono");
        telefono.setText(Long.toString(nInstructor.getTelefonoEmpleado()));
        Element direccion = new Element ("direccion");
        direccion.setText(nInstructor.getDireccionEmpleado());
        Element areaEntrenamiento = new Element ("AreaEntrenamiento");
        areaEntrenamiento.setText(nInstructor.getAreaEntrenamiento());
        Element sueldo = new Element ("sueldo");
        sueldo.setText(Long.toString(nInstructor.getSueldo()));
        Element turno = new Element ("turno");
        turno.setText(nInstructor.getTurno());
        Element rutina = new Element ("rutina");
        rutina.setText(nInstructor.getRutinas());
        Element tipoDeNutricion = new Element ("tipoDeNutricion");
        tipoDeNutricion.setText(nInstructor.getTipoDeNutricion());
        Instructoresp.addContent(cedula);
        Instructoresp.addContent(nombre);
        Instructoresp.addContent(telefono);
        Instructoresp.addContent(direccion);
        Instructoresp.addContent(areaEntrenamiento);
        Instructoresp.addContent(sueldo);
        Instructoresp.addContent(turno);
        Instructoresp.addContent (rutina);
        Instructoresp.addContent(tipoDeNutricion);
        return Instructoresp;
    }
    private boolean upDateDocument (){
        try{
           XMLOutputter out = new XMLOutputter (org.jdom.output.Format.getPrettyFormat());
           FileOutputStream file = new FileOutputStream (fileLocation);
           out.output(root, file);
           file.flush();
           file.close();
           return true;
        }
        catch(Exception t){
            JOptionPane.showMessageDialog(null, "Error");
            return false;
            
        }
    }
    public boolean nuevoInstructor (Instructores nInstructor){
        boolean fin = false;
        root.addContent(InstructoresXmlElement ((Instructores) nInstructor));
        fin = upDateDocument ();
        return fin;
    }
    public Instructores instructorObjeto (Element elemento) throws ParseException{
        Instructores ins = new Instructores (elemento.getChildText("AreaEntrenamiento"),Long.parseLong(elemento.getChildText("sueldo")),elemento.getChildText("nombre"),Long.parseLong(elemento.getChildText("cedula")),Long.parseLong(elemento.getChildText("telefono")),elemento.getChildText("direccion"));
        return ins;
    }
    public ArrayList<Instructores> cargarInstructores (){
        ArrayList<Instructores> listaIns = new ArrayList<Instructores>();
        for (Object p: root.getChildren()){
            Element elementoInstructor = (Element) p;
            try{
                listaIns.add(instructorObjeto(elementoInstructor));
            }
            catch (ParseException advertencia){
                JOptionPane.showMessageDialog(null, "ERROR:"+advertencia.getMessage());
            }
        }
        return listaIns;
    }
    
}
