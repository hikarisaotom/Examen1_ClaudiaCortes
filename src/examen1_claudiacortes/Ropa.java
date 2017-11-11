package examen1_claudiacortes;

public class Ropa extends Objetos{
    private String Talla;
     private String Material;
      private String Pais;

    public Ropa() {
   super();
    }
    

    public Ropa(String Talla, String Material, String Pais) {
        this.Talla = Talla;
        this.Material = Material;
        this.Pais = Pais;
    }

    public String getTalla() {
        return Talla;
    }

    public void setTalla(String Talla) {
        this.Talla = Talla;
    }

    public String getMaterial() {
        return Material;
    }

    public void setMaterial(String Material) {
        this.Material = Material;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String Pais) {
        this.Pais = Pais;
    }

    @Override
    public String toString() {
        return super.toString()+"Ropa{" + "Talla=" + Talla + ", Material=" + Material + ", Pais=" + Pais + '}';
    }

}
