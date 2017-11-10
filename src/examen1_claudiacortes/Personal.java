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
public class Personal extends Personas{
    private String Ocupacion;
    private String Horario_Trabajo;
    private int  Tiempo_Trabajo;

    public Personal() {
        super();
    }

    public Personal(String Ocupacion, String Horario_Trabajo, int  Tiempo_Trabajo) {
        this.Ocupacion = Ocupacion;
        this.Horario_Trabajo = Horario_Trabajo;
        this.Tiempo_Trabajo = Tiempo_Trabajo;
    }

    public String getOcupacion() {
        return Ocupacion;
    }

    public void setOcupacion(String Ocupacion) {
        this.Ocupacion = Ocupacion;
    }

    public String getHorario_Trabajo() {
        return Horario_Trabajo;
    }

    public void setHorario_Trabajo(String Horario_Trabajo) {
        this.Horario_Trabajo = Horario_Trabajo;
    }

    public int getTiempo_Trabajo() {
        return Tiempo_Trabajo;
    }

    public void setTiempo_Trabajo(int Tiempo_Trabajo) {
        this.Tiempo_Trabajo = Tiempo_Trabajo;
    }

    @Override
    public String toString() {
        return "Personal{" + "Ocupacion=" + Ocupacion + ", Horario_Trabajo=" + Horario_Trabajo + ", Tiempo_Trabajo=" + Tiempo_Trabajo + '}';
    }
    
}
