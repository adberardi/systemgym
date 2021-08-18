/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.util.ArrayList;
import registrar.DatosEmpleadoXml;

/**
 *
 * @author Antonio
 */
public class Personal  {
    private String nombreEmpleado;
    private long cedulaEmpleado;
    private long telfEmpleado;
    private String direccionEmpleado;
    

    public Personal(String nombreEmpleado, long cedulaEmpleado, long telfEmpleado, String direccionEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
        this.cedulaEmpleado = cedulaEmpleado;
        this.telfEmpleado = telfEmpleado;
        this.direccionEmpleado = direccionEmpleado;
    }
    
    public Personal(){
        nombreEmpleado = "";
        cedulaEmpleado = 0;
        telfEmpleado = 0;
        direccionEmpleado = "";
    }
    
    
    public void setNombreEmpleado (String nombreEmpleado){
        this.nombreEmpleado=nombreEmpleado;
    }
    public String getNombreEmpleado (){
        return nombreEmpleado;
    }
    public void setCedulaEmpleado (long cedulaEmpleado){
        this.cedulaEmpleado=cedulaEmpleado;
    }
    public long getCedulaEmpleado (){
        return cedulaEmpleado;
    }
    public void setDireccionEmpleado (String direccionEmpleado){
        this.direccionEmpleado = direccionEmpleado;
    }
    public String getDireccionEmpleado (){
        return direccionEmpleado;
    }
    public void setTelefonoEmpleado (long telfEmpleado){
        this.telfEmpleado=telfEmpleado;
    }
    public long getTelefonoEmpleado (){
        return telfEmpleado;
    }
    
   
    
}
