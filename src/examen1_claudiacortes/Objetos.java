/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1_claudiacortes;

import java.awt.Color;

/**
 *
 * @author Claudia Cortes
 */
public class Objetos {
    protected Color Color;
    protected String Descripcion;
    protected String Marca;
    protected int tamano;
    protected int Calidad;

    public Objetos() {
    super();
    }

    public Objetos(Color Color, String Descripcion, String Marca, int tamano, int Calidad) {
        this.Color = Color;
        this.Descripcion = Descripcion;
        this.Marca = Marca;
        this.tamano = tamano;
        this.Calidad = Calidad;
    }

    public Color getColor() {
        return Color;
    }

    public void setColor(Color Color) {
        this.Color = Color;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public int getCalidad() {
        return Calidad;
    }

    public void setCalidad(int Calidad) {
        this.Calidad = Calidad;
    }

    @Override
    public String toString() {
        return "Objetos{" + "Color=" + Color + ", Descripcion=" + Descripcion + ", Marca=" + Marca + ", tamano=" + tamano + ", Calidad=" + Calidad + '}';
    }
    
}
