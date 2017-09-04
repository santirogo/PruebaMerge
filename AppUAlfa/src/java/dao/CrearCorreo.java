/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author ayoro
 */
public class CrearCorreo {
    private String destinatario;
    private String usuario;
    private String pass;
    private String asunto;
    private String mensaje;
    private int numero;

    public CrearCorreo(String correo, int numero) {
        this.destinatario = correo;
        this.numero = numero;
        this.usuario = "appumartsw";
        this.pass = "dondetusicompras";
        this.asunto = "Verificación cuenta AppU-Mart";
        this.mensaje = "Tu número de verificación es "+numero;
    }
    
    public boolean enviar() throws AddressException, MessagingException{
        // Propiedades de la conexión, configuracion del servicio smtp.
                Properties props = new Properties();
                props.setProperty("mail.smtp.host", "smtp.gmail.com");
                props.setProperty("mail.smtp.starttls.enable", "true");
                props.setProperty("mail.smtp.port", "587");
                props.setProperty("mail.smtp.user", usuario+"@gmail.com");
                props.setProperty("mail.smtp.auth", "true");

                // Preparamos la sesion
                Session session = Session.getDefaultInstance(props);

                // Construimos el mensaje
                MimeMessage message = new MimeMessage(session);
                message.setFrom(new InternetAddress(usuario+"@gmail.com"));
                message.addRecipient(Message.RecipientType.TO, new InternetAddress(destinatario));
                message.setSubject(asunto);
                message.setText(mensaje);

                // Lo enviamos.
                Transport t = session.getTransport("smtp");
                t.connect(usuario+"@gmail.com", pass);
                t.sendMessage(message, message.getAllRecipients());

                // Cierre.
                t.close();
            //} catch (Exception e) {
              //  e.printStackTrace();
            //}
        return true;
    }
}
