package enviarMails;



import java.io.IOException;
import java.util.LinkedList;

public class TestCliente {
public static void main(String[] args) throws IOException {
	
	//LinkedList<Cliente> empresa=new LinkedList<Cliente>();
	
	LinkedList<Cliente> empresa2=new LinkedList<Cliente>();
	/*System.out.println("empezando agregando clientes a la lista");
	System.out.println();
	CrearCliente.agregarCliente(empresa);
	System.out.println(empresa);
	CrearCliente.agregarCliente(empresa);
	CrearCliente.agregarCliente(empresa);
	System.out.println("ordenando");
	System.out.println(LeerCliente.ordenarAlfabeticamente(empresa));*/
	System.out.println("creando nueva lista apartir de archivo de texto creado");
	empresa2=LeerCliente.getListaDeCliente("listaClientes");
	System.out.println(empresa2);

	
}
}
