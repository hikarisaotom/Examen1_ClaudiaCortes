/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1_claudiacortes;

/**
 *
 * @author Claudia Cortes
 */
public class Familiar extends Personas{
    private String Relacion;
    private String Trabajo;
    private int  altura;
     private int  Peso;

    public Familiar(String Hermana, String Trabajo, int altura, int Peso) {
        this.Relacion = Hermana;
        this.Trabajo = Trabajo;
        this.altura = altura;
        this.Peso = Peso;
    }

    public String getRelacion() {
        return Relacion;
    }

    public void setRelacion(String Hermana) {
        this.Relacion = Hermana;
    }

    public String getTrabajo() {
        return Trabajo;
    }

    public void setTrabajo(String Trabajo) {
        this.Trabajo = Trabajo;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getPeso() {
        return Peso;
    }

    public void setPeso(int Peso) {
        this.Peso = Peso;
    }

    @Override
    public String toString() {
        return "Familiar{" + "Relacion=" + Relacion + ", Trabajo=" + Trabajo + ", altura=" + altura + ", Peso=" + Peso + '}';
    }
     
}
