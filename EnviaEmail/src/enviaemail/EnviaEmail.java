package enviaemail;

import java.util.List;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.*;

public class EnviaEmail {

    String origen;
    String psswd;
    List<List<String>> destino;
    Archivo_Class[] adjunto;
    String asunto;
    String cuerpo;

    public EnviaEmail() {
    }

    //metodo que recibe y envia el email

    public EnviaEmail(String origen, String psswd, List<List<String>> destino, String asunto, String cuerpo, Archivo_Class[] adjunto) {
        this.origen = origen;
        this.psswd = psswd;
        this.destino = destino;
        this.asunto = asunto;
        this.cuerpo = cuerpo;
        this.adjunto = adjunto;
    }//fin metodo enviaEmail

    public Boolean enviar() {
        Properties props = new Properties();//propiedades a agragar
        props.put("mail.smtp.user", this.origen);//correo origen
        props.put("mail.smtp.port", "587");//puesto de salida
        props.put("mail.smtp.starttls.enable", "true");//inicializar el servidor
        props.put("mail.smtp.auth", "true");//autentificacion  

        String identifica = origen.substring(
                origen.indexOf("@") + 1,
                origen.indexOf("@") + 6);

        if (identifica.equals("gmail")) {
            props.put("mail.smtp.host", "smtp.gmail.com");//tipo de servidor            
            props.put("mail.smtp.socketFactory.port", "465");//activar el puerto
            props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
            props.put("mail.smtp.socketFactory.fallback", "false");
        } else {
            props.put("mail.smtp.host", "smtp.live.com");//tipo de servidor
        }
        //SecurityManager security = System.getSecurityManager();

        try {
            Authenticator auth = new autentificadorSMTP();//autentificar el correo
            Session session = Session.getInstance(props, auth);//se inica una session
            // session.setDebug(true);

            MimeMessage msg = new MimeMessage(session);//se crea un objeto donde ira la estructura del correo
            MimeMultipart multiParte = new MimeMultipart();//####

            //AGREGAR MULTIPLES ADJUNTOS
            if (adjunto != null) { //####
                for (Archivo_Class adjunto1 : adjunto) {
                    BodyPart adj = new MimeBodyPart();//####
                    adj.setDataHandler(new DataHandler(new FileDataSource(adjunto1.ruta))); //####
                    adj.setFileName(adjunto1.nombre); //####
                    multiParte.addBodyPart(adj);//####
                } //####
            }//####

            //AGREGAR MULTIPLES DESTINATARIOS
            for (int i = 0; i < this.destino.get(0).size(); i++) {//####
                msg.addRecipient(Message.RecipientType.TO,
                        new InternetAddress(
                                this.destino.get(0).get(i)
                        ));//agrega el destinatario //####
            }//####
            //AGREGAR MULTIPLES CC
            if (this.destino.get(1) != null) {
                for (int i = 0; i < this.destino.get(1).size(); i++) {//####
                    msg.addRecipient(Message.RecipientType.CC,
                            new InternetAddress(
                                    this.destino.get(1).get(i)
                            ));//agrega el destinatario //####
                }//####
            }
            if (this.destino.get(2) != null) {
                //AGREGAR MULTIPLES CCO
                for (int i = 0; i < this.destino.get(2).size(); i++) {//####
                    msg.addRecipient(Message.RecipientType.BCC,
                            new InternetAddress(
                                    this.destino.get(2).get(i)
                            ));//agrega el destinatario //####
                }//####
            }

            BodyPart texto = new MimeBodyPart();
            texto.setText(this.cuerpo);
            msg.setSubject(this.asunto);//setea asusto (opcional)
            msg.setFrom(new InternetAddress(this.origen));//agrega la la propiedad del correo origen
            multiParte.addBodyPart(texto);

            msg.setContent(multiParte);//####
            Transport.send(msg);//envia el mensaje

            return true;
        } catch (Exception mex) {//en caso de que ocurra un error se crea una excepcion
            return false;
        }//fin try-catch
    }

    private class autentificadorSMTP extends javax.mail.Authenticator {

        @Override
        public PasswordAuthentication getPasswordAuthentication() {
            return new PasswordAuthentication(origen, psswd);//autentifica tanto el correo como la contraseña
        }
    }
}
