package enviarMails;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class EnviarCorreo {

	public static void enviarUnCorreo(String mailUsuario, String mensaje) throws MessagingException {
		
		System.out.println("Enviando mail...");
		
		/*llamado a clase properties, esta clase sirve para asignar 
		un valor y una clave en strings. Permite manejar el conjunto de propiedades de un programa, 
		siendo estas persistentes*/
		Properties props = new Properties();
	    props.setProperty("mail.smtp.starttls.enable", "true");
	    props.setProperty("mail.transport.protocol", "smtp");
	    props.setProperty("mail.smtp.auth", "true");
	    props.setProperty("mail.smtp.host", "smtp.gmail.com");
	    props.setProperty("mail.smtp.port", "587");
	    props.setProperty("mail.smtp.user", "pcmax89@gmail.com");
	    props.setProperty("mail.smtp.password", "Noe420472");
//implementamos la clase session pasando  como parametro  las properties establecidas anteriormente
	    Session mailSession = Session.getDefaultInstance(props);
	    mailSession.setDebug(true);
	    //instanciamos clase transport para el envio del mail
	    Transport transport = mailSession.getTransport();
// la clase mimemessage sirve para creacion de mensajes multimedia
	    MimeMessage message = new MimeMessage(mailSession);
	    message.setSubject("HTML  mail with images");
	    message.setFrom(new InternetAddress("pcmax89@gmail.com"));
	    message.setText(mensaje);
	    message.addRecipient(Message.RecipientType.TO,
	         new InternetAddress(mailUsuario));

	    transport.connect("pcmax89@gmail.com", "Noe420472");//This is line 46
	    transport.sendMessage(message,
	        message.getRecipients(Message.RecipientType.TO));
	    transport.close();
	}
	
	public static void enviarMuchosCorreos(ArrayList <String> listaClientes, String mensaje) throws MessagingException {
		
		int i=0;
		
		
		for (i=0;i<listaClientes.size();i++) {
	
		System.out.println("Enviando mail...");
		
		/*llamado a clase properties, esta clase sirve para asignar 
		un valor y una clave en strings. Permite manejar el conjunto de propiedades de un programa, 
		siendo estas persistentes*/
	
	
		Properties props = new Properties();
	    props.setProperty("mail.smtp.starttls.enable", "true");
	    props.setProperty("mail.transport.protocol", "smtp");
	    props.setProperty("mail.smtp.auth", "true");
	    props.setProperty("mail.smtp.host", "smtp.gmail.com");
	    props.setProperty("mail.smtp.port", "587");
	    props.setProperty("mail.smtp.user", "pcmax89@gmail.com");
	    props.setProperty("mail.smtp.password", "Noe420472");
//implementamos la clase session pasando  como parametro  las properties establecidas anteriormente
	    Session mailSession = Session.getDefaultInstance(props);
	    mailSession.setDebug(true);
	    //instanciamos clase transport para el envio del mail
	    Transport transport = mailSession.getTransport();
// la clase mimemessage sirve para creacion de mensajes multimedia
	    MimeMessage message = new MimeMessage(mailSession);
	    message.setSubject("HTML  mail with images");
	    message.setFrom(new InternetAddress("pcmax89@mail.com"));
	    message.setText(mensaje);
	    message.addRecipient(Message.RecipientType.TO,
	         new InternetAddress(listaClientes.get(i)));

	    transport.connect("pcmax89@gmail.com", "Noe420472");//This is line 46
	    transport.sendMessage(message,
	        message.getRecipients(Message.RecipientType.TO));
	    transport.close();
		
	}}
	}
	
	
