package enviarMails;



import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Scanner;




public class LeerCliente {

	
public static LinkedList<Cliente> getListaDeCliente(String miLista) throws FileNotFoundException{
		
		LinkedList<Cliente> lista = new LinkedList<Cliente>();
		//Creamos un archivo y utilizamos el metodo scanner para leerlo
		File f = new File(miLista);
		Scanner sc = new Scanner(f);
		sc.useLocale(Locale.ENGLISH);
		
		while(sc.hasNext()) {
			//En la lista agregar, siguiente entero de la lectura del archivo, siguiente string de la lectura del archivo...
			lista.add(new Cliente(sc.next(), sc.next(), sc.nextInt()));
		}
		
		sc.close();
		return lista;
	}

public static LinkedList<Cliente> ordenarAlfabeticamente(LinkedList<Cliente> miLista)throws IOException{
	
	LinkedList <Cliente> ordenadasPorNombre=new LinkedList <Cliente>();
	Collections.sort(miLista);
	Iterator<Cliente> it1 = miLista.iterator();
	while(it1.hasNext()) {
		Cliente tmp = it1.next();
		ordenadasPorNombre.add(tmp);
	}
	
	return ordenadasPorNombre;
	
	
}

public static void crearArchivo(LinkedList<Cliente> miLista)throws IOException{
	
	//Metodo de escritura en un archivo
			PrintWriter salida=new PrintWriter(new FileWriter("listaClientes"));
			Iterator<Cliente> it1 = miLista.iterator();

	        while (it1.hasNext()){

	            Cliente tmp = it1.next();
	            salida.println(tmp);

	        }
			
			salida.close();
	
}
	
}