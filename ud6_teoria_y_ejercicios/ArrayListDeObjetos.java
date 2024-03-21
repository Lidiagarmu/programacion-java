package ud6_teoria_y_ejercicios;

import java.util.ArrayList;

import java.util.List;



public class ArrayListDeObjetos {
	
			public static void main(String[] args) { 
				
		// LISTA SIN ESPECIFICAR EL TIPO DE DATO GENERICO
				
		/*Para ilustrar la diferencia entre usar o no usar tipos de datos genéricos vamos a crear una lista de tipo ArrayList,
		  sin indicar el tipo de dato que va a contener.*/
				
				
				//Definición ArrayList
				
			List miLista = new ArrayList<>();
			
			miLista.add("hola");
			miLista.add(25);
			
			String primerDato = (String)miLista.get(0);
			System.out.println(primerDato);
			
		
			Integer segundoDato = (Integer)miLista.get(1); 
			System.out.println(segundoDato);


		/*   Como no se ha indicado el tipo, el ArrayList estará formado por cualquier tipo de objeto.
			 
			 En el caso del ejemplo, queremos almacenar el primer dato en una variable de tipo String y el segundo dato de la lista 
			 en una variable de tipo numérico, pero como la lista está formada por objetos, devolverá objetos y será necesario 
			 realizar un cast o casting para realizar una conversión de tipo al tipo de la variable primerDato(String) y
			 segundoDato(Integer).
			 
			 El problema surge porque tenemos que saber de qué tipo es cada uno de los elementos de la lista para 
			 realizar el casting apropiado, por tanto, habría que valorar si nos interesa establecer esta estructura según
			 las necesidades de la aplicación*/
			
		} 

}