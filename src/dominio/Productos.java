/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;
import java.util.*;

/**
 *
 * @author Administrador
 */
public class Productos extends Empresa {
    private String nombreProducto;
    private Long precioProducto;
    private Long cantidadProducto;
    private int cantidadComprada;


  
  
//public void listadoProducto(ArrayList<Productos> producto, Productos p){
//    for (Iterator i= producto.iterator(); i.hasNext();){
//     p=(Productos)i.next();
//     System.out.println(p.getNombreProducto()+ " "+p.getPrecioProducto());
//     
//    }
//}

    public Productos(String nombreProducto, Long precioProducto, Long cantidadProducto) {
        this.nombreProducto = nombreProducto;
        this.precioProducto = precioProducto;
        this.cantidadProducto = cantidadProducto;
        this.cantidadComprada = 0;
    }

   

  



    public void compraNueva() {
        this.cantidadComprada++;
    }

 public int getCantidadComprada() {
        return cantidadComprada;
    }
    
    public void setCantidadComprada(int cantidadComprada) {
        this.cantidadComprada = cantidadComprada;
    }
  

    public String getNombreProducto() {
        return nombreProducto;
    }

    public Long getPrecioProducto() {
        return precioProducto;
    }

    public Long getCantidadProducto() {
        return cantidadProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public void setPrecioProducto(Long precioProducto) {
        this.precioProducto = precioProducto;
    }

    public void setCantidadProducto(Long cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }
}