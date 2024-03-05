package Ud4EntornosCasoPractico;

public class Persona {

	//Atributos
	
	//datos personales
	
	private String nombre;
	private String apellido1; 
	private String apellido2; 
	private String edad;
	private double alturaEnMetros;
	private double pesoEnKg; 
	private int imc;
	
	//datos domicilio
	
	private Domicilio data = new Domicilio();


	//Constructor
	public Persona() { 
		
	}
	
	
	//Metodo para calcular el Indice de Masa Corporal (IMC)
	
	public int calcularIMC(int imc) { 
		
		return calculadoraIMC();
	}


	private int calculadoraIMC() {
		int imc;
		if(alturaEnMetros>0 && pesoEnKg >0) {
			imc = (int) (pesoEnKg / (alturaEnMetros * alturaEnMetros)); 
		} 
		else {
			imc = -1;
			System.out.println("Valor no válido"); }
		return imc;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}