package ud7_caso1;



public class CocheKm0 extends Coche implements Alquilable, Vendible{
		
	
	//constructor que hereda de la clase padre
	
	
	public CocheKm0(String matricula, String color, String modelo, int precio, int kmRecorridos) {
		super(matricula,color,modelo,precio,kmRecorridos);
		
	}
	
		
	//métodos que obliga a implementar las interfaces Alquilable y Vendible  a los que vamos a darle un comportamiento especifico para esta clase

	@Override
	public void alquilar() {
		System.out.println("El coche de km0 con matrícula: " + getMatricula() + " se ha  alquilado");
		
	}


	@Override
	public void vender() {
		System.out.println("El coche de km0 con matrícula: " + getMatricula() + " se ha vendido");
		
	}

	
	//método que obliga a implementar la clase padre Coche 
	
	@Override
	public void reservarCoche() {
		System.out.println("Cliente ha reservado el coche de km0: " + getModelo() + " con matricula: " + getMatricula());
		
	}
	
	
	//método opcional que la clase CocheKm0 va a sobreescribir para asignar cita a cliente 
	//le pongo la notacion 'final' para que el método no pueda volver a ser sobreescrito 
	
	@Override
	public final String asignarCitaCliente(String cita) {
		
		
			System.out.println("El coche de km0:::"
					+ "\n    modelo: " + getModelo()
					+ "\n    matricula: "+ getMatricula() 
					+ "\nTiene una cita para el día: " + cita);
			return cita;
		} 



	/* al  no tener atributos especificos de clase, no vamos a declarar el método toString
	 *  si queremos llamar al MÉTODO TOSTRING de una instancia de esta clase, usaremos el método toString() de la clase 
	 *  padre accesible y listo para usar en cualquier instancia de sus clases hijas*/
	
	
	
	
	
}
