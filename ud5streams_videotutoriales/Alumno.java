package ud5streams_videotutoriales;

import java.io.Serializable;

public class Alumno implements Serializable{
	
	private String nombre;
	private String nif;
	private int edad;
	
	public Alumno(String nombre, String nif, int edad) {
		this.nombre = nombre;
		this.nif=nif;
		this.edad=edad;
		
	}

	public String getNombre() {
		return nombre;
	}


	public String getNif() {
		return nif;
	}


	public int getEdad() {
		return edad;
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", nif=" + nif + ", edad=" + edad + "]";
	}

	
	
	
	

}
