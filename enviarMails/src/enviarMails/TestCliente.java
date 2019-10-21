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
	listaMails.add("martinezrosana472@gmail.com");
	listaMails.add("mayrasoledad912@gmail.com");
	
	Cliente c1=new Cliente("maxi", "pcmax89@gmail.com", 134567);
	Cliente c2=new Cliente("maxi", "maxi.rodriguez.3105@gmail.com", 134567);
	Cliente c3=new Cliente("noe", "noepaezsolange88@gmail.com", 134567);
	
	
	LinkedList<Cliente> empresa=new LinkedList<Cliente>();
	empresa.add(c1);
	empresa.add(c2);
	empresa.add(c3);
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
	EnviarCorreo.enviarUnCorreo("mayrasoledad912@gmail.com", "el programa funciona");
	EnviarCorreo.enviarUnCorreo("martinezrosana472@gmail.com", "el programa funciona");
	
	EnviarCorreo.enviarMuchosCorreos(empresa, "Probando mailSender con javamail, con un array de mails, envio texto plano aunque la libreria permite multimedia atravez de mimmemessage");

	
}
}
