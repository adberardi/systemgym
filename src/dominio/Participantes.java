/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

/**
 *
 * @author Antonio
 */
public class Participantes {
    private long cedulaParticipante;
    private String nombreParticipante;
    private long telfParticipante;
    private long montoCobrado;

    public Participantes(long cedulaParticipante, String nombreParticipante, long telfParticipante, long montoCobrado) {
        this.cedulaParticipante = cedulaParticipante;
        this.nombreParticipante = nombreParticipante;
        this.telfParticipante = telfParticipante;
        this.montoCobrado = montoCobrado;
    }
    public Participantes (){
        cedulaParticipante = 0;
        nombreParticipante = "";
        telfParticipante = 0;
        montoCobrado = 0;
    }
    public long getCedulaPartipante (){
        return cedulaParticipante;
    }
    public void setCedulaParticipante (long cedulaParticipante){
        this.cedulaParticipante = cedulaParticipante;
    }
    public String getNombreParticipante (){
        return nombreParticipante;
    }
    public void setNombreParticipante (String nombreParticipante){
        this.nombreParticipante = nombreParticipante;
    }
    public long getTelefonoParticipante(){
        return telfParticipante;
    }
    public void setTelefonoParticipante (long telfParticipante){
        this.telfParticipante = telfParticipante;
    }
    public long getMontoCobrado (){
        return montoCobrado;
    }
    public void setMontoCobrado (long montoCobrado){
        this.montoCobrado = montoCobrado;
    }
}
