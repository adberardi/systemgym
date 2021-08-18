/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.util.ArrayList;
import registrar.DatosInstructorXml;

/**
 *
 * @author Antonio
 */
public class Instructores extends Personal {
    private String areaEntrenamiento;
    private long sueldo;
    private String turno;
    private String rutinas;
    private String tipoDeNutricion;
    private String lugar;

    public Instructores(String areaEntrenamiento, long sueldo, String nombreEmpleado, long cedulaEmpleado, long telfEmpleado, String direccionEmpleado) {
        super(nombreEmpleado, cedulaEmpleado, telfEmpleado, direccionEmpleado);
        this.areaEntrenamiento = areaEntrenamiento;
        this.sueldo = sueldo;
    }
    public Instructores (){
        areaEntrenamiento = "";
        sueldo = 0;
        turno = "";
        rutinas = "";
        tipoDeNutricion = "";
        lugar = "";
    }
    
    
    public void setAreaEntrenamiento (String areaEntrenamiento){
        this.areaEntrenamiento = areaEntrenamiento;
    }
    public String getAreaEntrenamiento (){
        return areaEntrenamiento;
    }
    public long getSueldo(){
        return sueldo;
    }
    public void setSueldo (long sueldo){
        this.sueldo=sueldo;
    }
    public void setTurno (String turno){
        this.turno = turno;
    }
    public String getTurno (){
        return turno;
    }
    public void setRutinas (String rutinas){
        this.rutinas=rutinas;
    }
    public String getRutinas (){
        return rutinas;
    }
    public void setTipoDeNutricion (String tipoDeNutricion){
        this.tipoDeNutricion = tipoDeNutricion;
    }
    public String getTipoDeNutricion (){
        return tipoDeNutricion;
    }
    public void setLugar (String lugar){
        this.lugar = lugar;
    }
    public String getLugar (){
        return lugar;
    }
     public boolean buscarInstructor (long referencia){
        ArrayList<Instructores> refer = new ArrayList<Instructores> ();
        DatosInstructorXml datos = new DatosInstructorXml();
        refer = datos.cargarInstructores();
        for (Instructores puntero: refer){
            if (puntero.getCedulaEmpleado() == referencia)
                return false;
        }
        return true;
    }
    public void solicitarArea (){
        
    }
    public void AsignarAreaDeEjercicio(){
        
    }
    public void tipoDePrograma (){
        
    }
    public void solicitarInstructor(){
        
    }
    public void consultarTurno (){
        
    }
    public void buscarInstructor (){
        
    }
    public void verificarInstructor (){
        
    }
    public void mostrarInstructor (){
        
    }
        public void asignarTurno (){
        
    }
    public void verificarTurno (){
        
    }
}
