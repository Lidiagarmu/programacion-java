package Ud4Vehículo;

public class Taxi {
	
	//Atributos
	
	private String matricula;
	private String modelo;
	private int potenciaCV;
	private String numeroLicencia;
	
	//Constructor
	
	public Taxi() {
		
	}
	
	
	//Metodos
	
	
	public void setNumeroLicencia(String numeroLicencia) {
		this.numeroLicencia = numeroLicencia;
	}
	
	public String getMatricula() {
		return matricula;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public int getPotenciaCV() {
		return potenciaCV;
	}
	
	public String getNumeroLicencia() {
		return numeroLicencia;
	}

}
