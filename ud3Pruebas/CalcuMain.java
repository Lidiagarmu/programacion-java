package ud3Pruebas;


// Aquí tenemos el método Main que instancia un objeto llamado calculadora de la clase Calcu
//primera letra en minúscula para referirnos a objetos y atributos
//al ser un objeto instanciado de la clae Calcu dispone del método sumar

public class CalcuMain {
	
	public static void main (String[] args) {
		
		//Cuando creamos un ejemplar(objeto) tenemos que especificar la clase a partir de la cual se creará. A esta acción de crear un 
		//objeto a partir de una clase se llama instanciar
		
		Calcu calculadora = new Calcu(); //creo el objeto calculadora de la clase Calcu (esta seria la sentencia para crear un objeto)
		// con la palabra new especificamos que se tiene que crear una instancia de la clase que sigue a continuación
		//en este caso Calcu seria el nombre de la clase padre
		//con la palabra new crear una nueva instancia de Calcu, exactamente un objeto concreto de la clase Calcu
		// y este objeto se almacena en la variable calculadora
		
		
		// para llamar al método solo tenemos que escribir el nombre del objeto seguido de un punto
		// inmediatamente después se nos abrirá un listado de atributos y métodos que forma parte del objeto
		
		int resultado = calculadora.sumar(4, 6);
		
		System.out.println("El resultado de la suma es: " + resultado);
		
		
	}
}
