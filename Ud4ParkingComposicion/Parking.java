package Ud4ParkingComposicion;

public class Parking {
	
	private int numPlazas; //numero de plazas total disponibles
	private PlazaAparcamiento[] plazas; //atributo plazas que es un array de objetos PlazaAparcamiento para almacenar todas las plazas individuales 

	
	public Parking(int numPlazas) {
		this.numPlazas=numPlazas;
		plazas = new PlazaAparcamiento[numPlazas];
	}


	public int getNumPlazas() {
		return numPlazas;
	}


	public void setNumPlazas(int numPlazas) {
		this.numPlazas = numPlazas;
	}


	public PlazaAparcamiento[] getPlazas() {
		return plazas;
	}


	public void setPlazas(PlazaAparcamiento[] plazas) {
		this.plazas = plazas;
	}
}
