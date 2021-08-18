/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import static controlador.control.empresa;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrador
 */



/**
 *
 * @author A
 */
public class Ventas {
     private ArrayList<Productos> productos = new ArrayList<Productos>();
     
    
    
  public Productos loadCliente ( String Nombreproducto) {
    int i = 0;
    while ( i < productos.size() ) {
    if (   productos.get(i).getNombreProducto().compareTo(Nombreproducto)==0 ) 
    return productos.get(i);
    i++;
    }
    return null;
    }
    
    public int cantidadProductos () {
        return productos.size();
    }
   public Productos returnProductos(int i){
    
    return productos.get(i);
    
    }
    
    public void saveProducto (Productos p){
        productos.add(p);
    }
    
    public String Productos(int i){
     String NombreProductos= productos.get(i).getNombreProducto();
    return NombreProductos; 
    
}}
 