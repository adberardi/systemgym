/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registrar;
import dominio.*;
import controlador.control.*;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
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
public class DatosEmpleadoXml {
    private Element root;
    private String fileLocation = "src//archivo//empleados.xml";

    public DatosEmpleadoXml() {
        try {
        SAXBuilder builder = new SAXBuilder (false);
        Document doc = null;
        doc = builder.build(fileLocation);
        root = doc.getRootElement();
        }
        catch (JDOMException ex){
            System.out.println("No se pudo iniciar la operacion por: " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("No se pudo iniciar la operacion por: " + ex.getMessage());
        }
        
    }
    private Element PersonalAdministraciontoXmlElement (PersonalAdministrativo nEmpleado){
        Element PersonalAdministrativonext = new Element ("PersonalAdministrativo");
        Element cedula = new Element ("cedula");
        cedula.setText(Long.toString(nEmpleado.getCedulaEmpleado()));
        Element nombre = new Element ("nombre");
        nombre.setText(nEmpleado.getNombreEmpleado());
        Element direccion = new Element ("direccion");
        direccion.setText(nEmpleado.getDireccionEmpleado());
        Element telefono = new Element ("telefono");
        telefono.setText(Long.toString(nEmpleado.getTelefonoEmpleado()));
        Element sueldo = new Element ("sueldo");
        sueldo.setText(Long.toString(nEmpleado.getSueldo()));
        PersonalAdministrativonext.addContent(cedula);
        PersonalAdministrativonext.addContent(nombre);
        PersonalAdministrativonext.addContent(direccion);
        PersonalAdministrativonext.addContent(telefono);
        PersonalAdministrativonext.addContent(sueldo);
        return PersonalAdministrativonext;
    }
    private boolean upDateDocument (){
        try {
            XMLOutputter out = new XMLOutputter (org.jdom.output.Format.getPrettyFormat());
            FileOutputStream file = new FileOutputStream (fileLocation);
            out.output(root, file);
            file.flush();
            file.close();
            return true;
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error");
            return false;
        }
    }
    public boolean nuevo (PersonalAdministrativo nEmpleado){
        boolean fin = false;
        root.addContent(PersonalAdministraciontoXmlElement((PersonalAdministrativo) nEmpleado));
        fin = upDateDocument ();
        return fin;
    }
    private PersonalAdministrativo empleadoObjeto (Element elemento) throws ParseException{
        PersonalAdministrativo nEmpleado  = new PersonalAdministrativo (Long.parseLong(elemento.getChildText("sueldo")),elemento.getChildText("nombre"),Long.parseLong(elemento.getChildText("cedula")),Long.parseLong(elemento.getChildText("telefono")),elemento.getChildText("direccion"));
        return nEmpleado;
    }
    public ArrayList<PersonalAdministrativo> cargarEmpleados (){
        ArrayList<PersonalAdministrativo> lista = new ArrayList<PersonalAdministrativo>();
        for (Object p: root.getChildren()){
            Element elementoEmpleado = (Element) p;
            try {
                lista.add(empleadoObjeto(elementoEmpleado));
            }
            catch (ParseException advertencia){
                JOptionPane.showMessageDialog(null, "ERROR:"+advertencia.getMessage());
            }
        }
        return lista;
    }
    
}
