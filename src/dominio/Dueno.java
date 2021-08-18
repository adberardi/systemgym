/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.util.ArrayList;

/**
 *
 * @author Antonio
 */
public class Dueno extends Personal {
    private long nrif;
    private char crif;

    public Dueno(long nrif, char crif, String nombreEmpleado, long cedulaEmpleado, long telfEmpleado, String direccionEmpleado) {
        super(nombreEmpleado, cedulaEmpleado, telfEmpleado, direccionEmpleado);
        this.nrif = nrif;
        this.crif = crif;
    }

    
    
    public void getNRif (long nrif){
        this.nrif = nrif;
    }
    public long setNRif (){
        return nrif;
    }
    public void getCRif (char crif){
        this.crif=crif;
    }
    public char setCRif (){
        return crif;
    }
    public void asignarTurno (){
        
    }
    public void mostrarListEmpleados (){
        
    }
    public void personalAdministrativo (){
        
    }
    public void buscarInstructor (){
        
    }
    public void consultarTurno (){
        
    }
    public void consultarMorosos (){
        
    }
    public void buscarMorosos (){
        
    }
    public void buscarProductos (){
        
    }
    public void buscarVentas (){
        
    }
    public void mostrarInstructor (){
        
    }
}
