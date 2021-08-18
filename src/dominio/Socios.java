/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.util.ArrayList;
import dominio.Membresia;
import dominio.Membresia;
import dominio.Membresia;
import dominio.Membresia;
import dominio.Productos;
import dominio.Productos;
import dominio.Productos;

/**
 *
 * @author A
 */
public class Socios {
   
    private Long cedula;
    private String nombreSocio;
    private Long edad;
    private Long telfSocio;
    private int diaInscripcion;
    private int mesInscripcion;
    private int yearInscripcion;
    private String AreaEntrenar;
    private String Turno;
    private String paquetesocio;
    private ArrayList<Productos> productos = new ArrayList<Productos>();
    private ArrayList<Membresia> membresia = new ArrayList<Membresia>();
//    private ArrayList<Ventas> socios;

    public Socios(Long cedula, String nombreSocio, Long edad, Long telfSocio, int diaInscripcion, int mesInscripcion, int yearInscripcion, String AreaEntrenar, String Turno, String paquetesocio) {
        this.cedula = cedula;
        this.nombreSocio = nombreSocio;
        this.edad = edad;
        this.telfSocio = telfSocio;
        this.diaInscripcion = diaInscripcion;
        this.mesInscripcion = mesInscripcion;
        this.yearInscripcion = yearInscripcion;
        this.AreaEntrenar = AreaEntrenar;
        this.Turno = Turno;
        this.paquetesocio = paquetesocio;
    }

    public Socios() {
        
    }
            
    public Long getCedula() {
        return cedula;
    }

    public String getNombreSocio() {
        return nombreSocio;
    }

    public Long getEdad() {
        return edad;
    }

    public Long getTelfSocio() {
        return telfSocio;
    }

    public int getDiaInscripcion() {
        return diaInscripcion;
    }

    public void setDiaInscripcion(int diaInscripcion) {
        this.diaInscripcion = diaInscripcion;
    }
    public int getMesInscripcion() {
        return mesInscripcion + 1;
    }

    public void setMesInscripcion(int mesInscripcion) {
        this.mesInscripcion = mesInscripcion;
    }
    public int getAnoInscripcion() {
        return yearInscripcion;
    }

    public void setAnoInscripcion(int yearInscripcion) {
        this.yearInscripcion = yearInscripcion;
    }
    public void setMembresia (ArrayList<Membresia> membresia){
        this.membresia = membresia;
    }
    public ArrayList<Membresia> getMembresia (){
        return membresia;
    }
    public void agregarMembresia (Membresia registroLast){
        membresia.add(registroLast);
    }

    public void saveProducto (Productos articulo){
        productos.add(articulo);
    }

    public String getAreaEntrenar() {
        return AreaEntrenar;
    }

    public String getTurno() {
        return Turno;
    }

    public String getPaquetesocio() {
        return paquetesocio;
    }

    public boolean comprobarProducto(String codigo){
        for ( int i = 0 ; i < productos.size() ; i++) {
            if ( productos.get(i).getNombreProducto().compareTo(codigo) == 0 )
                return true;
        }
        return false;
    }

    public void setCedula(Long cedula) {
        this.cedula = cedula;
    }

    public void setNombreSocio(String nombreSocio) {
        this.nombreSocio = nombreSocio;
    }

    public void setEdad(Long edad) {
        this.edad = edad;
    }

    public void setTelfSocio(Long telfSocio) {
        this.telfSocio = telfSocio;
    }
    public void setAreaEntrenar(String AreaEntrenar) {
        this.AreaEntrenar = AreaEntrenar;
    }

    public void setTurno(String Turno) {
        this.Turno = Turno;
    }

    public void setPaquetesocio(String paquetesocio) {
        this.paquetesocio = paquetesocio;
    }

  
 
    
  public static void verificarMorosidad(){}
  
   public int  verificarPago(){
   return (1);
   }
   
  public static void registrarPago(){ }
  
  public static void ConsultarProductos(){ }
    
  public static void RealizarPaga(){ }   
   
  
    
     
//public void saveProducto (Productos p){
  //      productos.add(p);
    //}

  public void compraNueva(String codigo){
        for ( int i = 0 ; i < productos.size() ; i++) {
            if (productos.get(i).getNombreProducto().compareTo(codigo)==0)
                productos.get(i).compraNueva();
        }
    }
  
  public int comprobarCantidadArticulo(String codigo){
        for ( int i = 0 ; i < productos.size() ; i++) {
            if (productos.get(i).getNombreProducto().compareTo(codigo)==0)
                return productos.get(i).getCantidadComprada();
        }
        return 0;
    }
  
   public String nombreProducto ( int i) {
   return productos.get(i).getNombreProducto();
   }
   
   public int cantidadArticulos(){
        return productos.size();
    }
  
   
   public Productos getProducto ( int i) {
   return productos.get(i);
   }
   
}