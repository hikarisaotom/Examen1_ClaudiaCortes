
package examen1_claudiacortes;

/**
 *
 * @author Claudia Cortes
 */
public class Mensaje {
   protected Personas Destinatario;
      protected Personas Remitente;

    public Personas getRemitente() {
        return Remitente;
    }

    public void setRemitente(Personas Remitente) {
        this.Remitente = Remitente;
    }
   protected String Mensaje;

    public Mensaje() {
    }

    public Mensaje(Personas Destinatario, String Mensaje,Personas Remitente) {
        this.Destinatario = Destinatario;
        this.Mensaje = Mensaje;
        this.Remitente=Remitente;
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
