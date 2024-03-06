package Ud4Vehículo;

public class Autobus {
	
	
	//Atributos
	
	private String matricula;
	private String modelo;
	private int potenciaCV;
	private int numeroPlazas;
	
	//Constructor sin parametros
	
	public Autobus() {
	
	}
	
	//Constructor con todos los parametros
	
	public Autobus(String matricula, String modelo, int potenciaCV, int numeroPlazas) {
		this.matricula = matricula;
		this.modelo = modelo;
		this.potenciaCV = potenciaCV;
		this.numeroPlazas = numeroPlazas;
		
	}
	
	
	//Metodos getter y setter
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public void setModelo(String modelo) {
		this.modelo=modelo;
	}
	
	public void setPotenciaCV(int potenciaCV) {
		this.potenciaCV = potenciaCV;
	}
	
	public void setNumeroPlazas(int numeroPlazas) {
		this.numeroPlazas= numeroPlazas;
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
	
	public int getNumeroPlazas() {
		return numeroPlazas;
	}
	

}
