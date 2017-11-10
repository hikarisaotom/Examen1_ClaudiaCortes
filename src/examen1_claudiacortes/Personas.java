
package examen1_claudiacortes;

import java.util.ArrayList;

public class Personas extends Objetos{
    protected String Nombre;
    protected int edad;
    protected int id;
    protected String Sexo;
    protected String E_Civil;
    protected ArrayList <Mensaje> Mensajes =new ArrayList();
    protected String Rol;

    public Personas() {
        super();
    }

    public Personas(String Nombre, int edad, int id, String Sexo, String E_Civil, String Rol) {
        this.Nombre = Nombre;
        this.edad = edad;
        this.id = id;
        this.Sexo = Sexo;
        this.E_Civil = E_Civil;
      this.Rol = Rol;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public String getE_Civil() {
        return E_Civil;
    }

    public void setE_Civil(String E_Civil) {
        this.E_Civil = E_Civil;
    }

    public Object getMensajes() {
        return Mensajes;
    }

    public void setMensajes(Mensaje Mensajes) {
        this.Mensajes.add(Mensajes);
    }

    public String getRol() {
        return Rol;
    }

    public void setRol(String Rol) {
        this.Rol = Rol;
    }

    @Override
    public String toString() {
        return "Personas{" + "Nombre=" + Nombre + ", edad=" + edad + ", id=" + id + ", Sexo=" + Sexo + ", E_Civil=" + E_Civil + ", Mensajes=" + Mensajes + ", Rol=" + Rol + '}';
    }
    
    
}
