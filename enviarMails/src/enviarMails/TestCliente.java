package enviarMails;



import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;

import javax.mail.MessagingException;

public class TestCliente {
public static void main(String[] args) throws IOException, MessagingException {
	ArrayList <String>listaMails=new ArrayList<String>();
	
	listaMails.add("pcmax89@gmail.com");
	listaMails.add("noepaezsolange88@gmail.com");
	listaMails.add("maxi.rodriguez.3105@gmail.com");
	listaMails.add("lcarnero@uno.edu.ar");
	
	//LinkedList<Cliente> empresa=new LinkedList<Cliente>();
	
	//LinkedList<Cliente> empresa2=new LinkedList<Cliente>();
	/*System.out.println("empezando agregando clientes a la lista");
	System.out.println();
	CrearCliente.agregarCliente(empresa);
	System.out.println(empresa);
	CrearCliente.agregarCliente(empresa);
	CrearCliente.agregarCliente(empresa);
	System.out.println("ordenando");
	System.out.println(LeerCliente.ordenarAlfabeticamente(empresa));*/
	//System.out.println("creando nueva lista apartir de archivo de texto creado");
	//empresa2=LeerCliente.getListaDeCliente("listaClientes");
	//System.out.println(empresa2);
	EnviarCorreo.enviarUnCorreo("noepaezsolange88@gmail.com", "el programa funciona");
	EnviarCorreo.enviarMuchosCorreos(listaMails, "Probando mailSender con javamail, con un array de mails, envio texto plano aunque la libreria permite multimedia atravez de mimmemessage");

	
}
}
