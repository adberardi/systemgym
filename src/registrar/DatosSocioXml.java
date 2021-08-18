/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package registrar;

import dominio.Socios;
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
 * @author A
 */
public class DatosSocioXml {
     private Element root;
     private String fileLocation = "src//archivo//socios.xml";
    
    
     public DatosSocioXml() {
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
    private Element SociosXmlElement (Socios nSocios){
        Element SociosXmlElementnext = new Element ("Socios");
        Element cedula = new Element ("cedula");
        cedula.setText(Long.toString(nSocios.getCedula()));
        Element nombre = new Element ("nombre");
        nombre.setText(nSocios.getNombreSocio());
        Element edad = new Element ("edad");
        edad.setText(Long.toString(nSocios.getEdad()));
        Element telefono = new Element ("telefono");
        telefono.setText(Long.toString(nSocios.getTelfSocio()));
        Element AreaEntrenamiento = new Element ("AreadeEntrenamiento");
        AreaEntrenamiento.setText(nSocios.getAreaEntrenar());
        Element Turno = new Element ("Turno");
        Turno.setText(nSocios.getTurno());
        Element Paquete = new Element ("Paquete");
        Paquete.setText(nSocios.getPaquetesocio());
        
        Element dia = new Element ("dia");
        dia.setText(Long.toString(nSocios.getDiaInscripcion()));
        Element mes = new Element ("mes");
        mes.setText(Long.toString(nSocios.getMesInscripcion()));
        Element anio = new Element ("año");
        anio.setText(Long.toString(nSocios.getAñoInscripcion()));
        
        SociosXmlElementnext.addContent(cedula);
        SociosXmlElementnext.addContent(nombre);
        SociosXmlElementnext.addContent(edad);
        SociosXmlElementnext.addContent(telefono);
        SociosXmlElementnext.addContent(AreaEntrenamiento);
        SociosXmlElementnext.addContent(Turno);
        SociosXmlElementnext.addContent(Paquete);
        SociosXmlElementnext.addContent(dia);
        SociosXmlElementnext.addContent(mes);
        SociosXmlElementnext.addContent(anio);
       
        return SociosXmlElementnext;
    }
    
      private Element ProductosXmlElement (Productos nProductos){
        Element ProductosXmlElementnext = new Element ("Producto");
        
        Element nombre = new Element ("nombre");
        nombre.setText(nProductos.getNombreProducto());
        Element precio = new Element ("precio");
        precio.setText(Long.toString(nProductos.getPrecioProducto()));
        Element cantidad = new Element ("cantidad");
        cantidad.setText(Long.toString(nProductos.getCantidadProducto()));

        
         ProductosXmlElementnext.addContent(nombre);
         ProductosXmlElementnext.addContent(precio);
         ProductosXmlElementnext.addContent(cantidad);

       
        return ProductosXmlElementnext;
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
    public boolean nuevo (Socios nSocios){
        boolean fin = false;
        root.addContent(SociosXmlElement((Socios) nSocios));
        for(int n=0; n<nSocios.cantidadArticulos();n++){
            agregarProducto(nSocios.getCedula(),nSocios.getProducto(n),nSocios);
        }
        fin = upDateDocument ();
        return fin;
    }
    private void agregarProducto(Element cliente, Productos articulo){
        cliente.addContent(ProductosXmlElement (articulo));        
    }
      public void agregarProducto(long cedula,Productos articulo, Socios clie) {
        boolean resultado = false;
        Element aux = new Element("Socios");
        List Socioss = this.root.getChildren("Socios");
        while (aux != null) {
            aux = buscar(Socioss, Long.toString(cedula));
            if (aux != null) {
                agregarProducto(aux, articulo);
                resultado = upDateDocument();
                break;
            }
        }
     }
      public static Element buscar(List raiz, String dato) {
        Iterator i = raiz.iterator();
        while (i.hasNext()) {
            Element e = (Element) i.next();
            if (dato.equals(e.getChild("cedula").getText())) {
                return e;
            }
        }
        return null;
    }
//    public Socios CargarSocio (Element elementSocio){
//        Socios socioRegistro = new Socios (Long.parseLong(elementSocio.getChildText("cedula")),elementSocio.getChildText("nombre"),Long.parseLong(elementSocio.getChildText("edad")),Long.parseLong(elementSocio.getChildText("telefono")),Integer.parseInt(elementSocio.getChildText("dia")),Integer.parseInt(elementSocio.getChildText("mes")),Integer.parseInt(elementSocio.getChildText("año")),elementSocio.getChildText("AreaDeEntrenamiento"),elementSocio.getChildText("Turno"),elementSocio.getChildText("Paquete"));
//        return socioRegistro;
//    }
    
       public void actualizarPersona(Socios socio) {
        boolean resultado = false;
        Element aux = new Element("Socios");
        List Socioss = this.root.getChildren("Socios");
        while (aux != null) {
            aux = buscar(Socioss, Long.toString(socio.getCedula()));
            if (aux != null) {
                Socioss.remove(aux);
                resultado = upDateDocument();
            }
        }        
        borrarPersona(socio.getCedula());
        nuevo(socio);
    }
  
      public void borrarPersona(long cedula) {
        boolean resultado = false;
        Element aux = new Element("Socios");
        List Socioss = this.root.getChildren("Socios");
        while (aux != null) {
            aux = buscar(Socioss, Long.toString(cedula));
            if (aux != null) {
                Socioss.remove(aux);
                resultado = upDateDocument();
            }
        }
    }
     private Socios SociosToObject(Element elementSocio) throws ParseException {
        Socios nSocios = new Socios(Long.parseLong(elementSocio.getChildText("cedula")),elementSocio.getChildText("nombre"),Long.parseLong(elementSocio.getChildText("edad")),Long.parseLong(elementSocio.getChildText("telefono")),Integer.parseInt(elementSocio.getChildText("dia")),Integer.parseInt(elementSocio.getChildText("mes")),Integer.parseInt(elementSocio.getChildText("año")),elementSocio.getChildText("AreadeEntrenamiento"),elementSocio.getChildText("Turno"),elementSocio.getChildText("Paquete"));
                
        return nSocios;
    }
     
      public ArrayList<Socios> todosLosSocios() {
        ArrayList<Socios> resultado = new ArrayList<Socios>();
        for (Object it : root.getChildren()) {
            Element xmlElem = (Element) it;
            try {
                resultado.add(SociosToObject(xmlElem));
            } catch (ParseException ex) {
                System.out.println(ex.getMessage());
            }
        }
        return resultado;
    }
      
     
}
