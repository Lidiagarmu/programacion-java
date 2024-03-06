package Ud4Vehículo;

public class Vehiculo {
	
	//Atributos
	
	private String matricula;
	private String modelo;
	private int potenciaCV;
	
	//Constructor
	
	/* metodo constructor recibe 3 parametros que se corresponden con los atributos declarados en la clase y pueden tener el mismo nombre o no
	en el momento de la instanciacion de un objeto de tipo Vehiculo, se reciben los valores de estos parametros y 
	el metodo constructor se encarga de almacenarlos en sus correspondientes atributos dentro del objeto, es decir,
	inicializa los atributos con los valores recibidos */
	
	public Vehiculo(String matricula, String modelo, int pCV) { 
		
		
		/*antes de asignar los valores recibidos por el constructor a los atributos del objeto, se puede realizar algun tipo de
		comprobacion de los datos y en caso de que no sean validos no realizar la inicializacion*/
		
		this.matricula = matricula;
		this.modelo = modelo;
		this.potenciaCV = pCV;
		
	}

	
	//Metodos
	
	public String getMatriculaString () {
		return matricula;
	}
	
	
	public String getModeloString () {
		return modelo;
	}
	
	public int getPotenciaCV () {
		return potenciaCV;
	}
	
	public void setPoetenciaCV(int pCV){
		this.potenciaCV= pCV;
		
		
	}
}
