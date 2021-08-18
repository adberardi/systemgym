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
 * @author A
 */
public class DatosProductoXml {
    private Element root;
    private String fileLocation = "src//archivo//productos.xml";
      
    
    
    public DatosProductoXml() {
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
    private Element ProductosXmlElement (Productos nProductos){
        Element ProductosXmlElementnext = new Element ("Productos");
        
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
    public boolean nuevo (Productos nProductos){
        boolean fin = false;
        root.addContent(ProductosXmlElement((Productos) nProductos));
        fin = upDateDocument ();
        return fin;
    }
    
    
    
    
    
}
