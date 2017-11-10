
package examen1_claudiacortes;

/**
 *
 * @author Claudia Cortes
 */
public class Mensaje {
   protected Personas Destinatario;
   protected String Mensaje;

    public Mensaje() {
    }

    public Mensaje(Personas Destinatario, String Mensaje) {
        this.Destinatario = Destinatario;
        this.Mensaje = Mensaje;
    }

    public Personas getDestinatario() {
        return Destinatario;
    }

    public void setDestinatario(Personas Destinatario) {
        this.Destinatario = Destinatario;
    }

    public String getMensaje() {
        return Mensaje;
    }

    public void setMensaje(String Mensaje) {
        this.Mensaje = Mensaje;
    }

    @Override
    public String toString() {
        return "Destinatario=" + Destinatario + "Mensaje=" + Mensaje + '}';
    }
   
}
