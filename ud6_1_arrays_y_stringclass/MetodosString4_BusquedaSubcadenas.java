package ud6_1_arrays_y_stringclass;

import javax.net.ssl.SSLContext;

public class MetodosString4_BusquedaSubcadenas {

	public static void main(String[] args) {
		
		//BUSQUEDA DE SUBCADENAS
		
		
		// indexOf(String str)
		// indexOf(String str, int fromIndex) --> devuelven int
		
		// lastIndexOf(String str)
		// lastIndexOf (String str, int fromIndex) --> devuelven int
		
		// startsWith(String prefix)
		// startsWith (String prefix, int toffset) --> devuelven boolean
		
		// endsWith(String suffix) --> devuelven boolean
		
		
		//Ahora que sabemos cómo localizar unba cadena dentro de otra se va a ver cómo se substrae de donde está
		
		//subString(beginIndex) --> devuelve la cadena que se encuentra entre el índice pasado como argumento (beginIndex)
		// y el final de la cadena origen
		
		String s= "Víctor Cuervo";
		
		String resultado = s.substring(7);
		
		System.out.println(resultado); //devuelve Cuervo
		
		
		//subString(beginIndex, endIndex) 
		
		/*se puede utilizar este método indicando el índice inicial y final del cual queremos obtener la cadena. Se
		 *  debe tener en cuenta que el valor proporcionado a endIndex se interpretará como endIndex-1.*/
		
		String x = "En un lugar de la Mancha...";
		
		String result = x.substring(6, 11);
		System.out.println(result); //lugar
	}

}
