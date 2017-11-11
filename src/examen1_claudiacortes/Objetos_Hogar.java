/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1_claudiacortes;

import java.util.Date;

/**
 *
 * @author Claudia Cortes
 */
public class Objetos_Hogar extends Objetos{
   private int Tiempo_Vida;
   private String Area_Casa;
   private String Instrucciones;
   private Date Fecha;

    public Objetos_Hogar() {
        super();
    }

    public int getTiempo_Vida() {
        return Tiempo_Vida;
    }

    public void setTiempo_Vida(int Tiempo_Vida) {
        this.Tiempo_Vida = Tiempo_Vida;
    }

    public String getArea_Casa() {
        return Area_Casa;
    }

    public void setArea_Casa(String Area_Casa) {
        this.Area_Casa = Area_Casa;
    }

    public String getInstrucciones() {
        return Instrucciones;
    }

    public void setInstrucciones(String Instrucciones) {
        this.Instrucciones = Instrucciones;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }
    

    @Override
    public String toString() {
        return super.toString()+"Objetos_Hogar{" + "Tiempo_Vida=" + Tiempo_Vida + ", Area_Casa=" + Area_Casa + ", Instrucciones=" + Instrucciones + ", Fecha=" + Fecha + '}';
    }
   
}
