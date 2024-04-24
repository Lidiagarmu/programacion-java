package ud7_caso1;

public interface Alquilable {
	
	/*Recordar que en java podemos implementar múltiples interfaces en una clase.
	 
	 Al contrario que sucede con la herencia entre clases, donde una clase hija sólo puede extender de una clase padre, una interfaz
	 puede heredar de múltiples interfaces, aunque no es el caso de esta aplicación.
	 
	 Por ello las interfaces nos dan mucho juego dependiendo de las necesidades de nuestra aplicació a desarrollarn*/
	
	
	//los métodos (con modificador de acceso public) en las interfaces no llevan llaves {}.
	//las instrucciones se las daremos en la misma clase donde la implementemos 
	//al implementar la interfaz en una clase, obligaremos a esta a implementar su método
	
	void alquilar();

}
