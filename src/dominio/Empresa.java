/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;
import java.util.*;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author Antonio
 */
public class Empresa {
    private String nombreEmpresa;
    private String nombreDueno;
    private long telf;
    private String direccion;
    private ArrayList<Personal> personal;
    private ArrayList<Socios> socios;
    private ArrayList<Eventos> eventos;
//    ArrayList<Ventas> ventas;
    ArrayList<Productos> productos;

    public Empresa(String nombreEmpresa, String nombreDueno, long telf, String direccion, ArrayList<Personal> personal, ArrayList<Socios> socios, ArrayList<Eventos> eventos) {
        this.nombreEmpresa = nombreEmpresa;
        this.nombreDueno = nombreDueno;
        this.telf = telf;
        this.direccion = direccion;
        this.personal = personal;
        this.socios = socios;
        this.eventos = eventos;
    }

    
    
    public Empresa (){
        nombreEmpresa = "Nelson";
        nombreDueno = "Energym3000";
        telf = 0;
        direccion = "Santa Teresa";
        this.personal = new ArrayList<Personal> ();
        this.socios = new ArrayList<Socios> ();
        this.eventos = new ArrayList<Eventos> ();
    }
    public void Transacciones (){
        
    }
    public void setNombreEmpresa (String nombreEmpresa){
        this.nombreEmpresa=nombreEmpresa;
    }
    public String getNombreEmpresa (){
        return nombreEmpresa;
    }
    public void setnombreDueno (String nombreDueno){
        this.nombreDueno=nombreDueno;
    }
    public String getnombreDueno (){
        return nombreDueno;
    }
    public long getTelefono (){
        return telf;
    }
    public void setTelefono (long telf){
        this.telf=telf;
    }
    public void setDireccion (String direccion){
        this.direccion=direccion;
    }
    public String getDireccion (){
        return direccion;
    }
    
    public ArrayList<Personal> getPersonal(){
        return personal;
}
    public Personal getPersona (Personal i){
        return i;
    }
    public void setPersonal (ArrayList<Personal> personal){
        this.personal=personal;
    }
    public ArrayList<Personal> agregarEmpleado (Personal registro){
        personal.add(registro);
        return personal;
    }
    public Personal devolverPersona (int posicion){
        return personal.get(posicion);
    }
    public ArrayList<Eventos> getEvento (){
        return eventos;
    }
    public void setEvento (ArrayList<Eventos> eventos){
        this.eventos = eventos;
    }
    public void agregarEvento (Eventos curso){
        eventos.add(curso);
    }
    public Eventos devolverEventos (int posicionEvento){
        return eventos.get(posicionEvento);
    }

    public ArrayList<Socios> getSocios() {
        return socios;
    }

    public void setSocios(ArrayList<Socios> socios) {
        this.socios = socios;
    }
    
    public void incluirSocio(Socios s) {
        socios.add(s);
    }
    
    public int cantidadSocios () {
        return socios.size();
    }

     public int cantidadPersonal () {
        return personal.size();
    }
     
     public void incluirProducto(Productos s) {
        productos.add(s);
    }
    
    public int cantidadProducto () {
        return productos.size();
    }
    
    public Productos returnProducto(int i){    
        return productos.get(i);
    
    }
     
    public Socios returnSocio(int i){
    
    return socios.get(i);
    
    }
   
    public Socios loadCliente ( int cedula) {
    int i = 0;
    while ( i < socios.size() ) {
    if ( socios.get(i).getCedula() == cedula ) 
    return socios.get(i);
    i++;
    }
    return null;
    }
    public long cantidadEventos (){
        return eventos.size();
    }
    public Eventos buscarEvento (String registroEvento){
        for (int j = 0; eventos.size() > j;j++){
            if (eventos.get(j).getNombreEvento().equals(registroEvento))
                return eventos.get(j);
        }
        return null;
    }
}
