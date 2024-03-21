package ud6_teoria_y_ejercicios;

import java.util.HashMap;
import java.util.Map;

public class EjemploHashMap {

	public static void main(String[] args) {
		
		/*Dentro de una misma clase, crea una clase Empleado y una clase Main. La clase Empleado solo tendrá un atributo que 
		 será el nombre del empleado, un constructor que reciba un parámetro y los getter y setter correspondientes.
		 
		Dentro de la clase Main(en el ejemplo se llama EjemploHashMap), en el método main() debes crear un mapa y añadir al 
		menos los datos de dos empleados(usando el constructor de la clase Empleado) con sus correspondientes claves que serán 
		el dni de cada uno.
		
		Elimina uno de ellos por su clave e imprime también el valor asociado a una clave específica, finalmente, recorre todas 
		las entradas del mapa y muestra tanto la clave como el valor de cada entrada utilizando un bucle ‘for-each’*/

		
		//creamos un mapa 
		
		HashMap<String, Empleado> plantilla = new HashMap<String, EjemploHashMap.Empleado>();
		
		//añadimos datos de los empleados
		
		plantilla.put("444A", new Empleado("Lidia Garcia"));
		plantilla.put("333S", new Empleado("Laura Sanchez"));
		plantilla.remove("331S");
		
		System.out.println("El DNI 444A corresponde a: " + plantilla.get("444A")); //El DNI 444A corresponde a: ud6_teoria_y_ejercicios.EjemploHashMap$Empleado@7ad041f3
		
		
		//recorrer todas las entradas del mapa
		System.out.println("\nListado de empleados:"); 
		System.out.println("--------------------");
		
		for (Map.Entry<String,Empleado> entrada : plantilla.entrySet()) {
			
				String clave = entrada.getKey();
				Empleado e = entrada.getValue();
				System.out.println("clave = " + clave + " valor = " + e);
			
		}
		
		
	}




	static class Empleado{
		
		private String nombre;
		
		
		//constructor de la clase Empleado 
		
		 public Empleado(String nombre) {
			super();
			this.nombre = nombre;
		}
		 
		 //getter and setter

		public String getNombre() {
			return nombre;
		}


		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		
		 @Override
		    public String toString() {
		        return nombre;
		    }
		
	}

	
	
	
	
	
	
}