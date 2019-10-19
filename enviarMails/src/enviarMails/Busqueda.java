package enviarMails;

public class Busqueda {

	
	/**
	 * Busca un valor numerico dentro de un arreglo numerico...
	 * previamente ordenado usando el metodo de busqueda binaria 
	 * 
	 * @param arreglo con los elementos; dato a buscar
	 * @return posicion del elemento buscado, en caso de no existir retorna -1
	    */
	 public static int busquedaBinaria(int  vector[], int dato){
	  int n = vector.length;
	  int centro,inf=0,sup=n-1;
	   while(inf<=sup){
	     centro=(sup+inf)/2;
	     if(vector[centro]==dato) return centro;
	     else if(dato < vector [centro] ){
	        sup=centro-1;
	     }
	     else {
	       inf=centro+1;
	     }
	   }
	   return -1;
	 }
	 
	 
	 public static int busquedaBinariaConWhile(String[] arreglo, String busqueda) {
		    
		    int izquierda = 0, derecha = arreglo.length - 1;
		 
		    while (izquierda <= derecha) {
		        // Calculamos las mitades...
		        int indiceDelElementoDelMedio = (int) Math.floor((izquierda + derecha) / 2);
		        String elementoDelMedio = arreglo[indiceDelElementoDelMedio];
		 
		        
		        // Primero vamos a comparar y ver si el resultado es negativo, positivo o 0
		        int resultadoDeLaComparacion = busqueda.compareTo(elementoDelMedio);
		 
		        // Si el resultado de la comparación es 0, significa que ambos elementos son iguales
		        // y por lo tanto quiere decir que hemos encontrado la búsqueda
		        if (resultadoDeLaComparacion == 0) {
		            return indiceDelElementoDelMedio;
		        }
		 
		 
		        // Si no, entonces vemos si está a la izquierda o derecha
		 
		        if (resultadoDeLaComparacion < 0) {
		            derecha = indiceDelElementoDelMedio - 1;
		        } else {
		            izquierda = indiceDelElementoDelMedio + 1;
		        }
		    }
		    // Si no se rompió el ciclo ni se regresó el índice, entonces el elemento no
		    // existe
		    return -1;
		}
	 
	 
	
	
	
}
