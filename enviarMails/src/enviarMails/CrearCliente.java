package enviarMails;



import java.util.LinkedList;
import java.io.IOException;
import java.util.*;

public class CrearCliente {
	//agrego comentario
	
public static LinkedList<Cliente> agregarCliente(LinkedList<Cliente> miLista) throws IOException{
		
		
		Scanner sc=new Scanner(System.in);
		String idNombre;
		String mail;
		Integer celular;
		System.out.println("ingrese nombre de cliente");
		idNombre=sc.nextLine();
		System.out.println("ingrese mail de cliente");
		mail=sc.nextLine();
		System.out.println("ingrese celular de cliente");
		celular=sc.nextInt();
		
		miLista.add(new Cliente(idNombre, mail, celular));
		
		
		
		LeerCliente.crearArchivo(miLista);
		return miLista;
		
	}

}
 