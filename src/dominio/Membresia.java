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
public class Membresia {
    private int lastDay;
    private int lastMonth;
    private int lastYear;
    private long monto;
    private String pago;

    public Membresia(int lastDay, int lastMonth, int lastYear, long monto, String pago) {
        this.lastDay = lastDay;
        this.lastMonth = lastMonth;
        this.lastYear = lastYear;
        this.monto = monto;
        this.pago = pago;
    }

    public Membresia (){
        lastDay = 0;
        lastMonth = 0;
        lastYear = 0;
        monto = 0;
        pago = "";
    }
    public void setLastDay (int lastDay){
        this.lastDay = lastDay;
    } 
    public int getLastDay (){
        return lastDay;
    }
    public void setLastMonth (int lastMonth){
        this.lastMonth = lastMonth;
    }
    public int getLastMonth (int lastMonth){
        return lastMonth;
    }
    public void setLastYear (int lastYear){
        this.lastYear = lastYear;
    }
    public int getLastYear (){
        return lastYear;
    }
    public void setMonto (long monto){
        this.monto = monto;
    }
    public long getMonto (){
        return monto;
    }
    public void setPago (String pago){
        this.pago = pago;
    }
    public String getPago (){
        return pago;
    }
}
