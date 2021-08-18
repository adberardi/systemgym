/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registrar;
import dominio.*;
import java.io.IOException;
import javax.swing.JOptionPane;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;

/**
 *
 * @author Antonio
 */
public class DatosEventosXml {
    private Element evento;
    private String ubicacion = "src//archivo//eventos.xml";
    
    public DatosEventosXml (){
        try{
            SAXBuilder builder = new SAXBuilder (false);
            Document doc = null;
            doc = builder.build(ubicacion);
            evento = doc.getRootElement();
        }
        catch (JDOMException message){
            JOptionPane.showMessageDialog(null, "ERROR"+message.getMessage());
        }
        catch (IOException message){
            JOptionPane.showMessageDialog(null, "ERROR:"+message.getMessage());
        }
    }
}
