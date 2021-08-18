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
public class Eventos {
    private String nombreEvento;
    private String nombreInstructor;
    private int dia;
    private int mes;
    private int year;
    private long precioEvento;
    ArrayList<Participantes> alumnos;

    public Eventos(String nombreEvento, String nombreInstructor, int dia, int mes, int year, long precioEvento, ArrayList<Participantes> alumnos) {
        this.nombreEvento = nombreEvento;
        this.nombreInstructor = nombreInstructor;
        this.dia = dia;
        this.mes = mes;
        this.year = year;
        this.precioEvento = precioEvento;
        this.alumnos = alumnos;
    }
    public Eventos (){
        nombreEvento = "";
        nombreInstructor = "";
        dia = 0;
        mes = 0;
        year = 0;
        precioEvento = 0;
        this.alumnos = new ArrayList<Participantes>();
    }
    
    public String getNombreEvento (){
        return nombreEvento;
    }
    public void setNombreEvento (String nombreEvento){
        this.nombreEvento = nombreEvento;
    }
    public String getNombreInstructor (){
        return nombreInstructor;
    }
    public void setNombreInstructor (String nombreInstructor){
        this.nombreInstructor = nombreInstructor;
    }
    public int getDia (){
        return dia;
    }
    public void setDia (int dia){
        this.dia = dia;
    }
    public int getMes (){
        return mes+1;
    }
    public void setMes (int mes){
        this.mes = mes;
    }
    public int getAno(){
        return year;
    }
    public void setAno(int year){
        this.year = year;
    }
    public long getPrecioEvento (){
        return precioEvento;
    }
    public void setPrecioEvento (long precioEvento){
        this.precioEvento = precioEvento;
    }
    public ArrayList<Participantes> getAlumnos (){
        return alumnos;
    }
    public void setAlumno (ArrayList<Participantes> alumnos){
        this.alumnos = alumnos;
    }
    public void agregarAlumno (Participantes persona){
        alumnos.add(persona);
    }
    
    
}
