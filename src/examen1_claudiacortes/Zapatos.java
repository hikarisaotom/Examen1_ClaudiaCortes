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
public class Zapatos extends Objetos{
    private String Talla;
    private String Tipo_Suela;
    private String confort;

    public Zapatos() {
        super();
    }

    public Zapatos(String Talla, String Tipo_Suela, String confort) {
        this.Talla = Talla;
        this.Tipo_Suela = Tipo_Suela;
        this.confort = confort;
    }

    public String getTalla() {
        return Talla;
    }

    public void setTalla(String Talla) {
        this.Talla = Talla;
    }

    public String getTipo_Suela() {
        return Tipo_Suela;
    }

    public void setTipo_Suela(String Tipo_Suela) {
        this.Tipo_Suela = Tipo_Suela;
    }

    public String getConfort() {
        return confort;
    }

    public void setConfort(String confort) {
        this.confort = confort;
    }

    @Override
    public String toString() {
        return "Zapatos{" + "Talla=" + Talla + ", Tipo_Suela=" + Tipo_Suela + ", confort=" + confort + '}';
    }
    
}
