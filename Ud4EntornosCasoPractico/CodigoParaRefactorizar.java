package Ud4EntornosCasoPractico;

public class CodigoParaRefactorizar { 
	
	//Atributos
	
		//datos personales
	
	public String nombre;
	private String apellido1; 
	private String apellido2; 
	private String edad;
	private double alturaEnMetros;
	private double pesoEnKg;
	private int imc;
	
	
		//datos domicilio
	
	private String pais; private String ciudad;
	private String calle;
	private String numero; private String codigoPostal;
	
	
	//Constructor
	public CodigoParaRefactorizar() { }
	
	
	//Metodo para calcular el Indice de Masa Corporal (IMC)
	
	public int calcularIMC(int imc) { 
		
		if(alturaEnMetros>0 && pesoEnKg >0) {
			
		imc = (int) (pesoEnKg / (alturaEnMetros * alturaEnMetros)); 
		
		}
		else {
		imc = -1;
		System.out.println("Valor no válido"); 
		
		} 
		return imc;
	}
	
}