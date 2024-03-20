package ud6_hashset_equals_ejemplo;

import java.util.Objects;

public class Alumno implements Comparable<Alumno> {
	
	
	//LinkedHashSet si mantiene el orden de inserción
	//hashSet no mantiene el orden de inserción
	//si no implementamos el hashSet en la clase Alumno a la que se refiere, para el a1, a2, a3 y a4 son diferentes por lo que los incluye en la colección
	//y si nos fijamos a2 y a3 son la misma persona. No atiende al estado si no implementamos hashSet y equals
	
	@Override
	public int hashCode() {
		return Objects.hash(nia);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumno other = (Alumno) obj;
		return Objects.equals(nia, other.nia);
	}

	private String nombre;
	private String nia;
	private int edad;
	
	

	public Alumno(String nombre, String string, int edad) {
		this.nombre = nombre;
		this.nia = string;
		this.edad = edad;
		
		
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getNia() {
		return nia;
	}



	public void setNia(String nia) {
		this.nia = nia;
	}



	public int getEdad() {
		return edad;
	}



	public void setEdad(int edad) {
		this.edad = edad;
	}



	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", nia=" + nia + ", edad=" + edad + "]";
	}
	
	@Override
	public int compareTo(Alumno a) {
		int comparacion = Integer.compare(a.getEdad(), this.edad);
		if (comparacion == 0)
			comparacion = nombre.compareTo(a.getNombre());
		return comparacion;
	}
 
}
