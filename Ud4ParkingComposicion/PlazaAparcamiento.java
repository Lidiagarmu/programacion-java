package Ud4ParkingComposicion;

public class PlazaAparcamiento {
	
	private String numero;
	private double tamanho;
	
	public PlazaAparcamiento(String numero, double tamanho) {
		this.numero=numero;
		this.tamanho=tamanho;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public double getTamanho() {
		return tamanho;
	}

	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}
	
	
	

}
