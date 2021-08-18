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
public class PersonalAdministrativo extends Personal {
    private long sueldo;

    public PersonalAdministrativo(long sueldo, String nombreEmpleado, long cedulaEmpleado, long telfEmpleado, String direccionEmpleado) {
        super(nombreEmpleado, cedulaEmpleado, telfEmpleado, direccionEmpleado);
        this.sueldo = sueldo;
    }
    public PersonalAdministrativo (){
        sueldo = 0;
    }

    public void consultarSociosMorosos (){
        
    }
    public void setSueldo (long sueldo){
        this.sueldo = sueldo;
    }
    public long getSueldo (){
        return sueldo;
    }
    public boolean buscarEmpleado (long referencia){
        ArrayList<PersonalAdministrativo> refer = new ArrayList<PersonalAdministrativo> ();
        DatosEmpleadoXml datos = new DatosEmpleadoXml();
        refer = datos.cargarEmpleados();
        for (PersonalAdministrativo puntero: refer){
            if (puntero.getCedulaEmpleado() == referencia)
                return false;
        }
        return true;
    }
     public void registrarVentas (){
        
    }
     public void registrarProductos (){
         
     }
     public void registrarPagoInscripcion (){
         
     }
    public void registrarPagoCompraProducto (){
        
    }
    public void registrarPagoClientesPorPagar(){
        
    }
    public void asignarAreaEjercicio (){
        
    }
}
